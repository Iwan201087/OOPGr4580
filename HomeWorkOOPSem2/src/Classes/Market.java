package Classes;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    /**
     * Файл, в котором будет храниться запись лога работы магазина
     */
    private FileWriter logFile;

    /**
     * Очередь клиентов
     */
    private List<iActorBehaviour> queue;

    /**
     * Максимально допустимое количество клиентов учавствующих в промоакции 
     */
    private int maxPromoClientCount;

    /**
     * Текущее значение количества клиентов промоакции
     */
    private int promoClientCount;

    private List<Actor> visitedActors; // Список  клиентов которые посетили магазин
    private List<Actor> successfulPurchaseActors; // Список клиентов, которые успешно купили товар

    /**
     * Конструктор класса Market( он будет инициализировать список очереди, а так же создавать файл для записи лога работы магазина.
     */
    public Market() {
        this.queue = new ArrayList<>();
        this.maxPromoClientCount = 4;
        this.promoClientCount = 0;
        this.visitedActors = new ArrayList<>();
        this.successfulPurchaseActors = new ArrayList<>();

        // Создание файла для записи лога работы магазина
        try {
            logFile = new FileWriter("logStore.txt");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла лога работы магазина: " + e.getMessage());// сообщение об ошибке создания лога работы магазина
        }
    }

    /**
     * Метод необходимый для  добавления клиента в магазин.
     *
     * @param actor Клиент, который реализует интерфейс iActorBehaviour.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " (клиент пришел в магазин)");
        if (actor instanceof PromotionalClient) {
            if (promoClientCount >= maxPromoClientCount) {
                System.out.println("Акционному клиенту " + actor.getActor().getName() +
                        " отказано в обслуживании, так как  превышено количества участников промоакции)");
                return;
            } else
                promoClientCount++;
        }
        takeInQueue(actor);
    }

    /**
     * Метод, необходимый для добавления клиента в очередь.
     *
     * @param actor Клиент, который реализует интерфейс iActorBehaviour.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " (клиент добавлен в очередь)");
    }

    /**
     * Метод, необходимый  для обновления текущего состояния магазина( вызывает методы takeOrder(), giveOrder() и releaseFromQueue())
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод, необходимый  для приема заказа от клиента.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " (у клиента принят заказ)");
                try {
                    logFile.write(actor.getActor().getName() + " (клиент сделал заказ товара)\n");
                    logFile.flush();
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл лога работы магазина: " + e.getMessage());
                }
            }
        }
    }

    /**
     * Метод, необходимый для реализации выдачи заказа клиенту.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " (клиенту передали заказ)");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " (клиент вышел из очереди)");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод, необходимый  для выхода (освобождения маста в очереди) клиентов из магазина.
     *
     * @param actors Список клиентов, которым необходимо освободить место в очереди.
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " (клиент вышел из магазина)");
            queue.remove(actor);
            successfulPurchaseActors.add(actor);
            try {
                logFile.write(actor.getName() + " (клиент успешно приобрел товар)\n");
                logFile.flush();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл лога работы магазина: " + e.getMessage());
            }
        }
    }

    /**
     * Метод, необходимый для реализации закрытия файла лога, а так же закрывает файл, с записью лога работы магазина.
     */
    public void closeLogFile() {
        try {
            logFile.close();
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла лога работы магазина: " + e.getMessage());
        }
    }
}