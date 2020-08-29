import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ///Cliente

        Cliente carlos = new Cliente(1,"Julio" ,"Miranda","Clure");

        //ciudad

        Ciudad cochabamba = new Ciudad(1,"Cochabamba");

        Ciudad SantaCruz = new Ciudad(2,"SantaCruz");

        Ciudad tarija = new Ciudad( 3,"Tarija");

        //categoria

        Categoria turista = new Categoria(1,"Turista");

        //Aeropuertos

        Aeropuerto jorgeWilsterman = new Aeropuerto("jw" ,"JorgeWilsterman " , cochabamba);

        Aeropuerto viruViru = new Aeropuerto("VV" , "viruViru" , SantaCruz);

        Aeropuerto orielLea = new Aeropuerto("OL", "Oriel Lea", tarija);


        //vuelos

        List<Vuelo> vuelos = new ArrayList<>();

        Vuelo cochabambSantaCruz = new Vuelo("AMERICAS-777", Calendar.getInstance().getTime(),jorgeWilsterman , viruViru);

        vuelos.add(cochabambSantaCruz);

        Vuelo santaCruzTarija = new Vuelo("AMERICAS-778", Calendar.getInstance().getTime(), viruViru, orielLea);

        vuelos.add(santaCruzTarija);

        //Pasaje

        Pasaje pasaje = new Pasaje(1, Calendar.getInstance().getTime(), 1899.6 , carlos, cochabamba , tarija, turista, vuelos);


        System.out.println("PASAJE");

        System.out.println("************************************************************************************************************************************************************************************************");

        System.out.println("ID--: "+ pasaje.getIdPasaje());

        System.out.println("FECHA-: " + pasaje.getFechaEmision());

        System.out.println("TOTAL PRECIO-:" + pasaje.getPrecioTotal());

        System.out.println("CLIENTE-: " + pasaje.getCliente().getNombre());

        System.out.println("ORIGEN-: " + pasaje.getOrigen().getNombre());

        System.out.println("DESTINO-: " + pasaje.getDestino().getNombre());

        System.out.println("CATEGORIA-: " + pasaje.getCategoria().getNombre());

        System.out.println("------------VUELOS-----------");

        for (Vuelo vuelo :pasaje.getVuelos()) {


            System.out.println("Codigo vuelo:" + vuelo.getCodigoVuelo() + " | Salida: " + vuelo.getSalida() + " | Origen:" + vuelo.getOrigen().getNombre() + " | Destino:" + vuelo.getDestino().getNombre());


        }

        System.out.println("***********************************************************************************************************************************************************************************************");



    }

}
