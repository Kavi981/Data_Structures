import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Insertion element");
        int ele = sc.nextInt();

        //Insertion at Begining
        int[] res = new int[n + 1];
        res[0] = ele;
        for(int i = 0; i < n; i++)
        {
            res[i + 1] = arr[i];
        }

        //Insertion at End
        int[] result = new int[n + 1];
        for(int i = 0; i < n; i++)
        {
            result[i] = arr[i];
        }
        result[n] = ele;

        //Insertion at Specific Position
        System.out.println("Enter the Position");
        int pos = sc.nextInt();
        int[] result1 = new int[n + 1];
        for(int i = 0; i < pos; i++)
        {
            result1[i] = arr[i];
        }
        result1[pos] = ele;
        for(int i = pos + 1; i < n + 1; i++)
        {
            result1[i] = arr[i - 1];
        }
        //Output
        System.out.println("Insertion at Begining" + Arrays.toString(res));
        System.out.println("Insertion at End" + Arrays.toString(result));
        System.out.println("Insertion at Position" + Arrays.toString(result1));
        sc.close();
    }
}
