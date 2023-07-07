import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        // Создание экземпляра магазина
        Market romashka = new Market();

        // Создание клиентов магазина
        iActorBehaviour client1 = new OrdinaryClient("Иван");
        iActorBehaviour client2 = new SpecialClient("Екатерина - очень уважаемый клиент", 0001);
        iActorBehaviour retiree1 = new RetireeClient("Михаил Владимирович", 101010);
        iActorBehaviour prom1 = new PromotionalClient("Евгений Кринский", "discount 5 %", 001);
        iActorBehaviour prom2 = new PromotionalClient("Евгений Капылов", "discount 3 %", 002);
        iActorBehaviour prom3 = new PromotionalClient("Наталья Каташенко", "discount 6 %", 003);
        iActorBehaviour prom4 = new PromotionalClient("Алексей Иванов", "discount 2 %", 004);
        iActorBehaviour prom5 = new PromotionalClient("Василий Курочкин", "discount 15 %", 005);
      
        // Клиенты заходят в магазин
        romashka.acceptToMarket(client1);
        romashka.acceptToMarket(client2);
        romashka.acceptToMarket(retiree1);
        romashka.acceptToMarket(prom1);
        romashka.acceptToMarket(prom2);
        romashka.acceptToMarket(prom3);
        romashka.acceptToMarket(prom4);
        romashka.acceptToMarket(prom5);
        romashka.update();
    }
}