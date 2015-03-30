import java.io.UnsupportedEncodingException;

/**
 * Created by bondar on 3/30/2015.
 */
public class TypeConversion {
    public static void main(String[] args) throws UnsupportedEncodingException {
            //String to byte
        Byte b1 = new Byte("10");
        System.out.println(b1);

        String str1 = "123";
        Byte b2 = Byte.valueOf(str1);
        System.out.println(b2);

        byte b;
        String str2 = "100";
        b = Byte.parseByte(str2);
        System.out.println(b);

        String str3 = "20150";
        byte[] b3 = str3.getBytes();
        System.out.println(b3);
        String s = new String(b3, "cp1251");
        System.out.println(s);


            //String to short
        System.out.println();
        Short s1 = new Short("68");
        System.out.println(s1);

        Short s2 = Short.valueOf(s1);
        System.out.println(s2);

        short s3 = Short.parseShort(String.valueOf(s1));
        System.out.println(s3);


            //String ot int
        System.out.println();
        Integer myInt = new Integer("123456");
        System.out.println(myInt);

        String myString = "54312";
        System.out.println(Integer.valueOf(myString));
        System.out.println(Integer.parseInt(myString));


            //String to long
        System.out.println();
        Long myLong = new Long("98765");
        System.out.println(myLong);
        myString = "876345";
        System.out.println(Long.valueOf(myString));
        System.out.println(Long.parseLong(myString));


            //String to float
        System.out.println();
        Float myFloat = new Float("12.25");
        System.out.println(myFloat);
        myString = "23.48";
        System.out.println(Float.valueOf(myString));
        System.out.println(Float.parseFloat(myString));


            //String to Double
        System.out.println();
        Double myDouble = new Double("14.23e12");
        System.out.println(myDouble);
        myString = "14.37e5";
        System.out.println(Double.valueOf(myString));
        System.out.println(Double.parseDouble(myString));


            //String to boolean
        System.out.println();
        Boolean myBool = new Boolean("True");
        System.out.println(myBool);
        myString = "true";
        System.out.println(Boolean.valueOf(myBool));


    }
}
