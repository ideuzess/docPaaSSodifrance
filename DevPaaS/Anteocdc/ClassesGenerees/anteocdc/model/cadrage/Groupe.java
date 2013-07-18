/***********************************************************************
 * Module:  Groupe.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Groupe
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid a513fc5a-095c-4dfa-a23c-3fc7e260310a */
public class Groupe {
   /** @pdOid 17e24784-6f23-43fc-a27c-82b048f1d519 */
   private int idGroupe;
   /** @pdOid 474a93c7-6f96-4163-9615-6000cf5e32c2 */
   private String nom;
   
   /** @pdRoleInfo migr=no name=Typologie assc=association19 coll=java.util.List impl=java.util.LinkedList mult=0..* type=Aggregation side=A */
   private java.util.List<Typologie> typologies;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Typologie> getTypologies() {
      if (typologies == null)
         typologies = new java.util.LinkedList<Typologie>();
      return typologies;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTypologies() {
      if (typologies == null)
         typologies = new java.util.LinkedList<Typologie>();
      return typologies.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTypologies */
   public void setTypologies(java.util.List<Typologie> newTypologies) {
      removeAllTypologies();
      for (java.util.Iterator iter = newTypologies.iterator(); iter.hasNext();)
         addTypologies((Typologie)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTypologie */
   public void addTypologies(Typologie newTypologie) {
      if (newTypologie == null)
         return;
      if (this.typologies == null)
         this.typologies = new java.util.LinkedList<Typologie>();
      if (!this.typologies.contains(newTypologie))
         this.typologies.add(newTypologie);
   }
   
   /** @pdGenerated default remove
     * @param oldTypologie */
   public void removeTypologies(Typologie oldTypologie) {
      if (oldTypologie == null)
         return;
      if (this.typologies != null)
         if (this.typologies.contains(oldTypologie))
            this.typologies.remove(oldTypologie);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTypologies() {
      if (typologies != null)
         typologies.clear();
   }
   
   /** @pdOid 7ec390bc-5a8d-473b-a4f5-927bf4112f84 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 339e0eb4-7dec-48b8-a665-9b236e985932 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid ff7cfe6a-80e2-4c7c-a524-c013a0be32a5 */
   public int getIdGroupe() {
      return idGroupe;
   }
   
   /** @param newIdGroupe
    * @pdOid 86190639-5f5a-4bad-affd-97bd325dc5d3 */
   public void setIdGroupe(int newIdGroupe) {
      idGroupe = newIdGroupe;
   }

}