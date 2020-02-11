package watermelon.games.memorygame.events;

import watermelon.games.memorygame.events.engine.FlipDownCardsEvent;
import watermelon.games.memorygame.events.engine.GameWonEvent;
import watermelon.games.memorygame.events.engine.HidePairCardsEvent;
import watermelon.games.memorygame.events.ui.BackGameEvent;
import watermelon.games.memorygame.events.ui.DifficultySelectedEvent;
import watermelon.games.memorygame.events.ui.FlipCardEvent;
import watermelon.games.memorygame.events.ui.NextGameEvent;
import watermelon.games.memorygame.events.ui.ResetBackgroundEvent;
import watermelon.games.memorygame.events.ui.StartEvent;
import watermelon.games.memorygame.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
