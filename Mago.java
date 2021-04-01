public class Mago extends Humanoide {
    
    public Mago(){
        energia = 80;
        nome = "Mago";
        atk = 15;
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
