//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

           /* HashMapStreamExample example = new HashMapStreamExample();
            example.exampleMethod();
*/
           SingleTon instance1= SingleTon.getInstane();
           instance1.SingleTonMethod();


       Enemny goblin=EnemyFactory.createEnemy("Goblin");

        goblin.attack();
        goblin.defend();


        //LINEAR SEARCH

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        String s = LinearSearch.linersearch(target,arr);
        System.out.println(s);

    }
}