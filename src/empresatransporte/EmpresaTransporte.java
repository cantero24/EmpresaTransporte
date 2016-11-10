/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

import java.util.ArrayList;

public class EmpresaTransporte {

    static ArrayList<Envio> envio = new ArrayList<Envio>();
    static ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    static ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();

    public static void rellenardatos() {

        for (int i = 0; i < 10; i++) {
            Envio env = new Envio();
            env.setFecha("25/07/2016 " + i);
            env.setPeso(2 + i);
            envio.add(env);

            EnvioAzul enva = new EnvioAzul();
            enva.setFecha("28/07/2016 " + i);
            enva.setPeso(5 + i);
            enva.setValor(25 + i);
            envio.add(enva);

            Envio24h env24 = new Envio24h();
            env24.setFecha("28/07/2016 " + i);
            env24.setPeso(5 + i);
            env24.setPrioridad(1 + i);
            envio.add(env24);
        }

        for (int i = 0; i < 10; i++) {

            Coche coc = new Coche();
            coc.setMarca("opel" + i);
            coc.setMatricula("5323k" + i);
            coc.setColor("azul" + i);
            vehiculo.add(coc);

            Furgoneta fur = new Furgoneta();
            fur.setMarca("citroen" + i);
            fur.setMatricula("1234k" + i);
            fur.setPma(390 + i);
            vehiculo.add(fur);

            Camion cam = new Camion();
            cam.setMarca("opel" + i);
            cam.setMatricula("5333k" + i);
            cam.setVolumen("2345" + i);
            vehiculo.add(cam);
        }

    }

    public static void mostrarlosenvios() {
        for (int i = 0; i < envio.size(); i++) {
            if (envio.get(i) instanceof Envio) {
                System.out.println(envio.get(i).getFecha());

            }
        }

    }

    public static void mostrarenvio24demayorpeso() {

        int max = 0;

        for (int i = 0; i < envio.size(); i++) {
            if (envio.get(i) instanceof Envio24h) {
                Envio24h envi24 = (Envio24h) envio.get(i);

                if (envi24.getPeso() > max) {
                    max = (int) envi24.getPeso();

                }

            }
        }
        System.out.println("el envio de 24h mas pesado es: " + max);

    }

    public static void mostrarsumaportipodeenvio() {
        double suma = 0;
        double suma1 = 0;
        double suma2 = 0;

        for (int i = 0; i < envio.size(); i++) {
            suma = suma + envio.get(i).getPeso();
        }
        System.out.println("la suma del peso de los envios es: " + suma);

        for (int i = 0; i < envio.size(); i++) {
            if (envio.get(i) instanceof EnvioAzul) {
                EnvioAzul enva = (EnvioAzul) envio.get(i);
                suma1 = suma1 + (double) (enva.getPeso());

            }
        }

        System.out.println("la suma del peso de los envios azul es: " + suma1);

        for (int i = 0; i < envio.size(); i++) {
            if (envio.get(i) instanceof Envio24h) {
                Envio24h env24 = (Envio24h) envio.get(i);
                suma2 = suma2 + (double) (env24.getPeso());
            }

        }
        System.out.println("la suma del peso de los envios de 24h es: " + suma2);

    }

    public static void asignarempleadoavehiculo() {
       
    }

    public static void main(String[] args) {
        rellenardatos();
        //mostrarlosenvios();
        //mostrarenvio24demayorpeso();
        mostrarsumaportipodeenvio();
        asignarempleadoavehiculo();
        
    }

}
