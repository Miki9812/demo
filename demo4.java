public class demo4 {

    // 计算苹果、草莓和芒果的总价，并考虑满减活动
    public static double calculateTotalPriceWithPromotion(int appleWeight, int strawberryWeight, int mangoWeight) {
        // 设定各种水果的单价
        final double applePrice = 8.0;
        final double strawberryPrice = 13.0 * 0.8; // 草莓打8折
        final double mangoPrice = 20.0;

        // 计算各种水果的总价
        double totalPrice = appleWeight * applePrice + strawberryWeight * strawberryPrice + mangoWeight * mangoPrice;

        // 应用满减促销活动（满100减10）
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }

        // 返回总价
        return totalPrice;
    }

    // 示例使用
    public static void main(String[] args) {
        int appleWeight = 5; // 假设购买了 5 斤苹果
        int strawberryWeight = 3; // 假设购买了 3 斤草莓
        int mangoWeight = 2; // 假设购买了 2 斤芒果

        double totalCost = calculateTotalPriceWithPromotion(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("购买的商品总价是：" + totalCost + " 元");
    }
}


