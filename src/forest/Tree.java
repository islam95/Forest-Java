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
//  *******************************************************************
public class Tree implements Comparable<Tree> {
    // ---------------------- Object variables -----------------------

    private double height;            // Stores height of tree.
    private int age;               // Age of tree.               
    private int locationX, locationY; // Coordinates of location of tree.

    // ------------------------ Constructor --------------------------
    public Tree() {
        height = 1;
        age = 2;
        locationX = 0;
        locationY = 0;
    }

    public Tree(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    /**
     * Grows the tree by 10% and ages it by a year.
     */
    public void grow() {
        age = age + 1;
        System.out.print("The " + age + " year old tree has grown from " + height + "m to ");
        height = (height + 0.1 * height);
        System.out.println(height + "m.");
    }

    @Override
    public int compareTo(Tree tree) {

        int num = 0;

        if (this.age < tree.age) {
            num = -1;
        }

        if (this.age > tree.age) {
            num = 1;
        }

        if (this.height < tree.height) {
            num = -1;
        } else if (this.height > tree.height) {
            num = 1;
        } else {
            num = 0;
        }

        return num;
    }
}
