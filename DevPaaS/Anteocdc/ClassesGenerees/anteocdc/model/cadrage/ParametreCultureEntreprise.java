/***********************************************************************
 * Module:  ParametreCultureEntreprise.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreCultureEntreprise
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid e542943f-1ac9-45cc-a7de-1e58051023b1 */
public class ParametreCultureEntreprise {
   /** @pdOid 489d7355-0a5b-4ef1-9e63-e8bee7723048 */
   private int idPCE;
   
   /** @pdRoleInfo migr=no name=MesureProfondeur assc=association11 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid e062ede2-c477-482a-870e-cf0ceab0d9a4 */
   public int getIdPCE() {
      return idPCE;
   }
   
   /** @param newIdPCE
    * @pdOid 36de5bfa-97e8-4026-a4c7-fcb0b9a03eb7 */
   public void setIdPCE(int newIdPCE) {
      idPCE = newIdPCE;
   }

}