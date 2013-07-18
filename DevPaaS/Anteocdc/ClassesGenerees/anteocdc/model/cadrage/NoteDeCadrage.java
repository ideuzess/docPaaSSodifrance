/***********************************************************************
 * Module:  NoteDeCadrage.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class NoteDeCadrage
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid 94c3f596-7776-4114-bd86-51c4104f8daa */
public class NoteDeCadrage {
   /** @pdOid f537d7c5-4e47-4526-9a5d-b7bd2387663f */
   private int idNDC;
   /** @pdOid e591367a-8444-4791-8037-909cc1749454 */
   private String burningPlatform;
   /** @pdOid ec49edea-2880-41a3-b648-9e768afdc7e2 */
   private String constat;
   /** @pdOid 7a1f707e-7aa0-4c68-90be-bdb76830ffc6 */
   private String resultatsAttendus;
   /** @pdOid 9a62b228-cfd2-4377-bc7f-a13399ab74e3 */
   private String gainsAttendus;
   /** @pdOid 09d5132d-865e-4c85-9bdf-860d29b06854 */
   private String risquesPercus;
   
   /** @pdOid 15851d89-c7b4-40ef-9a7e-4ee8fe766ba9 */
   public String getBurningPlatform() {
      return burningPlatform;
   }
   
   /** @param newBurningPlatform
    * @pdOid 212d9be4-01ae-444b-ae7c-094875b459c7 */
   public void setBurningPlatform(String newBurningPlatform) {
      burningPlatform = newBurningPlatform;
   }
   
   /** @pdOid 22e7989e-87b2-4c24-95b0-a069bf5bc9b3 */
   public String getConstat() {
      return constat;
   }
   
   /** @param newConstat
    * @pdOid 8b80e820-e700-493c-8fb6-5a907c894dc0 */
   public void setConstat(String newConstat) {
      constat = newConstat;
   }
   
   /** @pdOid bc216283-05f2-4b7d-94bd-ea4b8132e23f */
   public String getResultatsAttendus() {
      return resultatsAttendus;
   }
   
   /** @param newResultatsAttendus
    * @pdOid 6a9e152c-19f5-4602-a013-4b9ce47e93c5 */
   public void setResultatsAttendus(String newResultatsAttendus) {
      resultatsAttendus = newResultatsAttendus;
   }
   
   /** @pdOid 7c9936d7-dbf2-4d48-9ce7-bdbbf4a3e566 */
   public String getGainsAttendus() {
      return gainsAttendus;
   }
   
   /** @param newGainsAttendus
    * @pdOid cfb7565e-365a-4f7d-a3dc-0676c1db71d2 */
   public void setGainsAttendus(String newGainsAttendus) {
      gainsAttendus = newGainsAttendus;
   }
   
   /** @pdOid ada40cba-4945-41ad-a04f-1f7400f59299 */
   public String getRisquesPercus() {
      return risquesPercus;
   }
   
   /** @param newRisquesPercus
    * @pdOid e85c10a6-3d15-48dc-8586-cd3c07a94050 */
   public void setRisquesPercus(String newRisquesPercus) {
      risquesPercus = newRisquesPercus;
   }
   
   /** @pdOid 5560b3a3-2aaa-4534-83a1-95a76d4fa43c */
   public int getIdNDC() {
      return idNDC;
   }
   
   /** @param newIdNDC
    * @pdOid c56508a7-7e82-469f-a673-78b8202c7066 */
   public void setIdNDC(int newIdNDC) {
      idNDC = newIdNDC;
   }

}