/***********************************************************************
 * Module:  Projet.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Projet
 ***********************************************************************/

package anteocdc.model;

import anteocdc.model.cadrage.Cadrage;
import java.util.*;

/** @pdOid 006a9a78-4ecf-4769-81a5-d876cf107d1c */
public class Projet {
   /** @pdOid 0d678d2e-03ec-4eb4-8fec-7debd438cf1b */
   private int idProjet;
   /** @pdOid 02b2d09e-1d1e-4d3b-b3d3-58d38bacabd3 */
   private int nom;
   
   /** @pdRoleInfo migr=no name=Cadrage assc=association1 mult=1..1 type=Composition side=A */
   private Cadrage dossierDeCadrage;
   
   
   /** @pdGenerated default parent getter */
   public Cadrage getDossierDeCadrage() {
      return dossierDeCadrage;
   }
   
   /** @pdGenerated default parent setter
     * @param newCadrage */
   public void setDossierDeCadrage(Cadrage newCadrage) {
      this.dossierDeCadrage = newCadrage;
   }
   
   /** @pdOid 6e756624-8e8e-4963-87d7-827315b902fc */
   public int getIdProjet() {
      return idProjet;
   }
   
   /** @param newIdProjet
    * @pdOid 4484531c-568f-422e-9741-0a84e0b6ea19 */
   public void setIdProjet(int newIdProjet) {
      idProjet = newIdProjet;
   }
   
   /** @pdOid 61cd71a7-f7d3-4341-bb82-bdafe0802bd6 */
   public int getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid bd4e70bd-6fae-4091-a802-218b918cf0a4 */
   public void setNom(int newNom) {
      nom = newNom;
   }

}