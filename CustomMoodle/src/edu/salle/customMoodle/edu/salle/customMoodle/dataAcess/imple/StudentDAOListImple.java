/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.imple;

import edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.StudentDAO;
import edu.salle.customMoodle.edu.salle.customMoodle.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * IMPLEMENTACION POR MEDIO DE ARCHIVOS
 */
public class StudentDAOListImple implements StudentDAO {

    private static List<Student> studentList = new ArrayList<>();
    
    @Override
    public Student save(Student stud) {
        String id = Integer.toString(studentList.size()+1);
        stud.setId(id);
        studentList.add(stud); //solito se va a generar id no generaremos id desde la interfaz con un campo
        return stud;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student find(String id) {
        Student stud = null;
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; //en caso de que no encuentre 
    }
    
    
    
}
