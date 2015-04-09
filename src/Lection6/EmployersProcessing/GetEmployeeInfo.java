package Lection6.EmployersProcessing;

/**
 * Created by bondar on 4/9/2015.
 * Класс GetEmployeeInfo описать как Generic, класс должен работать с типами реализующими Employable;
 Methods: printSalary(); printName();
 */
public class GetEmployeeInfo {
    private Employable inputObj;

    public void printSalary(){
        float currentSalary = 0;
        currentSalary = inputObj.getSalary();
        System.out.println("Salary: " + currentSalary);
    }

    public void set(Employable inputType){
        this.inputObj = inputType;
    }
    public Employable get(){
        return this.inputObj;
    }
}
