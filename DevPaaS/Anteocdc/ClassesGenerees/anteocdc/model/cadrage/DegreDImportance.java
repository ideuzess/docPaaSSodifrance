/***********************************************************************
 * Module:  DegreDImportance.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class DegreDImportance
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid a6525e67-4329-4980-8fc2-07dbf6e77843 */
public class DegreDImportance {
   /** @pdOid 8d96ef2c-8de3-4ed8-94c9-b0521631fb9a */
   private int idDDI;
   /** @pdOid 5653a87f-f76f-4e5a-97e1-5c068d5fd9ea */
   private String nom;
   /** @pdOid d866b4af-6194-437b-acb5-408b038b9ce8 */
   private int valeur;
   
   /** @pdOid 8d709079-c8d1-4db0-af73-03bc1b4e3880 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 4c8fe1ae-5484-4d90-9ac3-4e5bdbb1c73e */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 7af5f2cb-956a-43d6-972f-f50119303cbe */
   public int getValeur() {
      return valeur;
   }
   
   /** @param newValeur
    * @pdOid 0c4fe605-3770-4026-8bc7-b636380415a0 */
   public void setValeur(int newValeur) {
      valeur = newValeur;
   }
   
   /** @pdOid ae0d92f9-28f7-4c02-9115-478850aa974f */
   public int getIdDDI() {
      return idDDI;
   }
   
   /** @param newIdDDI
    * @pdOid 6b7f7f36-4689-4784-8691-f26a5bb749ac */
   public void setIdDDI(int newIdDDI) {
      idDDI = newIdDDI;
   }

}