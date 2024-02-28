package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim: " + isim;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Player)) return false;
        Player player = (Player) object;
        return id == player.id && Objects.equals(isim, player.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
}
public class Main {
    public static void main(String[] args) {

        Set<Player> hashSet= new HashSet<>();
        Player player1= new Player("Mustafa" , 1);
        Player player2= new Player("Murat" , 10);
        Player player3= new Player("Mehmet" , 20);
        Player player4= new Player("Mustafa" , 1);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for (Player p: hashSet){
            System.out.println(p);
        }

    }
}
