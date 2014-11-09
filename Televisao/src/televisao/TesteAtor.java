package televisao;

import javax.swing.JOptionPane;

public class TesteAtor {
    public static void main(String[] args) {
      String nome, nasc, email, nome_art, cidade, endereco, bairro, estado, status;
      Double novelas, salario, cache, eventos, ganhos;
      
      Ator a = new Ator();

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
      
      JOptionPane.showMessageDialog(null, " Nome artístico: "+ nome_art + "\n Data de nascimento: " + nasc + "\n Email:" + email + "\n Quantidade de novelas:" + novelas + "\n Status: " + a.returnStatus() + "\n Ganhos Mensais: "+ a.calcularGanhos());
    }
    
}
