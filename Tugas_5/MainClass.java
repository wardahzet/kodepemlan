package Tugas_5;

public class MainClass {
    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming",19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan",20, "081111111111");
        CarRider ling = new CarRider("Ling'er",31,"081222222222");
        CarRider li = new CarRider("Zhong Li",27,"081333333333");

        CarData data = new CarData();
        data.addCar("SUV","N 1111 AB","Honda");
        data.addCar("SPORT","N 2222 AB","SSC Tuatara");
        data.addCar("TRUCK","N 3333 AB","Suzuki");
        data.addCar("SEDAN","N 4444 AB","Yamaha");

        data.listOfCar();

        RentArchive archive = new RentArchive();
        archive.rent(ming,data.carList.get(1),9);
        archive.rent(youhan,data.carList.get(0),3);
        archive.rent(ling,data.carList.get(1),1);
        archive.rent(li,data.carList.get(3),7);

        System.out.println();
        archive.info();
    }
}
