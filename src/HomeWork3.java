import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        //1 задание
        int[] arrOne = new int[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        //2 задание
        Array(arrOne);
        int[] arrTwo = new int[100];
        //3 задание
        NewArray(arrTwo);
        int[] arrThree = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //4 задание
        MultiplicateArray(arrThree);
        //5 задание
        int[][] arrFour = new int[8][8];
        Diagonals(arrFour);
        //6 задание
        NewArr(10, 9);
        int[] arrFive = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 77, 54, 98, 21, 33, 14, 90, 55, 53, 13, 44, 67, 9, 3, 7, 99, 1, 34, 61, 2};
        MinAndMax(arrFive);
    }
    //1 задание
    public static void Array(int[] arrOne) {
        for(int i = 0; i < arrOne.length; ++i) {
            if (arrOne[i] == 0) {
                arrOne[i] = 1;
            } else {
                arrOne[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arrOne));
    }
    //2задание
    public static void NewArray(int[] arrTwo) {
        for(int i = 0; i < arrTwo.length; ++i) {
            arrTwo[i] = i + 1;
        }

        System.out.println(Arrays.toString(arrTwo));
    }
    //3задание
    public static void MultiplicateArray(int[] arrThree) {
        for(int i = 0; i < arrThree.length; ++i) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arrThree));
    }
    //4задание
    public static void printDoubleArr(int[][] douleArr) {
        for(int i = 0; i < douleArr.length; ++i) {
            System.out.println(Arrays.toString(douleArr[i]));
        }

    }

    public static void Diagonals(int[][] arrFour) {
        for(int i = 0; i < arrFour.length; ++i) {
            arrFour[i][i] = 1;
            arrFour[i][arrFour[i].length - 1 - i] = 1;
        }

        printDoubleArr(arrFour);
    }
    //5задание
    public static int[] NewArr(int len, int initialValue) {
        int[] returnArr = new int[len];

        for(int i = 0; i < returnArr.length; ++i) {
            returnArr[i] = initialValue;
        }

        System.out.println(Arrays.toString(returnArr));
        return returnArr;
    }
    //6задание
    public static void MinAndMax(int[] arrFive) {
        int max;
        int min = max = arrFive[0];

        for(int i = 0; i < arrFive.length; ++i) {
            if (arrFive[i] < min) {
                min = arrFive[i];
            }

            if (arrFive[i] > max) {
                max = arrFive[i];
            }
        }

        System.out.println("Минимальное значение: " + min + '\n' + "Максимальное значение: " + max);
    }
}