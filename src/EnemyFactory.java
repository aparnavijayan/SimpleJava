public class EnemyFactory {

    public static Enemny createEnemy(String enemyType)
    {
        if(enemyType.equals("Goblin"))
        {
            return new Goblin();
        }

        if(enemyType.equals("Troll"))
        {
            return new Troll();
        }
        return null;
    }

}
