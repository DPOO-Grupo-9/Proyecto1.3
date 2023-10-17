package view;
import java.util.Scanner;

import model.MenuPrinter;
public class ViewEmpleadoMantenimiento {

	public static void main(String[] args) {
		
	
	
		MenuPrinter mp =new MenuPrinter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido Empleado de Mantenimiento\n");
		
		boolean continuar = true;
		while (continuar) {
			System.out.println("Que desea hacer: ");
			mp.menuEmpleadoMantenimiento();;
			System.out.println(">");
			
			String eleccion =scanner.nextLine();
			
			if(eleccion.equals("1")) {
				//Aquí se debe iniciar el codigo para ejecutar el primer req
				System.out.println("Escogiste realizar un limpeza al vehiculo");

				System.out.println("Escriba la placa del vehiculo para continuar\n>");
					
					String placa = scanner.nextLine();

					System.out.println("Escriba la fecha estimada en la cual el vehiculo estará listo en formato AAAA/MM/DD\n>");
					
					String fecha = scanner.nextLine();
					String fecha = Integer.parseInt(fecha)
					
				
					if (cd.vehiculos.containsKey(placa)) {
						
						
						Vehiculo vehiculo = cd.vehiculos.get(placa); 

						cd.vehiculos.remove(placa);

						vehiculo.set_fecha(fecha)

						vehiculo.set_Disponibilidad("Limpieza")

						cd.vehiculos.put(vehiculo)
						
						csvE.escribirVehiculos(cd.vehiculos, cd.titulosVehiculos);
						
						cd.cargarVehiculos();
						
				   
						System.out.println("El vehiculo con placa "+ placaRemover + " ha sido pasado a limpieza.");
					
					} 
					else {
						System.out.println("El vehiculo con la placa "+ placaRemover + " no está registrado");
						
					}
			}
			else if(eleccion.equals("2")) {
				//Aquí se debe iniciar el codigo para ejecutar el primer req
				System.out.println("Escogiste realizar un mantenimiento al vehiculo");

				System.out.println("Escriba la placa del vehiculo para continuar\n>");
					
					String placa = scanner.nextLine();

					System.out.println("Escriba la fecha estimada en la cual el vehiculo estará listo en formato AAAA/MM/DD\n>");
					
					String fecha = scanner.nextLine();
					String fecha = Integer.parseInt(fecha)
					
				
					if (cd.vehiculos.containsKey(placa)) {
						
						
						Vehiculo vehiculo = cd.vehiculos.get(placa); 

						cd.vehiculos.remove(placa);

						vehiculo.set_fecha(fecha)

						vehiculo.set_Disponibilidad("Mantenimiento")

						cd.vehiculos.put(vehiculo)
						
						csvE.escribirVehiculos(cd.vehiculos, cd.titulosVehiculos);
						
						cd.cargarVehiculos();
						
				   
						System.out.println("El vehiculo con placa "+ placaRemover + " ha sido pasado a mantenimiento.");
					
					} 
					else {
						System.out.println("El vehiculo con la placa "+ placaRemover + " no está registrado");
						
					}
			}
			else if (eleccion.equals("0")){
				//aquí se cierra el loop y acaba la aplicación
				continuar = false;}
			else {
				//Aquí se reconocer enrrores de input y repite el loop
				System.out.println("Esa no es una de las opciones, intenta de nuevo");}
			
			
		}
		
		scanner.close();
	
	
	}

}
