package composition;

public class DishWasher {

    private boolean hasWorkToDo;

//    public DishWasher(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

//    public DishWasher getDishWasher() {
//        return new DishWasher(false);
//    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Washing dishes...");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
