package composition;

public class Refrigerator {

    private boolean hasWorkToDo;

//    public Refrigerator(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

//    public Refrigerator getRefrigerator() {
//        return new Refrigerator(false);
//    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering food...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
