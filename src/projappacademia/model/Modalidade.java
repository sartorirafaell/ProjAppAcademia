
package projappacademia.model;

public class Modalidade {
    private int id;
    private String tipo;

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
}
