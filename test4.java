//文字列データを受け取る
import java.util.*;/*1行目に記述*/
//importによってデータを受け取る機能をプログラムの中で扱えるようにしている

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);/*変数scanにはデータを受け取るための機能を割り当てている*/
        String text = scan.next();/*変数scanに.（ドット）でnextというメソットを連結させている*/
        //scan.next()では、scanが持っているnextという入力データを読み込むメソットを呼び出している
        System.out.println("Hello " + text);/*入力タブの文字列データを受け取って文字列型の変数textに代入している*/
    }
}
