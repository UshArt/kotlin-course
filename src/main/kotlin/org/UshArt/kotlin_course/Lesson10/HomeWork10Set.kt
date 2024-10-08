package org.UshArt.kotlin_course.Lesson10

//Работа с Множествами Set
fun main() {

//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.

    val set1 = setOf<Int>()
    println(set1)

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val set2 = setOf(1, 2, 3)
    println(set2)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println(set3)

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val set4 = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")
    println(set4)

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val set5 = mutableSetOf(1, 2, 3, 4, 5, 6)
    set5.remove(2)
    println(set5)

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val set6 = setOf(1, 2, 3, 4, 5, 6)
    for (i in set6) {
        println(i)
    }

//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    val set7 = setOf("один", "два", "три", "четыре", "пять")
    val searchString = "три"
    println(search(set7, searchString))

//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
//Реши задачу с помощью циклов.

    val set8 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val secondSet8 = setOf("два", "четыре", "шесть", "восемь", "стопицот", "дофигища")
    val unitedSet8 = mutableSetOf<String>()
    for (i in set8) {
        unitedSet8.add(i)
    }
    for (i in secondSet8) {
        unitedSet8.add(i)
    }
    println(unitedSet8)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

    val set9 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val secondSet9 = setOf(5, 12, 14, 4, 22, 7, 15, 33, 45, 2)
    val commonSet9 = mutableSetOf<Int>()
    for (i in set9) {
        if (secondSet9.contains(i)) {
            commonSet9.add(i)
        }
    }
    println(commonSet9)

    println("другой вариант")
    for (i in set9) {
        for (j in secondSet9) {
            if (i == j) {
                commonSet9.add(i)
            }
        }
    }
    println(commonSet9)

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие
//в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.

    val set10 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val secondSet10 = setOf("два", "четыре", "шесть", "восемь", "стопицот", "дофигища")
    val differenceSet10 = mutableSetOf<String>()
    for (i in set10) {
        var inSecondSet = false
        for (j in secondSet10) {
            if (i == j) {
                inSecondSet = true
            }
        }
        if (!inSecondSet) {
            differenceSet10.add(i)
        }
    }
    println(differenceSet10)

//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.

    val set11 = setOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")
    val list11 = mutableListOf<String>()
    for (i in set11) {
        list11.add(i)
    }
    println(list11)
}

fun search(set7: Set<String>, searchString: String): Boolean {
    for (i in set7) {
        if (i == searchString) {
            return true
        }
    }
    return false
}