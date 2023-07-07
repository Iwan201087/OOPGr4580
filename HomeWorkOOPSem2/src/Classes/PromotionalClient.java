package Classes;

/**
 * Класс, необходимый  для описания акционного клиента.
 */
public class PromotionalClient extends Actor {

    private static int participantCount; // количество участников акции
    private String promotionName;
    private int clientId;

    /**
     * Конструктор класса PromotionalClient.
     *
     * @param name          имя акционного клиента
     * @param promotionName название акции
     * @param clientId      идентификатор клиента
     */
    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantCount++;
    }

    /**
     * Метод, который позволяет получить количество участников промоакции.
     *
     * @return возвращает количество участников акции
     */
    public static int getParticipantCount() {
        return participantCount;
    }

    /**
     * Метод позволяющий получить название акции.
     *
     * @return возвращает название акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Метод позволяющий получить идентификатор клиента.
     *
     * @return возвращает идентификатор клиента
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Метод позволяющий получить имя акционного клиента.
     *
     * @return возвращает имя акционного клиента
     */
    public String getName() {
        return name;
    }

    /**
     * Метод позволяющий проверить возможность заказа.
     *
     * @return возвращает true, если акционный клиент может делать заказы, в противном случае -false */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод позволяющий проверить возможность создания заказа.
     *
     * @return возвращает true, если акционный клиент может создавать заказы, в противном случае - false
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод позволяющий проверить возможность заказа для акционного клиента.
     *
     * @param takeOrder возвращает true если клиент может делать заказы, в противном случае -  false */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    /**
     * Метод позволяющий проверить возможность создания заказа для акционного клиента.
     *
     * @param makeOrder возвращает true если клиент может создавать заказы, в противном случае -  false */
     
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Метод позволяющий получить объект акционного клиента.
     *
     * @return возвращает объект акционного клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод позволяющий делать возврат  заказа акционным клиентом.
     *
     * @param market магазин, в котором происходит возврат заказа
     */
    public void returnOrder(Market market) {
        // Описание логики возврата заказа клиентом
        market.acceptToMarket(this);
    }

    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakeReturnOrder'");
    }

    @Override
    public void setMakePaid(boolean makePaid) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakePaid'");
    }

    @Override
    public boolean isMakeReturnOrder() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakeReturnOrder'");
    }

    @Override
    public boolean isMakePaid() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakePaid'");
    }
}