package ru.geekbrains.lesson8;

import java.util.Random;

/**
 * Java Algorithms. Interactive course. Lesson 8
 *
 * @author Nika Zurbaevi
 * @version dated October 31, 2020
 */
public class Main {
    public static void main(String[] args) {
        // Задание 8.1: Приведите пример использование хеш-таблиц.
        // Ответ: Структурированая таблица с ценами на товар

        // Задание 8.2: Приведите примеры ключей и коллизий.
        // Ключем может быть логин или пароль

        // Задание 8.3: Приведите примеры популярных и эффективных хеш-функций.
        // популярная - наиболее быстрая, эффективная - с наименьшим шансом вызвать коллизию

        Random random = new Random();

        System.out.println("Task 8.4. Implementing a hash table using linear probing:");
        Item aDataItem;
        int aKey = 0;
        int size = 66;
        HashTable hashTable = new HashTable(size);
        for (int i = 0; i < 10; i++) {
            aKey = random.nextInt(300);
            aDataItem = new Item(aKey);
            hashTable.insert(aDataItem);
        }
        hashTable.display();
        System.out.println(hashTable.find(aKey).getKey());

        System.out.println("\nTask 8.5. Implementation of the double hashing algorithm:");
        SecondHashTable hashTableSecond = new SecondHashTable(size);
        for (int i = 0; i < 10; i++) {
            aKey = random.nextInt(300);
            aDataItem = new Item(aKey);
            hashTableSecond.insert(aDataItem);
        }
        hashTableSecond.display();
        System.out.println(hashTableSecond.find(aKey).getKey());
    }
}
