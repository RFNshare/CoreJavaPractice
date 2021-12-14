public class ConstructorTutorialsPoint {
    int puppyAge;
    public ConstructorTutorialsPoint(String name)
    {
        System.out.println("Name is" + name);
    }
    public void setAge(int age)
    {
        puppyAge = age;
    }
    public int getAge( ) {
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args) {
        /* Object creation */
        ConstructorTutorialsPoint myPuppy = new ConstructorTutorialsPoint( "tommy" );

        /* Call class method to set puppy's age */
        myPuppy.setAge( 2 );

        /* Call another class method to get puppy's age */
        myPuppy.getAge( );

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
}
