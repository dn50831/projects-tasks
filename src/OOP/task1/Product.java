package OOP.task1;

public class Product {

    //Zadanie 1
    //Masz klasę:
    //Product
    //z polami:
    //id
    //nazwa
    //cena
    //Utwórz listę produktów.
    //Następnie:
    //dodaj 5 produktów,
    //usuń produkt o konkretnym id,
    //znajdź najdroższy produkt,
    //wyświetl wszystkie produkty.

    private final String name;
    private final int id;
    private int price;

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nazwa: " + name + ", Cena: " + price;
    }
}
