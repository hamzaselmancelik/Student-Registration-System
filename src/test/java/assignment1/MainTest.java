package assignment1;

import org.junit.Assert;
import org.junit.Test;

public class MainTest
{
    @Test
    public void getUsernameTest()
    {
        Student s = new Student();
        s.setName("Hamza");
        s.setAge(21);
        Assert.assertEquals("Hamza21",s.getUsername());
    }
    @Test
    public void courseProgrammeStudents()
    {
        Student s1 = new Student();
        s1.setName("Hamza");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("Mark");
        s2.setAge(42);
        s2.setUsername();

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        CourseProgramme cp = new CourseProgramme();
        cp.setlistOfStudents(students);


        Assert.assertEquals("Hamza21",cp.getlistOfStudents()[0].getUsername());
        Assert.assertEquals("Mark42",cp.getlistOfStudents()[1].getUsername());
    }
}