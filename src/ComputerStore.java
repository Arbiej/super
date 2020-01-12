class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Computer(45, 16384);
        computer.coolDown();
        Notebook notebook = new Notebook(40, 8192, 1000);
        notebook.coolDown();
        System.out.println(notebook.getBatteryCapacity());
        System.out.println(notebook.getRemMemory());
        System.out.println(notebook.getCpuTemperature());
        notebook.coolDown();
    }

}
