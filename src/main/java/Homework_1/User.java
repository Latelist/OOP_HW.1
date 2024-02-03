package Homework_1;

public class User extends Basket {
    private static int id = 0;
    private final int userId;
    private String login;
    private final Basket userBasket;

    /**
     * Конструктор класса User с параметрами.
     *
     * @param login Логин пользователя.
     * @param userBasket Корзина пользователя.
     */
    public User(String login, Basket userBasket) {
        this.userId = id++;
        this.login = login;
        this.userBasket = userBasket;
    }

    /**
     * Конструктор класса User по умолчанию.
     */
    public User() {
        this(String.format("User %d", id), new Basket());
    }

    /**
     * Посмотреть, че за чел и сколько товаров купил.
     *
     * @return Строковое представление пользователя.
     */
    @Override
    public String toString() {
        return "Покупатель " + login + ". В его корзине " + userBasket.basket.size() + " товаров.";
    }

    /**
     * Посмотреть, что у покупателя в корзине.
     *
     * @return Строковое представление корзины пользователя.
     */
    public String userBasketToString() {
        StringBuilder strb = new StringBuilder("Покупки покупателя " + login + ": \n");
        strb.append(userBasket.toString());
        return strb.toString();
    }

    public static int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
