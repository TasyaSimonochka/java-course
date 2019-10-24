package lesson2.vector;

public interface Vector {

    // Длина вектора. Корень из суммы квадратов
    double length();

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector);

    // метод, вычисляющий векторное произведение
    //для 2D вектора пусть будет псевдо-скаляр, то есть
    //формула как для 3D, только с нулевой Z координатой
    Vector crossProduct(Vector vector);

    // Косинус между двумя векторами
    double cos(Vector vector);

    // Сумма двух векторов
    Vector add(Vector vector);

    // Разность двух веторов
    Vector subtract(Vector vector);
}
