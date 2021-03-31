public class Templario extends Humanoide implements Acao{
    
    public Templario(){
    
        energia = 120;
        nome = "Templario";
        atk = 10;
        xp = 0;

    }

    public void atacar(Humanoide h){
        h.energia = h.energia - this.atk;
    }

    public void atacar(Monstro m){
        m.energia = m.energia - this.atk;
    }

    public void defender(Humanoide h){
        
    }

    public void defender(Monstro m){
        
    }
}
