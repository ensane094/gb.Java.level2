package homework2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] strings = new String[4][4];


        for (int i = 0; i < strings.length; i++) {              // заполняем массив
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = j + "";
            }
        }
        strings [1][1] = "s";
        System.out.println(sum(strings));


        if (!arrayCheck(strings)) {                             //Если длинна массива не верна то инициализируем исключение
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Некорректная длинна массива");
            }
        }
    }


    static boolean arrayCheck(String[][] strings) {            //проверка длинны массива
        int i;
        int a = 0;
        for (i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                a++;
            }
        }
        return i == 4 && a == 16;
    }

    static int sum(String[][] strings) {
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    int o = convertion(strings[i][j]);
                    sum += o;
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке массива strings " + i + " под индексом: " + j + " неверный формат данных");
                    throw new MyArrayDataException();
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
