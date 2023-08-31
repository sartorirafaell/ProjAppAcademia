
package projappacademia.model;

import java.util.ArrayList;

public class Modalidade {
    private int id;
    private String tipo;
    private ArrayList<String> alunos = new ArrayList<>();

    public Modalidade(String tipo) {
        this.tipo = tipo;
    }
    public Modalidade(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<String> alunos) {
        this.alunos = alunos;
    }
}
