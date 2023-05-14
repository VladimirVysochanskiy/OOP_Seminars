package interfaces;

import java.util.List;
import classes.Actor;

/**
 * Интерфейс магазина
 */
public interface iMarketBehavior {

    /**
     * Инициализация визита клиента в магазин
     * @param actor Наименование клиента
     */
    void acceptToMarket(iActorBehavior actor);

    /**
     * Выход клиента из магазина (удаление из очереди)
     * @param actors Список обслуженных клиентов
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Финализация действий для всех клиентов в очереди
     */
    void update(); 
    
}
