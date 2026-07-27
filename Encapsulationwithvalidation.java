class Employee{
    private double salary;
    public void setsalary (double salary){
        if (salary>=0){
            this.salary=salary;
        }else{
            System.out.println("INVALID SALARY");
        }
    }
    public double getsalary(){
        return salary;
    }
}
public class Main{
    public static void main(String[]args){
        Employee e=new Employee();
        e.setsalary(6000);
        System.out.print(e.getsalary());
        e.setsalary(.1000);
    }
}
