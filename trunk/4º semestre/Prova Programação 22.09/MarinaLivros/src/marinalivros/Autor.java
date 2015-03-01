package marinalivros;
public class Autor {
     private String nome, sobrenome, nascimento;
     private int qlivros;

    public Autor(){
        nome = null;
        sobrenome = null;
        nascimento = null;
        qlivros = 0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getQlivros() {
        return qlivros;
    }

    public void setQlivros(int qlivros) {
        this.qlivros = qlivros;
    }
     
    public String infoAutor (String nome, String sobrenome, Integer qlivros){ // JÁ TEM! NÃO PRECISA DE ENTRADA
        String info;
        info = nome + " " + sobrenome + " - " + qlivros + " livros publicados.";
        return info;        
    }
    
}
