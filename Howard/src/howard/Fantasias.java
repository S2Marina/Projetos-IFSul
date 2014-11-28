package howard;
public class Fantasias extends Roupas{
        private String personagem;
       
        public String getPersonagem() {
           return personagem;
        }

        public void setPersonagem(String personagem) {
            this.personagem = personagem;
        }
        
        public String personagemFantasia(){
            return  " / " + this.personagem;   
        }
        
        public String retornoRoupa(){
            String retorno = " ";
            retorno = super.retornoRoupa() + personagemFantasia();
            return retorno;
        }
}
