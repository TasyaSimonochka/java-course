# Задание 5

## Дисклеймер

[![Дисклеймер](https://github.com/Styopa1769/java-course/blob/master/lesson-5/homework/disclaimer.png?raw=true "Дисклеймер")](https://github.com/Styopa1769/java-course/blob/master/lesson-5/homework/disclaimer.png?raw=true "Дисклеймер")

## На самом деле шутка, в этот раз должно быть все просто :)

## Задача 1
### Начиная с Java 8 в java.util появился очень полезный класс Optional:
- [статья про Optional](https://habr.com/ru/post/346782/ "Статья про Optional")
- [еще одна статья](https://megahub.me/post/16 "еще одна статья")
- [официальная документация](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html "официальная документация")

### Что предлагается сделать:
- самостоятельно ознакомиться с Optional
- написать самостоятельно похожий класс Pair

Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.

Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический [фабричный метод](https://refactoring.guru/ru/design-patterns/factory-method/java/example)(по сути статичный метод, возвращающий новый объект, то есть вызывающий приватный конструктор с параметрами метода внутри себя) of(). Конструктор должен быть закрытым (private).

С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:

```java
Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"

Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
```

### Разбалловка:
1. написан класс, есть приватный конструктор и фабричный метод of() - 1б
2. есть методы getFirst(), getSecond() - 1б
3. переопределены equals(), hashCode(), toString() - 1б

## Задача 2
### Сразу к делу. Что нужно сделать:
1. С клавиатуры вводится 20 чисел, нужно сохранить их в список и рассортировать по трём другим спискам согласно следующим правилам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков не важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList вывести эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

Решение - класс с методом main и printList, который вызывается в main:
```java
public static void main(String[] args) throws Exception {
    //напишите тут ваш код
}

public static void printList(ArrayList<Integer> list) {
    //напишите тут ваш код
}
```

### Разбалловка:
1. правильно работает main - 1б
2. правильно работает printList - 0,5б



## Задача 3
Реализуйте метод, вычисляющий [симметрическую разность](https://ru.wikipedia.org/wiki/%D0%A1%D0%B8%D0%BC%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F_%D1%80%D0%B0%D0%B7%D0%BD%D0%BE%D1%81%D1%82%D1%8C) двух множеств.

Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

### Пример

Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.

В результате у вас должен быть класс (название на ваше усмотрение), в котором есть следующий метод:
```java
public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {}
```

### Разбалловка:
метод правильно работает для любых типов - 2б

## Задача 4
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требованияк программе:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
6. Метод printMap() должен выводить Map на экран.
7. В методе main вызван createMap, над ним выполнена операция removeTheFirstNameDuplicates(), Map выведена с помощью printMap().

Как будет выглядеть ваша программа (название класса на ваше усмотрение):
```java
public static Map<String, String> createMap() {
  //напишите тут ваш код
}

public static void removeTheFirstNameDuplicates(Map<String, String> map) {
  //напишите тут ваш код
}

public static void removeItemFromMapByValue(Map<String, String> map, String value) {
  //напишите тут ваш код
}

public static void printMap(Map<String,String> map){
  //напишите тут ваш код
}

public static void main(String[] args) {
  //напишите тут ваш код
}
```

### Разбалловка:
1. реализован createMap() - 0,5б
2. реализован removeItemFromMapByValue() - 1б
3. реализован removeTheFirstNameDuplicates() - 1б
4. реализован printMap() - 0,5б
5. реализован main() - 0,5б

