class Notebook extends Computer{
    private int batteryCapacity;

    public Notebook(double cpuTemperature, int remMemory, int batteryCapacity) {
        super(cpuTemperature, remMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void coolDown() {
        super.coolDown();
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getCpuTemperature()-2);
    }
}
