/***********************************************************************
 * Module:  MesureLargeur.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class MesureLargeur
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 82fdd3bc-a7db-4d93-b08f-e402f90f278c */
public class MesureLargeur {
   /** @pdOid 12a78595-9058-40ea-a9f3-f0e62b948d81 */
   private int idML;
   /** @pdOid ef3a7eb1-9967-4df5-a7cc-f557ebc4b250 */
   private int points;
   /** @pdOid 31d7c050-b731-491e-853f-a46aa5480f83 */
   private int borneMin;
   /** @pdOid c94af32f-617d-4108-b2b6-0583003cd7b9 */
   private int borneMax;
   
   /** @pdOid 78323bd2-3483-446a-bd28-b6c0256db34c */
   public int getPoints() {
      return points;
   }
   
   /** @param newPoints
    * @pdOid 449b18a0-4c5e-4ead-ab12-4aa20bc5c976 */
   public void setPoints(int newPoints) {
      points = newPoints;
   }
   
   /** @pdOid c667a087-82cb-4ef7-be1c-2e4f5e20e931 */
   public int getBorneMin() {
      return borneMin;
   }
   
   /** @param newBorneMin
    * @pdOid 57522a64-b1e8-4620-811b-ea0f93a841f0 */
   public void setBorneMin(int newBorneMin) {
      borneMin = newBorneMin;
   }
   
   /** @pdOid 98a7c756-c2ce-404b-b5f4-f277196207f1 */
   public int getBorneMax() {
      return borneMax;
   }
   
   /** @param newBorneMax
    * @pdOid 1fda9608-3536-4460-adac-e9516befa330 */
   public void setBorneMax(int newBorneMax) {
      borneMax = newBorneMax;
   }
   
   /** @pdOid 58dad9be-85b4-48cb-adb3-ad666bd490d2 */
   public int getIdML() {
      return idML;
   }
   
   /** @param newIdML
    * @pdOid d8fa85af-5f6b-4fc0-a3ce-1fbe914c80f4 */
   public void setIdML(int newIdML) {
      idML = newIdML;
   }

}