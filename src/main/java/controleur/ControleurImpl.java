package controleur;

import controleur.abstractControleur.AbstractControleur;
import controleur.ordres.TypeOrdre;
import modele.Cheval;
import modele.ChevalDejaExistant;
import modele.ChevalNotFound;
import modele.FacadeModele;
import vues.GestionnaireVue;

import java.util.List;


public class ControleurImpl extends AbstractControleur {

    private FacadeModele facadeModele;

    public ControleurImpl(GestionnaireVue gestionnaireVue, FacadeModele facadeModele, ControleurSetUp controleurSetUp) {
        super(gestionnaireVue);
        this.facadeModele = facadeModele;
        controleurSetUp.setUp(this, getGestionnaireVue());
    }

    @Override
    public void run() {
    }

}
