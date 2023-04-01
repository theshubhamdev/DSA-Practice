package Arrays;

public class ArrayBasics {
    // Searching
    public static void linearSearch(int numbers[], int key) {
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Found " + key + " at Position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

    public static void binarySearch(int numbers[], int key) {
        boolean found = false;
        int mid;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            System.out.println(found);
            mid = (start + end) / 2;
            if (numbers[mid] == key) {
                found = true;
                System.out.println("Found " + key + " at Position " + (mid + 1));
                break;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
    // Find the Number
    public static void printLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest No: " + largest);
    }

    public static void reverseArray(int numbers[]) {
        int start = 0;
        int last = numbers.length - 1;
        while (start < last) {
            if (start == last) {
                break;
            }
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;
            start++;
            last--;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void pairsInArray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void pairsSubArray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void printSubArray(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(" " + numbers[k]);
                }
                System.out.println();
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }

    public static void printSubArraySum(int numbers[]) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + numbers[k];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void printMaxSubArraySumPrefixMethod(int numbers[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate Prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max < currSum) {
                    max = currSum;
                }
            }
        }
        System.out.println("Maximum: " + max);
    }

    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum: " + maxSum);
    }

    public static void trappedRainwater(int height[]) {
        int n = height.length;
        // Calc Left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calc Right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedwater += waterlevel - height[i];
        }
        System.out.println("Trapped Water =" + trappedwater);
    }

    public static void BuySellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0; // Global Profit
        for (int i = 0; i < prices.length; i++) {

            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        System.out.println("Profit = " + maxProfit);
    }

    public static void containsDuplicate(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("True");
                }
            }
        }
    }
    public static void main(String[] args) {
        // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        // int key = 4;
        // linearSearch(numbers, key);
        // binarySearch(numbers, key);
        // reverseArray(numbers);
        // pairsInArray(numbers);
        // printSubArraySum(numbers);
        // printMaxSubArraySumPrefixMethod(numbers);
        // kadanes(numbers);
        // trappedRainwater(height);
        BuySellStocks(prices);
    }
}
