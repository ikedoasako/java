//プログラムで計算
public class test2 {
    public static void main(String[] args) {
        System.out.println(100 + 100);
        //複数の演算子がある場合
        System.out.println(100 + 30 + 2);/*複数の演算子がある場合は、左から順番に計算していく*/
        System.out.println(100 + 30 * 2);/*掛け算を先に計算してから足している*/
        //足し算を先に計算したい場合
        System.out.println((100 + 30) * 2);/*カッコ（）を追加,プログラムは通常の計算と同じように（）の中を優先して計算する*/
    }
}
//ターミナルで実行
//javac test2.java *classで指定したclass名が入る
//java test2