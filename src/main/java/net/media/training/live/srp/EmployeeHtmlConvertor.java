package net.media.training.live.srp;

public class EmployeeHtmlConvertor {

    private Employee employee;

    public EmployeeHtmlConvertor(Employee employee){
        this.employee = employee;
    }
    
    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getLeaveInfo().getTotalLeaveAllowed() - employee.getLeaveInfo().getleaveTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getmonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";

        int totalLeaveLeftPreviously = employee.getLeaveInfo().getTotalLeaveLeftPreviously(employee.getYearsInOrg(),employee.getLeaveInfo().getleavesLeftPreviously());
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
