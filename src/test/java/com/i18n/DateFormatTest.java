package com.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class DateFormatTest {
    

    /**
     * DateFormat adalah class yang bisa kita gunakan untuk melakukan parsing dari string ke Date,
     * atau format dari date ke string
     * DateFormat mendukung i18n jika kita misal ingin melakukan format dan parse, sehingga bisa menerima hari
     * dengan data Sunday, Monday atau minggu, senin.
     * DateFormat adalah abstrac class, salahsatu implementasi nya adalaj SimpleDateFormat
     * berikut ini adalah pattren yang di sediakan untuk memparsing Date https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
     */
    @Test
    public void testDateFormat() {
        /**
         * EEEE maksudnya ini adalah akan menampilkan nama hari secara full misal Senin
         * dd ini maksudnya akan menampilkan tanggal secara penuh misal nya 01 atau 12 ata 28
         * yyyy ini maksudnya akan menampilkan tahun secara keselururhan misalnya 2023 bukan 23 dan lain2
         */
        String pattren = "EEEE dd MMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattren);
        String dateString = simpleDateFormat.format(new Date());
        System.out.println(dateString);
    }
    @Test
    public void testDateFormatI18n() {
        /**
         * untuk memformat tanggal nya dalam bahasa indonesa atau bahasa lainya 
         * pada class SimpleDateFormat sebenarnya ada contructor yang menerima
         * 2 parameter yaitu pattren of date dan locale
         * parameter Locale ini yang kita gunakan untuk meng konfersi tanggal berdasarkan
         * bahasa nya masing2
         * 
         * contoh nya sebagai berikut :
         */
        Locale indonesia = new Locale("id", "ID");
        String pattren = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JP");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattren, indonesia);
        String dateString = simpleDateFormat.format(new Date());

        SimpleDateFormat simpleDateFormatJapan = new SimpleDateFormat(pattren, japan);
        String dateStringJapan = simpleDateFormatJapan.format(new Date());


        System.out.println(dateString);

        System.out.println(dateStringJapan);
    }

    @Test
    public void testStringToDate() {
        String pattren = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("id", "ID");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattren, indonesia);

        try {
            Date date = simpleDateFormat.parse("Jumat 03 Maret 2023");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("gagal parsing String "+ e.getMessage());
        }
    }
}
