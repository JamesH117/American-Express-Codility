class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int start = A[0];
        int previous = start;

        int[] copied_array = new int[A.length];
        System.arraycopy(A, 0, copied_array, 0, A.length);

        int total_flips = 0;
        // Check without flipping first
        for (int i=1; i<copied_array.length; i++) {
            if (copied_array[i] == previous){
                total_flips += 1;

                if (copied_array[i] == 0){
                    copied_array[i] = 1;
                } else {
                    copied_array[i] = 0;
                }

            }
            previous = copied_array[i];
        }

        // flip start value and check other solution
        if (A[0] == 1) {
            A[0] = 0;
        } else {
            A[0] = 1;
        }
        previous = A[0];
        int total_alt_flips = 1;
        // Check after flipping first
        for (int i=1; i<A.length; i++) {
            if (A[i] == previous){
                total_alt_flips += 1;

                if (A[i] == 0){
                    A[i] = 1;
                } else {
                    A[i] = 0;
                }

            }
            previous = A[i];
        }

    if (total_flips <= total_alt_flips) {
        return total_flips;
    }
    return total_alt_flips;
    }
}
