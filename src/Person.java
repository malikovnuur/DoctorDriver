public abstract class Person implements PersonAble {

    private int id;
    private String fullName;
    private static byte age;
    private char gender;
    private String email;
    private long phoneNumber;

    public Person(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
    }

    private double governmentsSalary;

    protected Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", governmentsSalary=" + governmentsSalary +
                '}';
    }

    public static byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    public void setGovernmentsSalary(double governmentsSalary) {
        this.governmentsSalary = governmentsSalary;
    }


    }


