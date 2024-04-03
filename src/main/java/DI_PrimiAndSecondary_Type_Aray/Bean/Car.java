package DI_PrimiAndSecondary_Type_Aray.Bean;

public class Car {
    private String carname [];
    private Engine [] engine;

    public void setCarname(String[] carname) {
        this.carname = carname;
    }

    public void setEngine(Engine[] engine) {
        this.engine = engine;
    }

    public void printData() {
        for (String car : carname){
            System.out.println(car);
        }
        for (Engine eng : engine){
            System.out.println(eng.getModelyear());
        }
    }
}

