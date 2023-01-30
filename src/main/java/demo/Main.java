package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public List<String> empNames(List<Employee> employees) {
        List<String> e = new ArrayList<>();
        for(Employee emp: employees) e.add(emp.getName());
        return e;
    }

    public List<Integer> empAges(List<Employee> employees) {
        List<Integer> e = new ArrayList<>();
        for(Employee emp: employees) e.add(emp.getAge());
        return e;
    }

    public <U,T> List<T> map(List<U> list, Mapper<U, T> mapper) {
        List<T> result = new ArrayList<>();
        for (U u : list) {
            result.add(mapper.map(u));
        }
        return result;
    }

    public void doIt() {
        List<Employee> employees = new ArrayList<>();

        List<String> empNames = map(employees, employee -> employee.getName());
        List<String> empNames2 = employees.stream().map(e -> e.getName()).toList();

        List<Integer> empAges = map(employees, Employee::getAge);
    }
}
