public class Salidatabular {
    public static void main(String[] args) {
        int cont=1;
        int diz=0;
        int cien=0;
        int mil=0;
        System.out.print("Numero"+"\t"+"10*N"+"\t"+"100*N"+"\t"+"1000*N");
        while(cont<6){System.out.println();
            System.out.print(cont+"\t"+(cont*10)+"\t"+(cont*100)+"\t"+(cont*1000));
            cont++;
        }
    }
}
