public class SummativeSums {

    public static void main(String[] args) {

        int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] array2 = { 999, -60, -77, 14, 160, 301 };
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170,                   180, 190, 200, -99 };


        int sumArray1 = 0;
        int sumArray2 = 0;
        int sumArray3 = 0;

        for (int i = 0; i < array1.length; i++){
            sumArray1 += array1[i];
        }

        for (int j = 0; j < array2.length; j++){
            sumArray2 += array2[j];
        }

        for (int k = 0; k < array3.length; k++){
            sumArray3 += array3[k];
        }

        System.out.println("#1 Array sum is " + sumArray1);
        System.out.println("#2 Array sum is " + sumArray2);
        System.out.println("#3 Array sum is " + sumArray3);
    }
}
