import com.sun.source.doctree.SummaryTree;

public class Calculadora {
    private String marca;
    private boolean esCientifica;
    private double primerValor;
    private double segundoValor;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }
    public double sumar (){
        return primerValor+segundoValor;
    }
    public double resta (){
        return primerValor-segundoValor;
    }
    public double multiplica (){
        return primerValor*segundoValor;
    }
    private double dividir () {
            if (primerValor / segundoValor == 0) {
            return 0.0;}
            else {
                return dividir();
            }


        }
        public String elevarAPotencia (){
        if (esCientifica==true) {
            return "" +Math.pow(primerValor, segundoValor);
        }else {
            return "no es cientifica";
        }

        }

    @Override
    public String toString() {
        if (esCientifica==true){
            return ("La Calculadora es de marca" +marca);
        }else{
        return ("La Calculadora es de marca"+esCientifica);
        }

    }
}
