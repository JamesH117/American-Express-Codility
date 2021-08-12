class Solution {
  public int solution( int[] A) {

    int max_number = A.length;
    int start = 1;
    int moments_on = 0;
    int position = 0;

    while (start <= max_number){
      int add = 1;

      //find position of start
      for (int i=0; i<A.length; i++){
        if (A[i] == start && i >= position) {
          position= i;
        }
      }

      // Check all numbers upto start and position
      for (int i=0; i<= position; i++){
        if (A[i] > start){
          add = 0;
        }
      }
      moments_on += add;
      start += 1;
    }

    return moments_on;
  }
}
