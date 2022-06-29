package DayDen;

public class EmployeeWage {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    private final String company;
    private final int empRatePerHour;
    private final int noOfWday;
    private final int maxHrsMon;
    private int totalEmpWage;
    public  EmployeeWage(String company,int empRatePerHour,int noOfWday,int maxHrsMon){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.noOfWday=noOfWday;
        this.maxHrsMon=maxHrsMon;
    }

    public void computeEWage() {
        int empHour = 0;
        int totalEhour = 0;
        int totalWday = 0;
        while (totalEhour <= maxHrsMon && totalWday < noOfWday) {

            totalWday++;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case partTime:
                    System.out.println(empHour = 4);
                    break;
                case fullTime:
                    System.out.println(empHour = 8);
                    break;
                default:
                    System.out.println(empHour = 0);
            }
            totalEhour += empHour;
            System.out.println("day: " + totalWday + "emphour" + empHour);
        }

        int totalEmployeeWage = totalEhour * empHour;
    }
    public String toString(){
        return "Total Emp Wage for Company: "+company+"is " + totalEmpWage;
    }

    public static void main (String[] args){
        EmployeeWage dMart = new EmployeeWage("DMart",30,2,20);
        EmployeeWage reliance=new EmployeeWage("reliance",10,4,20);
        EmployeeWage Mart=new EmployeeWage("mart",20,3,10);
        dMart.computeEWage();
        System.out.println(dMart);
        reliance.computeEWage();
        System.out.println(reliance);
        Mart.computeEWage();
        System.out.println(Mart);

}
}