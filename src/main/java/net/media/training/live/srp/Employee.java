package net.media.training.live.srp;

public class Employee{
    EmployeeDetails empDetails;

    public Employee(EmployeeDetails empDetails) {
        this.empDetails = empDetails;
    }

    public String toHtml(){
        return EmployeeHtmlConverter.toHtml(empDetails);
    }
}
