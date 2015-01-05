
package carSeller;


public class CarSeller2 {  private int productionyear;
    private String windows;
    private boolean ac;
    private String engine;
    private static final String companyName="MCSC";
    
     public CarSeller2(String windows, int productionyear, 
            boolean ac, String engine){
        this.windows=windows;
        this.productionyear=productionyear;
        this.ac=ac;
        this.engine=engine;
     }
    public String getwindows(){
        return windows;
    }
    
    public void setwindows(String windows){
        this.windows=windows;
    }
    
    public String getengine(){
        return engine;
    }
    
    public void setengine(String engine){
        this.engine=engine;
    }
    
    public boolean hasac(){
        return ac;
    }
    
    public void setac(boolean ac){
        this.ac=ac;
    }
    
    public int getproductionyear(){
        return productionyear;
    }
    
    public void setproductionyear(int productionyear){
        this.productionyear=productionyear;
    }
    
}
