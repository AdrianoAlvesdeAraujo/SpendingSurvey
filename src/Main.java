import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Month janeiro = new Month();
        Month fevereiro = new Month();
        Account account = new Account("Adriano", "1234");

        System.out.println("Id da conta: "+account.getUniqueID());
        /*fevereiro.addSpendFood(200.00f);
        fevereiro.addSpendFood(330.50f);
        janeiro.addSpendDrugstore(100.00f);
        janeiro.addSpendDrugstore(50.00f);*/

        account.saque(10.00);
        if(account.getSaldo()>10.00) {

            janeiro.addSpendFixCheck(10.00);
            double valor = janeiro.totalSpendFixChecks();
            System.out.println(valor);

        }
        account.saque(30.00);
        if(account.getSaldo() > 30.00) {

            janeiro.addSpendFixCheck(30.00);

            System.out.println(janeiro.getFixChecks());
            double valor = janeiro.totalSpendFixChecks();
            System.out.println(valor);
        }
        account.deposito(100.00);
        System.out.println("após o depósito"+account.getSaldo());
        account.saque(200.00);
        if(account.getSaldo()>200.00)

            janeiro.addSpendFixCheck(30.00);

        System.out.println(account.getSaldo());


       System.out.println(janeiro.getFixChecks());
         double valor = janeiro.totalSpendFixChecks();
         System.out.println(valor);



        System.out.println(account.getSaldo());
        //janeiro.addSpendFixCheck(50.00);
        //janeiro.addSpendFixCheck(30.00);
        /*
        janeiro.addSpendFood(32.50f);
        janeiro.addSpendOthers(120f);
        janeiro.addSpendFood(115.90f);
        janeiro.addSpendFood(32.50f);
        janeiro.addSpendFood(32.50f);
        janeiro.addSpendFood(32.50f);

        System.out.println("Lista de despesas com Farmácia: "+janeiro.getDrugstores());
        System.out.println("Lista de despesas com Despesas fixas: "+janeiro.getFixChecks());
        System.out.println("Lista de despesas com Outras Despesas: "+janeiro.getOthers());
        System.out.println("Lista de despesas com Comida: "+janeiro.getFoods());
        float total = 0;
        for (Float food: janeiro.getFoods()){
            total +=food;

        }
        System.out.println(total);


        float total= janeiro.totalSpendFood();
        System.out.println(total);

        System.out.println(janeiro.getFoods());

        double totalFix= janeiro.totalSpendFixChecks();
        System.out.println(totalFix);

        float totalFood= fevereiro.totalSpendFood();
        System.out.println(totalFood);
*/
    }


}
