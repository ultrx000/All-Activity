import java.util.Random;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(50) + 10;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nmaximal " + Arrays.stream(arr).max().getAsInt());
        System.out.println("minimal " + Arrays.stream(arr).min().getAsInt());
        System.out.println("среднее ариф. " + Arrays.stream(arr).sum() / 50);
    }
}
