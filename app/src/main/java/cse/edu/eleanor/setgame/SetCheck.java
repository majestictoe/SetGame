package cse.edu.eleanor.setgame;

/**
 * Created by Eleanor on 4/30/18.
 */

public class SetCheck {
    Card card1;
    Card card2;
    Card card3;

    SetCheck(Card x, Card y, Card z, String[] checkSet) {
        card1 = x;
        card2 = y;
        card3 = z;
    }

    public String[] checkSet(){

        String cColorSame;
        String cNumberSame;
        String cShapeSame;
        String cShadingSame;

        if(card1.cColor() == card2.cColor() && card2.cColor() == card3.cColor() && card1.cColor() == card3.cColor()){
            cColorSame = "all";
        } else {
            if(card1.cColor() != card2.cColor() && card2.cColor() != card3.cColor() && card1.cColor() != card3.cColor()){
                cColorSame = "none";
            }
            else{
                cColorSame = "two";
            }
        }

        if(card1.cNumber() == card2.cNumber() && card2.cNumber() == card3.cNumber() && card1.cNumber() == card3.cNumber()){
            cNumberSame = "all";
        } else {
            if(card1.cNumber() != card2.cNumber() && card2.cNumber() != card3.cNumber() && card1.cNumber() != card3.cNumber()){
                cNumberSame = "none";
            }
            else{
                cNumberSame = "two";
            }
        }

        if(card1.cShape() == card2.cShape() && card2.cShape() == card3.cShape() && card1.cShape() == card3.cShape()){
            cShapeSame = "all";
        } else {
            if(card1.cShape() != card2.cShape() && card2.cShape() != card3.cShape() && card1.cShape() != card3.cShape()){
                cShapeSame = "none";
            }
            else{
                cShapeSame = "two";
            }
        }

        if(card1.cShading() == card2.cShading() && card2.cShading() == card3.cShading() && card1.cShading() == card3.cShading()){
            cShadingSame = "all";
        } else {
            if(card1.cShading() != card2.cShading() && card2.cShading() != card3.cShading() && card1.cShading() != card3.cShading()){
                cShadingSame = "none";
            }
            else{
                cShadingSame = "two";
            }
        }

        return new String[] {cColorSame, cNumberSame, cShapeSame, cShadingSame};
    }
}
