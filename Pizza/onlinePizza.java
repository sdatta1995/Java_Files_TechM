class onlinePizza {
    float totalSales;
    
    public float order (Pizza pizza) {
        totalSales = totalSales + pizza.calPrice();
        return pizza.calPrice();
    }
    
    public float getTotalSales () {
        return totalSales;
    }
    
    public static void main (String[]args) {
        onlinePizza op = new onlinePizza();
        vegPizza vp = new vegPizza (6, "Regular");
        nonVegPizza nvp = new nonVegPizza (12, "Medium");
        vegPizza vp2 = new vegPizza (8, "Large");
        float price = op.order(vp);
        System.out.println (price);
        price = op.order(nvp);
        System.out.println (price);
        price = op.order(vp2);
        System.out.println (price);
        
        System.out.println("Thus the total amount is: " +op.getTotalSales());
    }
}