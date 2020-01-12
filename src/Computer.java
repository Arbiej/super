class Computer {
    private double cpuTemperature;
    private int remMemory;

    public Computer(double cpuTemperature, int remMemory) {
        super();
        this.cpuTemperature = cpuTemperature;
        this.remMemory = remMemory;
    }

    public double getCpuTemperature(){
        return cpuTemperature;
    }
    public void setCpuTemperature(double cpuTemperature){
        this.cpuTemperature=cpuTemperature;

    }

    public int getRemMemory() {
        return remMemory;
    }

    public void setRemMemory(int remMemory) {
        this.remMemory = remMemory;
    }
    void coolDown(){
        cpuTemperature=cpuTemperature-1;

    }
}
