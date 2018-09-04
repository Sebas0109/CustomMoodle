/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.customMoodle.edu.salle.customMoodle.model;

import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Student{
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

    /*@Override
    public int compareTo(Object o) {
        return ((Student)o).Id .compareTo(Id); //regresa un 1 o un -1 para decir si llego o no compara ids objeto que damos es student para acceder al id lo comparamos 
                                                //SIEMPRE SE USA PARA ORDENAR 1 SI ES MAYOR AL OTRO  INVESTIGAR COMO ES EL COMPARE TO
    }
    
    @Override
    public int hashCode() //para forzar al programa se usan 3 metodos este es el segundo
    {
        return Id.hashCode();
    }*/ //SOLO SI USABAMOS ORDENAMIENTO

    @Override
    public boolean equals(Object obj) { //
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }    
}
