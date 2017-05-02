/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//--------------------NACHO----------------------------------------------------
package entornos_examen;

/**
 *
 * @author Nacho
 */
public class CCuenta {
    private String pepe;
    private String cuentacorriente;
    String contrasena; //contraseña del acceso web
    private double saldocuenta;
    private double interescuenta;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom nombre del cliente
     * @param cue número de cuenta del cliente
     * @param sal saldo de la cuenta del cliente
     * @param tipo el tipo de interés de la cuenta del cliente
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        pepe=nom;
        cuentacorriente=cue;
        saldocuenta=sal;
    }

    /**
     *
     * @param nom nombre del cliente
     */
    public void asignarNombre(String nom)
    {
        setNombreCliente(nom);
    }

    /**
     *
     * @return Devuelve el nombre del cliente
     */
    public String obtenerNombre()
    {
        return getNombreCliente();
    }

    /**
     *
     * @return Devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldocuenta();
    }

    /**
     *
     * @param cantidad Pide la cantidad a ingresas
     * @throws Exception lanza la excepción por si la cantidad a ingresar es menos de 0
     */
    public void Ingresos(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    /**
     *
     * @param cantidad Indica la cantidad a retirar
     * @throws Exception Lanza la excepción por si la cantidad es menor o igual a 0 ó mayor al saldo de la cuenta
     */
    public void Retirada(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
    
    /**
     *
     * @param tantoPorCiento Se introduce el tanto por ciento de interes de la cuenta
     * @return Devuelve el saldo con su interés
     */
    public double porcentaje(double tantoPorCiento){
        return getSaldocuenta()*tantoPorCiento/100;
        
    }

    /**
     * @return Devuelve el nombre del cliente
     */
    public String getNombreCliente() {
        return pepe;
    }

    /**
     * @param nombreCliente Asigna el nombre al cliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.pepe = nombreCliente;
    }

    /**
     * @return Devuelve la cuenta corriente
     */
    public String getCuentacorriente() {
        return cuentacorriente;
    }

    /**
     * @param cuentacorriente Asigna la cuenta corriente
     */
    public void setCuentacorriente(String cuentacorriente) {
        this.cuentacorriente = cuentacorriente;
    }

    /**
     * @return Devuelve el saldo de la cuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * @param saldocuenta Asigna el saldo a la cuenta
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * @return Devuelve el interés de la cuenta
     */
    public double getInterescuenta() {
        return interescuenta;
    }

    /**
     * @param interescuenta Asigna el interés a la cuenta
     */
    public void setInterescuenta(double interescuenta) {
        this.interescuenta = interescuenta;
    }
}
