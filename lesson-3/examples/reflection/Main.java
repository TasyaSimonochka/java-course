package lesson3.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        //получаем класс
        Class clazz = Person.class;

        //создаем экземпляр
        Person person = (Person) clazz.newInstance();

        //получаем список конструкторов
        clazz.getConstructors();

        //методы
        Method method = clazz.getMethod("method");
        method.invoke(person);

        //получаем private поле и редактируем его
        Field field = clazz.getDeclaredField("firstName");
        field.setAccessible(true);
        field.set(person,"Stepan");

        //получаем имя класса
        System.out.println("class: "+clazz.getSimpleName());

        //получаем имя суперкласса
        System.out.println("superclass: "+clazz.getSuperclass().getSimpleName());

        //список интерфейсов
        Class[] classes = clazz.getInterfaces();

        for (Class c : classes){
            System.out.println("interface: "+c.getSimpleName());
        }

        System.out.println(person.toString());

    }
}
