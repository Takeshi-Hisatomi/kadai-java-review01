
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax = 0.1;
        int result = tax(price, tax);
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result + "円）です。");
    }
    //消費税額の計算
    public static int tax(int price, double tax) {
        double pit = price * tax;
        return (int)pit;
    }

}
