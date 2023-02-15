package com.i18n;

import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestLocale
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }


    @Test
    public void testLocale() {

        final String language = "id";

        final String country = "ID";

        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println("\n");
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
