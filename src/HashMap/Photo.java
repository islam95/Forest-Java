/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;


/**
 *
 * @author islam
 */
public class Photo {
    
     // ---------------------- Object variables -------------------------
    
    private String title;
    private String contributorID;
    private String date;
    
    // ------------------------ Constructors -----------------------
    /**
     * To create an object of photo
     * @param title The title of the photo.
     * @param contributorID The contributorID.
     * @param date The date submitted a photo.
     */
    public Photo(String title, String contributorID, String date){
        this.title = title;
        this.contributorID = contributorID;
        this.date = date;
    }
    
    // ------------------------- Methods -------------------
    
    /**
     * Reports the title of the photo.
     * @return  The title of the photo.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Reports the contributorID.
     * @return  ThecontributorID.
     */
    public String getContributorID(){
        return contributorID;
    }
    
    /**
     * Reports the date of photo submitted.
     * @return The date of photo submitted.
     */
    public String getDate(){
        return date;
    }
}
