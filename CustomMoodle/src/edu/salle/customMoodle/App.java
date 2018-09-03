/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle;

import edu.salle.customMoodle.View.StudentWindow;
import edu.salle.customMoodle.businessLogic.StudentBLO;
import edu.salle.customMoodle.edu.salle.customMoodle.model.Student;
import java.util.List;

/**
 *
 * @author sebas
 */
public class App {
    public static void main(String[] args) {
       /* Student s1 = new Student("Francisco","Perez");
        Student s2 = new Student("Sancho","Gutierrez");
        Student s3 = new Student("Pepe","Pecas");
        Student s4 = new Student("Tania","Martinez");

        //al entrar al blo genera el id automaticamente por que implemeta a otra clase en la que genera el id automaticamente 
        StudentBLO studentBLO = new StudentBLO();
        studentBLO.save(s1);
        studentBLO.save(s2);
        studentBLO.save(s3);
        studentBLO.save(s4);
        
        List<Student> studentList = studentBLO.findAll();
        for (Student stud : studentList) {
            System.out.println("stud");
            System.out.println("");
        }*/
       
       StudentWindow window = new StudentWindow();
       window.setVisible(true);
        
    }
}
