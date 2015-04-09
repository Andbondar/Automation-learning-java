package Lection6;

import Lection6.EmployersProcessing.EmployeeOfCompanyA;
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
        GetEmployeeInfo jackInfo = new GetEmployeeInfo();
        jackInfo.set(jack);
        jackInfo.printSalary();
    }
}
