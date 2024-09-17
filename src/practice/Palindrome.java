package practice;

public class Palindrome {

    public static String isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        String newInput = str.replaceAll("\\s","").toLowerCase();
        for(int i = newInput.length() - 1; i >= 0; i--){
            sb.append(newInput.charAt(i));
        }
        String newStr = sb.toString();
        if(newInput.equals(newStr)){
            return "It is a palindrome";
        }
        else{
            return "It is not a palindrome";
        }
    }
    public static boolean isPalindrome2(String str){
        StringBuilder sb = new StringBuilder(str);
        String reverseWord = sb.reverse().toString();
        return reverseWord.equalsIgnoreCase(str);
    }
}
