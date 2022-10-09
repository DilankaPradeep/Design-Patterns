package BehavioralPatterns.TemplatePattern;

public class TestTemplateMethod {
    static Beverages beverages = null;

    public static void main(String[] args) {
        Beverages tea = new Tea();
        tea.prepareRecipie();

        Beverages coffee = new Coffee();
        coffee.prepareRecipie();

    }
}
