public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        super.getPrice();
        super.addTakeaway();
        super.getBill();

    }
}