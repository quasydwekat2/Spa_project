package database;


import Entities.Appointment;
import Entities.Employee;
import Entities.Room;

import java.util.ArrayList;
import java.util.List;

public class Employee_DB {
    static List<Employee> employees = new ArrayList<Employee>();
    public Employee_DB() {

    }
    static{
        employees.add(new Employee("31","SerPro1","123","Spa", new Room(1)));
        employees.add(new Employee("32","SerPro2","123","Spa",new Room(2)));
        employees.add(new Employee("33","SerPro3","123","Massage",new Room(3)));
        employees.add(new Employee("34","SerPro4","123","Massage",new Room(4)));
        employees.get(0).getRoom().setEmployee(employees.get(0));
        employees.get(1).getRoom().setEmployee(employees.get(1));
        employees.get(2).getRoom().setEmployee(employees.get(2));
        employees.get(3).getRoom().setEmployee(employees.get(3));
        Room_DB.rooms.add(employees.get(0).getRoom());
        Room_DB.rooms.add(employees.get(1).getRoom());
        Room_DB.rooms.add(employees.get(2).getRoom());
        Room_DB.rooms.add(employees.get(3).getRoom());
    }
    public static boolean addServiceProviders(String id,String name,String password,String WorkerType) {
        boolean flage = true;
        for (Employee employee: employees){
            if(employee.getId().equals(id)){
                flage=false;
                break;
            }
        }
        if(flage==true)
            employees.add(new Employee(id, name,password,WorkerType));

        return flage;
    }
    public static List<Employee> getServiceProviders() {
        return employees;
    }
    public static List<Employee> getEmployeeAtTime(String Date, String Time,String type){
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee1:employees){
            if(employee1.getWorkerType().equals(type)) {
                boolean flage = true;
                for (Appointment appointment : employee1.getAppointments()) {
                    if (appointment.getDate().equals(Date) && appointment.getTime().equals(Time)){
                        flage=false;
                        break;
                    }
                }
                if(flage) {
                    employeeList.add(employee1);
                }
            }
        }
        return employeeList;
    }
    public static Employee getEmployeeById(String id){
        for(Employee employee: employees){
            if (employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }


}
