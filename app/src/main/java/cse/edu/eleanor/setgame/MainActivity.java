package cse.edu.eleanor.setgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;
import java.util.Random;
import android.widget.ImageButton;

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
        }

        private static void swap(Card[] a, int i, int change) {
            Card helper = a[i];
            a[i] = a[change];
            a[change] = helper;
        }

        protected void onCreate(Bundle savedInstanceState) {
            Card[] cards = new Card[81];
            for(int i =0; i<3; i++){
                for(int j =0; j<3; j++){
                    for(int k =0; k<3; k++){
                        for(int l =0; l<3; l++){
                            //System.out.println(i + " " + j+ "");

                            System.out.println(i*27+j*9+k*3+l);
                            cards[i*27+j*9+k*3+l] = new Card(i,j,k,l);
                            System.out.println(cards[i*27+j*9+k*3+l]);
                        }
                    }
                }
            }
            shuffleArray(cards);

            System.out.println(cards);

            for(int j = 0; j<81; j++){
                System.out.println(cards[j].toString());
            }

            //how to set imagebutton image, will need this later.
            //ImageButton btn = (ImageButton)findViewById(R.id.imageButton1);
            //btn.setImageResource(R.drawable.actions_record);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}