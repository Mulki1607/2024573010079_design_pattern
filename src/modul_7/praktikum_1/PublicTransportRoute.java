package modul_7.praktikum_1;

public class PublicTransportRoute implements RouteStrategy{
    public void buildRoute(String from, String to){
        System.out.println("Membuat rute transpoertasi umum dari "+ from + "ke"+ to);
    }

}
