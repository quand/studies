package pacman.core.models;

import pacman.world.models.Direction;
import pacman.world.models.Wall;

import java.awt.*;


public abstract class MoveableObject extends DrawableObject {
    public Direction direction=Direction.NONE;
    private static final int DEFAULT_VELOCITY = 3;


    public void move(){
        switch(this.direction){
            case LEFT:
                x-=DEFAULT_VELOCITY;
                break;
            case TOP:
                y-=DEFAULT_VELOCITY;
                break;
            case RIGHT:
                x+=DEFAULT_VELOCITY;
                break;
            case DOWN:
                y+=DEFAULT_VELOCITY;
                break;
        }
    }

}