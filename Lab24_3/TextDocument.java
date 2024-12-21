package Lab24_3;

// Касс текстового документа
public class TextDocument implements IDocument {
    private String content;

    @Override
    public void open() {
        System.out.println("Opening Text Document");
        // Логика открытия текстового документа
    }

    @Override
    public void save() {
        System.out.println("Saving Text Document");
        // Логика сохранения текстового документа
    }

    @Override
    public void close() {
        System.out.println("Closing Text Document");
        // Логика закрытия текстового документа
    }
}
