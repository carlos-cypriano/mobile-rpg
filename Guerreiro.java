public class Guerreiro extends Humanoide{
    
    public Guerreiro(){
    
        energia = 115;
        nome = "Guerreiro";
        atk = 12;
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
