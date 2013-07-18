/***********************************************************************
 * Module:  ProfondeurDuChangement.java
 * Author:  idiallo.stage
 * Purpose: Defines the Class ProfondeurDuChangement
 ***********************************************************************/

package anteocdc.model.cadrage;

import java.util.*;

/** @pdOid fc267f64-0488-4621-baaa-b04e33cd2dda */
public class ProfondeurDuChangement {
   /** @pdOid 4d24453d-942b-483a-a151-24bd4f6da2d3 */
   private int idPDC;
   /** @pdOid e05e51d8-9299-4170-89fb-47f091f3339c */
   private float profondeur;
   
   /** @pdRoleInfo migr=no name=ParametreCompetences assc=association3 mult=1..1 */
   private ParametreCompetences parametreCompetences;
   /** @pdRoleInfo migr=no name=ParametrePerimetre assc=association24 mult=1..1 */
   private ParametrePerimetre parametrePerimetre;
   /** @pdRoleInfo migr=no name=ParametreRoleDuManagement assc=association31 mult=1..1 */
   private ParametreRoleDuManagement parametreRoleDuManagement;
   /** @pdRoleInfo migr=no name=ParametreCultureEntreprise assc=association10 mult=1..1 side=A */
   private ParametreCultureEntreprise parametreCultureEntreprise;
   /** @pdRoleInfo migr=no name=ParametreEngagementProjet assc=association20 mult=1..1 side=A */
   private ParametreEngagementProjet parametreEngagementProjet;
   /** @pdRoleInfo migr=no name=ParametreEffortMobilisation assc=association21 mult=1..1 side=A */
   private ParametreEffortMobilisation parametreEffortMobilisation;
   
   
   /** @pdGenerated default parent getter */
   public ParametreCompetences getParametreCompetences() {
      return parametreCompetences;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreCompetences */
   public void setParametreCompetences(ParametreCompetences newParametreCompetences) {
      this.parametreCompetences = newParametreCompetences;
   }
   /** @pdGenerated default parent getter */
   public ParametrePerimetre getParametrePerimetre() {
      return parametrePerimetre;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametrePerimetre */
   public void setParametrePerimetre(ParametrePerimetre newParametrePerimetre) {
      this.parametrePerimetre = newParametrePerimetre;
   }
   /** @pdGenerated default parent getter */
   public ParametreRoleDuManagement getParametreRoleDuManagement() {
      return parametreRoleDuManagement;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreRoleDuManagement */
   public void setParametreRoleDuManagement(ParametreRoleDuManagement newParametreRoleDuManagement) {
      this.parametreRoleDuManagement = newParametreRoleDuManagement;
   }
   /** @pdGenerated default parent getter */
   public ParametreCultureEntreprise getParametreCultureEntreprise() {
      return parametreCultureEntreprise;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreCultureEntreprise */
   public void setParametreCultureEntreprise(ParametreCultureEntreprise newParametreCultureEntreprise) {
      this.parametreCultureEntreprise = newParametreCultureEntreprise;
   }
   /** @pdGenerated default parent getter */
   public ParametreEngagementProjet getParametreEngagementProjet() {
      return parametreEngagementProjet;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreEngagementProjet */
   public void setParametreEngagementProjet(ParametreEngagementProjet newParametreEngagementProjet) {
      this.parametreEngagementProjet = newParametreEngagementProjet;
   }
   /** @pdGenerated default parent getter */
   public ParametreEffortMobilisation getParametreEffortMobilisation() {
      return parametreEffortMobilisation;
   }
   
   /** @pdGenerated default parent setter
     * @param newParametreEffortMobilisation */
   public void setParametreEffortMobilisation(ParametreEffortMobilisation newParametreEffortMobilisation) {
      this.parametreEffortMobilisation = newParametreEffortMobilisation;
   }
   
   /** @pdOid f284e779-411d-42f5-8fa3-541e3331ef3d */
   public float getProfondeur() {
      return profondeur;
   }
   
   /** @param newProfondeur
    * @pdOid 686aa9dd-bd68-4350-9301-045d2a353016 */
   public void setProfondeur(float newProfondeur) {
      profondeur = newProfondeur;
   }
   
   /** @pdOid dc1038df-328d-4234-bf77-a523edec28cf */
   public int getIdPDC() {
      return idPDC;
   }
   
   /** @param newIdPDC
    * @pdOid 55bb2e03-238a-4fba-8a07-f32a41492bc3 */
   public void setIdPDC(int newIdPDC) {
      idPDC = newIdPDC;
   }

}