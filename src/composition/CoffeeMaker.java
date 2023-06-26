package composition;

public class CoffeeMaker {

    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

//    public CoffeeMaker getCoffeeMaker() {
//        return new CoffeeMaker(false);
//    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
