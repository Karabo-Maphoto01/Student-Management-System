/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author Karabo
 */
public class StudentManager {
    
    private final ArrayList<Student> students;
    
    public StudentManager() {
        students = new ArrayList<>();
    }
    
    //Adding a student
    public void addStudent (Student student){
        students.add(student);
    }
    
    //Display the students
    public void displayStudents(){
        if(students.isEmpty()) { 
            System.out.println("There are no students available!");
        }else{
            for (Student student: students){
                System.out.println(student);
            }
        }
    }
    
    //Search student by ID
    public Student searchStudent(String ID) {
        for(Student student : students) {
            if (student.getId().equalsIgnoreCase(ID))
                return student;
        }
        return null;
    }
    
    //Method to remove student
    public boolean removeStudent (String ID){
        Student student = searchStudent(ID);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false; 
    }
    
    //Method to update student
    public boolean updateStudent (String ID, String newName, int newAge) {
        Student student = searchStudent(ID);
        if(ID != null) {
            student.setName(newName);
            if(newAge>0){
                student.setAge(newAge);
                      
            }
            return true;
        }
        return false;
    }
}
