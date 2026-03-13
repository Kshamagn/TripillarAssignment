package basic.TripillarAssignment.Module8;
import java.util.*;
public class RemoveDuplicates {

        public static void main(String[] args) {
            String str = "programming";

            Set<Character> set = new LinkedHashSet<>();

            for(char c : str.toCharArray()){
                set.add(c);
            }

            for(char c : set)
                System.out.print(c);
        }
    }

