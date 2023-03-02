package strategy;

public class Main {
    public static void main(String[] args) {
        String sourceText = "some text that should be translated";
        TranslatorContext context = new TranslatorContext(new EnglishToRussianTranslate());
        System.out.println(context.translate(sourceText));
    }
}
