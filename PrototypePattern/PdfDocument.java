package PrototypePattern;

class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public Document clone() {
        PdfDocument copy = new PdfDocument();
        copy.fileName = this.fileName;
        copy.author = this.author;
        copy.pageCount = this.pageCount;
        copy.name = this.name;
        return copy;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
        System.out.println();
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
        this.name = fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount (int pageCount) {
        this.pageCount = pageCount;
    }
}