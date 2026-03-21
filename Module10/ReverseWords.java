package basic.TripillarAssignment.Module10;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}
