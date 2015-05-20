package televisao;
public class Novela {
    private String titulo;
    private String duracao;
    private String hora;
    private String autor;
    private Emissora emissora;
    private Double ibope;
    private boolean violencia;
    private boolean sexo;
    private boolean drogas;
    private int clas;
    private Double audiencia;
    
    public Novela(){
        this.emissora = new Emissora();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Emissora getEmissora() {
        return emissora;
    }

    public void setEmissora(Emissora emissora) {
        this.emissora = emissora;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean violencia) {
        this.violencia = violencia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public Double getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Double audiencia) {
        this.audiencia = audiencia;
    }
    
    public Integer obterClassificacao(){
        if (violencia == false && sexo == false && drogas == false){
            clas = 0;
        }
        else if(violencia == true && sexo == false && drogas == false){
            clas = 14;
        }
        else if(violencia == true && sexo == false && drogas == true){
            clas = 16;
        }
        else if(violencia == true && sexo == true && drogas == true){
            clas = 18;
        }
        return clas;
    }
    
    public Double returnIbope(Double audiencia){
       ibope = audiencia / 10000;
       return ibope;
   }
    
}
