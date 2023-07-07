package Interfaces;

/**
 * Интерфейс для описания поведения  клиентов в очереди магазина.
 */
public interface iQueueBehaviour {

    /**
     * Метод необходимый для добавления клиента в очередь.
     *
     * @param actor возвращает Клиента, который будет добавлен в очередь.
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Метод необходимый для выхода клиента из очереди.
     */
    void releaseFromQueue();

    /**
     * Метод необходимый для принятия заказа у клиента.
     */
    void takeOrder();

    /**
     * Метод необходимый для передачи заказа клиентом.
     */
    void giveOrder();
}