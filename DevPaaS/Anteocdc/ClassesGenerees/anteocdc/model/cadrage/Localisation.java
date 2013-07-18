/***********************************************************************
 * Module:  Localisation.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Localisation
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid eaea7a56-4180-4af5-ba42-8971253c2be6 */
public class Localisation {
   /** @pdOid 509eea1a-b070-4536-a7a6-e16f6e07682e */
   private int idLocalisation;
   /** @pdOid dde9f358-fc5f-41e7-94e8-648dcf48e267 */
   private String nom;
   
   /** @pdOid b0e45bd5-9886-4754-bfff-eabb4631f58a */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 9a86e90a-47b4-44c4-a2c1-7bbc98cfbcb1 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 4122d323-7371-49ef-9dfa-dddb5cc10c07 */
   public int getIdLocalisation() {
      return idLocalisation;
   }
   
   /** @param newIdLocalisation
    * @pdOid a9e67108-7fb9-4134-a8d7-e853c2258cf1 */
   public void setIdLocalisation(int newIdLocalisation) {
      idLocalisation = newIdLocalisation;
   }

}