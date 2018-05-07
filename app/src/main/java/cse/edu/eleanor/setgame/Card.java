package cse.edu.eleanor.setgame;

import android.widget.ImageButton;

public class Card {
    int color;
    int number;
    int shape;
    int shading;
    String name;
    Card(int Color,int Number,int Shape, int Shading, String cardName){
        color = Color;
        number = Number;
        shape = Shape;
        shading = Shading;
        name = cardName;
    }

    public String toString(){
        return("Color:"+color+" Number:"+number+" Shape:"+shape+" Shading: "+shading);
    }

    public String fileName(){
        return name;
    }

    //color: 0: red 1: green 2: purple
    public int cColor(){
        return color;
    }
    //number: 0: 1 1: 2 2: 3
    public int cNumber(){
        return number;
    }
    //shape: 0: squiggle 1: oval 2: diamond
    public int cShape(){
        return shape;
    }
    //shading: 0: bold 1: half 2: empty
    public int cShading(){return shading;}

}
