package PrototypePattern;

interface Document extends Cloneable {
    Document clone();
    void open();
    String getType();
}