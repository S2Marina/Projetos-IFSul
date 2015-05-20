package marinalivros;
public class Livro {
    private String titulo, ano, autor;
    private int tiragem, vendidos;
    private Double preco;
    private boolean importado;
    
    public Livro (){
        titulo = null;
        ano = null;
        autor = null;
        tiragem = 0;
        vendidos = 0;
        preco = 0.0;
        importado = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
    
    public String getSucesso(Integer vendidos){
        String sucesso;
        if (vendidos <= 20000){
            sucesso = "Um Fracasso!!!";
        }
        else if (vendidos <= 40000){
            sucesso = "Regular!!!";
        }
        else{
            sucesso = "Um Sucesso!!!";
        }
        return sucesso;
    }
    
    public Double getValor(Integer vendidos, Double preco){// JÁ TEM! NÃO PRECISA DE ENTRADA
        Double valor;
        valor = vendidos * preco;
        return valor;
    }
    
    public Double ganhosAutor(Double valor, boolean importado){// JÁ TEM! NÃO PRECISA DE ENTRADA
        Double ganhos;
        if (importado == true){
            ganhos = valor * 0.2;
        }
        else{
            ganhos = valor *0.3;
        }
        return ganhos;
    }
}
