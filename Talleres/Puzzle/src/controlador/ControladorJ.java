
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelo.Ficha;
import modelo.Juego;
import vista.VentanaUsuario;

/**
 *
 * @author USER
 */
public class ControladorJ {
    
    private VentanaUsuario ventanaPrincipal;
    private Juego nuevoJuego = new Juego();
    private ArrayList<Ficha> fichasJuego = new ArrayList<Ficha>();
    private BotonesControlador panelBotones = new BotonesControlador();
    private int [] ordenFichasV = new int [16];
    private int posFicha16;
    
    public ControladorJ( VentanaUsuario ventana){
        
        this.ventanaPrincipal = ventana;        
        
    }
    
    public void iniciar(){
                
        obtenerFichas();  
        iniciarVentana(); 
        ubicarFichasDesordenadas();
        ventanaPrincipal.agregarImagenesPanelFichas(fichasJuego);
        this.panelBotones.colocarBotonesDireccionales();        
        eventosBotones();
        ventanaPrincipal.agregarPanelExterno(panelBotones);       
        this.ordenFichasV = nuevoJuego.vectorOrdenCorrecto();
        //System.out.println(this.ordenFichasV [15]);
       // this.posFicha16 = nuevoJuego.buscarPosicionFicha16(fichasJuego);
        //System.out.println("Hola: " + posFicha16);
    }
    
    public void iniciarVentana(){
        
        ventanaPrincipal.setSize(1000, 728);
        ventanaPrincipal.setTitle("PUZZLE");
        ventanaPrincipal.agregarPanelFichas(fichasJuego);  
        ventanaPrincipal.setLocationRelativeTo(null);
        
    }
    public void obtenerFichas(){
        
        this.fichasJuego = nuevoJuego.crearFichas(); 
    }
    
    public void ubicarFichasDesordenadas(){
        ArrayList<Ficha> Aux1 = new ArrayList<Ficha>();
        Aux1 = fichasJuego;
        Aux1.remove(15);
        this.fichasJuego = nuevoJuego.desordenarFichas(Aux1);
        Ficha nuevaFicha16 = new Ficha(16, new ImageIcon("Imagen16.png"), 484, 514);
        this.fichasJuego.add(nuevaFicha16);

    }
    
