public class TiposVariaveis {

    // A estrutura padrão para se declarar uma variável sempre é:
    // <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

    public static void main(String[] args) throws Exception {
        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
        double salarioMinimoCorreto = 2500; //declaração do tipo "double correta", quando o valor é milhar.


        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}
