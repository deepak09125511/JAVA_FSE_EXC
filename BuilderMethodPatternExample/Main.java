class Computer{
    String CPU;
    String RAM;
    String STORAGE;
    Computer(String CPU,String RAM,String STORAGE){
        this.CPU = CPU;
        this.RAM = RAM;
        this.STORAGE = STORAGE;
    }

    public String getCPU(){
        return CPU;
    }
    public String getRAM(){
        return RAM;
    }
    public String getSTORAGE(){
        return STORAGE;
    }
    
    public static class Builder{
        String CPU;
        String RAM;
        String STORAGE;
        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder setSTORAGE(String STORAGE){
            this.STORAGE = STORAGE;
            return this;
        }
        public Computer build(){
        return new Computer(CPU,RAM,STORAGE);
        }

    }
}
public class Main{
    public static void main(String[]args){
        Computer com = new Computer.Builder().setCPU("INTEL_8086").setRAM("LPDDR5").
        setSTORAGE("512GB").build();
        System.out.println("CPU: "+com.getCPU());
        System.out.println("RAM: "+com.getRAM());
        System.out.println("STORAGE: "+com.getSTORAGE());
    }
}