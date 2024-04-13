package JavaExercise;

public class Java01 {

	public static void main(String[] args) {
		/*一辺の長さ*/
		int side = 9;
		
		/*正方形のための2次元配列を設定*/
		char[][] asta = new char[side][side];
		
		for (int i = 0 ; i < side ; i++) {
			for (int j = 0 ; j < side ; j++) {
				if (i == j || j == (side / 2) || i + j == side -1) {
					asta[i][j] = '■';
				} else {
					asta[i][j] = '□';
				}
				System.out.print(asta[i][j]);			
				}
			System.out.println();	
		}
		
	}
}
