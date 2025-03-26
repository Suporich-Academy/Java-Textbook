package student;

public class StudentDTO {
    private final int id;
    private final String name;
    private final int age;
    private final String subject;
    private final String gender;

    public StudentDTO(int id, String name, int age, String subject, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "StudentDTO [id=" + id 
                + ", name=" + name 
                + ", age=" + age 
                + ", subject=" + subject 
                + ", gender=" + gender + "]";
    }
}
