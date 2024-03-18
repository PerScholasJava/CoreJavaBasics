package perscholas.java_basics.wrapperclass;

public class SubstringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {
            String tempString = s.substring(i, k + i);
            if (tempString.compareTo(smallest) <= 0) {
                smallest = tempString;
            }
            if (tempString.compareTo(largest) >= 0) {
                largest = tempString;
            }
        }

        return smallest + "\n" + largest;
    }
}
