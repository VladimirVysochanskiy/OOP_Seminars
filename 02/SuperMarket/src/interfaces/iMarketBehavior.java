package interfaces;

import java.util.List;
import classes.Actor;

public interface iMarketBehavior {

    void acceptToMarket(iActorBehavior actor);
    void releaseFromMarket(List<Actor> actors);
    void update(); 
    
}
