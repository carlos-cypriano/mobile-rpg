public class Cerbero extends Monstro implements Acao {
    
    public Cerbero(){
        energia = 180;
        nome = "Cerbero";
        atk = 13;
        xp = 120;
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
