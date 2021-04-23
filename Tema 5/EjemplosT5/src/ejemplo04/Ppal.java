package ejemplo04;

import java.util.ArrayList;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tambi�n se podr�a tener un m�todo para agregar varios objetos y as� cargar el array directamente cuando
				//comienza el programa
				
				Alumno alum1 = new Alumno("53353047Q","Carlos Mesquita Mansilla");
				Alumno alum2 = new Alumno("11111111A","Pepito Prevenciones Garc�a");
				Alumno alum3 = new Alumno("22222222B","Benito Torres");
				
				Secretaria sec = new Secretaria(new ArrayList<Alumno>());
				
				//Tambi�n se podr�a usar el constructor vac�o que instancia la lista dentro
				String dni, nuevoNombre, nomAlum, dniTEMP;
				
				int opc;
				char repetir = 'S';
				
				do{
					System.out.println(
							"================================================================================================================================");
					System.out.println("                                          BIENVENIDO A: GESTI�N DE ALUMNOS");
					System.out.println(
							"================================================================================================================================");
					
					System.out.println("\n1) Agregar un alumno.\n");
					System.out.println("\n2) Mostrar todos los alumnos.\n");
					System.out.println("\n3) Mostrar un alumno.\n");
					System.out.println("\n4) Modificar alumno.\n");
					System.out.println("\n5) Borrar alumno.\n");
					System.out.println("\n(0) SALIR DEL MEN�.\n");
					
					opc = Leer.datoInt();
					
					switch (opc) {
					case 0:
						repetir = 'N';
						break;
					case 1:
						System.out.println("\n=================================== Agregar un alumno ===================================\n");
						
						System.out.print("Introduzca el nombre del alumno: ");
						nomAlum = Leer.dato();
						System.out.print("Introduzca el DNI del alumno: ");
						dni = Leer.dato();
						
						//sec.agregarAlum(new Alumno(dni, nomAlum));

						sec.mostrarErrorAgregar(sec.agregarAlumno2(new Alumno (dni, nomAlum)));
						
						
						break;
					case 2:
						System.out.println("\n=================================== Mostrar alumnos ===================================\n");
						sec.mostrarTodos();
						break;
					case 3:
						System.out.println("\n=================================== Mostrar un alumno ===================================\n");
						System.out.print("Indique el dni del alumno que quiere mostrar: ");
						dniTEMP = Leer.dato();
						if(sec.buscarAlum(dniTEMP)<0)
							System.out.println("\nNo encontrado");
						else
							System.out.println(sec.getListaAlumno().get(sec.buscarAlum(dniTEMP)));
						break;
					case 4:
						System.out.println("\n=================================== Modificar alumno ===================================\n");
						sec.imprimirLista();
						System.out.print("Indique el dni del alumno que quiere modificar: ");
						dni=Leer.dato();
						System.out.println("Indique el nombre nuevo");
						nuevoNombre=Leer.dato();
						sec.modificarAlumno(dni, nuevoNombre);
						break;
					case 5:
						System.out.println("\n=================================== Borrar alumno ===================================\n");
						System.out.print("Indique el dni del alumno que quiere modificar: ");
						sec.borrarAlumno(Leer.dato());
						break;
					default:
						System.out.println("\nERROR: n�mero de opci�n fuera de rango. Int�ntelo de nuevo.");
						break;
					}
					
					if (opc > 0 && opc <= 4) {		
						System.out.print("\n\n�Desea realizar otra opci�n?(S/N): ");
						repetir = Leer.datoChar();
						if (repetir == 'S' || repetir == 's')
							System.out.println("\n\n");
					}
				}while (repetir == 'S' || repetir == 's');
				System.out.println(
						"\n\n================================================================================================================================");
				System.out.println("                                              GRACIAS POR USAR NUESTROS SERVICIOS. HASTA PRONTO");
				System.out.println(
						"================================================================================================================================");

	}

}
