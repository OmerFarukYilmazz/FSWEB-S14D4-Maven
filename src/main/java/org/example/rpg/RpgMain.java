package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek" , 1000 ,40);
        Monster wolf = new Werewolf("Wolf",500,60);

        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("Attack result of: " + monster.getName() + ": " + monster.attack());
    }

}
