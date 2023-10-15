//練習問題2-3

//1、「ようこそ占いの館へ」と表示する
//2、画面に「あなたの名前を入力してください」と表示する
//3、キーボードから1文字入力を受付け、String型の変数nameに格納します
//4、画面に「あなたの年齢を入力してください」と表示します
//5、キーボードから1行の文字入力を受付、String型の変数ageStringに格納します
//6、変数ageStringの内容をint型に変換し、int型の変数ageに代入します
//7、0から3までの乱数を生成し、int型の変数fortuneに代入します
//8、fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にする
//9、画面に「占いの結果が出ました！」と表示する
/*10、画面に「（年齢）歳の（名前）さん、あなたの運気番号は（乱数）です」と表示する
その際に（年齢）には変数ageを、（名前）には変数nameを、そして（乱数）には8で作った数を表示する
*/
//11、画面に「1：大吉、2：中吉、3：吉、4：凶」と表示する


public class Practice6 {
  public static void main(String[] args) {

    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");

    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");

    String ageString =
      new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;

    System.out.println("占いの結果が出ました！");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1：大吉 2:中吉 3：吉 4：凶");
  }
}