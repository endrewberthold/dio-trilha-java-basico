public class OperadoresRelacionais {
    public static void main(String[] args) { 
        String nomeUm = "Endrew";
        String nomeDois = new String("Endrew");

        System.out.println(nomeUm.equals(nomeDois));


        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 == n2;

        if(n1 == n2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("n1 é igual á n2? " + simNao);

        simNao = n1 != n2;
        System.out.println("n1 é diferente á n2? " + simNao);

        simNao = n1 > n2;
        System.out.println("n1 é maior á n2? " + simNao);
    }
}
