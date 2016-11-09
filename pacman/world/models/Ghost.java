package pacman.world.models;

import pacman.core.models.MoveableObject;
import pacman.utils.ResourcesLoader;

import java.util.Random;

import static pacman.world.WorldManager.CELL_HEIGHT;
import static pacman.world.WorldManager.CELL_WIDTH;

public class Ghost extends MoveableObject {
    public int row;
    public int column;
    public int id=0;

    public Ghost(int row, int column,int id){
        this.row = row;
        id = id;
        direction=Direction.TOP;
        this.column = column;
        state = GhostState.STILL;
        sprite = ResourcesLoader.loadDrawableIgnoreErrors("ghost"+id+".png");
        width = sprite.getWidth(null);
        height = sprite.getHeight(null);
    }

}
