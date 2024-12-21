package Lab24_3;

// Шаблон
public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        TextDocument doc = new TextDocument();
        doc.open();
        return doc;
    }
}