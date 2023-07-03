package Domen;

public class HotDrinks extends Product {
    // Поля объем и количество сахара для класса HotDrinks
    private float hotDrinksVolume;
    private int hotDrinksQuantitySugar;
    private int hotDrinksTemp;

    // Описание свойств для класса HotDrinks
    public float getHotDrinksVolume() {
        return hotDrinksVolume;
    }

    public int getHotDrinksQuantitySugar() {
        return hotDrinksQuantitySugar;
    }
    public int getHotDrinksTemp() {
        return hotDrinksTemp;
    }
    public void setHotDrinksVolume(float hotDrinksVolume) {
        this.hotDrinksVolume = hotDrinksVolume;
    }

    public void setHotDrinksTemp(int hotDrinksTemp) {
        this.hotDrinksTemp = hotDrinksTemp;
    }
    public void setHotDrinksQuantitySugar(int hotDrinksQuantitySugar) {
        this.hotDrinksQuantitySugar = hotDrinksQuantitySugar;
    }
    // Создание конструкторов для класса HotDrinks 
    public  HotDrinks(int price, int place, String name, long id){
        super(price, place, name, id);
        this.hotDrinksVolume = 0f;
        this.hotDrinksQuantitySugar = (int) 0f;
    }
    public HotDrinks (int price, int place, String name, long id, float hotDrinksVolume, int hotDrinksQuantitySugar, int hotDrinksTemp){
        super(price, place, name, id);
        this.hotDrinksVolume = hotDrinksVolume;
        this.hotDrinksQuantitySugar = hotDrinksQuantitySugar;
        this.hotDrinksTemp = hotDrinksTemp;
    }

    @Override
    public String toString() {
        return super.toString() + "Volume = " + hotDrinksVolume + " l.\n" +
        "Sugar = " + hotDrinksQuantitySugar + " g.\n" + "Temperature = " + hotDrinksTemp+ " `C.\n" ;
    }
}