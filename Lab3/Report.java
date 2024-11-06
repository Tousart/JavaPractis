package Lab3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    private ArrayList<Employee> report;
    private NumberFormat slr = NumberFormat.getCurrencyInstance();

    public Report() {
        this.report = new ArrayList<>();
    }

    public void addEmployee(String name, String post, double salary) {
        this.report.add(new Employee(name, post, salary));
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < this.report.size(); i++) {
            if (this.report.get(i).getFullname() == name) {
                this.report.remove(i);
                break;
            }
        }
    }
    @Override
    public String toString() {
        Formatter fmt1 = new Formatter();
        String s = "" + fmt1.format("Имя" + "%" + 46 + "s" + "%" + 39 + "s%n", "Должность", "Зарплата");
        for (int i = 0; i < this.report.size(); i++) {
            Formatter fmt = new Formatter();
            String salary = slr.format(this.report.get(i).getSalary());
            String name = this.report.get(i).getFullname();
            String post = this.report.get(i).getPost();
            fmt.format("%s" + "%" + (40 - name.length() + post.length()) + "s" + "%" +
                    (40 - post.length() + salary.length()) + "s%n",name, post, salary);
            s += fmt;
        }
        return s;
    }
}
