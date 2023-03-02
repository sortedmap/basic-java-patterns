package strategy;

public class EnglishToRussianTranslate implements TranslateStrategy {
    private TranslateApi api;

    @Override
    public String translate(String sourceText) {
        return api.translate(sourceText,"ENGLISH", "RUSSIAN");
    }
}