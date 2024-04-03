package SI_CI_usingP_C_namespace.bean;

public class Engine {
    private String modelyear;

  public Engine(String modelyear){
      this.modelyear=modelyear;
  }


  //can use getters to return the variables in the Car class
  public String getModelyear(){
      return modelyear;
  }


//can use toString ()  to return the variables in the Car Class
/*    @Override
    public String toString() {
        return "Engine{" +
                "modelyear='" + modelyear + '\'' +
                '}';
    }*/
}
