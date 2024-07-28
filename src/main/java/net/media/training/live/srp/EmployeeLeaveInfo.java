package net.media.training.live.srp;

public class EmployeeLeaveInfo {
    static int TOTAL_LEAVES_ALLOWED = 30;

    private int leavesTaken = 30;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private int[] leavesLeftPreviously;

    public EmployeeLeaveInfo(int leavesTaken, int[] leavesLeftPreviously) {
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public int[] getleavesLeftPreviously(){
        return leavesLeftPreviously;
    }

    public int getleaveTaken(){
        return leaveTaken;
    }

    public int getTotalLeaveAllowed(){
        return totalLeaveAllowed;
    }

    public int getTotalLeaveLeftPreviously(int yearsInOrg,int[] leavesLeftPreviously){
        int totalLeaveLeftPreviously = 0;
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
