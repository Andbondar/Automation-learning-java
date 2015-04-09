package Lection6.EmployersProcessing;

/**
 * Created by bondar on 4/9/2015.
 */
public class EmployeeOfCompanyB implements Employable {
    private String name = "";
    private float salary = 0;

    public EmployeeOfCompanyB(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public float getSalary() {
        return this.salary;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
