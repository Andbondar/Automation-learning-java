package Lection6.EmployersProcessing;

/**
 * Created by bondar on 4/9/2015.
 * Описать интерфейс Employeable
 Fields: name, salary;
 Methods: getName();  getSalary(); setName();  setSalary();
 */
public interface Employable {
    public String getName();
    public float getSalary();
    public void setName(String name);
    public void setSalary(float salary);
}
