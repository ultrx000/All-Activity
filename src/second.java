public class second
{
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                arr[i/2]=i;
            }
        }
        for(int i = 0; i < 11 / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[11 - i - 1];
            arr[11 - i - 1] = temp;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(arr[i]);
        }
    }
}
