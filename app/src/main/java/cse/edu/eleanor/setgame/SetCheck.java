package cse.edu.eleanor.setgame;

/**
 * Created by Eleanor on 4/30/18.
 */

public class SetCheck {
    Card card1;
    Card card2;
    Card card3;

    SetCheck(Card x, Card y, Card z) {
        card1 = x;
        card2 = y;
        card3 = z;
    }

    public int[] checkSet(){

        int cColorSame;
        int cNumberSame;
        int cShapeSame;
        int cShadingSame;

        if(card1.cColor() == card2.cColor() && card2.cColor() == card3.cColor() && card1.cColor() == card3.cColor()){
            cColorSame = 3;
        } else {
            if(card1.cColor() != card2.cColor() && card2.cColor() != card3.cColor() && card1.cColor() != card3.cColor()){
                cColorSame = 0;
            }
            else{
                cColorSame = 2;
            }
        }

        if(card1.cNumber() == card2.cNumber() && card2.cNumber() == card3.cNumber() && card1.cNumber() == card3.cNumber()){
            cNumberSame = 3;
        } else {
            if(card1.cNumber() != card2.cNumber() && card2.cNumber() != card3.cNumber() && card1.cNumber() != card3.cNumber()){
                cNumberSame = 0;
            }
            else{
                cNumberSame = 2;
            }
        }

        if(card1.cShape() == card2.cShape() && card2.cShape() == card3.cShape() && card1.cShape() == card3.cShape()){
            cShapeSame = 3;
        } else {
            if(card1.cShape() != card2.cShape() && card2.cShape() != card3.cShape() && card1.cShape() != card3.cShape()){
                cShapeSame = 0;
            }
            else{
                cShapeSame = 2;
            }
        }

        if(card1.cShading() == card2.cShading() && card2.cShading() == card3.cShading() && card1.cShading() == card3.cShading()){
            cShadingSame = 3;
        } else {
            if(card1.cShading() != card2.cShading() && card2.cShading() != card3.cShading() && card1.cShading() != card3.cShading()){
                cShadingSame = 0;
            }
            else{
                cShadingSame = 2;
            }
        }

        return new int[] {cColorSame, cNumberSame, cShapeSame, cShadingSame};
    }

    public boolean isSet(int[] setCheckResults){
        if(setCheckResults[0] != 2 && setCheckResults[1] != 2 && setCheckResults[2] != 2 && setCheckResults[3] !=2) {
            return true;
        }else{
            return false;
        }
    }
}
