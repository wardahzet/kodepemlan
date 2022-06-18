package Tugas_5;

class Car {
    String carType;
    private final String polNum;
    private final String merk;
    private Boolean status;

    public Car(String carType, String polNum, String merk, Boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("disable")) this.status = false;
        else this.status = true;
    }
}
