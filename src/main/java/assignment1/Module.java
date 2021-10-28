package assignment1;

import org.joda.time.DateTime;

public class Module {
    private String moduleName;
    private String id;
    private Student[] listOfStudents;
    private CourseProgramme[] coursesAssociated;
    //getters and setters for all the attributes
    
    //module name
    public String getmoduleName(){
        return this.moduleName;
    }
    public void setmoduleName(String moduleName){
        this.moduleName = moduleName;
    }
    
    //id
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    //list of students
    public Student[] getlistOfStudents(){
        return this.listOfStudents;
    }
    public void setlistOfStudents(Student[] listOfStudents){
        this.listOfStudents = listOfStudents;
    }
    
    //courses associated with
    public CourseProgramme[] getcoursesAssociated(){
        return this.coursesAssociated;
    }
    public void setcoursesAssociated(CourseProgramme[] coursesAssociated){
        this.coursesAssociated = coursesAssociated;
    }
}
