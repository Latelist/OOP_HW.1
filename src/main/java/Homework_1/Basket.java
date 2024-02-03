package Homework_1;

import java.util.ArrayList;
public class Basket {
    protected ArrayList<Product> basket;

    /**
     * Конструктор класса Basket. Создает пустую корзину.
     */
    protected Basket() {
        this.basket = new ArrayList<>();
    }

    /**
     * Добавить товары в корзину и удалить из каталога.
     *
     * @param product Добавляемый товар.
     * @param catalog Каталог товаров, из которого удаляется товар после добавления в корзину.
     */
    public void addToBasket(Product product, ArrayList<Product> catalog) {
        this.basket.add(product);
        catalog.remove(product);
    }

    /**
     * Посмотреть товары в корзине.
     *
     * @return Строка с товарами в корзине.
     */
    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (Product product : basket) {
            strb.append(product.getProductName() + ", ");
        }
        strb.setCharAt(strb.length() - 2, '.');
        return strb.toString();
    }
}
