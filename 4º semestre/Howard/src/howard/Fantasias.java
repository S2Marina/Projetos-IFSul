package howard;
public class Fantasias extends Prateleiras{
        private String personagem;

        public String getPersonagem() {
           return personagem;
        }

        public void setPersonagem(String personagem) {
            this.personagem = personagem;
        }
        
        @Override
        public String retornoRoupa(){
            String retorno = " ";
            retorno = super.retornoRoupa() + " / " + this.personagem; 
            return retorno;
        }
}
