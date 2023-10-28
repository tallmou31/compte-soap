
package sn.esmt.mp2isi.comptesoap.endpoint;

import com.example.soap.account.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import sn.esmt.mp2isi.comptesoap.model.Compte;
import sn.esmt.mp2isi.comptesoap.service.CompteService;

@Endpoint
public class CompteEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/soap/account";

    private final CompteService compteService;

    @Autowired
    public CompteEndpoint(CompteService compteService) {
        this.compteService = compteService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateAccountRequest")
    @ResponsePayload
    public CreateAccountResponse createAccount(@RequestPayload CreateAccountRequest request) {
        CreateAccountResponse response = new CreateAccountResponse();
        Compte compte = compteService.createAccount(request.getTitulaire(), request.getMontant());
        response.setNumero(compte.getNumero());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DebitRequest")
    @ResponsePayload
    public DebitResponse debit(@RequestPayload DebitRequest request) {
        DebitResponse response = new DebitResponse();
        compteService.debit(request.getNumero(), request.getMontant());
        response.setMessage("Débit effectué avec succès");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreditRequest")
    @ResponsePayload
    public CreditResponse credit(@RequestPayload CreditRequest request) {
        CreditResponse response = new CreditResponse();
        compteService.credit(request.getNumero(), request.getMontant());
        response.setMessage("Crédit effectué avec succès");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSoldeRequest")
    @ResponsePayload
    public GetSoldeResponse getSolde(@RequestPayload GetSoldeRequest request) {
        GetSoldeResponse response = new GetSoldeResponse();
        response.setSolde(compteService.getSolde(request.getNumero()));
        return response;
    }
}
