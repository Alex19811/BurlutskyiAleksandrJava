package LabWork2183;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale it = new Locale("італійський","ITALY");
        System.out.println("Current Locale: " + it);

        System.out.println(Locale.ITALY.getDisplayLanguage());
        System.out.println(Locale.ITALY.getCountry());

        long number= 25000000L;
        NumberFormat numItaly=NumberFormat.getInstance(Locale.ITALY);
        System.out.println("ITALY: " + numItaly.format(number));

        NumberFormat curItaly=NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("ITALY " + curItaly.format(number));

        NumberFormat curIt=NumberFormat.getCurrencyInstance(it);
        System.out.println("Currency: EURO: " + curIt.format(number));

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());



        Locale ch = new Locale("китайський","China");
        System.out.println("Current Locale: " + ch);

        System.out.println(Locale.CHINA.getDisplayLanguage());
        System.out.println(Locale.CHINA.getCountry());

        NumberFormat numChina=NumberFormat.getInstance(Locale.CHINA);
        System.out.println("CHINA: " + numChina.format(number));

        NumberFormat curChina=NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("CHINA " + curChina.format(number));


        NumberFormat curCh=NumberFormat.getCurrencyInstance(ch);
        System.out.println("Currency: Chinese hen: " + curCh.format(number));

        Date dateCh = new Date();
        System.out.println(dateCh);
        System.out.println(date.getTime());

    }
}
