/***********************************************************************
 * Module:  ParametreCompetences.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreCompetences
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 7060acac-bcbd-49c8-88eb-e2ee410d965e */
public class ParametreCompetences {
   /** @pdOid 1d75c086-4172-4bed-a015-b32295bb12e0 */
   private int idPC;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association13 coll=java.util.List impl=java.util.LinkedList mult=1..* */
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
   
   /** @pdOid e46c3036-cbfe-4ecf-b16f-85e887570ad0 */
   public int getIdPC() {
      return idPC;
   }
   
   /** @param newIdPC
    * @pdOid 741c691d-5295-4655-8808-2194c5fb6a4d */
   public void setIdPC(int newIdPC) {
      idPC = newIdPC;
   }

}