public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v_gol = new Veiculo();
        v_gol.capacidadeTanque = 0;
        v_gol.velocidade = 20;
        for (int i = 0;i < 5;i++){
            v_gol.acelerar();
    }
    
    for (int i = 0;i < 5;i++){
        v_gol.parar();
    }
        System.out.println(v_gol.velocidade);
    }
}
