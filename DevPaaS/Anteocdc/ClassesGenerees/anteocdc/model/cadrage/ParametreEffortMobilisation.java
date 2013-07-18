/***********************************************************************
 * Module:  ParametreEffortMobilisation.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreEffortMobilisation
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid c706aa1d-b3e5-4780-9e67-92b384d009f6 */
public class ParametreEffortMobilisation {
   /** @pdOid 9843d282-c2d8-4532-b07c-693e18b17d95 */
   private int idPEM;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association30 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid 16efe966-bf0c-4e2b-bd86-67d765c4eccd */
   public int getIdPEM() {
      return idPEM;
   }
   
   /** @param newIdPEM
    * @pdOid 6c3bcd4c-527e-4daa-8f3e-bbfb2444b282 */
   public void setIdPEM(int newIdPEM) {
      idPEM = newIdPEM;
   }

}