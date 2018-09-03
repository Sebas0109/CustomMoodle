/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle.edu.salle.customMoodle.model;

/**
 *
 * @author sebas
 */
public class Student {
    private String name;
    private String lastName;
    private String Id;
    
    public Student()
    {
        
    }
    
    public Student(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    //lo sobreescribimos para ber todos los elementos del estudiante
    @Override
    public String toString()
    {
        return String.format("id=%s\n, name=%s\n, lastName=%s", Id, name, lastName);//string format masna un string donde hay ub porcentaje y una s de string
    }
    
}
