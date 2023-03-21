import java.util.Arrays;

public class AnotherOptimal {
    public static void main(String[] args) {
        int [] nums={ 2, 5,6,7,8,15,200};// needs to be sorted
        int target=20;
        int [] ind=new int[2];

         //sort method here   nlogn

        for (int i = 0, j=1; i < nums.length; i++,j++) {   // O(n)
            if (nums[i]>target){continue;}                 // constant
            if (target-nums[i]==nums[j]){                  // constant
                ind[0]=i; ind[1]=j;
                System.out.println(Arrays.toString(ind));

            }   //overall complexity will be nlogn+ n
        }
    }
}
