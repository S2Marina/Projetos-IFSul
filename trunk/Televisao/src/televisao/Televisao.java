package televisao;

import javax.swing.JOptionPane;

public class Televisao {
    public static void main(String[] args) {
        Ator a = new Ator();
        Novela n = new Novela();
        Emissora e = new Emissora();
        Apresentador ap = new Apresentador();
        
        int m, x = 0;
        String nome, nasc, email, nome_art, cidade, endereco, bairro, estado, status, nome_ap, cidade_ap, programa, nome_e, end_e;
        Double novelas, salario, cache, eventos, ganhos, evento_ap;
        String titulo,duracao, hora, autor, emissora, violencia, sexo, drogas, tv;
        boolean v,s,d,aberta;
        int clas = 0;
        Double ibope, audiencia;

       do{          
             m = Integer.parseInt(JOptionPane.showInputDialog(" Menu:\n\n 1-Inserir informações do ator\n 2-Mostrar informações do ator\n 3-Inserir informações da novela\n 4-Mostrar informações da novela\n 5-Inserir informações da emissora\n 6-Mostrar informações da emissora\n 7-Inserir informações do apresentador\n 8-Mostrar informações do apresentador\n 0-Sair\n"));
             switch(m){
                 case 1:{
                          nome = JOptionPane.showInputDialog(" Informe o nome do ator:");
                          nasc  = JOptionPane.showInputDialog(" Informe a data de nascimento do ator:");
                          email  = JOptionPane.showInputDialog(" Informe o email do ator:");
                          nome_art  = JOptionPane.showInputDialog(" Informe o nome artístico do ator:");
                          cidade  = JOptionPane.showInputDialog(" Informe a cidade onde mora o ator:");
                          endereco  = JOptionPane.showInputDialog(" Informe o endereço onde mora o ator:");
                          bairro  = JOptionPane.showInputDialog(" Informe o bairro onde mora o ator:");
                          estado  = JOptionPane.showInputDialog(" Informe o estado onde mora o ator:");
                          novelas  = Double.parseDouble(JOptionPane.showInputDialog(" Informe quantas novelas fez o ator:"));
                          salario  = Double.parseDouble(JOptionPane.showInputDialog(" Informe o salário do ator:"));
                          cache  = Double.parseDouble(JOptionPane.showInputDialog(" Informe o cachê por evento do ator:"));
                          eventos  = Double.parseDouble(JOptionPane.showInputDialog(" Informe o número de eventos que o ator paticipou esse mês:"));

                          a.setNome(nome);
                          a.setNasc(nasc);
                          a.setEmail(email);
                          a.setNome_art(nome_art);
                          a.setCidade(cidade);
                          a.setEndereco(endereco);
                          a.setBairro(bairro);
                          a.setEstado(estado);
                          a.setNovelas(novelas);
                          a.setSalario(salario);
                          a.setCache(cache);
                          a.setEventos(eventos);

                          x = 0;
                     break;  
                 }

                 case 2:{
                     JOptionPane.showMessageDialog(null, " Nome artístico: "+ a.getNome_art() + "\n Data de nascimento: " + a.getNasc() + "\n Email:" + a.getEmail() + "\n Quantidade de novelas:" + a.getNovelas() + "\n Status: " + a.returnStatus() + "\n Ganhos Mensais: "+ a.calcularGanhos(a.getEventos()));
                     break;
                 }
                 
                 case 3:{
                      titulo = JOptionPane.showInputDialog(" Informe o título da novela:");
                      duracao = JOptionPane.showInputDialog(" Informe a duração da novela");
                      hora = JOptionPane.showInputDialog(" Informe o horário em que passa a novela");
                      autor = JOptionPane.showInputDialog(" Informe o nome do autor da novela:");
                      emissora = JOptionPane.showInputDialog(" Informe o nome da emissora da novela:");
                      audiencia = Double.parseDouble(JOptionPane.showInputDialog(" Informe quantas pessoas assistem a essa novela:"));
                      
                      n.setTitulo(titulo);
                      n.setDuracao(duracao);
                      n.setHora(hora);
                      n.setAutor(autor);
                      n.setEmissora(emissora);
                      n.setAudiencia(audiencia);
                      
                      do{
                           violencia = JOptionPane.showInputDialog(" Há cenas de violência (s/n):");
                      }while(!violencia.equals("s") && !violencia.equals("n"));

                      if (violencia.equals("s")){
                          v = true;
                      }
                      else{
                          v = false;
                      }
                      n.setViolencia(v);
                       
                      
                      do{
                           sexo = JOptionPane.showInputDialog(" Há cenas de sexo (s/n):");
                      }while(!sexo.equals("s") && !sexo.equals("n"));

                      if (sexo.equals("s")){
                          s = true;
                      }
                      else{
                          s = false;
                      }
                      n.setSexo(s);
                      
                      
                      do{
                           drogas = JOptionPane.showInputDialog(" Há cenas de uso de drogas (s/n):");
                      }while(!drogas.equals("s") && !drogas.equals("n"));

                      if (drogas.equals("s")){
                          d = true;
                      }
                      else{
                          d = false;
                      }
                      n.setDuracao(duracao);
                      
                      clas = n.obterClassificacao(v, s, d);
                      
                      x = 0;
                     break;
                 }
                 
                 case 4:{
                     JOptionPane.showMessageDialog(null, " Título da novela: " + n.getTitulo() + "\n Autor da novela: " + n.getAutor() + "\n Emissora: " + n.getEmissora() + "\n IBOPE: " + n.returnIbope(n.getAudiencia()));
                     if (clas == 0){
                       JOptionPane.showMessageDialog(null, "Classificação indicativa: Livre para todos os públicos");
                     }
                     else{
                     JOptionPane.showMessageDialog(null, "Classificação indicativa: " + clas + " anos.");
                     }
                     
                     x = 0;
                     break;
                 }

                 case 5:{
                     nome_e = JOptionPane.showInputDialog(" Informe o nome da emissora:");
                     end_e  = JOptionPane.showInputDialog(" Informe o endereço da emissora:");
                     do{
                           tv = JOptionPane.showInputDialog(" A emissora é aberta (s/n):");
                      }while(!tv.equals("s") && !tv.equals("n"));

                      if (tv.equals("s")){
                           aberta = true;
                      }
                      else{
                         aberta = false;
                      }
                      e.setAberta(aberta);
                      e.setNome(nome_e);
                      e.setEndereco(end_e);
                         
                      x = 0;
                     break;
                 }
                 
                 case 6:{
                      JOptionPane.showMessageDialog(null, " Nome da emissora: " + e.getNome() + "\n Endereço da emissora: " + e.getEndereco());
                      if (e.isAberta() == true){
                          JOptionPane.showMessageDialog(null, " TV aberta!!!");
                      }
                      else{
                          JOptionPane.showMessageDialog(null, " TV fechada!!!");
                      }
                      x = 0;
                     break;
                 }
                 
                 case 7:{
                      nome_ap = JOptionPane.showInputDialog(" Informe o nome do apresentador:");
                      cidade_ap = JOptionPane.showInputDialog(" Informe a cidade onde mora o apresentador:");
                      programa = JOptionPane.showInputDialog(" Informe o nome do programa que ele apresenta:");
                      evento_ap = Double.parseDouble(JOptionPane.showInputDialog(" Informe o número de eventos dos quais ele participou:"));
                      
                      ap.setNome_art(nome_ap);
                      ap.setCidade(cidade_ap);
                      ap.setProg(programa);
                      ap.setEventos(evento_ap);
                      
                      x = 0;
                     break;
                 }
                 
                 case 8:{
                      JOptionPane.showMessageDialog(null, " Nome do apresentador: " + ap.getNome() + "\n Nome do programa que ele apresenta: " + ap.getProg() + "\n Cidade onde ele mora: " + ap.getCidade() + "\n Ganhos mensais: " + ap.calcularGanhos(ap.getEventos()));
                      x = 0;
                     break;
                 }
                 default:{
                      x = 13;
                     break;
                 }
        }
        }while(x == 0);
    }
    }