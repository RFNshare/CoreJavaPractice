import java.util.ArrayList;

public class CoreJavaTwo {
    public static void main(String[] args) {
        int[] arr2 = {12, 23, 34, 45, 50};
        System.out.println("asd");
        for (int i = 0; i < arr2.length; i++) {
            {
                if (arr2[i] % 2 == 0) {
                    System.out.println(arr2[i]);
                    break;
                }
                else
                {
                    System.out.println("Holly Shit");

                }
            }
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("raju");
        a.add("rashed");
        a.add("fatema");
//        a.remove(0);
        System.out.println(a.get(0));
//        for(String i: a)
//        {
//            System.out.println(a.get(i));
//        }

    }
}
