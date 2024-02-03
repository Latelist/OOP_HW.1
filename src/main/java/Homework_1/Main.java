package Homework_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    /** Каталог товаров. */
    public static ArrayList<Product> catalog = new ArrayList<>();
    static Random rand = new Random();

    public static void main(String[] args) {
        addProduct("Чипсики", 15, 200500, Categories.FOOD);
        addProduct("Пивасик", 20, 100500, Categories.DRINKS);
        addProduct("Картошечка", 5, 10, Categories.FOOD);
        addProduct("Кока-кола", 13, 9, Categories.DRINKS);
        addProduct("Куртка Бейна", 200, 27, Categories.CLOTHES);
        addProduct("Перчатки без пальцев", 50, 14, Categories.CLOTHES);
        addProduct("Блокнотик", 19, 3, Categories.STATIONERY);
        addProduct("Перьевая ручка", 90, 2, Categories.STATIONERY);
        System.out.println(catalogToString(catalog));
        System.out.println("");

        Category clothes = new Category(Categories.CLOTHES, catalog);
        System.out.println(clothes.toString());

        Category stationery = new Category(Categories.STATIONERY, catalog);
        System.out.println(stationery.toString());

        Category food = new Category(Categories.FOOD, catalog);
        System.out.println(food.toString());

        Category drinks = new Category(Categories.DRINKS, catalog);
        System.out.println(drinks.toString());
        System.out.println("");

        User user0 = new User();
        user0.getUserBasket().addToBasket(catalog.get(rand.nextInt(catalog.size())), catalog);
        System.out.println(user0);
        System.out.println(user0.userBasketToString());
        System.out.println("");

        User user1 = new User();
        user1.getUserBasket().addToBasket(catalog.get(rand.nextInt(catalog.size())), catalog);
        user1.getUserBasket().addToBasket(catalog.get(rand.nextInt(catalog.size())), catalog);
        user1.getUserBasket().addToBasket(catalog.get(rand.nextInt(catalog.size())), catalog);

        System.out.println(user1);
        System.out.println(user1.userBasketToString());
        System.out.println("");

        System.out.println(catalogToString(catalog));
    }

    /**
     * Добавить продукты в каталог.
     *
     * @param productName Название продукта.
     * @param productPrice Цена продукта.
     * @param rating Рейтинг продукта.
     * @param categories Категория продукта.
     */
    public static void addProduct(String productName, int productPrice, int rating, Categories categories) {
        Product product = new Product(productName, productPrice, rating, categories);
        catalog.add(product);
    }

    public static String catalogToString(ArrayList<Product> catalog) {
        StringBuilder strb = new StringBuilder("В каталоге магазина " +
                                                catalog.size() + " товаров:\n");
        for (Product product : catalog) {
            strb.append(product.toString());
        }
        return strb.toString();
    }
}
