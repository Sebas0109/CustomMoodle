/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.imple;

import edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.StudentDAO;
import edu.salle.customMoodle.edu.salle.customMoodle.model.Student;
import java.util.List;

/**
 *
 * @author sebas
 */
public class StudentDAOMySQL implements StudentDAO { //dos clases que implemetnan student dao las de el mismo paquete uno entra por listas y otro por base de datos

    @Override
    public Student save(Student stud) {  //donde dice save vamos a hacer logica para infgresar en una base de datos 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student find(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
