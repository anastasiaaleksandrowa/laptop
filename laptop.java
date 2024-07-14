import java.util.*;

public class laptop {
   private String модель;
   private int объемОЗУ;
   private int объемЖД;
   private String  операционнаяСистема;
   private String цвет;
   
   public laptop (String модель, int объемОЗУ, int объемЖД, String  операционнаяСистема, String цвет;){
        this.модель = модель;
        this.объемОЗУ = объемОЗУ;
        this.объемЖД = объемЖД;
        this.операционнаяСистем = операционнаяСистем;
        this.цвет = цвет;
    }
    public String getМодель(){
        return модель;
    }
    // геттеры и сеттеры для остальных полей
    @Override
    public String toString(){
        return "Ноутбук{" +
            "модель='" + модель + '\'' + 
            ", объемОЗУ=" + объемОЗУ + 
            ", объемЖД=" + объемЖД +
            ", операционнаяСистема='" +операционнаяСистема + '\'' +
            ", цвет='" + цвет + '\'' +
        '}';
     }
     
}
