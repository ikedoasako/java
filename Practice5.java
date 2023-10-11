//　実行結果が「x+yは510」と表示されるコードを
//「x+yは15」と表示させる為に正しく動作するため修正する

public class Practice5 {
  public static void main(String[] args) {

    int x = 5;
    int y = 10;
    String ans = "x+yは" + (x + y); /*計算して1「15」と表示させる為に（）で囲む*/
    System.out.println(ans);

  }
}