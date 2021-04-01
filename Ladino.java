public class Ladino extends Humanoide {
    
    public Ladino(){
        energia = 90;
        nome = "Ladino";
        atk = 9;
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