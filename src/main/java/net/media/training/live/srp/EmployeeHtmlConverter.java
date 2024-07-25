package net.media.training.live.srp;

public class EmployeeHtmlConverter {
    public static String toHtml(EmployeeDetails empDetails) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + empDetails.getEmpId() + "'>" +
                "<span>" + empDetails.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (EmployeeDetails.TOTAL_LEAVES_ALLOWED - empDetails.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(empDetails.getMonthlySalary() * 12) + "</span>";
        if (empDetails.getManager() != null) str += "<span>" + empDetails.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (empDetails.getYearsInOrg() < 3) {
            years = empDetails.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += empDetails.getLeavesLeftPreviously()[empDetails.getYearsInOrg()-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
