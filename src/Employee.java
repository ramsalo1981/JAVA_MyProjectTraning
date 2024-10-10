public class Employee {
    private int Emp_ID;
    private String Name;
    private String Dep;
    private Double Salary;
    private Double Bonus;
    private boolean Resident;


    public Employee() {


    }
    public Employee(int id , String name,String dep) {
    this.Emp_ID = id;
    this.Name = name;
    this.Dep = dep;

    }
    public Employee(int emp_ID, String name, String dep, Double salary, Double bonus, boolean resident) {
        /*Emp_ID = emp_ID;
        Name = name;
        Dep = dep;*/
        this(emp_ID, name,dep);
        Salary = salary;
        Bonus = bonus;
        Resident = resident;
    }
    public void setName(String name) {
        Name = name;
    }

    public void setDep(String dep) {
        Dep = dep;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public void setBonus(Double bonus) {
        Bonus = bonus;
    }

    public void setResident(boolean resident) {
        Resident = resident;
    }



    public void setEmp_ID(int emp_ID) {
        Emp_ID = emp_ID;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public String getName() {
        return Name;
    }

    public String getDep() {
        return Dep;
    }

    public Double getSalary() {
        return Salary;
    }

    public Double getBonus() {
        return Bonus;
    }

    public boolean isResident() {
        return Resident;
    }

    public void PrintData(){
        System.out.println("ID " + Emp_ID);
        System.out.println("Name " + Name);
        System.out.println("Dep " + Dep);
        System.out.println("Salary: " + Salary);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Resident: " + Resident);
    }
}
