class ParkingSystem {
    int capacityBig = 0, capacityMedium = 0, capacitySmall = 0;
    public ParkingSystem(int big, int medium, int small) {
        capacityBig = big;
        capacityMedium = medium;
        capacitySmall = small;
    }
    
    public boolean addCar(int carType) {
        boolean flag = true; 
        if(carType == 1){
            if(capacityBig > 0)
                capacityBig--;
            else
                flag = false;
        }else if(carType == 2){
            if(capacityMedium > 0)
                capacityMedium--;
            else
                flag = false;
        }else if(carType == 3 ){
            if(capacitySmall > 0)
                capacitySmall--;
            else
                flag = false;
        }
        return flag;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */