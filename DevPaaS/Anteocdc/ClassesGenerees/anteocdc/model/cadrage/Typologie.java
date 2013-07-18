/***********************************************************************
 * Module:  Typologie.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Typologie
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid e8095086-64b5-4f94-9c99-f2d5c534cc6a */
public class Typologie {
   /** @pdOid 74472e0f-912c-4dad-86c3-5681a72058ae */
   private int idTypologie;
   /** @pdOid a258e5c0-1003-4ff9-89c7-71ba5f81e9c9 */
   private String nom;
   /** @pdOid edd17008-2dc1-4d51-8de7-5b8b16ff3eee */
   private int effectif;
   
   /** @pdRoleInfo migr=no name=DegreDeRisques assc=association4 mult=1..1 type=Composition side=A */
   private DegreDeRisques degreDeRisques;
   /** @pdRoleInfo migr=no name=Localisation assc=association6 coll=java.util.List impl=java.util.LinkedList mult=0..* type=Composition side=A */
   private java.util.List<Localisation> localisations;
   /** @pdRoleInfo migr=no name=DegreDImportance assc=association7 mult=1..1 type=Composition side=A */
   private DegreDImportance degreDImportance;
   
   
   /** @pdGenerated default parent getter */
   public DegreDeRisques getDegreDeRisques() {
      return degreDeRisques;
   }
   
   /** @pdGenerated default parent setter
     * @param newDegreDeRisques */
   public void setDegreDeRisques(DegreDeRisques newDegreDeRisques) {
      this.degreDeRisques = newDegreDeRisques;
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
   public DegreDImportance getDegreDImportance() {
      return degreDImportance;
   }
   
   /** @pdGenerated default parent setter
     * @param newDegreDImportance */
   public void setDegreDImportance(DegreDImportance newDegreDImportance) {
      this.degreDImportance = newDegreDImportance;
   }
   
   /** @pdOid b0246990-e917-431e-b902-ea3a63af9931 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 44a1d2a3-3263-42eb-a784-2313b3b8a0d0 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid a8b10840-55d8-41e1-97c9-a72194672f35 */
   public int getEffectif() {
      return effectif;
   }
   
   /** @param newEffectif
    * @pdOid 2fe592ed-2fa4-43e1-be4c-2479a71ec63e */
   public void setEffectif(int newEffectif) {
      effectif = newEffectif;
   }
   
   /** @pdOid b2cfdba3-446c-42c2-a16a-c1801d4967cd */
   public int getIdTypologie() {
      return idTypologie;
   }
   
   /** @param newIdTypologie
    * @pdOid 028ac83d-5269-4dc5-92e5-3f949603ef65 */
   public void setIdTypologie(int newIdTypologie) {
      idTypologie = newIdTypologie;
   }

}