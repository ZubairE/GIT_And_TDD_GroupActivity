package za.ac.cput;

public class NewCar {

        private String CarName;
        private String ModelYear;
        private int CarLitres;

        public NewCar() {
            this.CarName = "";
            this.ModelYear = "";
            this.CarLitres = 0;

        }

        public String getCarName() {
            return CarName;
        }

        public String getModelYear() {
            return ModelYear;
        }

        public void setModelYear(String modelYear) {
            ModelYear = modelYear;
        }

        public int getCarLitres() {
            return CarLitres;
        }

        public void setCarLitres(int carLitres) {
            CarLitres = carLitres;
        }

        public void setCarName(String carName) {
            CarName = carName;
        }

    @Override
    public String toString() {
        return "NewCar{" +
                "CarName='" + CarName + '\'' +
                ", ModelYear='" + ModelYear + '\'' +
                ", CarLitres=" + CarLitres +
                '}';
    }
}



