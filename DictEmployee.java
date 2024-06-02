package homework04;

import java.util.ArrayList;

public class DictEmployee {
    private ArrayList<Employee> arrEmployee = new ArrayList<>();

    public void addEmployee(Employee employee){
        arrEmployee.add(employee);
    }

    public ArrayList<Employee> searchForExp(int exp){
        ArrayList<Employee> arrExp = new ArrayList<>();
        if (arrEmployee != null) {
            for (Employee employee : arrEmployee) {
                if (employee.getExperience() == exp) arrExp.add(employee);
            }
        }
        return arrExp;
    }

    public ArrayList<Integer> searchNumber(String name){
        ArrayList<Integer> listNumber = new ArrayList<>();
        if (arrEmployee != null) {
            for (Employee employee : arrEmployee) {
                if (employee.getName().equals(name)) listNumber.add(employee.getTelNumber());
            }
        }
        return listNumber;
    }

    public Employee findTabel(int tabel){
        if (arrEmployee != null) {
            for (Employee employee : arrEmployee) {
                if (employee.getTabel() == tabel) return employee;
            }
        }
        return null;
    }

    public ArrayList<Employee> getArrEmployee() {
        return arrEmployee;
    }
}
