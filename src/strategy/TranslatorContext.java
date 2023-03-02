package strategy;

public class TranslatorContext {
    private TranslateStrategy translateStrategy;

    public TranslatorContext(TranslateStrategy translateStrategy) {
        this.translateStrategy = translateStrategy;
    }

    public void setTranslateStrategy(TranslateStrategy translateStrategy) {
        this.translateStrategy = translateStrategy;
    }

    public String translate(String sourceText) {
        return translateStrategy.translate(sourceText);
    }
}
