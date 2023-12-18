package Busreserve;

public class Bus {
    private int busNo;
    private boolean AC;
    private int Capacity;

    Bus(int no,boolean ac,int cap){//accessor method
        this.AC = ac;
        this.busNo = no;
        this.Capacity = cap;
    }
    public int getBusNo(){
        return busNo;
    }
    public int getCapacity() {//accessor
        return Capacity;
    }

    public void setCapacity(int capacity) {//mutator
        Capacity = capacity;
    }
    public void displayInfo(){
        System.out.println("Bus no: " + busNo + "   AC: "+ AC + "   Capacitiy: "+ Capacity);
    }
}
