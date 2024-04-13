package JavaExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		System.out.println("文字を入力してください。");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		char[] charArray = input.toCharArray();
		
		Arrays.sort(charArray);
		String sorted = new String(charArray);
		System.out.println(sorted);
		
		scan.close();
		

	}

}
