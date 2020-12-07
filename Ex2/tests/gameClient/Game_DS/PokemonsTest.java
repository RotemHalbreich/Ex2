package gameClient.Game_DS;

import Server.Game_Server_Ex2;
import api.game_service;
import org.json.JSONException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PokemonsTest {

    @Test
    void update() throws JSONException {
        game_service game = Game_Server_Ex2.getServer(1);
        Pokemons P= new Pokemons(game);
        Iterator g=P.iterator();
        while(g.hasNext()){
            System.out.println(g.next().toString());
        }


    }

    @Test
    void size() {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b=a;
        System.out.println(b.toString());
      b.add(4);
        System.out.println(a.toString());
    }
}