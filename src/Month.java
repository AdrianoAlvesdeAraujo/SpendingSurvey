import java.util.ArrayList;
import java.util.List;

public class Month {

    private float totalSpendFood;
    private double totalSpendFixChecks;
    private Account account;

    private List<Float> foods = new ArrayList<>();
    private List<Double> fixChecks = new ArrayList<>();
    private List<Float> gases = new ArrayList<>();
    private List<Float> drugstores = new ArrayList<>();
    private List<Float> others = new ArrayList<>();



    public float totalSpendFood(){
        float total=0;

        for (float food:foods){

           total+=food;
        }
        return total;
            }

    public double totalSpendFixChecks(){
        double total=0;

        for (double fixCheck:fixChecks){

            total+=fixCheck;
        }
        return total;
    }

    public double getTotalSpendFixChecks() {
        return totalSpendFixChecks;
    }

    public void setTotalSpendFixChecks(double totalSpendFixChecks) {
        this.totalSpendFixChecks = totalSpendFixChecks;
    }

    public void addSpendFood(Float food) {
        foods.add(food);
    }

    public void addSpendFixCheck(Double fixCheck) {

            this.fixChecks.add(fixCheck);
    }

    public void addSpendGas(Float gas) {
        this.gases.add(gas);
    }

    public void addSpendDrugstore(Float drugstore) {
        this.drugstores.add(drugstore);
    }

    public void addSpendOthers(Float other) {
        this.others.add(other);
    }

    public void setTotalSpendFood(float totalSpendFood) {
        this.totalSpendFood = totalSpendFood;
    }

    public void setFoods(List<Float> foods) {
        this.foods = foods;
    }

    public float getTotalSpendFood() {
        return totalSpendFood;
    }

    public List<Float> getFoods() {
        return foods;
    }

    public List<Double> getFixChecks() {
        return fixChecks;
    }

    public List<Float> getGases() {
        return gases;
    }

    public List<Float> getDrugstores() {
        return drugstores;
    }

    public List<Float> getOthers() {
        return others;
    }
}
