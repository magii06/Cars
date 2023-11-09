public class Vehicle implements Comparable<Vehicle>{
    private String make;
    private String model;
    private int yearOfProduction;

    abstract public void drive (double speed);

    @Override;
        public int compareTo(Vehicle v){
            if (this.getYearOfProduction()>v.getYearOfProduction())
                return 1;
            else if(this.getYearOfProduction()<v.getYearOfProduction())
                return -1;
            else
                return 0;
        }
        public String getMake() {
            return make;
        }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
