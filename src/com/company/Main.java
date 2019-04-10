package com.company;

public class Main {
    public static void printArrOneDim(int[] mass) {

        for (int i = 0; i < mass.length; i++)        // печать одномерного массива
        {
            System.out.print(mass[i] + " ");
        };
    }
//....................................................

    public static void printArrTwoDim(int[][] mass) {               // печать двумерного массива

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println();
        }
    }
//....................................................


    public static void massElemMult(int[] anyarray) {          // задание 3

        for (int i = 0; i < anyarray.length; i++) {
            if (anyarray[i] < 6) anyarray[i] *= 3;
        }

        for (int i = 0; i < anyarray.length; i++) {
            System.out.print(anyarray[i] + " ");
        }
    }

//....................................................

    public static void arreyInvert(int[] anyarray) {           // задание 1
        for (int i = 0; i < anyarray.length; i++) {
            if (anyarray[i] == 0) {
                anyarray[i] = 1;
            } else {
                anyarray[i] = 0;
            }
            ;
        }
        printArrOneDim(anyarray);
    }

    //....................................................

    public static void arreyVolumeMult(int[] anyarray) {           // задание 2
        for (int i = 0; i < anyarray.length; i++) {
            anyarray[i] = (i * 3);
            System.out.print(anyarray[i] + " ");
        }
        ;

    }
    //....................................................
    public static void diagonal( int [][] anyarray) {                // задание 4


        for (int i = 0, j = anyarray.length -1; i<anyarray.length ; i++, j--){
            anyarray[i][i] = 1;
            anyarray[i][j] = 1;

        };
        printArrTwoDim(anyarray);
    }
    //....................................................
    public static void minMaxOneDimArr(int [] anyarray){            // задание 5
        System.out.println("Исходный одномерный массив");
        printArrOneDim(anyarray);
        System.out.println();
        int min = anyarray[0];
        int max = anyarray[0];

        for (int i = 0; i < anyarray.length; i++) {
            if (anyarray[i] > max) {max = anyarray[i];}
            else {if (anyarray[i]< min) {min = anyarray[i];
            }};
        };
        System.out.println("Минимальное  значение = "+ min);
        System.out.println("Максимальное значение = "+ max);
        System.out.println();
    }
//....................................................

    public static void happyArray(int [] anyarray){                     // задание 6
        int sumElemArr = 0, tempSumElem = 0, happyPosition = 0;

        for (int i = 0; i < anyarray.length; i++) {
            sumElemArr += anyarray[i];
        };
        printArrOneDim(anyarray);
        System.out.print("Исходный массив. Cумма эл-ов массива " + sumElemArr );
        for (int i = 0; i < anyarray.length; i++) {
            tempSumElem += anyarray[i];
            if (tempSumElem == (sumElemArr/2)) {happyPosition = i+1;
                continue;
            };
        };

        if (happyPosition != 0) {

            System.out.println();
            for (int i = 0; i < happyPosition; i++) {
                System.out.print(anyarray[i]+ ", ");
            };
            System.out.print( "|| ");
            for (int i = happyPosition; i < anyarray.length; i++ ){
                System.out.print(anyarray[i] + ", ");
            };
            System.out.println("  Вам сегодня везет -> true -> вы выйграли!!! хотите удвоить? ");
        };
        if ((happyPosition == 0)){
            printArrOneDim(anyarray);
            System.out.println("  Ваш массив не выйграл -> false -> попробуйте еще разок ;-) ");
        }
    }
//....................................................

    public static void scewArray (int skew, int [] anyarray) {               // задание 7
        String skewDir = "направо";
        int lap = 0;
        int finalSkew = 0;
        if (skewDir == "направо" && skew > anyarray.length ) {
            lap = skew/anyarray.length;
            skew %=anyarray.length;
        };

        if (skew < 0) { skewDir = "налево";};
        if (skewDir == "налево" && skew *-1 > anyarray.length ) {
            skew %=anyarray.length;
            skew += anyarray.length;
        };

        if (skew < 0) { skew +=anyarray.length;};

        int tempEl = 0;
        for (int j = 1; j < skew + 1; j++){
            tempEl = anyarray[anyarray.length - 1];

            for (int i = anyarray.length - 1; i > 0; i--)
            {anyarray[i] = anyarray[i-1];};

            anyarray[0] = tempEl;
        }
        printArrOneDim(anyarray);
        System.out.println("Сдвиг проведен " + skewDir);

    }
//....................................................

    public static void main(String[] args) {


        // задание 1
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 0};
        System.out.println("    Задание 1");

        printArrOneDim(arr);
        System.out.println("исходный массив");
        System.out.println();
        arreyInvert(arr);
        System.out.println("инвертированыый массив из " + arr.length + " элементов");
        System.out.println();
//......................................................
        // задание 2
        System.out.println("    Задание 2");
        int[] arr2 = new int[8];
        arreyVolumeMult(arr2);
        System.out.println();
        System.out.println();
//......................................................

        // задание 3
        System.out.println("    Задание 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6 && arr3[i] > 3) {
                System.out.print(arr3[i] + "  ");
            } else {
                System.out.print(arr3[i] + " ");
            }
        }
        System.out.println(" Исходный одномерный массив ");
        massElemMult(arr3);
        System.out.println(" Обработанный по условию одномерный массив ");
        System.out.println();
//......................................................

        // Задание 4

        System.out.println("    Задание 4");
        int matrixRate = 5;
        int[][] arr4 = new int[matrixRate][matrixRate];
        diagonal(arr4);
        System.out.println();
//......................................................

        // Задание 5

        System.out.println("    Задание 5");
        int[] arr5 = {-3,-7,-9,-1,-1,-5,-89,-1,-90909};
        minMaxOneDimArr(arr5);
//......................................................
        // задание 6

        System.out.println("    Задание 6");
        int [] arr6 = {2,-2,2,2,0,2,2,1,1,1,9};
        happyArray(arr6);
        System.out.println();
//......................................................

        // задание 7
        System.out.println("    Задание 7");
        System.out.println();
        int [] arr7 = {0,0,0,0,0,0,0,0,0,1};
        int skew = -9;
        printArrOneDim(arr7);
        System.out.print("Исходный массив. Сдвиг "+ skew);
        System.out.println();
        scewArray(skew, arr7);

        //Scanner sc = new Scanner(System.in);


    }
}