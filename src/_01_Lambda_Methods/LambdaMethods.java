package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static Random rando = new Random();

	public static void main(String[] args) {
		/** 1. Look at the SpecialPrinter function interface. */

		/*
		 * Here is an example of calling the printCustomMessage method with a lambda. //
		 * This prints the passed in String 10 times.
		 */
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		/**
		 * 2. Call the printCustomMessage method using a lambda so that the String
		 * prints backwards.
		 */
		printCustomMessage((s) -> {
			String ret = "";
			for (char c : s.toCharArray()) {
				ret = c + ret;
			}
			System.out.println(ret);
		}, "repeat");
		/**
		 * 3. Call the printCustomMessage method using a lambda so that the String
		 * prints with a mix between upper an lower case characters.
		 */
		printCustomMessage((s) -> {
			String ret = "";
			for (char c : s.toCharArray()) {
				if (rando.nextBoolean()) {
					ret = ret + s.valueOf(c).toUpperCase();
				} else {
					ret = ret + s.valueOf(c).toLowerCase();
				}
			}
			System.out.println(ret);
		}, "repeat");
		/**
		 * 4. Call the printCustomMessage method using a lambda so that the String
		 * prints with a period in between each character.
		 */
		printCustomMessage((s) -> {
			String ret = "";
			for (char c : s.toCharArray()) {
				ret = ret + c + ".";
			}
			System.out.println(ret);
		}, "repeat");
		/**
		 * 5. Call the printCustomMessage method using a lambda so that the String
		 * prints without any vowels.
		 */
		printCustomMessage((s) -> {
			String ret = "";
			for (char c : s.toCharArray()) {
				String vowels = "aAeEiIoOuU";
				boolean isVow = false;
				for (char v : vowels.toCharArray()) {
					if (c == v) {
						isVow = true;
					}
				}
				if (!isVow) {
					ret = ret + c;
				}

			}
			System.out.println(ret);
		}, "repeat");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
