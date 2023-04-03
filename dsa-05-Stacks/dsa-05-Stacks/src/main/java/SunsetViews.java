import java.util.*;
import java.util.stream.Collectors;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings={3, 5,4,4,3,1,2};
        sunsetViews(buildings,"East").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack=new Stack<>();
        if(buildings.length==1){
            return new ArrayList<>(List.of(0));
        }

        for(int i = 0 , j = buildings.length-1 ; i < buildings.length; i++,j--){
            int k = (direction.equalsIgnoreCase("east"))?i:j;
            if(stack.isEmpty()) {
                stack.push(k);
                continue;
            }
            if(buildings[stack.peek()] <= buildings[k]){
                while(!stack.isEmpty()&&buildings[stack.peek()]<=buildings[k]){
                    stack.pop();
                }
                stack.push(k);
            }else {
                stack.push(k);
            }
        }
        return new ArrayList<>(stack);
    }
}
