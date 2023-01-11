public class Employee {

    static Employee[] employees;
    private String SNP;
    private Integer department;
    private Integer salary;
    private final Integer id;
    private static Integer idCounter = 1;




    public Employee(String SNP, Integer salary, Integer department) {
        this.id = idCounter++;
        this.SNP = SNP;
        this.salary = salary;
        this.department = department;



    }

    public Integer getId() {
        return id;
    }

    // Фамилия Имя Отчество
    public String getSNP() {
        return SNP;
    }
    public void setSNP(String SNP) {
        this.SNP = SNP;
    }

    // Отдел
    public Integer getDepartment() {
        return department;
    }
    public void setDepartment(Integer department) {
        this.department = department;
    }

    // Зарплата
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        return id + " ФИО " + SNP + " Зарплата " + salary + " Отдел " + department;
    }

}












