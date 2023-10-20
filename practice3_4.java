//冗長ですっきりしないソースコード

public class practice3_4 {
  public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");

    int fortune = new java.util.Random().nextInt(4) + 1;
    /*if (fortune == 1) {
      System.out.println("大吉");
    } else if (fortune == 2) {
      System.out.println("中吉");
    } else if (fortune == 3) {
      System.out.println("吉");
    } else {
     System.out.println("凶");*/


    //if文からswitch文に変更してコードをシンプルにする
    //switch文に書き換えることができる条件

    /*（1）全ての条件式が「変数 == 値」や「変数 == 変数」のように左辺と右辺が
    一致するかを比較する式になっており、それ以外の「>」や「<」または「!=」などが
    使われていないこと！

    （2）比較する値が整数（byte型、short型、int型のいずれか）、文字列（String型）
    または文字（char型）であり、少数や真偽値ではないこと！
    */

    switch(fortune) {
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      default:
        System.out.println("凶");
    }
    /*
    switchの直後に書くのは条件式（foutune == 1など）ではなく、変数名（今回はfortune）
    case（「〜の場合は」の横には値を書き、その後ろにはコロン：を記述する）
    caseラベル、またはラベルと呼ぶ
    case以降の処理の文末には忘れずにbreak文を記述する
    default：（デフォルトラベル）は、条件にカ合致しない時の処理が不要な場合は省略可能
    */
  }
}

//このコードには条件式が3つ（if, else if, else）含まれている
/*
条件式全て「fortune == 整数」になっている
このように同じ変数に対して繰り返し比較を行っており
なおかつ、その次に挙げる条件も満たす場合にはif文よりスマートなswitch分に
書き換えることができる
*/