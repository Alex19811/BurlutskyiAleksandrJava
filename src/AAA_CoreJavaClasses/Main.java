package AAA_CoreJavaClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*long number = 12_000_000_000L;
        Locale loc = Locale.UK;
        NumberFormat curFmt = NumberFormat.getInstance(loc);
        System.out.println("Format: "+ curFmt.format(number));
*/


        BigDecimal currencyAmount = new BigDecimal("1000.55");
        Currency cur = Currency.getInstance(new Locale ("uk", "UA"));
        NumberFormat curFmt = NumberFormat.getCurrencyInstance(new Locale("uk", "UA"));
        System.out.println(cur.getDisplayName()+ ":" + curFmt.format(currencyAmount))



        /*
        //8
        BigDecimal currencyAmount = new BigDecimal("1000.55");
        Locale locale = new Locale("uk", "UK");
        Currency cur = Currency.getInstance(locale);
        NumberFormat curFmt = NumberFormat.getCurrencyInstance(locale);
        System.out.println(cur.getDisplayName()+ ":" + curFmt.format(currencyAmount))*/;



      /*  System ss = new System();
        String param = ss.getenv("SystemDrive");
        System.out.println("SystemDrive -> " + param);*/

   /*double x = -10.77;

        System.out.println(Math.round(x));*/



        /*
        //1
        BigInteger n1= BigInteger.ONE;
        BigInteger n2= BigInteger.TWO;
        System.out.println(n1.compareTo(n2));*/
    }
}
