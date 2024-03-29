package Setter_DI_ArraydataType.Bean;

public class Engine {
    private String modelyear;

    String [] name;

    public void setName(String[] name){
        this.name=name;
    }

    public String[] getName(){
        return name;
    }

    public String getModelyear() {
        return modelyear;
    }

    public Engine() {
        System.out.println("Engine constructor");
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }
}

