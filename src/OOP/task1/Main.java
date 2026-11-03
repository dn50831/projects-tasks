package OOP.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


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

        Product p1 = new Product("Buty", 1, 10);
        Product p2 = new Product("Kurtka", 2, 20);
        Product p3 = new Product("Spodnie", 3, 11);
        Product p4 = new Product("Koszula", 4, 5);
        Product p5 = new Product("Skarpety", 5, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        System.out.print(productList + " ");

        System.out.println();
        System.out.println("Najdrozszy produkt;" + findMostExpensive(productList));

        removeProductById(productList, 1);
        System.out.print(productList + " ");
    }

    public static Product findMostExpensive(List<Product> list) {
        Product product = list.get(0);
        for (Product p : list) {
            if (p.getPrice() > product.getPrice()) {
                product = p;
            }
        }
        return product;
    }

    public static void removeProductById(List<Product> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }
    }
}
