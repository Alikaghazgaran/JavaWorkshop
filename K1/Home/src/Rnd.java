import java.util.Random;

public class Rnd {
    public int[] random () {
        Random ran = new Random();
        int arr[];
        arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = ran.nextInt(50);
            boolean b = ran.nextBoolean();
            if (b == false)
                arr[i] *= (-1);
        }
        return arr;
    }
    public void print (int[] arr) {
        System.out.print("Array: ");
        for (int n : arr)
            System.out.print(n + " ");
    }
    public int[] sort (int[] arr) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<9; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}