public class Main {
    public static void main(String[] args) {

        Document wordDoc = new WordDocumentFactory().createDocument();
        wordDoc.print(); // prints "Printing Word document..."
        wordDoc.edit(); // prints "Editing Word document..."

        
        Document pdfDoc = new PdfDocumentFactory().createDocument();
        pdfDoc.print(); // prints "Printing Pdf document..."
        pdfDoc.annotate(); // prints "Annotating Pdf document..."

        
        Document excelDoc = new ExcelDocumentFactory().createDocument();
        excelDoc.print(); // prints "Printing Excel document..."
        excelDoc.format(); // prints "Formatting Excel document..."
    }
}