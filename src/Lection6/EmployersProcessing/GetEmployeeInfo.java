package Lection6.EmployersProcessing;

/**
 * Created by bondar on 4/9/2015.
 * Класс GetEmployeeInfo описать как Generic, класс должен работать с типами реализующими Employable;
 Methods: printSalary(); printName();
 */
public class GetEmployeeInfo<T> {
    private T inputObj;
    //constructor
    public GetEmployeeInfo(T inputObj){
        this.inputObj = inputObj;
    }
    public GetEmployeeInfo() {
        this.inputObj = null;
    }

    public void printSalary(){
        float currentSalary = 0;
        if (this.inputObj instanceof EmployeeOfCompanyA){
            currentSalary = ((EmployeeOfCompanyA)inputObj).getSalary();
        }
        else if (this.inputObj instanceof EmployeeOfCompanyB){
            currentSalary = ((EmployeeOfCompanyB)inputObj).getSalary();
        }
        System.out.println("Salary: " + currentSalary);
    }
    public void printName(){
        String currentName = "";
        if (this.inputObj instanceof EmployeeOfCompanyA){
            currentName = ((EmployeeOfCompanyA)inputObj).getName();
        }
        else if (this.inputObj instanceof EmployeeOfCompanyB){
            currentName = ((EmployeeOfCompanyB)inputObj).getName();
        }
        System.out.println("Name: " + currentName);
    }


    public void set(T inputType){
        this.inputObj = inputType;
    }
    public T get(){
        return this.inputObj;
    }
}
