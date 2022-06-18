package Tugas_5;

import java.util.ArrayList;

class CarData{
    public ArrayList<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType,polNum,merk,true));
    }

    public void listOfCar(){
        System.out.println("----------------------------");
        System.out.println("        Daftar Mobil        ");
        System.out.println("----------------------------");
        for (Car cars : carList){
            System.out.println("TIPE MOBIL : "+cars.carType);
            System.out.println("NO. POLISI : "+cars.getPolNum());
            System.out.println("MERK MOBIL : "+cars.getMerk());
            System.out.println("----------------------------");
        }
        System.out.println();
    }
}
