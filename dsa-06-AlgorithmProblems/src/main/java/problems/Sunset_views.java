package problems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Sunset_views {

    public static void main(String[] args) {
        Sunset_views obj = new Sunset_views();

        List<Integer> result = obj.sunsetViewsList(new int[]{3,5,4,4,3,1,3,2},"west");

        System.out.println(result);

    }
    public List<Integer> sunsetViewsList(int[] buildings, String direction){

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0 ; i<buildings.length; i++){
            int index = i;
            if(direction.equalsIgnoreCase("east"))
                index = (buildings.length-1)-i;

            if(stack.isEmpty()){
                stack.push(index);
            }else {
                if(buildings[stack.peek()]<buildings[index])
                    stack.push(index);
            }
        }
        return new ArrayList<Integer>(stack);
    }
}
