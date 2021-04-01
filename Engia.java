public class Engia extends Monstro {
    
    public Engia(){
        energia = 120;
        nome = "Engia";
        atk = 10;
        xp = 80;
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
