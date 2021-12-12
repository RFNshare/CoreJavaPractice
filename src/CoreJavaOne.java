public class CoreJavaOne {

    public static void main(String[] args) {
        // write your code here

        int myNumber = 5;
        String myString = "Abdullah Al Faroque";
        char letter = 'r';
        float dec = (float) 5.99;
        double d = 5.99;
        boolean myCard = true;
        System.out.println(myNumber + " " + myString + " " + letter + " " + dec + " " + d + " " + myCard);
        // Declared an array
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 27;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 17;

        int[] arr2 = {1, 2, 3, 4, 50};
        System.out.println(arr[3]);
        System.out.println(arr2[3]);

        String[] name = {"raju", "rashed", "fatema"};

        //for loop
        System.out.println("-----FOR LOOP ARR1-----");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----FOR LOOP ARR2-----");
        // Enhanced for loop
        for (int j : arr2) {
            System.out.println(j);
        }

        System.out.println("-----FOR LOOP String ARR-----");
        for (String k : name) {
            System.out.println(k);
        }

    }
}
