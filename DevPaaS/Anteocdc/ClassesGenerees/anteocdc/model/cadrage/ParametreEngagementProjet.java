/***********************************************************************
 * Module:  ParametreEngagementProjet.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreEngagementProjet
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 075bba18-1837-4149-8e07-6407c2159e66 */
public class ParametreEngagementProjet {
   /** @pdOid 31231228-c5db-47bf-bf9c-e707699ea2b5 */
   private int idPEP;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association23 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid 937b2da1-bd24-4276-bbf9-4b62302b6d13 */
   public int getIdPEP() {
      return idPEP;
   }
   
   /** @param newIdPEP
    * @pdOid 70ccb3cd-0840-47e2-bc9c-f76c9b4fe88f */
   public void setIdPEP(int newIdPEP) {
      idPEP = newIdPEP;
   }

}