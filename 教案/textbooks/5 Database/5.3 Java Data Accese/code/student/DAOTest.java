package student;

public class DAOTest {
    public static void main(String[] args) {
        StudentDAO repository = new StudentDAO();

        repository.save(new StudentDTO(1, "Alice", 19, "Java", "Female"));
        repository.save(new StudentDTO(2, "Bob", 21, "Python", "Male"));
        
        for (StudentDTO student : repository.findAll()) {
            System.out.println(student);
        }
        
        repository.close();
    }
}
