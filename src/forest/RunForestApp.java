/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forest;

/**
 *
 * @author islam
 */
public class RunForestApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Forest forest = new Forest();
        Tree t1 = new Tree(2,   2.3);
        Tree t2 = new Tree(3,  22.3);
        Tree t3 = new Tree(1,  12.4);
        Tree t4 = new Tree(53, 43.2);
        Tree t5 = new Tree(12, 23.13);
        Tree t6 = new Tree(12, 54.33);
        Tree t7 = new Tree(23, 26.83);
        Tree t8 = new Tree(34, 56.53);
        
        forest.addTree(t1);
        forest.addTree(t2);
        forest.addTree(t3);
        forest.addTree(t4);
        forest.addTree(t5);
        forest.addTree(t6);
        forest.addTree(t7);
        forest.addTree(t8);
        
        
        forest.displayTree();
        
    }
    
}
