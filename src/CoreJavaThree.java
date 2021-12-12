import java.util.Arrays;

public class CoreJavaThree {
    public static void main(String[] args) {
        String s1 = " Abdullah Al Faroque";
        System.out.println(s1.length());
        String[] splittedString = s1.split(" ");
        System.out.println(Arrays.toString(splittedString));
        System.out.println(splittedString[0]);
        System.out.println("Trimmed -->"+s1.trim());
        for (int i=0; i<splittedString.length; i++)
        {
            System.out.println(splittedString[i]);
        }
        for(int j=s1.length()-1; j < s1.length(); j--)
        {
            System.out.println(s1.charAt(j));
        }
    }
}
