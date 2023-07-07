package Interfaces;

import Classes.Actor;

/**
 * Интерфейс, определяющий порядок поведения клиентов магазина.
 */
public interface iActorBehaviour {
    /**
     /**
     * Метод позволяющий проверить возможность оформления заказа  клиентом.
     *
     * @return возвращает true, если  клиент может делать заказы, в противном случае -false */
    public boolean isTakeOrder();

    /**
     * Метод позволяющий проверить возможность клиент создать заказ.
     *
     * @return возвращает true, если  клиент может создавать заказы, в противном случае -false 
     */
    public boolean isMakeOrder();

    /**
     * Метод позволяющий установить возможность принимать заказ клиентом.
     *
     * @param takeOrder true, чтобы разрешить клиенту принимать заказ, false в
     *                  противном случае.
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * Устанавливает возможность клиенту создавать заказ.
     *
     * @param makeOrder true, чтобы разрешить клиенту создавать заказ, false в
     *                  противном случае.
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Возвращает экземпляр класса Actor, связанного с данным сценарием поведения.
     *
     * @return возвращает экземпляр класса Actor.
     */
    Actor getActor();
}