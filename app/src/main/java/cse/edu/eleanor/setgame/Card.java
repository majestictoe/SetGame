package cse.edu.eleanor.setgame;

import android.widget.ImageButton;

public class Card {
    int color;
    int number;
    int shape;
    int shading;
    Card(int Color,int Number,int Shape, int Shading){
        color = Color;
        number = Number;
        shape = Shape;
        shading = Shading;
    }

    public String toString(){
        return("Color:"+color+" Number:"+number+" Shape:"+shape+" Shading: "+shading);
    }

    public int cColor(){
        return color;
    }

    public int cNumber(){
        return number;
    }

    public int cShape(){
        return shape;
    }

    public int cShading(){
        return shading;
    }

}
