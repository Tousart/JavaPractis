package Lab3;

public class Employee {
    private String fullname;
    private String post;
    private double salary;

    public Employee(String fullname, String post, double salary) {
        this.fullname = fullname;
        this.post = post;
        this.salary = salary;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return this.post;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
