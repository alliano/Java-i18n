package com.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;




/**
 * untuk penulisan kode negara dan kode Bahasa susah ada setandarnya
 * unutk bahasa http://loc.gov/standards/iso639-2/php/code_list.php
 * untuk negara https://www.iban.com/country-codes
 */
public class TestResourceBundle {

	@Test
	public void testresourceBundle(){

		ResourceBundle bundle = ResourceBundle.getBundle("com.i18n.resources.message");

		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("greet"));
	}

	/**
	 * dalam resourceBundle kita bisa melakukan i18n
	 * untuk melakukan nya kita membutuhkan file properties sesuai dengan Locale nya
	 * misal jikalau kita ingin mendukung bahasa indonesia maka kita perlu membuat
	 * message_id_ID.properties -> id adalan nama bahasanya (bahasa indonesia) dan ID adalan Country nya atau negaranya
	 * untuk nama file nya bebas jadi nga harus message misla data_id_ID.properties atau english_en_us.properties dll
	 */
	@Test
	public void testresourceBundleIndonesia(){

		Locale indoensia = new Locale("id", "ID");
		ResourceBundle bundle = ResourceBundle.getBundle("com.i18n.resources.message", indoensia);

		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("greet"));
	}

	@Test
	public void testBundleJawaIndonesia(){

		Locale indoensiaJawa = new Locale("jv", "ID");
		ResourceBundle bundle = ResourceBundle.getBundle("com.i18n.resources.message", indoensiaJawa);

		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("greet"));
	}
}
