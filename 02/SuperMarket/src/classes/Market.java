package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.iActorBehavior;
import interfaces.iMarketBehavior;
import interfaces.iQueueBehavior;

/**
 * Магазин
 */
public class Market implements iMarketBehavior,iQueueBehavior {
    //private List<Actor> queue;
    private List<iActorBehavior> queue;

    /**
     * Конструктор магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }

    /**
     * Инициализация визита клиента в магазин
     * @param actor Наименование клиента
     */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Постановка клиента в очередь
     * @param actor Наименование клиента
     */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * Выход клиента из магазина (удаление из очереди)
     * @param actors Список обслуженных клиентов
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    /**
     * Финализация действий для всех клиентов в очереди
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    /**
     * Проставление отметок о получении заказа клиентам в очереди
     */
    @Override
    public void giveOrder() {
        for(iActorBehavior actor: queue)
        {
            if(actor.isMakeOrder() && !actor.isReturnGoods())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }

    /**
     * Завершение обслуживания (добавление обслуженных клиентов в список на удаление из очереди )
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehavior actor:queue)
       {
        if(actor.isTakeOrder() || actor.isReturnGoods())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }

    /**
     * Установка отметок об активных заказах для клиентов в очереди.
     */
    @Override
    public void takeOrder() {
        for(iActorBehavior actor:queue)
        {
            if(!actor.isMakeOrder() && !actor.isReturnGoods())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
}