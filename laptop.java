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

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> минимальныеЗначения = new HashMap<>();
        for (Map.Entry<Integer, String> entry: критерии.entrySet()){
            System.out.println("введите критерии" + entry.getKey()+"(" + entry.getValue()+ "): ");
            String minValue = scanner.nextLine();
            минимальныеЗначения.put(entry.getKey(), minValue);
        }

        for (laptop ноутбук : ноутбуки ){
            boolean проходитПоУсловиям = true;
            for (Map.Entry<Integer, String> entry : критерии.entrySet()){
                int критерий = entry.getKey();
                String минЗначение = минимальныеЗначения.get(критерий);
                switch (критерий) {
                    case 1:
                        if (ноутбук.объемЖД < Integer.parseInt(минЗначение)) {
                            проходитПоУсловиям = false;
                        }
                        break;
                    case 2:
                        if (ноутбук.объемОЗУ < Integer.parseInt(минЗначение)) {
                            проходитПоУсловиям = false;
                        }
                        break;
                                  
                    default:
                        break;
                }
            }
        if (проходитПоУсловиям){
            System.out.println(ноутбук);
        }
        }
     }
}
