
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で除算
        int a = 10 / 0;

        // この下には実行されない！！
        System.out.println(a);

    }

}
