public class demo3 {

    // 计算苹果、打折草莓和芒果的总价
    public static double calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight){

        // 设定各种水果的单价
        double applePrice = 8.0;
        double strawberryPrice = 13.0;
        double mangoPrice = 20.0;

        // 计算草莓的打折后单价
        double discountedStrawberryPrice = strawberryPrice * 0.8;

        // 计算总价
        double totalPrice = appleWeight * applePrice + strawberryWeight * strawberryPrice + mangoWeight*discountedStrawberryPrice;

        return totalPrice;
    }


    public static void main(String[] args) {
        int appleWeight = 5; // 假设购买了 5 斤苹果
        int strawberryWeight = 3; // 假设购买了 3 斤草莓
        int mangoWeight = 2; // 假设购买了 2 斤芒果

        double totalCost = calculateTotalPrice(appleWeight, strawberryWeight, mangoWeight);
        System.out.println("购买的商品总价是：" + totalCost + " 元");
    }
}
