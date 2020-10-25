package lad3.ss7;

public class Employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;

    public Employee(int ID, String Name){
        empID=ID;
        empName= Name;
    }

    public  String getSSN(){
        return SSN;
    }

    public void setSSN(String ssn){
        SSN=ssn;
    }

    public void setEmpDesig(String desig){
        empDesig = desig;
    }

    public void display(){
        System.out.println("Employee ID is " + empID);
        System.out.println("Employee name is " + empName);
        System.out.println("Designation is " + empDesig);
        System.out.println("SSN is " + SSN);
    }

    public static void main(String[] args) {
        Employee objEmp1 = new Employee(1200,"Steven");

        objEmp1.empDesig = "manager";
        objEmp1.SSN = "23424-234-234";

        objEmp1.display();
    }
}
