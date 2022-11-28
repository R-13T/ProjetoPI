package com.mycompany.projetopi;

import java.util.*;

public class ProjetoPI {

    public static void login() {

        Scanner input = new Scanner(System.in);
        String us = "carlos", pass = "12345m";
        String user, password;
        System.out.println("DIGITE USÚARIO: ");
        user = input.nextLine();
        System.out.println("DIGITE SENHA: ");
        password = input.nextLine();
        int intentos = 0;
        if (us.equals(user) && pass.equals(password)) {
            System.out.println("BEM-VINDO AO JOGO MATEMÁTICA");
            
        }
        while (pass.equals(password) == false && intentos < 2) {
            System.out.println("TENTATIVA INVALIDA, DIGITE NOVAMENTE");
            System.out.println("DIGITE USUARIO: ");
            user = input.nextLine();
            System.out.println("DIGITE SENHA: ");
            password = input.nextLine();
            intentos++;
            if (intentos == 2) {
                System.out.println("Três tentativas inválidas. Nome de usuário e senha errados");
                System.exit(0);
            }
        }
    }

    public static int menu() {
        int opcionMenu;
        System.out.println("Menu");
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("1. Soma");
            System.out.println("2. Substração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divição");
            System.out.println("5. Raíz Quadrada");
            System.out.println("6. Potência");
            System.out.println("Opcção");
            // System.out.println("Please enter a positive number!");

            while (!input.hasNextInt()) {
                System.out.println("Opção ivalida!");
                input.next(); // this is important!
            }

            opcionMenu = input.nextInt();

            if (opcionMenu < 1 || opcionMenu > 6) {
                System.err.println("Opcao invalida");
            }
        } while (opcionMenu < 1 || opcionMenu > 6);
        return opcionMenu;
    }

    static int creditos = 5;

    static void disminuirCreditos() {
        if (creditos <= 0) {
            System.out.println("Jogo terminado!!!!!!!!!!!!");
            System.exit(0);

            return;
        }
        creditos = creditos - 1;

        System.out.println("Perdiste un credito X__X");
        System.out.println("te quedan " + creditos + " chances");

    }

    /*
    void verificarCreditos() {
        if (creditos > 0) {
            System.out.println("Disminuyo 1 credito");
            disminuirCreditos();
        } else {
            System.out.println("Game over");
            System.exit(0);
        }
    }
     */
    static void generarDesafios(int opcionDesafio) {
        Random rand = new Random();
        int n1 = rand.nextInt(1, 10);
        int n2 = rand.nextInt(1, 10);
        int respuesta = 0;
        ArrayList<Integer> opciones = new ArrayList<Integer>();
        int opcion = 1;
        int solucion = 0;//nuevo
        int opcionSeleccionada;//nuevo
        switch (opcionDesafio) {

            case 1:

                opciones.clear();
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                respuesta = n1 + n2;
                opciones.add(respuesta);
                Collections.shuffle(opciones);
                //aqui reiniciamos el valor del ejercicio
                //opcion = 1;
                // vamos a recorrer la lista
                Scanner input = new Scanner(System.in);
                //solucion = 0;

                //opcion = 1;
                System.out.println("Exercicio " + n1 + " + " + n2);
                for (Integer elemento : opciones) {

                    // estamos actualizando la respuesta
                    respuesta = n1 + n2;
                    //imprimir la opcion y el elemento(respuesta)
                    System.out.println("Opção: " + opcion + "  " + elemento);
                    //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                    opcion = opcion + 1;
                    //opcion++;

                }
                System.out.println("Digite opcção correta: ");
                while (!input.hasNextInt()) {
                    System.out.println("Escolha uma das opções validas!");
                    opcion = 1;
                    System.out.println("Exercicio " + n1 + " + " + n2);
                    for (Integer elemento : opciones) {
                        // estamos actualizando la respuesta
                        respuesta = n1 + n2;
                        //imprimir la opcion y el elemento(respuesta)
                        System.out.println("Opção: " + opcion + "  " + elemento);
                        //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                        opcion = opcion + 1;
                        //opcion++;

                    }

                    System.out.println("Digite opcção correta: ");
                    input.next();
                }
                solucion = input.nextInt();

                opcionSeleccionada = opciones.get(solucion - 1);
                if (opcionSeleccionada == respuesta) {
                    System.out.println("Resposta Correta");
                    generarDesafios(opcionDesafio);

                } else {
                    System.out.println("Resposta Incorreta");
                    disminuirCreditos();
                    generarDesafios(opcionDesafio);
                }
                break;

            case 2:

                opciones.clear();
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                respuesta = n1 - n2;
                opciones.add(respuesta);
                Collections.shuffle(opciones);
                //aqui reiniciamos el valor del ejercicio
                //opcion = 1;
                // vamos a recorrer la lista
                input = new Scanner(System.in);
                //solucion = 0;

                //opcion = 1;
                System.out.println("ola " + n1 + " - " + n2);
                for (Integer elemento : opciones) {

                    // estamos actualizando la respuesta
                    respuesta = n1 - n2;
                    //imprimir la opcion y el elemento(respuesta)
                    System.out.println("Opção: " + opcion + "  " + elemento);
                    //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                    opcion = opcion + 1;
                    //opcion++;

                }
                System.out.println("Digite opcção correta: ");
                while (!input.hasNextInt()) {
                    System.out.println("Escolha uma das opções validas!");
                    opcion = 1;
                    System.out.println("ola " + n1 + " - " + n2);
                    for (Integer elemento : opciones) {
                        // estamos actualizando la respuesta
                        respuesta = n1 - n2;
                        //imprimir la opcion y el elemento(respuesta)
                        System.out.println("Opção: " + opcion + "  " + elemento);
                        //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                        opcion = opcion + 1;
                        //opcion++;

                    }

                    System.out.println("Digite opcção correta: ");
                    input.next(); // this is important!
                }
                solucion = input.nextInt();

                opcionSeleccionada = opciones.get(solucion - 1);
                if (opcionSeleccionada == respuesta) {
                    System.out.println("Respuesta Correcta");
                    generarDesafios(opcionDesafio);

                } else {
                    System.out.println("Respuesta Incorrecta");
                    disminuirCreditos();
                    generarDesafios(opcionDesafio);
                }
                break;

            case 3:

                opciones.clear();
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                respuesta = n1 * n2;
                opciones.add(respuesta);
                Collections.shuffle(opciones);
                //aqui reiniciamos el valor del ejercicio
                opcion = 1;
                // vamos a recorrer la lista
                input = new Scanner(System.in);
                //solucion = 0;

                //opcion = 1;
                System.out.println("Exercicio " + n1 + " * " + n2);
                for (Integer elemento : opciones) {

                    // estamos actualizando la respuesta
                    respuesta = n1 * n2;
                    //imprimir la opcion y el elemento(respuesta)
                    System.out.println("Opção: " + opcion + "  " + elemento);
                    //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                    opcion = opcion + 1;
                    //opcion++;

                }
                System.out.println("Digite opcção correta: ");
                while (!input.hasNextInt()) {
                    System.out.println("Escolha uma das opções validas!");
                    opcion = 1;
                    System.out.println("Exercicio " + n1 + " * " + n2);
                    for (Integer elemento : opciones) {
                        // estamos actualizando la respuesta
                        respuesta = n1 * n2;
                        //imprimir la opcion y el elemento(respuesta)
                        System.out.println("Opção: " + opcion + "  " + elemento);
                        //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                        opcion = opcion + 1;
                        //opcion++;

                    }

                    System.out.println("Digite opcção correta: ");
                    input.next();
                }
                solucion = input.nextInt();

                opcionSeleccionada = opciones.get(solucion - 1);
                if (opcionSeleccionada == respuesta) {
                    System.out.println("Resposta Correta");
                    generarDesafios(opcionDesafio);

                } else {
                    System.out.println("Resposta Incorreta");
                    disminuirCreditos();
                    generarDesafios(opcionDesafio);
                }

                break;

            case 4:

                opciones.clear();
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                opciones.add(rand.nextInt(1, 100));
                respuesta = n1 / n2;
                opciones.add(respuesta);
                Collections.shuffle(opciones);
                //aqui reiniciamos el valor del ejercicio
                //opcion = 1;
                // vamos a recorrer la lista
                input = new Scanner(System.in);
                //solucion = 0;

                //opcion = 1;
                System.out.println("Exercicio " + n1 + " * " + n2);
                for (Integer elemento : opciones) {

                    // estamos actualizando la respuesta
                    respuesta = n1 / n2;
                    //imprimir la opcion y el elemento(respuesta)
                    System.out.println("Opção: " + opcion + "  " + elemento);
                    //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                    opcion = opcion + 1;
                    //opcion++;

                }
                System.out.println("Digite opcção correta: ");
                while (!input.hasNextInt()) {
                    System.out.println("Escolha uma das opções validas!");
                    opcion = 1;
                    System.out.println("Exercicio " + n1 + " / " + n2);
                    for (Integer elemento : opciones) {
                        // estamos actualizando la respuesta
                        respuesta = n1 / n2;
                        //imprimir la opcion y el elemento(respuesta)
                        System.out.println("Opção: " + opcion + "  " + elemento);
                        //aumenta uno a opcion1, opcion2, opcion3, opcion 4, y tambien avanzara una posicion en la respuesta1, respuesta2 ,respuesta 3, respuesta 4
                        opcion = opcion + 1;
                        //opcion++;

                    }

                    System.out.println("Digite opcção correta: ");
                    input.next();
                }
                solucion = input.nextInt();

                opcionSeleccionada = opciones.get(solucion - 1);
                if (opcionSeleccionada == respuesta) {
                    System.out.println("Resposta Correta");
                    generarDesafios(opcionDesafio);

                } else {
                    System.out.println("Resposta Incorreta");
                    disminuirCreditos();
                    generarDesafios(opcionDesafio);
                }

                break;
        }

    }

    public static void main(String[] args) {
        login();
        int optipoDeJuego = menu();
        generarDesafios(optipoDeJuego);

    }

}
