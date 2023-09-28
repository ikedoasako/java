//ゼロ・プラス・マイナスを繰り返し判定する
//(1)受け取った整数データを表示する
//(2)受け取った整数の回数分処理を繰り返す

//a.受け取った整数が0の場合「xは0」のメッセージを表示させる
//（xの部分は受け取った整数が入る）
//b.受け取った整数が0より大きい場合「xはプラス」
//c.受け取った整数がそれ以外の場合「xはマイナス」

import java.util.*;


public class test12_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            //System.out.println(number);

            if (number == 0) {
                System.out.println(number + "は" + number);
            } else if (number > 0) {
                System.out.println(number + "はプラス");
            } else {
                System.out.println(number + "はマイナス");
            }
        }
    }
}