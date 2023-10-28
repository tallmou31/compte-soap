//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.10.25 à 07:46:45 PM GMT 
//


package com.example.soap.account;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link CreditRequest }
     * 
     */
    public CreditRequest createCreditRequest() {
        return new CreditRequest();
    }

    /**
     * Create an instance of {@link GetSoldeRequest }
     * 
     */
    public GetSoldeRequest createGetSoldeRequest() {
        return new GetSoldeRequest();
    }

    /**
     * Create an instance of {@link CreditResponse }
     * 
     */
    public CreditResponse createCreditResponse() {
        return new CreditResponse();
    }

    /**
     * Create an instance of {@link DebitRequest }
     * 
     */
    public DebitRequest createDebitRequest() {
        return new DebitRequest();
    }

    /**
     * Create an instance of {@link DebitResponse }
     * 
     */
    public DebitResponse createDebitResponse() {
        return new DebitResponse();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

}
