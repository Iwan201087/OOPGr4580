package Interfaces;

import Classes.Actor;
import java.util.List;

/**
 * Интерфейс, определяющий состояния клиентов магазина.
 */
public interface iMarketBehaviour {
    /**
     * Метод необходимый для входа клиента в магазин.
     *
     * @param actor возвращает Клиента, который будет принят для обработки в магазин.
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод необходимый для выхода клиентов из магазина.
     *
     * @param actor Список клиентов, которые выходят  из магазина.
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * Метод для обновления текущего состояния магазина.
     */
    void update();
}