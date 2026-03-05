public class ReverseString {

    
    public static String reverse(String str) {
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        String input = "Hello";
        String result = reverse(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}