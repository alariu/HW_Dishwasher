public class DishwasherMain {

    private final int dishwasherCapacity = 10;
    private final boolean is_empty;
    private final boolean is_running;



    public DishwasherMain(boolean is_empty, boolean is_running) {
        this.is_empty = true;
        this.is_running = false;

    }

    public boolean isIs_empty() {
        return is_empty;
    }

    public boolean isIs_running() {
        return is_running;
    }

    public int getDishwasherCapacity() {
        return dishwasherCapacity;
    }


}

