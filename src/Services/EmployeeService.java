package Services;

import java.util.ArrayList;

import Models.Employees.*;

public class EmployeeService {
    
    private ArrayList<Employee> employees;
    
    public EmployeeService() {
        this.employees = new ArrayList<>();
        load();
    }

    public boolean add(Employee employee)
    {
        if(employee != null)
        {
            employees.add(employee);
            return true;
        }

        return false;
    }

    public Employee findByUserName(String userName)
    {
        for(Employee e : employees)
        {
            if(e.get_UserName().equals(userName))
            {
                return e;
            }
        }

        return null;
    }

    private void load()
    {
        // load from file
    }
}
