package watermelon.games.memorygame.events.ui;

import watermelon.games.memorygame.events.AbstractEvent;
import watermelon.games.memorygame.events.EventObserver;
import watermelon.games.memorygame.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
