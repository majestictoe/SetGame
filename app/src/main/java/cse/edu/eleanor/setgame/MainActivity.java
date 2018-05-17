package cse.edu.eleanor.setgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;

import java.util.Arrays;
import java.util.Random;

import 	android.widget.ImageButton;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    boolean button0Toggled = false;
    boolean button1Toggled = false;
    boolean button2Toggled = false;
    boolean button3Toggled = false;
    boolean button4Toggled = false;
    boolean button5Toggled = false;
    boolean button6Toggled = false;
    boolean button7Toggled = false;
    boolean button8Toggled = false;
    boolean button9Toggled = false;
    boolean button10Toggled = false;
    boolean button11Toggled = false;
    boolean button12Toggled = false;
    boolean button13Toggled = false;
    boolean button14Toggled = false;
    boolean button15Toggled = false;
    boolean button16Toggled = false;
    boolean button17Toggled = false;
    Card[] betaCards = new Card[18];

        public void shuffleArray(Card[] a) {
            int n = a.length;
            Random random = new Random();
            random.nextInt();
            for (int i = 0; i < n; i++) {
                int change = i + random.nextInt(n - i);
                swap(a, i, change);
            }
            System.out.println(Arrays.toString(a));
            int[] buttonIDs = new int[] {R.id.imageButton0, R.id.imageButton1, R.id.imageButton2,R.id.imageButton3, R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9, R.id.imageButton10, R.id.imageButton11, R.id.imageButton12, R.id.imageButton13, R.id.imageButton14, R.id.imageButton15, R.id.imageButton16, R.id.imageButton17};
            for(int i=0; i<buttonIDs.length; i++) {
                ImageButton b =findViewById(buttonIDs[i]);
                System.out.println(a[i].fileName());
                if (a[i].fileName().equals("card0000")) {
                    System.out.println("Hi from card0000");
                    b.setImageResource(R.drawable.card0000);
                }
                if(a[i].fileName().equals("card0001")){
                    b.setImageResource(R.drawable.card0001);
                }
                if(a[i].fileName().equals("card0002")){
                    b.setImageResource(R.drawable.card0002png);
                }
                if(a[i].fileName().equals("card0200")){
                    b.setImageResource(R.drawable.card0200);
                }
                if(a[i].fileName().equals("card0201")){
                    b.setImageResource(R.drawable.card0201);
                }
                if(a[i].fileName().equals("card0202")){
                    b.setImageResource(R.drawable.card0202);
                }
                if(a[i].fileName().equals("card1000")){
                    b.setImageResource(R.drawable.card1000);
                }
                if(a[i].fileName().equals("card1001")){
                    b.setImageResource(R.drawable.card1001);
                }
                if(a[i].fileName().equals("card1002")){
                    b.setImageResource(R.drawable.card1002);
                }
                if(a[i].fileName().equals("card1200")){
                    b.setImageResource(R.drawable.card1200);
                }
                if(a[i].fileName().equals("card1201")){
                    b.setImageResource(R.drawable.card1201);
                }
                if(a[i].fileName().equals("card1202")){
                    b.setImageResource(R.drawable.card1202);
                }
                if(a[i].fileName().equals("card2000")){
                    b.setImageResource(R.drawable.card2000);
                }
                if(a[i].fileName().equals("card2001")){
                    b.setImageResource(R.drawable.card2001);
                }
                if(a[i].fileName().equals("card2002")){
                    b.setImageResource(R.drawable.card2002);
                }
                if(a[i].fileName().equals("card2200")){
                    b.setImageResource(R.drawable.card2200);
                }
                if(a[i].fileName().equals("card2201")){
                    b.setImageResource(R.drawable.card2201);
                }
                if(a[i].fileName().equals("card2202")){
                    b.setImageResource(R.drawable.card2202);
                }
            }
        }

        private static void swap(Card[] a, int i, int change) {
            Card helper = a[i];
            a[i] = a[change];
            a[change] = helper;
        }

        public void button0Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton0);
            if(button0Toggled){
                button.getBackground().setAlpha(255);
                button0Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button0Toggled = true;
            }
        }
        public void button1Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton1);
            if(button1Toggled){
                button.getBackground().setAlpha(255);
                button1Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button1Toggled = true;
            }
        }
        public void button2Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton2);
            if(button2Toggled){
                button.getBackground().setAlpha(255);
                button2Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button2Toggled = true;
            }
        }
        public void button3Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton3);
            if(button3Toggled){
                button.getBackground().setAlpha(255);
                button3Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button3Toggled = true;
            }
        }
        public void button4Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton4);
            if(button4Toggled){
                button.getBackground().setAlpha(255);
                button4Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button4Toggled = true;
            }
        }
        public void button5Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton5);
            if(button5Toggled){
                button.getBackground().setAlpha(255);
                button5Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button5Toggled = true;
            }
        }
        public void button6Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton6);
            if(button6Toggled){
                button.getBackground().setAlpha(255);
                button6Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button6Toggled = true;
            }
        }
        public void button7Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton7);
            if(button7Toggled){
                button.getBackground().setAlpha(255);
                button7Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button7Toggled = true;
            }
        }
        public void button8Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton8);
            if(button8Toggled){
                button.getBackground().setAlpha(255);
                button8Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button8Toggled = true;
            }
        }
        public void button9Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton9);
            if(button9Toggled){
                button.getBackground().setAlpha(255);
                button9Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button9Toggled = true;
            }
        }
        public void button10Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton10);
            if(button10Toggled){
                button.getBackground().setAlpha(255);
                button10Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button10Toggled = true;
            }
        }
        public void button11Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton11);
            if(button11Toggled){
                button.getBackground().setAlpha(255);
                button11Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button11Toggled = true;
            }
        }
        public void button12Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton12);
            if(button12Toggled){
                button.getBackground().setAlpha(255);
                button12Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button12Toggled = true;
            }
        }
        public void button13Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton13);
            if(button13Toggled){
                button.getBackground().setAlpha(255);
                button13Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button13Toggled = true;
            }
        }
        public void button14Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton14);
            if(button14Toggled){
                button.getBackground().setAlpha(255);
                button14Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button14Toggled = true;
            }
        }
        public void button15Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton15);
            if(button15Toggled){
                button.getBackground().setAlpha(255);
                button15Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button15Toggled = true;
            }
        }
        public void button16Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton16);
            if(button16Toggled){
                button.getBackground().setAlpha(255);
                button16Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button16Toggled = true;
            }
        }
        public void button17Toggle(View view){
            ImageButton button = findViewById(R.id.imageButton17);
            if(button17Toggled){
                button.getBackground().setAlpha(255);
                button17Toggled = false;
            }else{
                button.getBackground().setAlpha(45);
                button17Toggled = true;
            }
        }

        public int toggledNumberCheck(){
            boolean[] buttonToggles = new boolean[] {button0Toggled, button1Toggled, button2Toggled, button3Toggled, button4Toggled, button5Toggled, button6Toggled, button7Toggled, button8Toggled, button9Toggled, button10Toggled, button11Toggled, button12Toggled, button13Toggled, button14Toggled, button15Toggled, button16Toggled, button17Toggled};
            int amount = 0;
            for(int i = 0; i<18; i++){
                if(buttonToggles[i] = true){
                    amount++;
                }else{
                }
            }
            System.out.println(amount+" cards selected.");
            return amount;
        }

        public int[] whichToggled(){
            boolean[] buttonToggles = new boolean[] {button0Toggled, button1Toggled, button2Toggled, button3Toggled, button4Toggled, button5Toggled, button6Toggled, button7Toggled, button8Toggled, button9Toggled, button10Toggled, button11Toggled, button12Toggled, button13Toggled, button14Toggled, button15Toggled, button16Toggled, button17Toggled};
            int amount = 0;
            int[] A = {0,0,0};
            for(int i = 0; i<18; i++){
                if(buttonToggles[i] = true){
                    amount++;
                    A[amount] = i;
                }else{
                }
            }
            return A;
        }

        public void setCheckOnClick(View view){
            int[] buttonIDs = new int[] {R.id.imageButton0, R.id.imageButton1, R.id.imageButton2,R.id.imageButton3, R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7, R.id.imageButton8, R.id.imageButton9, R.id.imageButton10, R.id.imageButton11, R.id.imageButton12, R.id.imageButton13, R.id.imageButton14, R.id.imageButton15, R.id.imageButton16, R.id.imageButton17};
            boolean[] buttonToggles = new boolean[] {button0Toggled, button1Toggled, button2Toggled, button3Toggled, button4Toggled, button5Toggled, button6Toggled, button7Toggled, button8Toggled, button9Toggled, button10Toggled, button11Toggled, button12Toggled, button13Toggled, button14Toggled, button15Toggled, button16Toggled, button17Toggled};
            if(toggledNumberCheck() == 2 ){
                int[] toggledList = whichToggled();
                for(int i = 0; i<18; i++) {
                    ImageButton button = findViewById(buttonIDs[i]);
                    button.getBackground().setAlpha(255);
                    buttonToggles[i] = false;
                }
                SetCheck check = new SetCheck(betaCards[toggledList[0]], betaCards[toggledList[1]], betaCards[toggledList[2]]);
                if(check.isSet(check.checkSet())){
                   //where I'd remove cards
                }else{

                }
                System.out.println(check.setExplanation(check.checkSet()));
            }else{
                for(int i = 0; i<18; i++) {
                    ImageButton button = findViewById(buttonIDs[i]);
                    button.getBackground().setAlpha(255);
                    buttonToggles[i] = false;
                }
                System.out.println("Please select three cards and try again.");
            }
        }

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

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            shuffleArray(betaCards);
    }
}