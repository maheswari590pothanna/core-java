package string;

import java.util.Scanner;

public class CharacterFrequency {

	static void frequency(String str) {
		int[] count = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + "->" + count[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("accept the string");
		String str = sc.nextLine();
		frequency(str);

	}

}
