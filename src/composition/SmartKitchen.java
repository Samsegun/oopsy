package composition;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator refrigerate;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.refrigerate = new Refrigerator();
    }
//    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
//        this.brewMaster = brewMaster;
//        this.dishWasher = dishWasher;
//        this.iceBox = iceBox;
//    }

//    public void addWater() {
//        brewMaster.setHasWorkToDo(true);
//    }
//
//    public void pourMilk() {
//        iceBox.setHasWorkToDo(true);
//    }
//
//    public void loadDishwasher() {
//        dishWasher.setHasWorkToDo(true);
//    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        refrigerate.orderFood();
    }


    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return refrigerate;
    }

    public void setKitchenState(boolean brew, boolean dish, boolean iceBox) {
        brewMaster.setHasWorkToDo(brew);
        dishWasher.setHasWorkToDo(dish);
        refrigerate.setHasWorkToDo(iceBox);
    }
}
