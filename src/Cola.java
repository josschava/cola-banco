import java.util.Collection;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }

    public void insercion(Nodo nuevoNodo) {
        if (frente == null) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
            System.out.println("Agregando primer persona " + nuevoNodo.getDato().getCedula());
        } else {
            if (nuevoNodo.getDato().getDiscapacidad()){
                Nodo aux = frente;
                frente = nuevoNodo;
                frente.setAtras(aux);
                System.out.println("Agregando persona con discapacidad al inicio " + nuevoNodo.getDato().getCedula()+ " " + nuevoNodo.getDato().getNombre());
            }else {
                ultimo.setAtras(nuevoNodo);
                ultimo = nuevoNodo;
                System.out.println("Agregando persona sin discapacidad a la cola " + nuevoNodo.getDato().getCedula()+ " " + nuevoNodo.getDato().getNombre());
            }
        }
        largo++;
    }

    public Nodo atiende() {
        Nodo aux = frente;
        if (frente != null) {
            System.out.println("Atendiendo a " + frente.getDato().getCedula()+ " " + frente.getDato().getNombre());
            frente = frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }

    public boolean encuentra(int x) {
        if (frente != null) {
            if (ultimo.getDato().getCedula().equals(x)) {
                return true;
            } else {
                Nodo aux = frente;
                while (aux != null) {
                    if (aux.getDato().getCedula().equals(x)) {
                        return true;
                    }
                    aux = aux.getAtras();
                }
            }
        }
        return false;
    }

    public String imprimir() {
        String s = "";
        Nodo aux = frente;
        while (aux != null) {
            s += aux.getDato().getCedula() + " " + aux.getDato().getNombre() + "\n";
            aux =aux.getAtras();
        }
        return s;
    }
}