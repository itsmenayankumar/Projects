public class Pizza {
    private int price;
    private Boolean veg;
    private int addExtraCheesePrice = 100;
    private int addExtraToppingsPrice = 150;
    private int bagPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        }else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price+=addExtraCheesePrice;
    }
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price+=addExtraToppingsPrice;
    }
    public void takeAway() {
        isOptedForTakeAway = true;
        this.price+=bagPackPrice;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill+="Extra Cheese Added: "+ addExtraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded) {
            bill+="Extra Toppings Added: "+ addExtraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway) {
            bill+="Take Away: "+ bagPackPrice+"\n";
        }
        bill+="Bill: "+this.price+"\n";
        System.out.println(bill);
    }
}
