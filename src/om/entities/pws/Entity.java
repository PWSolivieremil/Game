package om.entities.pws;

import om.graphics.pws.Screen;
import om.level.pws.Level;

public abstract class Entity {

	public int x;
	public int y;
	protected Level level;
	
	public Entity(Level level) {
		init(level);
	}
	
	public final void init(Level level) {
		this.level = level;
	}
	
	public abstract void tick();
	
	public abstract void render(Screen screen);
}