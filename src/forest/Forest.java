/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forest;

import java.util.ArrayList;

/**
 *
 * @author islam
 */
public class Forest {

     private ArrayList<Tree> trees;
    
    /**
     * Constructor for objects of class Forest
     */
    public Forest()
    {
        // initialise instance variables
        trees = new ArrayList<Tree>();
        
    }

    public void displayTree()
    {
        for(Tree tree : trees)
        {
            System.out.println(tree.getAge() + " " + tree.getHeight());
        }
    }
   
    public void addTree(Tree aTree){
        trees.add(aTree);
        
        
    }
    
    
}
