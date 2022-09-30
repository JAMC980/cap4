import java.util.Scanner;
public class EnNumGran {
    public static void main(String[] args) {
        int contador=1;
        int numero=0;
        int numero2=0;
        int mayor=0;
        int mayor2=0;
        boolean d=true;
        while(contador<10&&d){
            System.out.print("Ingrese el numero"+" "+(contador));
            Scanner m=new Scanner(System.in);
            numero=m.nextInt();
            contador++;
            System.out.print("Ingrese el numero"+" "+(contador));
            Scanner n=new Scanner(System.in);
            numero2=n.nextInt();
            contador++;
            if(numero==numero2||numero==mayor||numero==mayor2||numero2==mayor||numero2==mayor2||numero2==numero){
                System.out.print("Los numeros no deben ser iguales");
                System.out.println();
                System.out.print("Por favor ingrese de nuevo el numero"+" "+
                (contador-1));
                System.out.println();
                contador--;
                d=true;
            }else{
                if(numero>mayor&&numero>numero2&&mayor>numero2&&mayor>mayor2){
                    mayor=numero;
                    mayor2=mayor;
                }
                else
                if(numero>mayor&&numero>numero2&&mayor>numero2&&mayor<mayor2){
                    mayor=numero;
                    mayor2=mayor2;
                }else{
                    if(numero>mayor&&numero>numero2&&mayor<numero2&&numero2>mayor2){
                        mayor=numero;
                        mayor2=numero2;
                    }else {
                        if(numero>mayor&&numero>numero2&&mayor<numero2&&numero2<mayor2){
                            mayor=numero;
                            mayor2=mayor2;
                        }else{
                            if(numero2>mayor&&numero2>numero&&mayor<numero&&numero>mayor2){
                                mayor=numero2;
                                mayor2=numero;
                            }else{
                                if(numero2>mayor&&numero2>numero&&mayor<numero&&numero<mayor2){
                                    mayor=numero2;
                                    mayor2=mayor2;
                                }else{
                                    if(numero2>mayor&&numero2>numero&&mayor>numero&&mayor>mayor2){
                                        mayor=numero2;
                                        mayor2=mayor;
                                    }else{
                                        if(numero2>mayor&&numero2>numero&&mayor>numero&&mayor<mayor2){
                                            mayor=numero2;
                                            mayor2=mayor2;
                                        }else{
                                            if(mayor>numero&&mayor>numero2&&numero2<numero&&numero>mayor2){
                                                mayor=mayor;
                                                mayor2=numero;
                                            }else{
                                                if(mayor>numero&&mayor>numero2&&numero2<numero&&numero2<mayor2){
                                                    mayor=mayor;
                                                    mayor2=mayor2;
                                                }else{
                                                    if(mayor>numero&&mayor>numero2&&numero2>numero&&numero2>mayor2){
                                                        mayor=mayor;
                                                        mayor2=numero2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.print("El primer numero mayor es"+mayor);
        System.out.println();
        System.out.print("El segundo numero mayor es"+mayor2);
        System.out.println();
    }
}
