package com.ishan.design_patterns.creational.factory.usecase.document_example;

public class DocumentProcessorClient {

    public static void main(String[] args) {
        DocumentProcessor processor =
                DocumentProcessorFactory.createDocumentProcessor(
                        DocumentType.TEXT, "design_patterns.txt");

        processor.processDocument();
    }
}
