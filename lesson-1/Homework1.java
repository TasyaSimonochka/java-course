//здесь напишите свои ФИ
//например - Щербаков Степан
public class Homework1 {

    //ВАЖНО!
    //модификаторы методов оставьте public - так нужно мне для тестов

    //посчитать факториал числа n
    //1б - если посчитаете в цикле, 2б - если посчитаете рекурсией
    public static int fact(int n){
        return n;
    }

    //вывести таблицу умножения на экран - 1б
    //подсказка - использовать двойной for
    public static void table(){
        //Ваше решение здесь
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 1б
    //для любого числа - 2б
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        //Ваше решение здесь
        return n;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 1б
    public static boolean isLeapYear(int year) {
        //Ваше решение здесь
        return true;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 1б
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            //
        } else {
            //
        }
        return 0;
    }

    //определить день недели по номеру
    //например: 1 - Понедельник
    //правильный ответ - 1б
    public static String dayOfTheWeek(int n){
        //Ваше решение здесь
        return "";
    }

    //вывести массив на экран в виде [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 1б
    public static void printArray(int[] array){
        //Ваше решение здесь
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1б
    public static int[] sort(int[] array){
        //Ваше решение здесь
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek(1));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));
    }
}