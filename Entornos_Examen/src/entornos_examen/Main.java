/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//--------------------NACHO----------------------------------------------------
package entornos_examen;

public class Main {
    public static void main(String[] args) {
        CCuenta a;
        double saldoA;
        
        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        MostarSaldo(a);

        try {
            a.Retirada(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            a.Ingresos(600);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        System.out.println("Datos de la cuenta: "+ a.getNombreCliente() + a.getCuentacorriente() + a.getSaldocuenta() + a.getInterescuenta());
    }

    public static void MostarSaldo(CCuenta a) {
        double saldoA;
        saldoA = a.estado();
        System.out.println("El saldo actual es"+ saldoA );
    }
}
