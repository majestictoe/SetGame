package cse.edu.eleanor.setgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton[] cards = new ImageButton[0];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        for(int j=0; j<3; j++) {
            for (int k=0; k<7; k++) {
                //instead of myButton being an ImageButton, it should probably be an object that incorporates ImageButtons.
                ImageButton myButton = new ImageButton(this);
                cards[(7*j)+k] = myButton;
                //android:id="@+id/buttonContainer"
                //how to set image?
                //myButton.();
            }
        }
    }
}
