package JavaExercise;

public class Javava06 {

	import java.util.Random;

	public class MakePassword {
	    public static void main(String[] args) {
	        // パスワードの長さを指定（ここでは10文字）
	        int length = 10;

	        // 大文字を含めるかどうか
	        boolean uppercaseFlg = true;

	        // 数字を含めるかどうか
	        boolean digitFlg = true;

	        // パスワードを生成
	        System.out.println(makePassword(length, uppercaseFlg, digitFlg));
	    }

	    private static StringBuilder makePassword(int length, boolean uppercaseFlg, boolean digitFlg) {
	        StringBuilder lowercase = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
	        StringBuilder uppercase = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	        StringBuilder digit = new StringBuilder("0123456789");

	        if (uppercaseFlg) {
	            lowercase.append(uppercase);
	        }
	        if (digitFlg) {
	            lowercase.append(digit);
	        }

	        StringBuilder password = new StringBuilder();
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            int num = rand.nextInt(lowercase.length());
	            password.append(lowercase.charAt(num));
	        }

	        return password;
	    }
	}


}
