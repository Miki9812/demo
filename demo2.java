public class demo2 {

    // 计算苹果、草莓和芒果的总价
    public static double calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight) {
        // 设定各种水果的单价
        double applePrice = 8.0;
        double strawberryPrice = 13.0;
        double mangoPrice = 20.0;

        // 计算总价
        double totalPrice = appleWeight * applePrice + strawberryWeight * strawberryPrice + mangoWeight * mangoPrice;

        // 返回总价
        return totalPrice;
    }

    // 示例使用
    public static void main(String[] args) {
        int apple = 5; // 假设购买了 5 斤苹果
        int strawberry = 3; // 假设购买了 3 斤草莓
        int mango = 2; // 假设购买了 2 斤芒果

        double totalCost = calculateTotalPrice(apple, strawberry, mango);
        System.out.println("购买的商品总价是：" + totalCost + " 元");
    }
}
