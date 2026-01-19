package com.ishan.design_patterns.creational.factory.usecase.document_example;

public class DocumentProcessorFactory {

    public static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName) {

        if (documentType == null) {
            throw new IllegalArgumentException("Document type cannot be null");
        }

        return switch (documentType) {
            case TEXT -> new TextDocumentProcessor(documentName);
            case PRESENTATION -> new PresentationDocumentProcessor(documentName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);
            default -> throw new IllegalArgumentException("Unsupported document type: " + documentType);
        };
    }
}
