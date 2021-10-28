package assignment1;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date DOB;
    private int ID;
    private String username;
    private String[] coursesRegistered;
    private String[] modulesRegistered;
    
    public Student(){
        
    }
    
    //getters and setters for all the attributes
    //name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //age
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //date of birth
    public Date getDOB(){
        return this.DOB;
    }
    public void setDOB(Date DOB){
        this.DOB = DOB;
    }
    //ID
    public int getID(){
        return this.ID;
    }
    public void ID(int ID){
        this.ID = ID;
    }
    //username
    public String getUsername(){
        return this.name + this.age;
    }
    public void setUsername(){
        this.username = this.name + this.ID;
    }

    //courses registered
    public String[] getCoursesRegistered(){
        return this.coursesRegistered;
    }
    public void setCoursesRegistered(String[] coursesRegistered){
        this.coursesRegistered = coursesRegistered;
    }
    //modules registered
    public String[] getModulesRegistered(){
        return this.modulesRegistered;
    }
    public void setModulesRegistered(String[] modulesRegistered){
        this.modulesRegistered = modulesRegistered;
    }
}
