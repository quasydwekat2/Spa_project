package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class Employee {
    private String id ;
    private String name;
    private String password;
    private String workerType;

    private double profitpercentage;
    private final List<Room> rooms = new ArrayList<>();

    private final List<Appointment> appointments =new ArrayList<>();

    public Employee(String id, String name, String password, String workerType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.workerType = workerType;
    }

    public void setAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }


    public double getProfitPercentage() {
        return this.profitpercentage;
    }
    public Employee(String id, String name, String password,String workerType,Room room,double profitpercentage) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.workerType = workerType;
        this.rooms.add(room);
        this.profitpercentage=profitpercentage;
    }
    public Employee(String id, String name, String password,String workerType,double profitpercentage) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.workerType = workerType;
        this.profitpercentage=profitpercentage;
    }
    public Room getRoom1() {
        if (this.rooms != null && !this.rooms.isEmpty()) {
            return rooms.get(0);
        } else {

            return null;
        }
    }
    public Room getRoom(){

        return rooms.get(0);
    }
    public void addRoomToEmployee(Room room){
        this.rooms.add(room);
    }

    public void setWorkerType(int workerTypeId) {
        if(workerTypeId == 1){
            workerType ="Sawna";
        }
        else if( workerTypeId ==2){
            workerType ="Massage";
        }
    }

    public void setProfitPercentage(double profitPercentage) {
        this.profitpercentage = profitPercentage;
    }



}
