/***********************************************************************
 * Module:  Acteur.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class Acteur
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 0dda891c-30fb-4453-88f2-dfbf5789561f */
public class Acteur {
   /** @pdOid 8aa0cf01-fb2c-4b2d-9921-a1d041f0cb91 */
   private int idActeur;
   
   /** @pdOid 249502c0-0d6e-4131-8233-89c7789d02e2 */
   public int getIdActeur() {
      return idActeur;
   }
   
   /** @param newIdActeur
    * @pdOid 3d29a516-9c9b-4433-b9b4-c956c5f68422 */
   public void setIdActeur(int newIdActeur) {
      idActeur = newIdActeur;
   }

}