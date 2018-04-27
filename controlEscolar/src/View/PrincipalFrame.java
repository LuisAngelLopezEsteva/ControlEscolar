package View;

import Model.Alumno;
import Model.ListaAlumnos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

public class PrincipalFrame extends JFrame{
    private PanelCabecera head;
    private tablaPanel tablitaPanel;
    
    public PrincipalFrame(ListaAlumnos listaAlumnos){
        super("Universidad LaSalle Oaxca");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setSize(500, 500);
        String[] columnasnombre = {"No. Control",
                        "Nombre",
                        "Paterno",
                        "Materno",
                        "Fecha Nac",
                        "Carrera",
                        "Promedio"}; 
        System.out.println("Cantidad de alumnos: "+listaAlumnos.getNumeroAlumnos());
        Object[][] data = new Object[listaAlumnos.getNumeroAlumnos()][7];
        
       
        Alumno current = listaAlumnos.getHead();
        
        for(int i=0; i<listaAlumnos.getNumeroAlumnos(); i++){
            data[i][0] = current.getNoControl();
            data[i][1] = current.getNombre();
            data[i][2] = current.getPaterno();
            data[i][3] = current.getMaterno();
            data[i][4] = current.getFechaNac().fechaToString();
            data[i][5] = current.getCarrera();
            data[i][6] = current.getPromedio();
            current = current.getNext();
        }
        
        head = new PanelCabecera();
        tablitaPanel = new tablaPanel(data, columnasnombre);
        
        System.out.println("Se va a agregar head");
        super.add(head);
        System.out.println("Se agrego head");
        
        super.add(tablitaPanel);
        super.setVisible(true);
    }
}
