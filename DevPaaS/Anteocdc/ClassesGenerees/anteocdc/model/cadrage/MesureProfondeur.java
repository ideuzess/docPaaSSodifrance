/***********************************************************************
 * Module:  MesureProfondeur.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class MesureProfondeur
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid ba37c957-e8bf-4175-8038-93db2d747da5 */
public class MesureProfondeur {
   /** @pdOid de5d199d-19f7-4174-a4da-8066ca991f66 */
   private int idMP;
   /** @pdOid e9b869e1-00f0-4bd2-ab2e-5472bef0f385 */
   private int points;
   /** @pdOid 345d619c-368f-4043-ae2a-fc72c6674790 */
   private String libelle;
   
   /** @pdOid 2dedb5bd-4fcc-449f-93a6-dde9ea064428 */
   public int getPoints() {
      return points;
   }
   
   /** @param newPoints
    * @pdOid fca505a8-d8b2-428e-a2f1-8bca86c5b969 */
   public void setPoints(int newPoints) {
      points = newPoints;
   }
   
   /** @pdOid fa4dbd93-4e6c-4e21-ad59-86b25093f312 */
   public String getLibelle() {
      return libelle;
   }
   
   /** @param newLibelle
    * @pdOid 82ac1b93-f6e3-4b65-b804-34ce3a171d8f */
   public void setLibelle(String newLibelle) {
      libelle = newLibelle;
   }
   
   /** @pdOid b0dda3e9-b029-46b3-8523-18838df0b43c */
   public int getIdMP() {
      return idMP;
   }
   
   /** @param newIdMP
    * @pdOid ea389918-d0e4-4116-88c0-53fb38f06b85 */
   public void setIdMP(int newIdMP) {
      idMP = newIdMP;
   }

}