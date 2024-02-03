package Homework_1;

public class Product {
    private String productName;
    private int productPrice;
    private int rating;
    private Categories category = Categories.UNDEFINED;

    /**
     * Конструктор класса Product с параметрами.
     *
     * @param productName Наименование товара.
     * @param productPrice Цена товара.
     * @param rating Рейтинг товара.
     * @param category Категория товара.
     */
    public Product(String productName, int productPrice, int rating, Categories category) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.rating = rating;
        this.category = category;
    }

    /**
     * Конструктор класса Product по умолчанию.
     */
    public Product() {
        this("Default Name", 0, 0, Categories.UNDEFINED);
    }

    /**
     * Получить строку с информацией о товаре.
     */
    @Override
    public String toString() {
        return "Товар " + productName +
                " стоит " + productPrice + " рублей, " +
                "оценен покупателями на " + rating +
                ". Категория — " + category.getRuName() + ".\n";
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}
