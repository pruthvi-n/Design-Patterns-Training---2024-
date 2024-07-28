package net.media.training.live.srp;


public class Employee {
    private int empId;
    private String name;
    private double monthlySalary;
    private String manager;
    private int yearsInOrg;

    private EmployeeAddressInfo address;
    private EmployeeLeaveInfo leaveInfo;
    


    public Employee(EmployeeAddressInfo address,EmployeeLeaveInfo leaveInfo,int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.yearsInOrg = leaveInfo.getleavesLeftPreviously().length;
        
        this.address = address;
        this.leaveInfo = leaveInfo;
    }

    public Employee() {
    }

    public int getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public EmployeeLeaveInfo getLeaveInfo(){
        return leaveInfo;
    }

    public double getmonthlySalary(){
        return monthlySalary;
    }

    public String getManager(){
        return manager;
    }

    public int getYearsInOrg(){
        return yearsInOrg;
    }


    //other method related to customer
}
