package watermelon.games.memorygame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class WelcomeActivity extends FragmentActivity {

    int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.wellcome_sound);
        mediaPlayer.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mySuperIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(mySuperIntent);

                finish();

            }
        }, SPLASH_TIME);
    }
}
