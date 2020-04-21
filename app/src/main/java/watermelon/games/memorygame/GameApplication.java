package watermelon.games.memorygame;

import android.app.Application;

import watermelon.games.memorygame.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);
	}
}
