package MainLesson3;
import java.math.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;




public class Lesson3_Random {               // задаем случайное число

    public static int randVal() {
        Random rand = new Random();
        int rV = rand.nextInt(9);
        System.out.println("посказка   " + rV);
        return rV;

    }

    public static int numbersOfTrys() {             // запрос кол-ва попыток
        Scanner sc = new Scanner(System.in);        // определение сканера для ввода числа с клавы
        System.out.println("ВВедите число попыток ");
        int tryNum = sc.nextInt();                  // ввод числа попыток угадывания
        return tryNum;
    }


    public static int enterValue() {                 // запрос на ввод числа от пользователя
        System.out.println("Введите число от 0 до 9");
        Scanner sc = new Scanner(System.in);
        int fingerToSky = sc.nextInt();
        //System.out.println(fingerToSky);
        return fingerToSky;

    }


    public static void guessNumber(int randVal, int tryNum) {
        //int trys = numbersOfTrys();

        do {
            int a = enterValue();                   // попытка угадать
            tryNum--;                               // вычитаем попытку
            if (randVal > a) {
                System.out.println("Неугадали. Задайте число побольше )");
            } else {
                if (randVal < a) {
                    System.out.println("Неугадали. Задайте число поменьше ))");
                } else {
                    System.out.println(" Вы угадали !!! ))");
                    break;
                }
                ;
            }
            ;

        }
        while (tryNum > 0);
    }


//____________________________________

        public static void fruitArray(String[] fruit ){            //задание угадай фрукт
        Scanner sc = new Scanner(System.in);
        int ln = fruit.length;
        Random rand = new Random();
        int rV = rand.nextInt(ln);                      // случайное число с границе в длину массива
        String randFruit = fruit[rV];                   // случайный фрукт
        System.out.println("угадай фрукт ");
        System.out.println(""+ randFruit);
        String str = sc.next();
        int shortFruit = 0;
        if (str.length() < randFruit.length()) shortFruit = str.length(); // определяем кол-во буков меньшего слова
        else shortFruit = randFruit.length();
            for(int i=0; i<shortFruit; i++){                                // печать на длину короткого слова
                if(randFruit.charAt(i)== str.charAt(i)){
                System.out.print(str.charAt(i));
            }
            else System.out.print("#");
        }
            for(int i=shortFruit; i<15; i++)                                // допечатываем симовлы до длины в 15 симв
            { System.out.print("#");};

           // System.out.println(randFruit);

        }

    public static void main(String[] args) {
        //задание 2
        String[] fruits = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        fruitArray(fruits);

       // Задание1
        //int num = numbersOfTrys();
        guessNumber( randVal(), numbersOfTrys());


        //Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();                   // считывает число
        //  String s = sc.nextLine();               //считывает всю строку
        //  String c = sc.next();                   //считвыет строку до первого пробела

    }
}