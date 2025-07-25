package chapter16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("pikachu");
        Pokemon pokemon2 = new Pokemon("squirtle");
        Pokemon pokemon3 = new Pokemon("charizard");
        Pokemon pokemon4 = new Pokemon("mewtow");

        //配列
        int[] level = new int[3];
        level[0] = 1;
        level[1] = 50;
        level[2] = 100;

        Pokemon[] pokemons = new Pokemon[3];
        pokemons[0] = pokemon1;
        pokemons[1] = pokemon2;
        pokemons[2] = pokemon3;
        System.out.println("配列の長さ : " + pokemons.length);

        //ArrayList
        /*
        　ArrayList<型名> 変数名 = new ArrayList<>();
         */

        //for文
        System.out.println("----for文によるデータの取り出し(配列)----");
        for (Pokemon poke : pokemons) {
            System.out.println(poke.getName());

            level_array.add(1) = 1;
            level_array.add(50) = 50;
            level_array.add(100)= 100;

            ArrayList<Pokemon> pokemon_array = new ArrayList<>();
            pokemon_array.add(pokemon1);
            pokemon_array.add(index1,pokemon2);
            pokemon_array.add(index2,pokemon3);
            pokemon_array.add(index3,pokemon4);

            System.out.println("------for文によるデータの取り出し（配列）" );
            for (Pokemon poke : pokemon_array) {
                System.out.println(poke.getName());

                System.out.println("------for文によるデータの取り出し（配列）" );
                for (Pokemon poke : pokemon_array) {
                    System.out.println(poke.getName());
            }

        }
    }
}
