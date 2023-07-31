public class App {
            
    public static int LargestSum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            

        }

        return maxSum;
    }


    public static void main(String[] args)  {
        int[] arr={1,2,3,-4,5,6,-7,8};

        int maxSum=LargestSum(arr);
        System.out.println("Largest Sum is " + maxSum);
    }
}
