public class TypeConversions{
    public static void main(String[] args){
        byte a =16;
        int b = a; // this is will work because the range of int is more than byte

        int c= 27;
//        byte d = c ; // this wont work because the range of byte is small
//        for the above we need to do the type conversion like :
        byte d = (byte) c;

//        byte e = 20* 30 ; // going out of range---> error

        System.out.println(d);
    }

}