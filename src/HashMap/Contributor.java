package HashMap;

/**
 *
 * @author Islam Dudaev
 */
public class Contributor {
    
    // ---------------------- Object variables -------------------------
    
    private String name;
    private int photosUp;
    
    // ------------------------ Constructors -----------------------
    /**
     * Creates an object with the name and number of photos uploaded.
     * @param name      User's name.
     * @param photosUp  Number of photos uploaded.
     */
    public Contributor(String name, int photosUp){
        this.name = name;
        this.photosUp = photosUp;
    }
    
    // ------------------------- Methods -------------------
    
    /**
     * Reports the user's name.
     * @return  User's name.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Reports the number of uploaded photos.
     * @return  Number of uploaded photos.
     */
    public int getPhotosUp(){
        return photosUp;
    }
    
    
    
}
