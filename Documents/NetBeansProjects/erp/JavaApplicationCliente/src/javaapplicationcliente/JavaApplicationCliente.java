/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcliente;

/**
 *
 * @author legion
 */
public class JavaApplicationCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println(premier(501));
         System.out.println("decomposer 362880 : "+decomposer(362880));
    }

    private static boolean premier(int entier) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.premier(entier);
    }

    private static java.util.List<java.lang.Object> decomposer(int entier) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.decomposer(entier);
    }

    private static java.util.List<java.lang.Object> decomposer_1(int entier) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.decomposer(entier);
    }

    private static double somme(double nombreA, double nombreB) {
        erp.CalculSimples_Service service = new erp.CalculSimples_Service();
        erp.CalculSimples port = service.getCalculSimplesPort();
        return port.somme(nombreA, nombreB);
    }
    
}
