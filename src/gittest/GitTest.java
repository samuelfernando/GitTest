/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

/**
 *
 * @author samf
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GitTest gt = new GitTest();
        int out = gt.coolFunction();
        System.out.println("Oh no cool function was wrong it should be "+out);
    }

    private int coolFunction() {
        return 9999;
    }
    
}
