public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean addExtraCheese;
    private Boolean addExtraTopping;
    private Boolean addExtrabag;


    public  Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true){
            this.bill = "Base Price Of The Pizza: 300\n";
            this.price+=300;
        }
        else{
            this.bill = "Base Price Of The Pizza: 400\n";
            this.price+=400;
        }
        
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(addExtraCheese==false){
            this.price+=80;
            this.bill = "Extra Cheese Added: 80\n";
            
            this.addExtraCheese = true;
        }

        
    }

    public void addExtraToppings(){

        if(addExtraTopping==false){
            this.bill = "Extra Toppings Added: 70\n";
            this.price+=70;
            
            
        }
        else{
            this.bill = "Extra Toppings Added: 120\n";
            this.price+=120;
            
        }
        this.addExtraTopping = true;


        
    }

    public void addTakeaway(){

        if(addExtrabag==false){
        this.bill = "Paperbag Added: 20\n";
        this.bill +=20;
        this.addExtrabag = true;

        }

        
        
    }

    public String getBill(){

        this.bill = "Total Price: " + this.price;
        return this.bill;
        
    }
}