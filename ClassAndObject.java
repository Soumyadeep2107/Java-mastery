class sum{
    int addition(int a, int b)
    {
        int r= a + b;
        return r;
    }
}
class ClassAndObject{
    public static void main(String[] args) {
        sum s = new sum(); // Creation of Object
        int result = s.addition(10, 20); // calling of the method using the object.
        System.out.println(result);
    }
}