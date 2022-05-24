
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Robo robo = new Robo(100, "0 Grau");

        boolean Loop = true;
        while (Loop){
            System.out.println();
            System.out.println();
            System.out.println("===============================================================");
            System.out.println();
            robo.statusRobo();
            System.out.println();
            System.out.println("===============================================================");
            System.out.println();
            System.out.println();
            System.out.println(" - Realize uma acao com seu robo...");
            System.out.println();
            System.out.println("   1 - Mudar direcao");
            System.out.println("   2 - Tirar foto");
            System.out.println("   3 - Continuar trajeto");
            System.out.println("   4 - Voltar trajeto");
            System.out.println("   5 - Recarregar a bateria");
            System.out.println("   6 - Desligar robo!");

            switch (leitor.nextInt()){
                case 1:
                    System.out.println();
                    System.out.println("Qual direcao?");
                    System.out.println();
                    System.out.println("   1 - Continuar em frente");
                    System.out.println("   2 - Rotacionar 90 Graus");
                    System.out.println("   3 - Rotacionar 180 Graus");
                    System.out.println("   4 - Rotacionar 270 Graus");
                    switch (leitor.nextInt()){
                        case 1:
                            robo.mudarDirecao("Robo seguindo rota 0 Grau!");
                            break;
                        case 2:
                            robo.mudarDirecao("Robo seguindo rota 90 Graus!");
                            break;
                        case 3:
                            robo.mudarDirecao("Robo seguindo rota 180 Graus!");
                            break;
                        case 4:
                            robo.mudarDirecao("Robo seguindo rota 270 Graus!");
                            break;
                        default:
                            System.out.println("Ops :(, não conseguir entender, digite novamente!");
                    }
                    break;
                case 2:
                    robo.capturarFoto();
                    break;
                case 3:
                    robo.movimentarFrente();
                    break;
                case 4:
                    robo.movimentarTras();
                    break;
                case 5:
                    robo.recarregarRobo();
                    break;
                case 6:
                    System.out.println("Robo desligado.");
                    Loop = false;
            }
        }
        leitor.close();
    }
}