    public void eventosBotones(){          
        
        //** Flecha Arriba **//
        ActionListener botonArribaAction = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                posFicha16 = nuevoJuego.buscarPosicionFicha16(fichasJuego) + 1;      
                
                //De Derecha a Izquierda
                //** Columna 1 **//
                if(posFicha16 == 16){
                    
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(15, 11);

                }
                
                if(posFicha16 == 12){
                        
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(11, 7);

                }
                
                if(posFicha16 == 8){
                   
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(7, 3);

                }
                
                //** Columna 2 **//
                if(posFicha16 == 15){
                    
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(14, 10);

                }
                
                if(posFicha16 == 11){
                        
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(10, 6);

                }
                
                if(posFicha16 == 7){
                   
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(6, 2);

                }
                
                //** Columna 3 **//
                if(posFicha16 == 14){
                    
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(13, 9);

                }
                
                if(posFicha16 == 10){
                        
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(9, 5);

                }
                
                if(posFicha16 == 6){
                   
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(5, 1);

                }
                
                //** Columna 4 **//
                if(posFicha16 == 13){
                    
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(12, 8);

                }
                
                if(posFicha16 == 9){
                        
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(8, 4);

                }
                
                if(posFicha16 == 5){
                   
                    ventanaPrincipal.moverFichaPanelFichas(1, posFicha16);
                    reordenarArregloFichas(4, 0);

                }

            }
            
        };
        
        this.panelBotones.botonArriba.addActionListener(botonArribaAction);
        
        //** Flecha Abajo **//
        ActionListener botonAbajoAction = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                posFicha16 = nuevoJuego.buscarPosicionFicha16(fichasJuego) + 1;        
                
                //De Derecha a Izquierda
                //** Columna 1 **//
                if(posFicha16 == 4){
                    
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(3, 7);

                }
                
                if(posFicha16 == 8){
                        
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(7, 11);

                }
                
                if(posFicha16 == 12){
                   
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(11, 15);

                }
                
                //** Columna 2 **//
                if(posFicha16 == 3){
                    
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(2, 6);

                }
                
                if(posFicha16 == 7){
                        
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(6, 10);

                }
                
                if(posFicha16 == 11){
                   
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(10, 14);

                }
                
                //** Columna 3 **//
                if(posFicha16 == 2){
                    
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(1, 5);

                }
                
                if(posFicha16 == 6){
                        
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(5, 9);

                }
                
                if(posFicha16 == 10){
                   
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(9, 13);

                }
                
                //** Columna 4 **//
                if(posFicha16 == 1){
                    
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(0, 4);

                }
                
                if(posFicha16 == 5){
                        
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(4, 8);

                }
                
                if(posFicha16 == 9){
                   
                    ventanaPrincipal.moverFichaPanelFichas(2, posFicha16);
                    reordenarArregloFichas(8, 12);

                }

            }
            
        };
        
        this.panelBotones.botonAbajo.addActionListener(botonAbajoAction);
                
        //** Flecha Izquierda **//
        ActionListener botonIzquierdaAction = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                posFicha16 = nuevoJuego.buscarPosicionFicha16(fichasJuego) + 1;        
                
                //De Abajo hacia Arriba
                //** Fila 1 **//
                if(posFicha16 == 16){
                    
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(15, 14);

                }
                
                if(posFicha16 == 15){
                        
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(14, 13);

                }
                
                if(posFicha16 == 14){
                   
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(13, 12);

                }
                
                //** Fila 2 **//
                if(posFicha16 == 12){
                    
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(11, 10);

                }
                
                if(posFicha16 == 11){
                        
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(10, 9);

                }
                
                if(posFicha16 == 10){
                   
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(9, 8);

                }
                
                //** Fila 3 **//
                if(posFicha16 == 8){
                    
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(7, 6);

                }
                
                if(posFicha16 == 7){
                        
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(6, 5);

                }
                
                if(posFicha16 == 6){
                   
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(5, 4);

                }
                
                //** Fila 4 **//
                if(posFicha16 == 4){
                    
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(3, 2);

                }
                
                if(posFicha16 == 3){
                        
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(2, 1);

                }
                
                if(posFicha16 == 2){
                   
                    ventanaPrincipal.moverFichaPanelFichas(3, posFicha16);
                    reordenarArregloFichas(1, 0);

                }
    
            }
            
        };
        
        this.panelBotones.botonIzquierda.addActionListener(botonIzquierdaAction);
        
        //** Flecha Derecha **//
        ActionListener botonDerechaAction = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                posFicha16 = nuevoJuego.buscarPosicionFicha16(fichasJuego) + 1;       
                
                //De Abajo hacia Arriba
                //** Fila 1 **//
                if(posFicha16 == 13){
                    
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(12, 13);

                }
                
                if(posFicha16 == 14){
                        
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(13, 14);

                }
                
                if(posFicha16 == 15){
                   
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(14, 15);

                }
                
                //** Fila 2 **//
                if(posFicha16 == 9){
                    
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(8, 9);

                }
                
                if(posFicha16 == 10){
                        
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(9, 10);

                }
                
                if(posFicha16 == 11){
                   
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(10, 11);

                }
                
                //** Fila 3 **//
                if(posFicha16 == 5){
                    
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(4, 5);

                }
                
                if(posFicha16 == 6){
                        
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(5, 6);

                }
                
                if(posFicha16 == 7){
                   
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(6, 7);

                }
                
                //** Fila 4 **//
                if(posFicha16 == 1){
                    
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(0, 1);

                }
                
                if(posFicha16 == 2){
                        
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(1, 2);

                }
                
                if(posFicha16 == 3){
                   
                    ventanaPrincipal.moverFichaPanelFichas(4, posFicha16);
                    reordenarArregloFichas(2, 3);

                }
                
            }
            
        };
        
        this.panelBotones.botonDerecha.addActionListener(botonDerechaAction);
               
        
    }
    
    public void reordenarArregloFichas(int posicion16, int posicionCambio){
        
        Ficha auxFicha = new Ficha();
        
        auxFicha = this.fichasJuego.get(posicion16);
        this.fichasJuego.set(posicion16, this.fichasJuego.get(posicionCambio));
        this.fichasJuego.set(posicionCambio, auxFicha);
        
    }
}
