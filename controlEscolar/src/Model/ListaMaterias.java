package Model;

public class ListaMaterias {
    Materia inicio;
    Materia fin;
    
    public void append(Materia nuevo){
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }
}
