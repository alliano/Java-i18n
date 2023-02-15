package com.i18n;

import java.util.Locale;

public class Main {

	private static final String language = "id";

	private static final String country = "ID";
	public static void main(String[] args) {

		Locale locale = new Locale(language, country);

		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());

		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
	}
}
