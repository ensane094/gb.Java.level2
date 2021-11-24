package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phones {
    private final Map<String, Set<Integer>> phoneBook;


    public Phones() {
        phoneBook = new HashMap<>();                          // при создании объекта создаётся HashMap
    }
    public void add(String name, int number) {
        phoneBook.putIfAbsent(name, new HashSet<>());        //если отсутствует ключ с таким именем - добавляем его
        phoneBook.get(name).add(number);                     //если есть, добавляем ему номер
    }

    public Set<Integer> get(String name) {
        return phoneBook.get(name);
    }
}