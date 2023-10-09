//値より大きな方の変数に代入


public class Practice4 {
  public static void main(String[] args) {

    float f = 3; /*float型の変数にint型を代入*/
    double d = f; /*double型の変数にfloat型を代入*/

    System.out.println(f);
    System.out.println(d);
  }
}

/*
float型：小数点付きの数字で末尾がFまたはf
double型：小数点付きの数字
*/

/*
Javaの数値型は代償関係が定められている
「小さな型」の値を「大きな型」の値に代入する場合に限り
「値が自動的に箱の型に変換されて代入」される
*/