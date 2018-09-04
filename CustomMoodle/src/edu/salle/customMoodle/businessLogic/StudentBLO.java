/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle.businessLogic;

import edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.StudentDAO;
import edu.salle.customMoodle.edu.salle.customMoodle.dataAcess.imple.StudentDAOListImple;
import edu.salle.customMoodle.edu.salle.customMoodle.model.Student;
import java.util.List;

/**
 *  TENEMOS NUESTRA CAPA DE LA VISTA QUE SE VA A COM CON LA DE BL LA CUAL HACE TODAS ÑAS OPERACIONES Y LOGICA Y SE COM CON CAPA DE ACC A DATOS
 * VISTA Y DAO NO SE COM DIRECTAMENTE SE COM POR CAPA DE BL LOS METODOS AQUI SE LLAMAN IGUAL TENEMOS UN STUDENT DAO OBJECT EN EL QUE NO TENEMOS NADA 
 * 
 * @author sebas
 */
public class StudentBLO {
    
    private StudentDAO studentDAO;
    
    public StudentBLO()
    {
        studentDAO = new StudentDAOListImple(); //por que va a implementar todos los metodos de la clase //esto la hace mas escalable por que no depende de implemetnacion solo se cambia 
                                            //la clase dpnde se conecta abase de datos para acceder a ptro tipo de ide de base de ddatos
                                            
    }
    
    public Student save(Student stud)
    {
        return studentDAO.save(stud);
    }
    
    public List<Student> findAll()
    {
        return studentDAO.findAll();
    }
    
    public Student find(String id)
    {
        return studentDAO.find(id);
    }
    
    public Student findByLastName(String lastName)
    {
        return studentDAO.findByLastName(lastName);
    }
    
    public void delete(Student student) //como es void solo se pone lo que hace no lo que retirna 
    {
        studentDAO.delete(student);
    }
    
    public void update(Student student)
    {
        studentDAO.update(student);
    }  
}
