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

    public String setExplanation(int[] setCheckResults){
        String colorStatus;
        String numberStatus;
        String shapeStatus;
        String shadingStatus;

        if(setCheckResults[0] != 2){
            colorStatus = "";
        }else{
            colorStatus = "Two of the colors are the same, and one is different. ";
        }

        if(setCheckResults[1] != 2){
            numberStatus = "";
        }else{
            numberStatus = "Two of the numbers are the same, and one is different. ";
        }

        if(setCheckResults[2] != 2){
            shapeStatus = "";
        }else{
            shapeStatus = "Two of the shapes are the same, and one is different. ";
        }

        if(setCheckResults[3] != 2){
            shadingStatus = "";
        }else{
            shadingStatus = "Two of the shapes are the same, and one is different. ";
        }

        if(isSet(setCheckResults)) {
            return "Congratulations! You have a set!";
        }else{
            return "If two of any attribute are the same while one is different, it is not a set. "+colorStatus + numberStatus + shapeStatus + shadingStatus;
        }
    }
}
