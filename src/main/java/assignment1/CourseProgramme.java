package assignment1;

import org.joda.time.DateTime;
        
public class CourseProgramme {
    private String courseName;
    private String id;
    private Module[] listOfModules;
    private Student[] listOfStudents;
    private int a;
    private DateTime academicStartDate;
    private DateTime academicEndDate;
    
    //getters and setters for all the attributes
    
    //course name
    public String getcourseName(){
        return this.courseName;
    }
    public void setcourseName(String courseName){
        this.courseName = courseName;
    }
    
    //id
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    //list of modules
    public Module[] getlistOfModules(){
        return this.listOfModules;
    }
    public void setlistOfModules(Module[] listOfModules){
        this.listOfModules = listOfModules;
    }
    
    //list of students
    public Student[] getlistOfStudents(){
        return this.listOfStudents;
    }
    public void setlistOfStudents(Student[] listOfStudents){
        this.listOfStudents = listOfStudents;
    }
    
    //academic start date 
    public DateTime getacademicStartDate(){
        return this.academicStartDate;
    }
    public void setacademicStartDate(DateTime academicStartDate){
        this.academicStartDate = academicStartDate;
    }
    
    //academic end date 
    public DateTime getacademicEndDate(){
        return this.academicEndDate;
    }
    public void setacademicEndDate(DateTime academicEndDate){
        this.academicEndDate = academicEndDate;
    }
}
