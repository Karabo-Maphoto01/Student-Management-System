/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

/**
 *
 * @author Karabo
 */
public class AgeValidatorException {
    
    public static void validateAge(int age) {
        //Setting age to be from 18 years and above
        if(age <= 17){
            throw new AgeException("Age must be older than 17 years, please try again!");
        }
        
        //Students shoulds be older than 60
        if(age >= 60){
            throw new AgeException("Age must not be older 50 years!");
        }
        System.out.println("Age is valid");
    }
    
}
