package cse.edu.eleanor.setgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;

import java.util.Arrays;
import java.util.Random;

import 	android.widget.ImageButton;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    //@Override
        public static void shuffleArray(Card[] a) {
            int n = a.length;
            Random random = new Random();
            random.nextInt();
            for (int i = 0; i < n; i++) {
                int change = i + random.nextInt(n - i);
                swap(a, i, change);
            }
            System.out.println(Arrays.toString(a));
        }

        private static void swap(Card[] a, int i, int change) {
            Card helper = a[i];
            a[i] = a[change];
            a[change] = helper;
        }

        //stolen from stackOverflow
        //not working >:(

//        public int getDrawableId(String name){
//            try {
//                Field fld = R.drawable.class.getField(name);
//                return fld.getInt(null);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return -1;
//        }

        protected void onCreate(Bundle savedInstanceState) {
            //code for when I make the whole deck of 81.
//            Card[] cards = new Card[81];
//            for(int i =0; i<3; i++){
//                for(int j =0; j<3; j++){
//                    for(int k =0; k<3; k++){
//                        for(int l =0; l<3; l++){
//                            //System.out.println(i + " " + j+ "");
//
//                            System.out.println(i*27+j*9+k*3+l);
//                            String cardName = "card"+Integer.toString(i)+Integer.toString(j)+Integer.toString(k)+Integer.toString(l);
//                            cards[i*27+j*9+k*3+l] = new Card(i,j,k,l,cardName);
//                            System.out.println(cards[i*27+j*9+k*3+l]);
//                        }
//                    }
//                }
//            }
//            shuffleArray(cards);
//
//            System.out.println(cards);
//
//            for(int j = 0; j<81; j++){
//                System.out.println(cards[j].toString());
//            }

            Card[] betaCards = new Card[18];
            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    for(int k = 0; k<2; k++){
                        String cardName;
                        System.out.println(k*9+j*3+i);
                        if(k==0) {
                            cardName = "card" + Integer.toString(i) + Integer.toString(k) + Integer.toString(0) + Integer.toString(j);
                        }else{
                            cardName = "card" + Integer.toString(i) + Integer.toString(k+1) + Integer.toString(0) + Integer.toString(j);
                        }
                        betaCards[k*9+j*3+i] = new Card(i,k,0,j,cardName);
                        System.out.println(betaCards[k*9+j*3+i]);
                    }
                }
            }

            System.out.println(Arrays.toString(betaCards));

            shuffleArray(betaCards);

            //how to set imagebutton image, will need this later.
            //ImageButton btn = (ImageButton)findViewById(R.id.imageButton1);
            //btn.setImageResource(R.drawable.actions_record);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            int[] buttonIDs = new int[] {R.id.imageButton0, R.id.imageButton1, R.id.imageButton2,R.id.imageButton3, R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9, R.id.imageButton10, R.id.imageButton11, R.id.imageButton12, R.id.imageButton13, R.id.imageButton14, R.id.imageButton15, R.id.imageButton16, R.id.imageButton17};
            for(int i=0; i<buttonIDs.length; i++) {
                ImageButton b =findViewById(buttonIDs[i]);
                System.out.println(betaCards[i].fileName());
                if (betaCards[i].fileName().equals("card0000")) {
                    System.out.println("Hi from card0000");
                    b.setImageResource(R.drawable.card0000);
                }
                if(betaCards[i].fileName().equals("card0001")){
                    b.setImageResource(R.drawable.card0001);
                }
                if(betaCards[i].fileName().equals("card0002")){
                    b.setImageResource(R.drawable.card0002png);
                }
                if(betaCards[i].fileName().equals("card0200")){
                    b.setImageResource(R.drawable.card0200);
                }
                if(betaCards[i].fileName().equals("card0201")){
                    b.setImageResource(R.drawable.card0201);
                }
                if(betaCards[i].fileName().equals("card0202")){
                    b.setImageResource(R.drawable.card0202);
                }
                if(betaCards[i].fileName().equals("card1000")){
                    b.setImageResource(R.drawable.card1000);
                }
                if(betaCards[i].fileName().equals("card1001")){
                    b.setImageResource(R.drawable.card1001);
                }
                if(betaCards[i].fileName().equals("card1002")){
                    b.setImageResource(R.drawable.card1002);
                }
                if(betaCards[i].fileName().equals("card1200")){
                    b.setImageResource(R.drawable.card1200);
                }
                if(betaCards[i].fileName().equals("card1201")){
                    b.setImageResource(R.drawable.card1201);
                }
                if(betaCards[i].fileName().equals("card1202")){
                    b.setImageResource(R.drawable.card1202);
                }
                if(betaCards[i].fileName().equals("card2000")){
                    b.setImageResource(R.drawable.card2000);
                }
                if(betaCards[i].fileName().equals("card2001")){
                    b.setImageResource(R.drawable.card2001);
                }
                if(betaCards[i].fileName().equals("card2002")){
                    b.setImageResource(R.drawable.card2002);
                }
                if(betaCards[i].fileName().equals("card2200")){
                    b.setImageResource(R.drawable.card2200);
                }
                if(betaCards[i].fileName().equals("card2201")){
                    b.setImageResource(R.drawable.card2201);
                }
                if(betaCards[i].fileName().equals("card2202")){
                    b.setImageResource(R.drawable.card2202);
                }
                //Drawable d = Drawable.createFromPath(betaCards[i].fileName());
                //b.setBackgroundResource(getDrawableId(betaCards[i].fileName()));
                //https://stackoverflow.com/questions/5834221/android-drawable-from-file-path
            }
    }
}