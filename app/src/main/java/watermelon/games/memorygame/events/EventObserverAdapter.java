package watermelon.games.memorygame.events;

import watermelon.games.memorygame.events.engine.FlipDownCardsEvent;
import watermelon.games.memorygame.events.engine.GameWonEvent;
import watermelon.games.memorygame.events.engine.HidePairCardsEvent;
import watermelon.games.memorygame.events.ui.BackGameEvent;
import watermelon.games.memorygame.events.ui.FlipCardEvent;
import watermelon.games.memorygame.events.ui.NextGameEvent;
import watermelon.games.memorygame.events.ui.ResetBackgroundEvent;
import watermelon.games.memorygame.events.ui.ThemeSelectedEvent;
import watermelon.games.memorygame.events.ui.DifficultySelectedEvent;
import watermelon.games.memorygame.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
