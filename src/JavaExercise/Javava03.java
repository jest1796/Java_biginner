package JavaExercise;

import java.util.Random;
import java.util.Scanner;

public class Javava03
{
    public static void main(String[] args) {

        String [] questions = {"猫カフェ発祥の国はどこ？\\n１：米国　２：仏国　３：日本",
        					    "世界一大きい猫は？\\n１：ラグドール　２：メインクーン　３：虎",
        					    "猫に与えてはいけない食べ物は？\n１：イカ　２：焼き魚　３：マグロ",
        					    "猫の飼育率1位の国は？\n１：ロシア　２：仏国　３：日本",
        					    "三毛猫のオスの出生確率は？\n１：50％以上　２：30％ほど　３：５％未満"};
        
        /*正解の選択肢を整数で表現*/
        int[] answers = {3, 2, 1, 1, 3}; 
        
        /*正解数のカウント*/
        int correctCount = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(questions.length);
            
            String question = questions[randomIndex];
            System.out.println(question);

            int userAnswer = scanner.nextInt(); // ユーザーの回答を整数として受け取る
             
            if (userAnswer == answers[randomIndex]) {
                System.out.println("正解！");
                correctCount++;
            } else {
                System.out.println("不正解...");
            }

        }
        scanner.close();
        System.out.println("正解数：" + correctCount);
        
    }
}
