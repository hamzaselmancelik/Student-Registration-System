package assignment1;

public class TestGetUserName {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Hamza");
        s.setAge(21);
        System.out.print(s.getUsername());

    }
}
