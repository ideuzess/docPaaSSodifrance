/***********************************************************************
 * Module:  ParametreSites.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreSites
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 58cb028e-3ee6-454a-9d8f-71b24aa8ad46 */
public class ParametreSites {
   /** @pdOid a49b6ef1-b0b8-494c-a14d-2b02f57ce171 */
   private int idPS;
   
   /** @pdRoleInfo migr=no name=MesureLargeur assc=association26 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
   private java.util.List<MesureLargeur> mesureLargeur;
   
   
   /** @pdGenerated default getter */
   public java.util.List<MesureLargeur> getMesureLargeur() {
      if (mesureLargeur == null)
         mesureLargeur = new java.util.LinkedList<MesureLargeur>();
      return mesureLargeur;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMesureLargeur() {
      if (mesureLargeur == null)
         mesureLargeur = new java.util.LinkedList<MesureLargeur>();
      return mesureLargeur.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMesureLargeur */
   public void setMesureLargeur(java.util.List<MesureLargeur> newMesureLargeur) {
      removeAllMesureLargeur();
      for (java.util.Iterator iter = newMesureLargeur.iterator(); iter.hasNext();)
         addMesureLargeur((MesureLargeur)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMesureLargeur */
   public void addMesureLargeur(MesureLargeur newMesureLargeur) {
      if (newMesureLargeur == null)
         return;
      if (this.mesureLargeur == null)
         this.mesureLargeur = new java.util.LinkedList<MesureLargeur>();
      if (!this.mesureLargeur.contains(newMesureLargeur))
         this.mesureLargeur.add(newMesureLargeur);
   }
   
   /** @pdGenerated default remove
     * @param oldMesureLargeur */
   public void removeMesureLargeur(MesureLargeur oldMesureLargeur) {
      if (oldMesureLargeur == null)
         return;
      if (this.mesureLargeur != null)
         if (this.mesureLargeur.contains(oldMesureLargeur))
            this.mesureLargeur.remove(oldMesureLargeur);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMesureLargeur() {
      if (mesureLargeur != null)
         mesureLargeur.clear();
   }
   
   /** @pdOid 05ede76d-9155-4329-a370-a7d36b6e2ffd */
   public int getIdPS() {
      return idPS;
   }
   
   /** @param newIdPS
    * @pdOid 78528bcb-fd30-48e3-9d58-924636438091 */
   public void setIdPS(int newIdPS) {
      idPS = newIdPS;
   }

}