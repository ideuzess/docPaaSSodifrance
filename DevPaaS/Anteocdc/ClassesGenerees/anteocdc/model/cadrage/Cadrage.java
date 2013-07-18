/***********************************************************************
 * Module:  Cadrage.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Cadrage
 ***********************************************************************/

package anteocdc.model.cadrage;

import anteocdc.model.Projet;
import java.util.*;

/** @pdOid ea3ba7e1-b242-4f45-bfb3-023e5bc53f89 */
public class Cadrage {
   /** @pdOid cb604909-6d2e-43ef-861e-ac5b20d3d1a4 */
   private int idCadrage;
   /** @pdOid 16f41003-4f77-4109-a03b-d5959d3dd791 */
   private Projet projet;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association2 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   private java.util.List<MesureProfondeur> mesuresProfondeur;
   /** @pdRoleInfo migr=no name=Localisation assc=association18 coll=java.util.List impl=java.util.LinkedList mult=0..* */
   private java.util.List<Localisation> localisations;
   /** @pdRoleInfo migr=no name=LargeurDuChangement assc=association22 mult=1..1 */
   private LargeurDuChangement largeurDuChangement;
   /** @pdRoleInfo migr=no name=DegreDImportance assc=association25 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   private java.util.Collection<DegreDImportance> degresDImportance;
   /** @pdRoleInfo migr=no name=MesureLargeur assc=association8 coll=java.util.List impl=java.util.LinkedList mult=0..* side=A */
   private java.util.List<MesureLargeur> mesuresLargeur;
   /** @pdRoleInfo migr=no name=ProfondeurDuChangement assc=association9 mult=1..1 side=A */
   private ProfondeurDuChangement profondeurDuChangement;
   /** @pdRoleInfo migr=no name=DegreDeRisques assc=association14 coll=java.util.List impl=java.util.LinkedList mult=0..* side=A */
   private java.util.List<DegreDeRisques> degresDeRisques;
   /** @pdRoleInfo migr=no name=Groupe assc=association17 coll=java.util.List impl=java.util.LinkedList mult=0..* type=Composition side=A */
   private java.util.List<Groupe> groupes;
   /** @pdRoleInfo migr=no name=NoteDeCadrage assc=association27 mult=1..1 type=Composition side=A */
   private NoteDeCadrage noteDeCadrage;
   
   
   /** @pdGenerated default getter */
   public java.util.List<MesureProfondeur> getMesuresProfondeur() {
      if (mesuresProfondeur == null)
         mesuresProfondeur = new java.util.LinkedList<MesureProfondeur>();
      return mesuresProfondeur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMesuresProfondeur() {
      if (mesuresProfondeur == null)
         mesuresProfondeur = new java.util.LinkedList<MesureProfondeur>();
      return mesuresProfondeur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMesuresProfondeur */
   public void setMesuresProfondeur(java.util.List<MesureProfondeur> newMesuresProfondeur) {
      removeAllMesuresProfondeur();
      for (java.util.Iterator iter = newMesuresProfondeur.iterator(); iter.hasNext();)
         addMesuresProfondeur((MesureProfondeur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMesureProfondeur */
   public void addMesuresProfondeur(MesureProfondeur newMesureProfondeur) {
      if (newMesureProfondeur == null)
         return;
      if (this.mesuresProfondeur == null)
         this.mesuresProfondeur = new java.util.LinkedList<MesureProfondeur>();
      if (!this.mesuresProfondeur.contains(newMesureProfondeur))
         this.mesuresProfondeur.add(newMesureProfondeur);
   }
   
   /** @pdGenerated default remove
     * @param oldMesureProfondeur */
   public void removeMesuresProfondeur(MesureProfondeur oldMesureProfondeur) {
      if (oldMesureProfondeur == null)
         return;
      if (this.mesuresProfondeur != null)
         if (this.mesuresProfondeur.contains(oldMesureProfondeur))
            this.mesuresProfondeur.remove(oldMesureProfondeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMesuresProfondeur() {
      if (mesuresProfondeur != null)
         mesuresProfondeur.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Localisation> getLocalisations() {
      if (localisations == null)
         localisations = new java.util.LinkedList<Localisation>();
      return localisations;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLocalisations() {
      if (localisations == null)
         localisations = new java.util.LinkedList<Localisation>();
      return localisations.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLocalisations */
   public void setLocalisations(java.util.List<Localisation> newLocalisations) {
      removeAllLocalisations();
      for (java.util.Iterator iter = newLocalisations.iterator(); iter.hasNext();)
         addLocalisations((Localisation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLocalisation */
   public void addLocalisations(Localisation newLocalisation) {
      if (newLocalisation == null)
         return;
      if (this.localisations == null)
         this.localisations = new java.util.LinkedList<Localisation>();
      if (!this.localisations.contains(newLocalisation))
         this.localisations.add(newLocalisation);
   }
   
   /** @pdGenerated default remove
     * @param oldLocalisation */
   public void removeLocalisations(Localisation oldLocalisation) {
      if (oldLocalisation == null)
         return;
      if (this.localisations != null)
         if (this.localisations.contains(oldLocalisation))
            this.localisations.remove(oldLocalisation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLocalisations() {
      if (localisations != null)
         localisations.clear();
   }
   /** @pdGenerated default parent getter */
   public LargeurDuChangement getLargeurDuChangement() {
      return largeurDuChangement;
   }
   
   /** @pdGenerated default parent setter
     * @param newLargeurDuChangement */
   public void setLargeurDuChangement(LargeurDuChangement newLargeurDuChangement) {
      this.largeurDuChangement = newLargeurDuChangement;
   }
   /** @pdGenerated default getter */
   public java.util.Collection<DegreDImportance> getDegresDImportance() {
      if (degresDImportance == null)
         degresDImportance = new java.util.HashSet<DegreDImportance>();
      return degresDImportance;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDegresDImportance() {
      if (degresDImportance == null)
         degresDImportance = new java.util.HashSet<DegreDImportance>();
      return degresDImportance.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDegresDImportance */
   public void setDegresDImportance(java.util.Collection<DegreDImportance> newDegresDImportance) {
      removeAllDegresDImportance();
      for (java.util.Iterator iter = newDegresDImportance.iterator(); iter.hasNext();)
         addDegresDImportance((DegreDImportance)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDegreDImportance */
   public void addDegresDImportance(DegreDImportance newDegreDImportance) {
      if (newDegreDImportance == null)
         return;
      if (this.degresDImportance == null)
         this.degresDImportance = new java.util.HashSet<DegreDImportance>();
      if (!this.degresDImportance.contains(newDegreDImportance))
         this.degresDImportance.add(newDegreDImportance);
   }
   
   /** @pdGenerated default remove
     * @param oldDegreDImportance */
   public void removeDegresDImportance(DegreDImportance oldDegreDImportance) {
      if (oldDegreDImportance == null)
         return;
      if (this.degresDImportance != null)
         if (this.degresDImportance.contains(oldDegreDImportance))
            this.degresDImportance.remove(oldDegreDImportance);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDegresDImportance() {
      if (degresDImportance != null)
         degresDImportance.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<MesureLargeur> getMesuresLargeur() {
      if (mesuresLargeur == null)
         mesuresLargeur = new java.util.LinkedList<MesureLargeur>();
      return mesuresLargeur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMesuresLargeur() {
      if (mesuresLargeur == null)
         mesuresLargeur = new java.util.LinkedList<MesureLargeur>();
      return mesuresLargeur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMesuresLargeur */
   public void setMesuresLargeur(java.util.List<MesureLargeur> newMesuresLargeur) {
      removeAllMesuresLargeur();
      for (java.util.Iterator iter = newMesuresLargeur.iterator(); iter.hasNext();)
         addMesuresLargeur((MesureLargeur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMesureLargeur */
   public void addMesuresLargeur(MesureLargeur newMesureLargeur) {
      if (newMesureLargeur == null)
         return;
      if (this.mesuresLargeur == null)
         this.mesuresLargeur = new java.util.LinkedList<MesureLargeur>();
      if (!this.mesuresLargeur.contains(newMesureLargeur))
         this.mesuresLargeur.add(newMesureLargeur);
   }
   
   /** @pdGenerated default remove
     * @param oldMesureLargeur */
   public void removeMesuresLargeur(MesureLargeur oldMesureLargeur) {
      if (oldMesureLargeur == null)
         return;
      if (this.mesuresLargeur != null)
         if (this.mesuresLargeur.contains(oldMesureLargeur))
            this.mesuresLargeur.remove(oldMesureLargeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMesuresLargeur() {
      if (mesuresLargeur != null)
         mesuresLargeur.clear();
   }
   /** @pdGenerated default parent getter */
   public ProfondeurDuChangement getProfondeurDuChangement() {
      return profondeurDuChangement;
   }
   
   /** @pdGenerated default parent setter
     * @param newProfondeurDuChangement */
   public void setProfondeurDuChangement(ProfondeurDuChangement newProfondeurDuChangement) {
      this.profondeurDuChangement = newProfondeurDuChangement;
   }
   /** @pdGenerated default getter */
   public java.util.List<DegreDeRisques> getDegresDeRisques() {
      if (degresDeRisques == null)
         degresDeRisques = new java.util.LinkedList<DegreDeRisques>();
      return degresDeRisques;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDegresDeRisques() {
      if (degresDeRisques == null)
         degresDeRisques = new java.util.LinkedList<DegreDeRisques>();
      return degresDeRisques.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDegresDeRisques */
   public void setDegresDeRisques(java.util.List<DegreDeRisques> newDegresDeRisques) {
      removeAllDegresDeRisques();
      for (java.util.Iterator iter = newDegresDeRisques.iterator(); iter.hasNext();)
         addDegresDeRisques((DegreDeRisques)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDegreDeRisques */
   public void addDegresDeRisques(DegreDeRisques newDegreDeRisques) {
      if (newDegreDeRisques == null)
         return;
      if (this.degresDeRisques == null)
         this.degresDeRisques = new java.util.LinkedList<DegreDeRisques>();
      if (!this.degresDeRisques.contains(newDegreDeRisques))
         this.degresDeRisques.add(newDegreDeRisques);
   }
   
   /** @pdGenerated default remove
     * @param oldDegreDeRisques */
   public void removeDegresDeRisques(DegreDeRisques oldDegreDeRisques) {
      if (oldDegreDeRisques == null)
         return;
      if (this.degresDeRisques != null)
         if (this.degresDeRisques.contains(oldDegreDeRisques))
            this.degresDeRisques.remove(oldDegreDeRisques);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDegresDeRisques() {
      if (degresDeRisques != null)
         degresDeRisques.clear();
   }
   /** @pdGenerated default getter */
   public java.util.List<Groupe> getGroupes() {
      if (groupes == null)
         groupes = new java.util.LinkedList<Groupe>();
      return groupes;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGroupes() {
      if (groupes == null)
         groupes = new java.util.LinkedList<Groupe>();
      return groupes.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGroupes */
   public void setGroupes(java.util.List<Groupe> newGroupes) {
      removeAllGroupes();
      for (java.util.Iterator iter = newGroupes.iterator(); iter.hasNext();)
         addGroupes((Groupe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGroupe */
   public void addGroupes(Groupe newGroupe) {
      if (newGroupe == null)
         return;
      if (this.groupes == null)
         this.groupes = new java.util.LinkedList<Groupe>();
      if (!this.groupes.contains(newGroupe))
         this.groupes.add(newGroupe);
   }
   
   /** @pdGenerated default remove
     * @param oldGroupe */
   public void removeGroupes(Groupe oldGroupe) {
      if (oldGroupe == null)
         return;
      if (this.groupes != null)
         if (this.groupes.contains(oldGroupe))
            this.groupes.remove(oldGroupe);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGroupes() {
      if (groupes != null)
         groupes.clear();
   }
   /** @pdGenerated default parent getter */
   public NoteDeCadrage getNoteDeCadrage() {
      return noteDeCadrage;
   }
   
   /** @pdGenerated default parent setter
     * @param newNoteDeCadrage */
   public void setNoteDeCadrage(NoteDeCadrage newNoteDeCadrage) {
      this.noteDeCadrage = newNoteDeCadrage;
   }
   
   /** @pdOid 167513ca-d658-4d25-90b4-b712b2d78cbf */
   public Projet getProjet() {
      return projet;
   }
   
   /** @param newProjet
    * @pdOid a0da1842-fb5e-475c-bbe2-1b0111b51bc2 */
   public void setProjet(Projet newProjet) {
      projet = newProjet;
   }
   
   /** @pdOid 09b6b9ff-e4c9-437e-a363-5899f37df6d8 */
   public int getIdCadrage() {
      return idCadrage;
   }
   
   /** @param newIdCadrage
    * @pdOid 1cf5dd2c-1add-4913-8c87-228e787332b9 */
   public void setIdCadrage(int newIdCadrage) {
      idCadrage = newIdCadrage;
   }

}