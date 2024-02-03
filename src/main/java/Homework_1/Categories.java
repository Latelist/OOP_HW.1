package Homework_1;

/**
 * Перечисление, представляющее категории товаров.
 */
public enum Categories {
    UNDEFINED("Не определена"),
    CLOTHES("Одежда"),
    STATIONERY("Канцелярия"),
    DRINKS("Напитки"),
    FOOD("Еда");

    private final String ruName;

    /**
     * Конструктор перечисления Categories.
     *
     * @param ruName Наименование категории на русском языке.
     */
    Categories(String ruName) {
        this.ruName = ruName;
    }

    /**
     * Получить наименование категории на русском языке.
     */
    public String getRuName() {
        return ruName;
    }
}
