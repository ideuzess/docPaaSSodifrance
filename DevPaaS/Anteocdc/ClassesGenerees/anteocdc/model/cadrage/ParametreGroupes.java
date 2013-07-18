/***********************************************************************
 * Module:  ParametreGroupes.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreGroupes
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 50dc6c64-91a8-4395-aa37-a3101de43370 */
public class ParametreGroupes {
   /** @pdOid 5a580e71-66ec-4476-bdf5-84b2ef56c7a1 */
   private int idPG;
   
   /** @pdRoleInfo migr=no name=MesureLargeur assc=association28 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid a72df3eb-75b6-445f-831c-14aa54cef25a */
   public int getIdPG() {
      return idPG;
   }
   
   /** @param newIdPG
    * @pdOid 765892b9-3647-41b9-9209-09828a001dc1 */
   public void setIdPG(int newIdPG) {
      idPG = newIdPG;
   }

}