/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoo;
import javax.swing.JOptionPane;
/**
 *
 * @author JC
 */
public class ProgramacionOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        telefono objTelefono = new telefono();
	int continuar=1;
	while(continuar==1){
		Object [] opciones = {"Comprar Telefono", 
				      "Recargar Saldo", 
				      "Hacer Llamada",
                                      "Regalar Saldo",
                                      "Agregar Tarifa",
                                      "Mostrar Informacion",
				       "Salir"
		};
		Object opcion = JOptionPane.showInputDialog(null, "Selecciona una opcion", 
			"Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		switch (opcion.toString()) {
			case "Salir" :
				continuar = 0;
				break;
			case "Comprar Telefono":
				if(!objTelefono.getTelefono().equals("")){
					JOptionPane.showMessageDialog(null, "Creo que ya compro un celular no?");
				}else{
					String telefono;
                                        double precio;
					telefono = JOptionPane.showInputDialog( "Numero de Telefono");
                                        //Aqui debo mostar la información
                                        Object [] marcas ={"Seleccione",
                                                            "LG",
                                                           "Samsumg",
                                                           "Xaoimi",
                                                           "Huawei"
                                        };
                                        Object marca = JOptionPane.showInputDialog(null, "Seleccione una marca",
                                                "Elegir", JOptionPane.QUESTION_MESSAGE, null, marcas, marcas[0]);
			
					if(marca == "LG"){
                                            if(!telefono.equals("")){
                                                precio = 200;
                                                objTelefono.setTelefono(telefono);
                                                objTelefono.setMarca(marca.toString());
                                                JOptionPane.showMessageDialog(null, "El telefono "+marca+" Fue comprado con exito a: $"+precio);
                                            }      
					}
                                        if(marca == "Samsumg"){
                                            if(!telefono.equals("")){
                                                precio = 325;
                                                objTelefono.setTelefono(telefono);
                                                objTelefono.setMarca(marca.toString());
                                                JOptionPane.showMessageDialog(null, "El telefono "+marca+" Fue comprado con exito a: $"+precio);
                                            }      
					}
                                        if(marca == "Xaoimi"){
                                            if(!telefono.equals("")){
                                                precio = 180;
                                                objTelefono.setTelefono(telefono);
                                                objTelefono.setMarca(marca.toString());
                                                JOptionPane.showMessageDialog(null, "El telefono "+marca+" Fue comprado con exito a: $"+precio);
                                            }      
					}
                                        if(marca == "Huawei"){
                                            if(!telefono.equals("")){
                                                precio = 450;
                                                objTelefono.setTelefono(telefono);
                                                objTelefono.setMarca(marca.toString());
                                                JOptionPane.showMessageDialog(null, "El telefono "+marca+" Fue comprado con exito a: $"+precio);
                                            }      
					}
				}	break;

			case "Hacer Llamada":
                            if(!objTelefono.getTelefono().equals("")){
                                String telefonoDestino;
				int minutos;
				telefonoDestino = JOptionPane.showInputDialog( "Numero a Llamara");
				minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos a llamar"));
				objTelefono.realizarLlamada(telefonoDestino, minutos);
                            }else{
                                JOptionPane.showMessageDialog(null, "Debe comprar un telefono primero");
                            }
				
				break;
                        case "Recargar Saldo":
                            if(!objTelefono.getTelefono().equals("")){
                                double cantidad1;
                                cantidad1 = Double.parseDouble(JOptionPane.showInputDialog( "Cuanto saldo cargara?"));
                                if(cantidad1 >0){
                                    objTelefono.recargarSaldo(cantidad1);
                                }else{
                                    JOptionPane.showMessageDialog(null, "No coloco la cantidad a recargar");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Debe comprar un telefono primero");
                            }
                                break;
                        case "Regalar Saldo":
                            if(!objTelefono.getTelefono().equals("")){
                                int numero1;
                                double cantidad2;
                                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que le va transferir"));
                                cantidad2 = Double.parseDouble(JOptionPane.showInputDialog( "Cuanto saldole enviara?"));
                                objTelefono.regalarSaldo(numero1, cantidad2);
                            }else{
                                JOptionPane.showMessageDialog(null, "Debe comprar un telefono primero");
                            }
                                break;
                        case "Agregar Tarifa":
                            if(!objTelefono.getTelefono().equals("")){
                                double tarifa;
                                tarifa = Double.parseDouble(JOptionPane.showInputDialog("ingrese la tarifa "));
                                objTelefono.agregarTarifa(tarifa);
                            }else{
                                JOptionPane.showMessageDialog(null, "Debe comprar un telefono primero");
                            }
                            break;
                        case "Mostrar Informacion":
                            if(!objTelefono.getTelefono().equals("")){
                                String numeroOriginal = objTelefono.getTelefono();
                                String marcaOriginal = objTelefono.getMarca();
                                double saldoPrincipal = objTelefono.getSaldo();
                                JOptionPane.showMessageDialog(null, "Información del Telefono\n"
                                        + "Número de Telefono: "+numeroOriginal+" \n"
                                        + "Marca: "+marcaOriginal+"\n"
                                        + "Saldo Principal: "+saldoPrincipal);
                            }else{
                                JOptionPane.showMessageDialog(null, "Debe comprar un telefono primero");
                            }
                         //Falta mostar
                            break;
			default:
				break;
		}
	}


	JOptionPane.showMessageDialog(null, "Gracias :D");
    }
    
}
