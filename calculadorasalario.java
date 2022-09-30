import java.util.Scanner;

public class calculadorasalario {
	
	Scanner input = new Scanner(System.in);
	
	int horasBase = 40;
	
	private double pesosXHora;
	private int horasTrabajadas;

	public double getPesosXHora() {
		return pesosXHora;
	}

	public void setPesosXHora(double pesosXHora) {
		if(pesosXHora >= 0){
			this.pesosXHora = pesosXHora;
		}
		else{
			this.recurPesosXHora();
		}
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		if(horasTrabajadas >= 0 && horasTrabajadas <= 168){ //Limite teorico
			this.horasTrabajadas = horasTrabajadas;
		}
		else{
			this.recurHorasTrabajadas();
		}
	}

	public void datosSalario(){
		
		System.out.print("Cuantas horas trabajo el empleado: ");
		int horas = input.nextInt();
		this.setHorasTrabajadas(horas);
		
		System.out.print("Ingrese la cuota normal por hora trabajada del empleado: ");
		double cuota = input.nextDouble();
		this.setPesosXHora(cuota);
		
	}
	
	public void calculoSalario(){
		
		if(this.getHorasTrabajadas() <= 40){
			System.out.printf("---->El salario bruto del trabajador es: $%.2f", 
											this.getHorasTrabajadas()*this.getPesosXHora());
			System.out.println();
		}
		else{
			System.out.printf("---->El salario bruto del trabajador es: $%.2f",
											(this.getHorasTrabajadas()-horasBase)*(this.getPesosXHora()*1.5) + 
											(horasBase*this.getPesosXHora()));
			System.out.println();
		}
		
	}
	
	public void recurHorasTrabajadas(){
		
		System.out.println("\n***VALOR ERRONEO, VUELVA A INGRESAR EL VALOR***");
		System.out.print("\nCuantas horas trabajo el empleado: ");
		int horas = input.nextInt();
		this.setHorasTrabajadas(horas);
		
	}
	
	public void recurPesosXHora(){
		
		System.out.println("\n***VALOR ERRONEO, VUELVA A INGRESAR EL VALOR***");
		System.out.print("\nIngrese la cuota normal por hora trabajada del empleado: ");
		double cuota = input.nextInt();
		this.setPesosXHora(cuota);
		
	}

}