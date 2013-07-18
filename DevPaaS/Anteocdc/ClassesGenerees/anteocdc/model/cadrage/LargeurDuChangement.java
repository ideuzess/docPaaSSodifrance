/***********************************************************************
 * Module:  LargeurDuChangement.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class LargeurDuChangement
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 1066c89b-e059-4a2b-b6f4-0589f9049c1a */
public class LargeurDuChangement {
   /** @pdOid c87a52bf-8293-415a-8616-ba8c9ff2829d */
   private int idLargeur;
   /** @pdOid c00ed90a-f82d-457a-9564-f2d59fffd153 */
   private float largeur;
   
   /** @pdRoleInfo migr=no name=ParametreSites assc=association5 mult=1..1 side=A */
   private ParametreSites parametreSites;
   /** @pdRoleInfo migr=no name=ParametreActeurs assc=association12 mult=1..1 side=A */
   private ParametreActeurs parametreActeurs;
   /** @pdRoleInfo migr=no name=ParametreGroupes assc=association16 mult=1..1 side=A */
   private ParametreGroupes parametreGroupes;
   
   
   /** @pdGenerated default parent getter */
   public ParametreSites getParametreSites() {
      return parametreSites;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreSites */
   public void setParametreSites(ParametreSites newParametreSites) {
      this.parametreSites = newParametreSites;
   }
   /** @pdGenerated default parent getter */
   public ParametreActeurs getParametreActeurs() {
      return parametreActeurs;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreActeurs */
   public void setParametreActeurs(ParametreActeurs newParametreActeurs) {
      this.parametreActeurs = newParametreActeurs;
   }
   /** @pdGenerated default parent getter */
   public ParametreGroupes getParametreGroupes() {
      return parametreGroupes;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreGroupes */
   public void setParametreGroupes(ParametreGroupes newParametreGroupes) {
      this.parametreGroupes = newParametreGroupes;
   }
   
   /** @pdOid bcdfc069-9cd8-4eee-95df-62771a8bf0fd */
   public float getLargeur() {
      return largeur;
   }
   
   /** @param newLargeur
    * @pdOid 1613d8fc-1096-4ccc-94c3-d4dda9bc6fc9 */
   public void setLargeur(float newLargeur) {
      largeur = newLargeur;
   }
   
   /** @pdOid 38505810-93d0-4097-abd7-291320cac7b7 */
   public int getIdLargeur() {
      return idLargeur;
   }
   
   /** @param newIdLargeur
    * @pdOid be129048-e167-4264-984e-dfb2a6aba757 */
   public void setIdLargeur(int newIdLargeur) {
      idLargeur = newIdLargeur;
   }

}