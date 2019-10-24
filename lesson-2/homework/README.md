## Домашнее задание №2

### Задача 1:

##### Реализовать свои классы Vector2D и Vector3D.

Создайте два класса с общим  интерфейсом, которые будут описывать вектора в двумерном и трёхмерном пространстве.

У них должны быть:

- конструктор с параметрами в виде списка координат x, y (z)
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt()
- метод, вычисляющий скалярное произведение
- метод, вычисляющий векторное произведение с другим вектором (для 3D)
- метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов
- методы для суммы и разности

Так же должен быть отдельный класс с методом main, в котором будут инициализированны два 2d вектора и два 3d. Ввод координат осуществлять с клавиатуры. Затем нужно вызвать для каждой пары векторов все перечисленные методы и вывести их на экран.

Всего 3 балла за задачу:
- реализованн класс для 2d вектора - 1 балл
- реализованн класс для 3d вектора - 1 балл
- реализованн метод main для ввода данных - 1 балл

------------


### Задача 2:

##### Реализовать свою иерархию классов для следующих видов компьютеров:
- персональный компьютер (ПК, он же desctop)
- ноутбук
- нетбук
- моноблок
- сервер
- неттоп

Для выполнения этой задачи вам понадобится композиция, о корой я вам забыл рассказать на занятии. Изучить ее самостоятельно будет несложно: 
[Композиция и агрегирование](https://javarush.ru/groups/posts/1967-otnoshenija-mezhdu-klassami-nasledovanie-kompozicija-i-agregirovanie- "Композиция и агрегирование")
[Просто про композицию](https://javadevblog.com/chto-takoe-kompozitsiya-primer-kompozitsii-v-java.html "Просто про композицию")
Если после прочтения не понятно - ничего страшного, можно сделать и без нее.

##### Иерархия классов составляется на ваше усмотрение, вот несколько советов для выполнения задачи:
- все виды компьютеров должны реализовывать один интерфейс
- планшет, ноутбук, нетбук, являются портативными компьютерами
- ПК, неттоп и моноблок являются настольными компьютерами
- серверный компьютер не имеет ничего общего с остальными
- у моноблока, нетбука, ноутбука есть дисплей
- у ноутбука и нетбука есть клавиатура
- "являются" по сути равно "наследуют"
- "есть" по сути равно "композиция"

##### Вот подсказка, как будет выглядеть диаграмма классов для ноутбука и нетбука:
![Диаграмма классов](https://github.com/Styopa1769/java-course/blob/master/lesson-2/homework/computer.png?raw=true "Диаграмма классов")

То есть есть интерфейс Computer, в котором прописанны базовые методы. Далее его реализует абстрактный класс ComputerImpl, от которого мы наследуем абстрактный класс PortableComputer, от которого уже наследуем обычные классы ноутбука и нетбука. Ваша задача - аналогичным образом реализовать иерархию для других классов.

##### Общий интерфейс для всех компьютеров должен описывать следующие методы:
- включить
- выключить
- подключиться к интернету

При включении/выключении должна выводится следующая информация:
"Компьютер такой-то, с такими характеристиками, включение/выключение"
При подключении к интернету:
"Компьютер такой-то, с такими характеристиками, подключился к интернету"

##### Подводя итог, у вас будут следующие классы:
- интерфейс "компьютер"
- клавиатура
- дисплей
- персональный компьютер (ПК, он же desctop)
- ноутбук
- нетбук
- моноблок
- сервер
- неттоп

##### Какие поля будут у каждого класса:

- ПК:
процессор, ОЗУ, жесткий диск, видеокарта
- Ноутбук:
процессор, ОЗУ, жесткий диск, монитор, клавиатура
- Нетбук:
процессор, ОЗУ, жесткий диск, монитор, клавиатура
- Моноблок:
процессор, ОЗУ, жесткий диск, монитор
- Неттоп:
процессор, ОЗУ, жесткий диск
- Сервер:
процессор, ОЗУ, жесткий диск

Для простоты процессор, ОЗУ, жесткий диск, видеокарта, крепление - строка (например, процессор "intel i5", жесткий диск "ssd 250gb" и т.п.).
Монитор и клавиатура - отдельные классы, "вставляем" их с помощью композиции.

Так же нужно реализовать main в отдельном классе, где создать по одному объекту каждого класса, добавить их в массив Computer[ ], пройтись циклом и вызвать для каждого поочередно: включить, подключиться к интернету, выключить.

##### Оценка: 
- описанны все классы - 2 балла
- нет ошибок в иерархии  - 1 балл
- есть композиция - 1 балл
- есть main с инициализацией минимум одного объекта каждого класса компьютера - 1 балл

##### Так же предусмотрены дополнительные баллы:
- инициализация из файла (т.е. считывание из файла информации о всех компьютерах, парсинг строки, вызов конструктора) - 1 балл
- реализовать классы (у всех есть поле производитель): процессор (количество ядер, частота), ОЗУ (память, частота), жесткий диск (тип, объем), видеокарта (память), положить их в отдельный пакет и использовать их с помощью композиции в коде - 1 балл

#### Как присылать ответы:
архив с двумя папками: vector и computer, в которых реализованны java-классы