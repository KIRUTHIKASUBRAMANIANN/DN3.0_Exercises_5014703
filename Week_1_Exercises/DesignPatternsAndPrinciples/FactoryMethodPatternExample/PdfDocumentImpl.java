public class PdfDocumentImpl implements PdfDocument {
    @Override
    public void print() {
        System.out.println("Printing Pdf document...");
    }

    @Override
    public void annotate() {
        System.out.println("Annotating Pdf document...");
    }
}
