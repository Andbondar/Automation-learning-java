package Lection6;

import Lection6.EmployersProcessing.EmployeeOfCompanyA;
import Lection6.EmployersProcessing.EmployeeOfCompanyB;
import Lection6.EmployersProcessing.GetEmployeeInfo;

/**
 * Created by bondar on 4/9/2015.
 *
 * Задание № 1 - 25 points
  Описать интерфейс Employable
 Fields: name, salary;
 Methods: getName();  getSalary(); setName();  setSalary();

  Классы EmployeeOfCompanyA, EmployeeOfCompanyB реализуют Employeable;
  Класс GetEmployeeInfo описать как Generic, класс должен работать с типами реализующими  Employeable;
 Methods: printSalary(); printName();
  Вывести информацию(salary, name) для экземпляров типов EmployeeOfCompanyA,  EmployeeOfCompanyB;
 */
public class Task01 {
    public static void main(String[] args) {
        EmployeeOfCompanyA jack = new EmployeeOfCompanyA("Jack", 120);
        EmployeeOfCompanyB john = new EmployeeOfCompanyB("John", 150);

        GetEmployeeInfo<EmployeeOfCompanyA> jackInfo = new GetEmployeeInfo<>(jack);
        jackInfo.printName();
        jackInfo.printSalary();


        GetEmployeeInfo<EmployeeOfCompanyB> johnInfo = new GetEmployeeInfo<>(john);
        jackInfo.printName();
        johnInfo.printSalary();

    }
}
