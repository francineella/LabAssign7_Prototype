package PrototypePattern;

class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        
        Document pdfDoc = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc.open();

        Document textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();

        Document spreadsheetDoc = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        spreadsheetDoc.open();

        Document anotherPdfDoc = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        anotherPdfDoc.open();
    }
}