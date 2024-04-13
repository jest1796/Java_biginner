package JavaExercise;

import java.util.HashMap;
import java.util.Scanner;

public class Java02 {

	public static void main(String[] args) {
		HashMap<String,String> phoneBook = new HashMap<>();
		phoneBook.put("ボンバー岡田", "090-0123-0321");
		phoneBook.put("西山　利一", "090-1100-0011");
		phoneBook.put("橋本　名人", "080-1325-5231");
		
		System.out.println("検索したい人の名前を入力してください");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		scanner.close();
		
		/*該当者の有無を判別する*/
		boolean hit = false;
		
		/*データを名前で検索*/
		for (String name : phoneBook.keySet()) {
			if (name.contains(inputName)) {
				String phoneNumber = phoneBook.get(name);
				System.out.println(name);
				System.out.println(phoneNumber);
				hit = true;
			}
		}
		
		if (hit == false) System.out.println("データに登録がありません。");
	}

}
