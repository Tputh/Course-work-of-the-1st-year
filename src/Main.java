public class Main {


    public static Employee[] employees = {
            new Employee("Иванов Иван Иваныч", 45987, 1),
            new Employee("Петров Пётр Аркадьевич", 40000, 5),
            new Employee("Левиофанов Левиофан Левиофанович", 49999, 2),
            new Employee("Фёдорв Фёдор Фёдорович", 29999, 3),
            new Employee("Газманов Олег Сергеевич", 31000, 4),
            new Employee("Перекусов Агафий Леонтьевич", 39500, 5),
            new Employee("Ненадо Алексей Алексеевич", 46787, 1),
            new Employee("Дюков Сергей Петрович", 51000, 2),
            new Employee("Фёдорова Альбина Яковлева", 28700, 3),
            new Employee("Ненадо Лариса Борисовна", 46800, 4),
    };


    public static void main(String[] args) {
        System.out.println("Курсовая работа 1-го курса ");


        System.out.println("Сумма всех выплат ЗП " + totalAmountOfSalaries());
        System.out.println("Минимальная сумма выплат " + minimumPayout());
        System.out.println("Максимальная сумма выплат " + maximumPayout());
        System.out.println("Средняя сумма выплат " + averagePayoutValue());
        snp();
        printEmployees();


    }

    public static int totalAmountOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minimumPayout() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee maximumPayout() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float averagePayoutValue() {
        return totalAmountOfSalaries() / (float) employees.length;
    }

    public static void  snp() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getSNP());
        }
    }
}

