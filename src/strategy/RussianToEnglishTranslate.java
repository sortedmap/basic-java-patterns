package strategy;

public class RussianToEnglishTranslate implements TranslateStrategy {
    private TranslateApi api;

    @Override
    public String translate(String sourceText) {
        return api.translate(sourceText, "RUSSIAN", "ENGLISH");
    }
}