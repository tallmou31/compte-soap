package sn.esmt.mp2isi.comptesoap.service;

import org.springframework.stereotype.Service;
import sn.esmt.mp2isi.comptesoap.model.Compte;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class CompteServiceImpl implements CompteService {
    private Map<String, Compte> comptes = new HashMap<>();

    @Override
    public Compte createAccount(String titulaire, double solde) {
        String numero = UUID.randomUUID().toString();
        Compte compte = new Compte();
        compte.setNumero(numero);
        compte.setTitulaire(titulaire);
        compte.setSolde(solde);
        comptes.put(numero, compte);
        return compte;
    }

    @Override
    public void debit(String numero, double montant) {
        Compte compte = comptes.get(numero);
        if (compte != null && compte.getSolde() >= montant) {
            compte.setSolde(compte.getSolde() - montant);
        } else {
            throw new RuntimeException("Solde insuffisant ou compte inexistant");
        }
    }

    @Override
    public void credit(String numero, double montant) {
        Compte compte = comptes.get(numero);
        if (compte != null) {
            compte.setSolde(compte.getSolde() + montant);
        } else {
            throw new RuntimeException("Compte inexistant");
        }
    }

    @Override
    public double getSolde(String numero) {
        Compte compte = comptes.get(numero);
        if (compte != null) {
            return compte.getSolde();
        } else {
            throw new RuntimeException("Compte inexistant");
        }
    }
}

