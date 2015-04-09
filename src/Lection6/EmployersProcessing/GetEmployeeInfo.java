package Lection6.EmployersProcessing;

/**
 * Created by bondar on 4/9/2015.
 * Класс GetEmployeeInfo описать как Generic, класс должен работать с типами реализующими Employable;
 Methods: printSalary(); printName();
 */
public class GetEmployeeInfo<T> {
    private T inputObj;

    public void printSalary(){
        float currentSalary = 0;
        if (inputObj instanceof EmployeeOfCompanyA){
            currentSalary = ((EmployeeOfCompanyA) inputObj).getSalary();
        } else if (inputObj instanceof EmployeeOfCompanyB){
            currentSalary = ((EmployeeOfCompanyB) inputObj).getSalary();
        }
        System.out.println("Salary: " + currentSalary);
    }

    public void set(T inputType){
        this.inputObj = inputType;
    }
    public T get(){
        return this.inputObj;
    }
}
