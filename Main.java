/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;

/**
 *
 * @author mario.delpratoramon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta();
    }

    private static void operativa_cuenta() {
        operativa_cuenta(null, 0.0f);
    }

    public static void operativa_cuenta(java.lang.Float cuenta, float cantidad) {
        CCuenta miCuenta;
        double saldoActual;
        miCuenta = new CCuenta("Mario Delprato", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
