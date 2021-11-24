package com.basics;

@FunctionalInterface
interface Employee {
    //abstract method
    Employee Find(int id);

    //default method
    default boolean isExec(int id){
        return true;
    }
    //static method
    static String getDefaultCountry(){
        return "US";
    }

}
public class DefaultStaticMethods {
    public static void main(String[] args) {

        class EmployeeOne implements Employee{
            public Employee Find(int id){
                boolean executive = isExec(id);
                return null;
            }
        }
        EmployeeOne emp1 = new EmployeeOne();
        emp1.isExec(123);
        String defaultCountry = Employee.getDefaultCountry();
    }
}
