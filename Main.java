/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        private String[] productNames ={
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };
    private int[][] sales = new int[3][3];
    
    public Product(int[][] sales) {
        this.sales =sales;
    }
    Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i< sales.length;i++) {
            for (int j = 0; j < sales[i].length;j++ {
                total += sales[i][j];
        
    }
}
