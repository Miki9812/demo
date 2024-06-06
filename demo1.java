public class demo1 {

    // 计算苹果和草莓的总价
    public static double calculateTotalPrice(int appleWeight, int strawberryWeight) {
        // 设定苹果和草莓的单价
        final double applePrice = 8.0;
        final double strawberryPrice = 13.0;

        // 计算总价
        double totalPrice = appleWeight * applePrice + strawberryWeight * strawberryPrice;

        // 返回总价
        return totalPrice;
    }

    // 示例使用
    public static void main(String[] args) {
        int apple = 5; // 假设购买了 5 斤苹果
        int strawberry = 3; // 假设购买了 3 斤草莓

        double totalCost = calculateTotalPrice(apple, strawberry);
        System.out.println("购买的商品总价是：" + totalCost + " 元");
    }
}
