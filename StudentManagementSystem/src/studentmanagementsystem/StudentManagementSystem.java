/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Karabo
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Instatiating a student object
        StudentManager manager = new StudentManager();
        
        int choice; // Declaring a data type for the user's input
        do {  
            System.out.print("==================");
            System.out.print("1. Add Student");
            System.out.print("2. Display Students");
            System.out.print("3. Search Student");
            System.out.print("4. Remove Student");
            System.out.print("5. Update Student");
            System.out.print("6. Exit");
            System.out.println("==================");
         while (!scan.hasNextInt()){
            System.out.println("Invalid input! Enter a number between 1 and 6.");
            scan.next(); //Clear invalid input
        }
         
         choice = scan.nextInt();
         scan.nextLine();
        
            switch (choice) {
                case 1:
                    
                    break;
                default:
                    
            }
        }while(choice != 6);
   }
}
