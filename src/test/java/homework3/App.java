package homework3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.add("Малиновский", 448037);
        phones.add("Прохоренко", 334411);
        phones.add("Прохоренко", 3098211);
        phones.add("Катафалк", 208411);
        phones.add("Катафалк", 3098721);
        phones.add("Герасимук", 3996681);
        phones.add("Торрето", 6564311);
        phones.add("Сопрано", 4324441);
        phones.get("Прохоренко");
    }

    static void firstTask() {
        String[] strings = {"Альфарий", "Омегон", "Робокоп",
                "Робоцып", "Альфарий", "Роджер",
                "Шредер", "Бонифаций", "Джафар",
                "Шархан", "Корбен", "Грека",
                "Бонифаций", "Робокоп"};
        Set<String> set = new HashSet<>(List.of(strings));
        System.out.println(set);
        System.out.println("Уникальных значений: " + set.size());
    }
}
