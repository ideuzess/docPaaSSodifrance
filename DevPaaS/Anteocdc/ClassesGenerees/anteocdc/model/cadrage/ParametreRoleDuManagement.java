/***********************************************************************
 * Module:  ParametreRoleDuManagement.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreRoleDuManagement
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid dfe58a06-baa8-41f5-80a5-c1944f0a647e */
public class ParametreRoleDuManagement {
   /** @pdOid dc6f1b69-43ca-468f-bc74-9de44218eaf5 */
   private int idPRDM;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association15 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid 65922ac2-e32f-4679-813c-9a3a18224223 */
   public int getIdPRDM() {
      return idPRDM;
   }
   
   /** @param newIdPRDM
    * @pdOid ddec6189-2355-4d35-889e-f55d036a34a5 */
   public void setIdPRDM(int newIdPRDM) {
      idPRDM = newIdPRDM;
   }

}