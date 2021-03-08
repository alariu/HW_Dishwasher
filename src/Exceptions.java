public class Exceptions extends DishwasherMain {
    private final int maxDishes;
    private final boolean is_clean;
    public Exceptions(boolean is_empty, boolean is_running, int maxDishes, String dishes, boolean is_clean) {
        super(is_empty, is_running);
        this.maxDishes = maxDishes;
        this.is_clean = is_clean;
    }

    public int getMaxDishes() {
        return maxDishes;
    }

        private boolean maxCapacityReached (){
            if (maxDishes > super.getDishwasherCapacity()){
                throw new IllegalArgumentException("The maximum number of dishes is loaded");
            } else { return false; }

        }


        public void putDishes(String dishes, boolean maxCapacityReached) throws Exception{
            if (!isIs_running()) {
                if (isIs_empty()) {
                    System.out.println("Please put your dishes");
                } else {
                    if(is_clean){
                        throw new Exception("Dishes can not be loaded." +
                                "Please remove clean dishes  from the dishwasher.");
                    }else {
                        if (!maxCapacityReached){
                            System.out.println("Please put your dishes");
                        } else {
                            throw new Exception("Dishes can not be loaded." +
                                    "The maximum number of dishes is loaded." +
                                    "Please start washing program.");
                        }
                    }
                }
            } else {
                throw new Exception ("Dishes can not be loaded because the dishwasher is running now");
            }
        }

        public void getDishes(String dishes) throws Exception{
            if (!isIs_running()) {
                if (!isIs_empty()) {
                    System.out.println("...");
                    } else {
                    throw new Exception("Dishes can not be removed. The dishwasher is empty.");
                }
            }else {
                throw new Exception ("Dishes can not be removed because the dishwasher is running now");
            }
        }

        public void startWashing () throws Exception{
            if (!isIs_running()) {
                if (!isIs_empty()) {
                    System.out.println("Washing is started");
                }else {
                    throw new Exception("Washing can not be started. The dishwasher is empty.");
                }
            }else{
                throw new Exception("Washing can not be started. The dishwasher is already running");
            }
        }

         public void stopWashing () throws Exception{
              if (isIs_running()) {
                  System.out.println("Washing is stopped");
                  }else {
                        throw new Exception("Washing can not be stopped. The dishwasher is not running.");
                   }

         }
    public static void main(String[] args){

    }

}
