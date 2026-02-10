public class charData {
    public static void main(String[] args) {
        char a='d';
        System.out.println(a);
        String b="basavaraj";
        System.out.println(b);
        // ascii value
        char c = 'b';
        int e = c;// implisit conversion
        System.out.println(e);
        char f ='g';
        int h=(int)f;// explict conversion
        System.out.println(h);
        /*A-B = 65-90,
        a-b = 97-122
        0- 1= 48-49 */
        char x='z';
        System.out.println((int)x);
        System.out.println(x+0);// adding 0 to char will give ascii value
        int Y=43;
        char z=(char)Y;
        System.out.println(z);

    }
}
