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
public class telefono {
    private String telefono;
    private double saldo;
    private String marca;
   // private double tarifa1;
    private  double tarifa=0.10;
    //Definiendo los GET y SET de las propiedades
    
    public String getTelefono(){
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
        
        
	//Fin

	public telefono() {
		this.telefono = "";
		this.saldo = 0.0;
		this.marca = "Sin Marca";
	}

	public void realizarLlamada(String telefono, int minutos) {
		double saldoGastar;
		double nuevoSaldo = this.saldo;
		saldoGastar = minutos * this.tarifa;
		if(saldoGastar <= this.saldo){
			nuevoSaldo = nuevoSaldo - saldoGastar;
			this.setSaldo(nuevoSaldo);
			JOptionPane.showMessageDialog(null, "LLamada realizada con exito");
		}else{
			JOptionPane.showMessageDialog(null, "Salado Insuficiente");
		}
	}

	public void recargarSaldo(double cantidad){
		double nuevoSaldo;
		nuevoSaldo = this.saldo + cantidad;
		this.setSaldo(nuevoSaldo);
		JOptionPane.showMessageDialog(null, "Saldo Cargado con exito");
	}
        
        public void regalarSaldo(int numero, double cantidad){
            double regalaSaldo;
            if(cantidad <= this.saldo && cantidad > 0){
                regalaSaldo = this.saldo - cantidad;
                this.setSaldo(regalaSaldo);
                JOptionPane.showMessageDialog(null, "Se le ha transferido: "+cantidad+" al numero: "+numero+ 
                        " con éxito, \n Su nuevo Saldo es: "+regalaSaldo);
            }else{
                JOptionPane.showMessageDialog(null, "Saldo infuciciente par realizar esta transaccion");
            }  
        }
        
        public void agregarTarifa(double tarifa){
            
            if((this.tarifa = tarifa) > 0){
             JOptionPane.showMessageDialog(null, "Nueva tarifa por minuto es: "+ this.tarifa);
            }else{
                JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
            }
        }
        
       
}