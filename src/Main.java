public class Main {
    public static void main(String[] args) {
    Calculadora objetobasica=new Calculadora("Patito", false);
    Calculadora objetoCientifica= new Calculadora("Casio",true);


    objetobasica.setPrimerValor(284.9);
    objetobasica.setSegundoValor(0.0);

    objetoCientifica.setSegundoValor(45.83);
    objetoCientifica.setSegundoValor(13.6);

        System.out.println(objetobasica.sumar());
        System.out.println(objetobasica.resta());
        System.out.println(objetobasica.multiplica());
        System.out.println(objetobasica.getMarca());
        System.out.println(objetoCientifica.getMarca());

    }
}
