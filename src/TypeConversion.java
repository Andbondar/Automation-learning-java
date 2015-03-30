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
    }
}
