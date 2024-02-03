package Homework_1;

import java.util.ArrayList;

public class Category {
    private final Categories categories;
    private final ArrayList<Product> category;

    /**
     * Конструктор класса Category.
     *
     * @param categories Категория товаров.
     * @param catalog    Список всех товаров для фильтрации по категории.
     */
    public Category(Categories categories, ArrayList<Product> catalog) {
        this.categories = categories;
        category = new ArrayList<>();
        for (Product product : catalog) {
            if (product.getCategory().equals(categories)) {
                category.add(product);
            }
        }
    }

    /**
     * Получить строку с товарами в категории.
     */
    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder("Товары в категории " + this.categories.getRuName() + ": ");

        for (Product product : category) {
            strb.append(product.getProductName() + ", ");
        }

        strb.setCharAt(strb.length() - 2, '.');
        return strb.toString();
    }
}
