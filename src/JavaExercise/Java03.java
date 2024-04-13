package JavaExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        /*1から5の順をシャッフルする*/
        Collections.shuffle( numbers,new Random());
        
        /*シャッフルしたうちの3つを取得*/
        List<Integer> selectedNumbers = numbers.subList(0, 3);
//        System.out.println(selectedNumbers.get(0));
//        System.out.println(selectedNumbers.get(1));
//        System.out.println(selectedNumbers.get(2));
        
        /*正解数*/
        int total = 0;
        
        for (int i = 0 ; i < 3 ; i++) {
        	total = quiz01(total);
        }
        
        for (int quizNumber:selectedNumbers) {
        	total = quiz(quizNumber,total);
        }
        
        System.out.println("正解数は" + total + "問でした");

	}
	public static int quiz(int quizNumber,int total) {
		switch(quizNumber) {
			case 1:
			System.out.println("猫カフェ発祥の国はどこ？");
			System.out.println("１：米国　２：仏国　３：日本");
			Scanner scanner = new Scanner(System.in);
			int answer = scanner.nextInt();
			if (answer == 3) {
				System.out.println("正解です！");
				return total+1;
			} else {
				System.out.println("不正解です。");
				return total;
			}
	}
		return total;
	
	
		
	}
	public static int quiz01(int total) {
		System.out.println("猫カフェ発祥の国はどこ？");
		System.out.println("１：米国　２：仏国　３：日本");
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		if (answer == 3) {
			System.out.println("正解です！");
			return total+1;
		} else {
			System.out.println("不正解です。");
			return total;
		}
		
		
	}

}
