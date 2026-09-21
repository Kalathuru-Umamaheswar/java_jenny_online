package me.jenny.oopexercises;

public class employee extends person1{
    private String empname;
    private int empId;
    private long empSalary;

    public employee(){
        System.out.println("Constructor inside employee class");
    }
    public void setEmpname(String empname){
        this.empname=empname;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpname(){
        return empname;
    }
    public int getEmpId(){
        return empId;
    }
    public long getEmpSalary(){
        return empSalary;
    }

}
