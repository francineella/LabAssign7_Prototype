package PrototypePattern;

class DocumentRegistry {
    private Document pdfPrototype;
    private Document textDocumentPrototype;
    private Document spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pageCount) {
        PdfDocument document = (PdfDocument) pdfPrototype.clone();
        document.setFileName(fileName);
        document.setAuthor(author);
        document.setPageCount(pageCount);
        return document;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument document = (TextDocument) textDocumentPrototype.clone();
        document.setFilePath(filePath);
        document.setEncoding(encoding);
        document.setWordCount(wordCount);
        return document;
    }

    public Document createSpreadsheet(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument document = (SpreadsheetDocument) spreadsheetPrototype.clone();
        document.setSpreadsheetName(spreadsheetName);
        document.setRowCount(rowCount);
        document.setColumnCount(columnCount);
        return document;
    }
}