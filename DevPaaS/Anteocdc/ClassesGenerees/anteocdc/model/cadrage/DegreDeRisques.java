/***********************************************************************
 * Module:  DegreDeRisques.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class DegreDeRisques
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid b8ff32e4-f4be-4d38-a741-e29338a9dd24 */
public class DegreDeRisques {
   /** @pdOid 1ec4e967-a5c9-4913-8342-32ca46b10d9d */
   private int idDDR;
   /** @pdOid 8313df20-1b5f-4050-9104-2b04d75c4d1d */
   private String nom;
   /** @pdOid 604a0ab8-ef5f-43ac-ac8b-f65a3180d652 */
   private int valeur;
   
   /** @pdOid 670c4146-7ae9-463a-8873-c0fdc7c79952 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 1682b8be-cab4-41c0-8cf8-bc6348cc3724 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 2f577f7a-3591-4a1e-b6ed-8f78cd3415cf */
   public int getValeur() {
      return valeur;
   }
   
   /** @param newValeur
    * @pdOid 108e5ada-6db8-49e8-8dd3-9966f3aee91d */
   public void setValeur(int newValeur) {
      valeur = newValeur;
   }
   
   /** @pdOid 4c83167d-cc84-4324-85b6-859e2c155cea */
   public int getIdDDR() {
      return idDDR;
   }
   
   /** @param newIdDDR
    * @pdOid 96df94ca-5ef9-4e77-8c5f-53a196820ba7 */
   public void setIdDDR(int newIdDDR) {
      idDDR = newIdDDR;
   }

}