package HashMap;

import java.util.HashMap;

/**
 *
 * @author islam
 */
public class MainHashMap {
    
    private HashMap <String, Contributor> contributors;
    private HashMap <String, Photo> photos;
    
    public MainHashMap(){
        contributors = new HashMap <String, Contributor>();
        contributors.put("7539598@N04", new Contributor("Thomas Shahan", 230));
        contributors.put("55186440@N00", new Contributor("Brian DeMeester", 610));
        contributors.put("14884524@N08", new Contributor("Kilarin", 104));
        
        photos = new HashMap <String, Photo>();
        photos.put("3609624150", new Photo("Female Rabid Wolf Spider", "7539598@N04", "08062009"));
        photos.put("3596720576", new Photo("Head of Long Legged Fly", "7539598@N04", "04062009"));
        photos.put("4336541668", new Photo("Bronco", "55186440@N00", "06022010"));
        photos.put("4162213878", new Photo("P1050942v01-frost-rose", "14884524@N08", "05122009"));
        
        showResult();
    }
    
    public void showResult(){
        System.out.println("Contributors: ");
        
        for(String key : contributors.keySet()){
            
            Contributor contr = contributors.get(key);
            System.out.println("\t" + contr.getName() + " " + contr.getPhotosUp());
            
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Photos: ");
        
        for(String key : photos.keySet()){
            
            Photo photo = photos.get(key);
            System.out.println("\t" + photo.getTitle() + " " + photo.getContributorID() + " " + photo.getDate());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        MainHashMap newHashMap = new MainHashMap();
        
    
    }
}
