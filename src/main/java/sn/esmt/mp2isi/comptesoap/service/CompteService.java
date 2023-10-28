package sn.esmt.mp2isi.comptesoap.service;

import sn.esmt.mp2isi.comptesoap.model.Compte;

public interface CompteService {
    Compte createAccount(String titulaire, double solde);
    void debit(String numero, double montant);
    void credit(String numero, double montant);
    double getSolde(String numero);
}

