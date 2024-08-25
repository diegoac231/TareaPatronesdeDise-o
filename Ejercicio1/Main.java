
package Ejercicio1;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ClonadorHeroe cloner = new ClonadorHeroe();

        Guerrero guerrero = new Guerrero("Guerrero", "Armado con una espada", 100, 5, 10, Arrays.asList(new Skill("Ataque fuerte", 20)));
        cloner.registroPrototipo(Guerrero.class, guerrero);

        PrototipoHeroe guerreroClonado = cloner.cloneHero(Guerrero.class);
        guerreroClonado.setName("Clon del Guerreiro");
        guerreroClonado.setAppearance("Armado con una espada clónica");

        System.out.println(guerreroClonado.getName());
        System.out.println(guerreroClonado.getAppearance());
        System.out.println(guerreroClonado.getExperience());
        System.out.println(guerreroClonado.getLevel());
        System.out.println(guerreroClonado.getSkillPoints());
        System.out.println(guerreroClonado.getSkills());
    }
}