public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v_gol = new Veiculo();
        v_gol.capacidadeTanque = 0;
        v_gol.velocidade = 20;
        v_gol.acelerar();
        v_gol.acelerar();
        v_gol.acelerar();
        v_gol.acelerar();
        v_gol.acelerar();
        System.out.println(v_gol.velocidade);
    }
}
