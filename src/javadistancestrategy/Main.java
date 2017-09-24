/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadistancestrategy;

import java.util.Arrays;

/**
 *
 * @author Robert Streetman
 */
public class Main {
    //The example points for distance metrics
    private static final double[] pointA = {1.3, 2.3, 67.6, 105.5, 30004.};
    private static final double[] pointB = {5.9, 1.6, 47.3, 456.3, 79994.};

    /**
     * @param args No command line args... yet
     */
    public static void main(String[] args) {
        System.out.format("Point A: %s\n", Arrays.toString(pointA));
        System.out.format("Point B: %s\n\n", Arrays.toString(pointB));
        
        //Create a new distance context
        DistanceContext distCon = new DistanceContext();
        
        //Set distance context to use Euclidean distance strategy
        distCon.setDistanceStrategy(new EuclideanDistanceStrategy());
        System.out.format("Euclidean Distance: %f\n", distCon.getDistance(pointA, pointB));
        
        //Set distance context to use Manhattan distance strategy
        distCon.setDistanceStrategy(new ManhattanDistanceStrategy());
        System.out.format("Manhattan Distance: %f\n", distCon.getDistance(pointA, pointB));
    }    
}
