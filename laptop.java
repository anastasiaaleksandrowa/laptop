import java.util.*;

public class laptop {
   private String модель;
   private int объемОЗУ;
   private int объемЖД;
   private String  операционнаяСистема;
   private String цвет;
   
   public laptop (String модель, int объемОЗУ, int объемЖД, String  операционнаяСистема, String цвет){
        this.модель = модель;
        this.объемОЗУ = объемОЗУ;
        this.объемЖД = объемЖД;
        this.операционнаяСистема = операционнаяСистема;
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
     public static void main(String[] args) {
        Set<laptop> ноутбуки = new HashSet<>();
        ноутбуки.add(new laptop("моедль1", 8, 512, "windows", "черный"));
        ноутбуки.add(new laptop("модель2", 16, 1024, "MacOS", "серый"));

        // фильтрация по критериям
        Map<Integer, String> критерии = new HashMap<>();
        критерии.put(1, "8");
        критерии.put(2, "16");
     }
}
