# Задание 7
В дополнение к практикуму на паре предлагается решить следующие задачи.
# Внимание
Убедительная просьба, создавайте классы в пакете homework7, так мне будет гораздо проще проверять.
## Задача 1
### Английские буквы
Написать метод, которому на вход будет приходить String имя файла, а на выходе будет int - количество английских букв в файле.
В этой задаче вам поможет табличка кодирования char в Java: ![табличка кодирования char в Java](https://i.stack.imgur.com/ocfbM.png).
Затем нужно вызвать данный метод в main методе.

### Разбалловка:
1. работает метод - 1 б
2. работает main - 1 б

## Задача 2
### Адаптер
Реализуйте класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Например, "[User] : Table".

```java
public class Adapter {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "User";
            }

            @Override
            public String getTableName() {
                return "Table";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter {

    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
```

Класс TableAdapter должен реализовывать интерфейс BTable и иметь конструктор с параметром ATable.

### Разбалловка:
1. Написан класс TableAdapter - 2 б

## Задача 3
### Числа
Написать метод, принимающий два имени файла String.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Потоки должны быть в конце закрыты.

Затем в main считать с консоли 2 имени файла и вызвать написанный метод.

Пример тела файла (первый файл):
12 text var2 14 8ю 1

Результат (второй файл):
12 14 1

### Разбалловка:
1. работает метод - 1 б
2. работает main - 1 б
