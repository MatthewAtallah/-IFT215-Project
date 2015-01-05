
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
        public int getPrice(){
        int fuelp, dieselp, electricalp, acPrice,windowsp, price;
        switch(productionyear){
            case"2012":
                fuelp=10000;
                dieselp=9500;
                electricalp=11500
                ;
                break;
            case "2013":
                fuelp=12000;
                dieselp=11500;
                electricalp=13500
                ;
                break;
             case "2014":
                fuelp=14000;
                dieselp=13500;
                electricalp=15500
                ;
                break;
             case "2015":
                fuelp=16000;
                dieselp=15500;
                electricalp=17500
                ;
                break;     
            default: 
               fuelp=0;
               dieselp=0;
               electricalp=0;
               acPrice=0;
        }
        switch(windows){
             case "Electricale":
                 windowsp=500;
                 break;
             case "Manual":
                 windowsp=0;
                 break;
                 
        }
        {if(ac==false)
            acPrice=0;
            else acPrice=500;
        }
        price =fuelp+dieselp+electricalp+acPrice+windowsp; 
        return price;
        
    }
    
}
