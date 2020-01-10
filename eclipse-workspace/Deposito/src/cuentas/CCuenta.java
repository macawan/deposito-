package cuentas;
/**
 * 
 * @author Walter.Camacho
 * Clase que nos da información sobre el estado de una cuenta de un cliente.
 * @since 09-01-2020
 * @version 1.1
 * 
 */

public class CCuenta {

 // Variables con los datos de la clase. Nombre, cuenta, saldo y tipo de interés;
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
    
    /**
     * 
     * @param nom Pasa los datos del nombre del cliente
     * @param cue Pasa el número de la cuenta
     * @param sal Pasa el saldo
     * @param tipo Pasa el interés.
     */

    public CCuenta(String nom, String cue, double sal, float tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * 
     * @return el saldo actualizado
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * @param cantidad Ingreso realizado por el cliente
     * @throws Exception Error de cantidad negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * @param cantidad. Cantidad que el cliente quiere retirar
     * @throws Exception Errores a la hora de retirar bien por no tener esa cantidad en cuenta
     * o bien por ser una cantidad negativa.
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * 
 * @return metodos que retornan el nombre del cliente, número de cuenta, saldo actualizado e interes
 */
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getCuenta() {
		return cuenta;
	}

	protected void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected double getTipoInteres() {
		return tipoInteres;
	}

	protected void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
