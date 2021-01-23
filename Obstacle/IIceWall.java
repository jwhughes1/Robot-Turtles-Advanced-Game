package Obstacle;
import Core.*;

/**
 * Interface to construct IceWall objects
 * @author Justin Hughes, Yacine Belaifa
 */
public interface IIceWall extends  ILocation
{
    public boolean isPuddle();
    public void changeWallState();

}
