import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[50];
        int numPositive = 0, sumPositive = 0, numNegative = 0, sumNegative = 0, numNull = 0;
        for (int i = 0; i < 50; i++){
            int n = random.nextInt(101) - 50;
            arr[i] = n;
            if (n > 0) {
                numPositive++;
                sumPositive += n;
            } else if(n <0){
                numNegative++;
                sumNegative += n;
            } else {
                numNull++;
            }
        }

        System.out.printf("В массиве из 50 чисел: \n- %d положительных чисел и их сумма равна %d\n" +
                "- %d отрицательных чисел и их сумма равна %d\n- %d нулевых значений \n- среднее по массиву равно %.2f",
                numPositive, sumPositive, numNegative, sumNegative, numNull, (sumPositive + sumNegative)/50D);

    }
}
