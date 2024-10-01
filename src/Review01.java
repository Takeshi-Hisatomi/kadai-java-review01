
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax = 1.1;
        int result1;
        int result2;
        result1 = taxMethod1(price, tax);
        result2 = taxMethod2(result1, price);
        System.out.println(price + "円の商品の税込価格は" + result1 + "円（消費税は" + result2 + "円）です。");
    }
    //税込価格の計算
    public static int taxMethod1(int price, double tax) {
        double pit1 = price * tax;
        return (int)pit1;
    }
    //消費税の計算
    public static int taxMethod2(int result1, int price) {
        int pit2 = result1 - price;
        return pit2;
    }

}
