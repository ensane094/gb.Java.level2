package homework2;


public class Main {

    public static void main(String[] args) {
        String[][] strings = new String[4][4];

        for (int i = 0; i < strings.length; i++) {              // заполняем массив
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = j+"1";
            }
        }

        System.out.println(sum(strings));
    }


    static void arrayCheck(String[][] strings) {            //проверка длинны массива
        if (strings.length != 4) {
            throw new MyArraySizeException("Количество строк в массиве не равно 4");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length != 4) {
                throw new MyArraySizeException("Количество строк в массиве не равно 4");
            }
        }
    }

    static int sum(String[][] strings) {
        arrayCheck(strings);                                        //сначала проверяем длинну массива
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    int o = convertion(strings[i][j]);
                    sum += o;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке массива strings " + i + " под индексом: " + j + " неверный формат данных");
                }
            }
        }
        return sum;
    }

    static int convertion(String s) {
        int i = Integer.parseInt(s);
        return i;
    }
}
