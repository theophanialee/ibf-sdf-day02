public class Bus extends Vehicle{
    private Boolean frontDoor;
    private Boolean backDoor;
    private Boolean frontDoorOpened;
    private Boolean backDoorOpened;

    public Bus(Boolean frontDoor, Boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }
    public Bus(String color, int capacity, String licensePlate, String year, String model, String make,
            Boolean frontDoor, Boolean backDoor) {
        super(color, capacity, licensePlate, year, model, make);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }
    public Boolean getFrontDoor() {
        return frontDoor;
    }
    public void setFrontDoor(Boolean frontDoor) {
        this.frontDoor = frontDoor;
    }
    public Boolean getBackDoor() {
        return backDoor;
    }
    public void setBackDoor(Boolean backDoor) {
        this.backDoor = backDoor;
    }
    public Boolean getFrontDoorOpened() {
        return frontDoorOpened;
    }
    public void setFrontDoorOpened(Boolean frontDoorOpened) {
        this.frontDoorOpened = frontDoorOpened;
    }
    public Boolean getBackDoorOpened() {
        return backDoorOpened;
    }
    public void setBackDoorOpened(Boolean backDoorOpened) {
        this.backDoorOpened = backDoorOpened;
    }
    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpened=" + frontDoorOpened
                + ", backDoorOpened=" + backDoorOpened + "]";
    }

    
    
}