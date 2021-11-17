package homework3;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
           Phones phones = new Phones();
        phones.add("Соколов",448000);
        phones.add("Соколов",448330);
        phones.add("Соколов",511100);
        phones.add("Торетто",4434321);
        phones.add("Криптман",150991);
        phones.add("Астарта",652330);
        System.out.println(phones.get("Соколов"));

        firstTask();

}

    static void firstTask() {
        String[] words = {"Рафаэль", "Донателло", "Том", "Джерри", "Донателло", "Том", "Джерри"};
        Map<String, Integer> wordsMap = countWords(words);
        System.out.println(wordsMap);
    }

    static Map<String, Integer> countWords(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            map.putIfAbsent(word, 0);
            map.compute(word, (k, v) -> v += 1);
            /**
             *Мне помогли с заданием. Получается, создаём коллекцию со словами и каждому слову добавляем счётчик
             * Если элемент коллекции null то записываем в него слово и даём счётчик
             * Затем если ключ сходится со словом то ++
             */
        }
        return map;
    }
}
