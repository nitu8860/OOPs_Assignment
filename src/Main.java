
   import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

   public class Main {

        public static List<Integer> SumElements(int[] arr) {
            List<Integer> result = new ArrayList<>();

            Map<Integer, Integer> map = new HashMap<>();
            int Sum = 0;

            for (int i = 0; i < arr.length; i++) {
                Sum += arr[i];
                if (Sum == 0) {
                    for (int j = 0; j <= i; j++) {
                        result.add(arr[j]);
                    }
                    return result;
                }
                if (map.containsKey(Sum)) {
                    int startIndex = map.get(Sum) + 1;
                    for (int j = startIndex; j <= i; j++) {
                        result.add(arr[j]);
                    }
                    return result;
                }
                map.put(Sum, i);
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            List<Integer> result = SumElements(arr);
            if (result.isEmpty()) {
                System.out.println("No Elements found");
            } else {
                System.out.println("Elements whose sum is 0:");
                for (int num : result) {
                    System.out.print(num + " ");
                }
            }
        }
    }
