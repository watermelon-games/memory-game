package watermelon.games.memorygame.common;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

import watermelon.games.memorygame.MainActivity;
import watermelon.games.memorygame.engine.Engine;
import watermelon.games.memorygame.events.EventBus;

public class Shared {

	public static Context context;
	public static MainActivity activity; // it's fine for this app, but better move to weak reference
	public static Engine engine;
	public static EventBus eventBus;

}
