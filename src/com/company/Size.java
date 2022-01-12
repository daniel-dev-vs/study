package com.company;

enum Size {
    NONE(""),
    SMALL("it is small"),
    MEDIUM("its medium"),
    LARGE("its large");

    private final String pizzaSize;

    private Size(String pizza){
        this.pizzaSize = pizza;
    }
    public String getSize(){
        return pizzaSize;
    }

    public final String getSizeByNumber(int number){
        String size;

        switch(number){
            case 1:
                size = Size.SMALL.pizzaSize;
                break;
            case 2:
                size = Size.MEDIUM.pizzaSize;
                break;
            case 3:
                size = Size.LARGE.pizzaSize;
                break;
            default:
                size = "";
        }

        return size;
    }


}
