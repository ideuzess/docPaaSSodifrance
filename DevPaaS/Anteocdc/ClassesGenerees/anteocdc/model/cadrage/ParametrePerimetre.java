/***********************************************************************
 * Module:  ParametrePerimetre.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametrePerimetre
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 14c43a1e-935d-4f8e-9181-adac05d4f440 */
public class ParametrePerimetre {
   /** @pdOid 81ce2052-26f8-4f5e-91c1-49cf735e7822 */
   private int idPP;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association1 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
   private java.util.List<MesureProfondeur> mesureProfondeur;
   
   
   /** @pdGenerated default getter */
   public java.util.List<MesureProfondeur> getMesureProfondeur() {
      if (mesureProfondeur == null)
         mesureProfondeur = new java.util.LinkedList<MesureProfondeur>();
      return mesureProfondeur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMesureProfondeur() {
      if (mesureProfondeur == null)
         mesureProfondeur = new java.util.LinkedList<MesureProfondeur>();
      return mesureProfondeur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMesureProfondeur */
   public void setMesureProfondeur(java.util.List<MesureProfondeur> newMesureProfondeur) {
      removeAllMesureProfondeur();
      for (java.util.Iterator iter = newMesureProfondeur.iterator(); iter.hasNext();)
         addMesureProfondeur((MesureProfondeur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMesureProfondeur */
   public void addMesureProfondeur(MesureProfondeur newMesureProfondeur) {
      if (newMesureProfondeur == null)
         return;
      if (this.mesureProfondeur == null)
         this.mesureProfondeur = new java.util.LinkedList<MesureProfondeur>();
      if (!this.mesureProfondeur.contains(newMesureProfondeur))
         this.mesureProfondeur.add(newMesureProfondeur);
   }
   
   /** @pdGenerated default remove
     * @param oldMesureProfondeur */
   public void removeMesureProfondeur(MesureProfondeur oldMesureProfondeur) {
      if (oldMesureProfondeur == null)
         return;
      if (this.mesureProfondeur != null)
         if (this.mesureProfondeur.contains(oldMesureProfondeur))
            this.mesureProfondeur.remove(oldMesureProfondeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMesureProfondeur() {
      if (mesureProfondeur != null)
         mesureProfondeur.clear();
   }
   
   /** @pdOid 62f349b0-742f-4608-b768-75603d6f63ac */
   public int getIdPP() {
      return idPP;
   }
   
   /** @param newIdPP
    * @pdOid 858541fe-ff51-479e-b3e4-acaf9ec34b19 */
   public void setIdPP(int newIdPP) {
      idPP = newIdPP;
   }

}