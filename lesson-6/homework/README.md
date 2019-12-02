# Задание 6
Для начала создадим поток двумя способами, каждый в своем классе, экземпляры каждого класса создать и запустить в классе Main.

## Задача 1
### Runnable

Создать свой поток, реализовав интерфейс Runnable.
Он должен выводить "This is runnable thread" при запуске.

1 балл за успешное решение.

## Задача 2
### Thread

Создать свой поток, отнаследовавшись от Thread.
Он должен выводить "This is extended thread" при запуске.

1 балл за успешное решение.

## Задача 3
### Часы

Нужно создать класс MyClock, который будет потоком. 
Переопределить в нем метод run() таким образом, чтобы каждые 500 мс (0,5 с) на консоль выводилось "Tik", затем через такой же интервал "Tak", затем снова "Tik" и так до тех пор, пока поток не прерван.
В классе Main нужно создать экземпляр потока, стартовать его, "усыпить" main на 50 с (5000 мс), затем прервать поток.

Разбалловка:
- 1 балл за класс MyClock
- 1 балл за правильную обработку остановки потока
- 1 балл за main

## Задача 4
### Скачки

Скачки и прочие гонки хорошо иллюстрируют многопоточность. Реализуйте метод, который будет считать количество лошадей, пришедших к финишу. 
И ещё, нужно обязательно подождать, пока аутсайдеры также закончат гонку.

Реализуйте метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Нужно использовать метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. 
2.3. Не считать такую лошадь финишировавшей.

```java
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //напишите тут ваш код
        
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
```

Разбалловка: все работает - 2 балла

## Задача 5

Нужно сделать удаление и добавление заметок потокобезопасным - 1 балл за выполненую задачу.

```java
public class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
```

## Задача 6
### Singleton

В этот раз познакомимся с паттерном [Singleton](https://refactoring.guru/ru/design-patterns/singleton) ([javarush](https://javarush.ru/groups/posts/589-patternih-i-singleton--dlja-vsekh-kto-vpervihe-s-nimi-stolknulsja))
Код ниже не потокобезопасен - мы можем создать два экземпляра Singleton из-за долгой инициализации, а такого быть не должно. 
Нужно это исправить. Как именно - на ваше усмотрение. За правильно решенную задачу - 2 балла.

```java
public final class Singleton {
    private static Singleton instance;
    String value;

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
```

## Задача 7
### Игра

Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name) и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.

О коде ниже:
1 List<String> steps хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
2. isWinnerFound показывает, найден победитель или нет.
3. Метод sleep выбрасывает InterruptedException и принимает параметр типа long.
4. Игроки играют независимо друг от друга.
5. Реализуйте логику метода run так, чтобы для каждого игрока:
- Через равные интервалы времени (1000ms / rating) выводились в консоль действия, описанные в steps.
- Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.

Пример:
Player 1:Начало игры

```java
public class Game {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            //Ваш код
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Здесь может и должен быть ваш код
             
            }
    }
}
```

Критерии:
- Метод run класса Gamer через равные интервалы времени (1000ms / rating) должен выводить в консоль фамилию игрока (метод getName()), потом двоеточие, а затем текст из OnlineGame.steps. Пример: Player1:Начало игры
-	Когда все игровые шаги будут выполнены, а победитель еще не найден, метод run должен установить флаг OnlineGame.isWinnerFound в true (сообщить остальным, что он победитель).
-	Если игрок стал победителем, его метод run должен вывести надпись getName() + ":победитель!". Например: Player 2:победитель!
-	Методы run всех игроков которые не стали победителями (были прерваны), должны вывести надписи getName() + ":проиграл". Например: Player 2:проиграл
-	Метод run не должен кидать исключение при прерывании.

За каждый выполненный критерий 1 балл.

Итого 15 баллов за ДЗ, срок сдачи - 09.12.19 23:59



