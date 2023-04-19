
package com.UG8A.main;

import com.UG8A.main.character.MagicCharacter;
import com.UG8A.main.character.hero.DragonKnight;
import com.UG8A.main.character.hero.LegionCommander;
import com.UG8A.main.character.hero.Lina;

/**
 * Hello world!
 *
 */
        public class App
        {
            public static void main( String[] args )
            {
                Lina lina = new Lina();
                DragonKnight dragonKnight = new DragonKnight();
                LegionCommander legionCommander = new LegionCommander();
                System.out.println("Info karakter: ");
                lina.showCharacterInfo();
                dragonKnight.showCharacterInfo();
                legionCommander.showCharacterInfo();

                lina.skill(dragonKnight);
                lina.showCharacterInfo();
                dragonKnight.skill();


                dragonKnight.attack(lina);
                dragonKnight.attack(lina);
                lina.showCharacterInfo();

                lina.attack(dragonKnight);
                lina.showCharacterInfo();
                legionCommander.skill(lina);

                lina.skill(legionCommander);


                lina.showCharacterInfo();

                dragonKnight.showCharacterInfo();
                legionCommander.showCharacterInfo();
            }
        }



