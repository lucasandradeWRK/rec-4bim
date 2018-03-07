import javax.swing.JOptionPane;
public class Personagem {
    public String nome;
    public int maxHP;
    public int HPAtual;
    Arma a = new Arma();
    pocao p = new pocao();
    
    public String Personagem(String nome, int maxHP, int HPAtual){
        return "Nome:"+nome+"HP Maximo--> "+maxHP+"HP Atual";
    }
    public void equiparArma(Arma a){
        
    }
    public void addPocao(pocao p){
    //ode fica o inventário??
    
    }
    
    public void recuperarVida(){
    
    }public int dano(){
        int durabilidade=Integer.parseInt(JOptionPane.showInputDialog(null, "informe a durabilidade"));
        HPAtual = HPAtual - a.atacar(durabilidade);
        return HPAtual;
    }
    public String Status(){
    
    
    }
    
}
