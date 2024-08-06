public class ExcelDocumentImpl implements ExcelDocument {
    @Override
    public void print() {
        System.out.println("Printing Excel document...");
    }

    @Override
    public void format() {
        System.out.println("Formatting Excel document...");
    }
}