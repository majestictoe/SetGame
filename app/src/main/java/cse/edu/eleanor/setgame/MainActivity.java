package cse.edu.eleanor.setgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Card[] cards = new Card[81];
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                for(int k =0; k<3; k++){
                    for(int l =0; l<3; l++){
                        cards[i*3+j*3+k*3+l] = new Card(i,j,k,l);
                    }
                }
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}