package JavaExercise;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		
		 /* お札と硬貨の額を定義*/
        int[] billsAndCoins = {10000, 5000, 1000, 500, 100, 50, 10, 5,1};

        /* お札と硬貨の枚数を格納する配列*/
        int[] count = new int[9];

        /* お札と硬貨の枚数を計算*/
        for (int i = 0; i < 9; i++) {
            count[i] = amount / billsAndCoins[i];
            amount %= billsAndCoins[i];
        }
        
        /* 紙幣の枚数を表示 */
        for (int i =0; i < 3; i++ ) {
        	if (count[i] > 0) {
        		 System.out.println(billsAndCoins[i] + "札が" + count[i] + "枚");
        	}
        }
        
        /* 硬貨の枚数を表示 */
        for (int i = 3; i <  9; i++ ) {
        	if (count[i] > 0) {
        		 System.out.println(billsAndCoins[i] + "硬貨が" + count[i] + "枚");
        	}
        }
        scan.close();
	}

}
