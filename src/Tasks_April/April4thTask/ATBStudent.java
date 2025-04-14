package Tasks_April.April4thTask;
//Create the Class of ATB ( Encapsulation) , getter & setter)
//Create an Array of ATB Students and add toString method.
class ATBStudent {
    private String name;
    private int age;

    // Constructor
    ATBStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ATBStudent[] students = new ATBStudent[2];
        students[0] = new ATBStudent("Alice", 22);
        students[1] = new ATBStudent("Bob", 23);

        for (ATBStudent s : students) {
            System.out.println(s);
        }
    }
}