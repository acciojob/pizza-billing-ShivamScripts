package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheese = false;
    private boolean isPackage = false;
    private boolean isTopping = false;
    private int vegPizzaPrice = 300;
    private int nonVegPizzaPrice = 400;
    private int cheesePrice = 80;
    private int vegToppings = 70;
    private int nonVegToppings = 120;

    private final int packingCharges = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "";
        if(isVeg){
            this.price = vegPizzaPrice;
        }
        else{
            this.price = nonVegPizzaPrice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            isCheese = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping && isVeg){
            isTopping = true;
            this.price += vegToppings;
        }else if(!isTopping && !isVeg){
            isTopping = true;
            this.price += nonVegToppings;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isPackage){
            isPackage = true;
            this.price += 20;
        }
    }
    //Base Price Of The Pizza: 300
    //Extra Cheese Added: 80
    //Extra Toppings Added: 70
    //Paperbag Added: 20
    //Total Price: 470
    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill += "Base Price Of The Pizza: "+vegPizzaPrice+'\n';
        }else{
            this.bill += "Base Price Of The Pizza: "+nonVegPizzaPrice+'\n';
        }
        if(isCheese){
            this.bill += "Extra Cheese Added: "+cheesePrice+'\n';
        }
        if(isTopping && isVeg){
            this.bill += "Extra Toppings Added: "+vegToppings+"\n";
        }else if(isTopping && !isVeg){
            this.bill += "Extra Toppings Added: "+nonVegToppings+"\n";
        }
        if(isPackage){
            this.bill += "Paperbag Added: 20"+"\n";
        }
        this.bill += "Total Price: "+this.price+"\n";
        return this.bill;
    }
}
