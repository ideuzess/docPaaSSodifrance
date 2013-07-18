/***********************************************************************
 * Module:  ParametreActeurs.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ParametreActeurs
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 7acbaa83-4131-46e6-864d-65ac641c3f68 */
public class ParametreActeurs {
   /** @pdOid c113a8cc-0e2c-47fb-9ba2-5c75517f397d */
   private int idPA;
   
   /** @pdRoleInfo migr=no name=MesureLargeur assc=association29 coll=java.util.List impl=java.util.LinkedList mult=1..* side=A */
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
   
   /** @pdOid 706e63e9-38f1-4ea6-9361-c26dad679c69 */
   public int getIdPA() {
      return idPA;
   }
   
   /** @param newIdPA
    * @pdOid ad4ad314-2f29-483d-845e-41d170037aa4 */
   public void setIdPA(int newIdPA) {
      idPA = newIdPA;
   }

}