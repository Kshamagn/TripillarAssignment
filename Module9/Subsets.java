package basic.TripillarAssignment.Module9;

public class Subsets {
    static void subset(String str, String curr, int i){
            if(i == str.length()){
                System.out.println(curr);
                return;
            }

            subset(str, curr + str.charAt(i), i+1);
            subset(str, curr, i+1);
        }

        public static void main(String[] args) {
            subset("ABC","",0);
        }
    }

