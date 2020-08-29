public class Boletos {

  private   int idBoletos;

  private   Vuelo vuelo;

   private Categoria categoria;

   private int numeroBoletos;

   private double tarifa;

    public Boletos(int idBoletos, Vuelo vuelo, Categoria categoria, int numeroBoletos, double tarifa) {
        this.idBoletos = idBoletos;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroBoletos = numeroBoletos;
        this.tarifa = tarifa;
    }


    public int getIdBoletos() {
        return idBoletos;
    }

    public void setIdBoletos(int idBoletos) {
        this.idBoletos = idBoletos;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroBoletos() {
        return numeroBoletos;
    }

    public void setNumeroBoletos(int numeroBoletos) {
        this.numeroBoletos = numeroBoletos;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
