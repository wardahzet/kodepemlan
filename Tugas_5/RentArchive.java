package Tugas_5;

import java.util.ArrayList;

class RentArchive{
    private ArrayList<CarRent> rentData = new ArrayList<>();

    public void rent(CarRider rider, Car car, int rentDur){
        if (car.isStatus()){
            if (rider.getAge() >= 17){
                CarRent data = new CarRent(rider,car,rentDur);
                data.getCar().setStatus("disable");
                rentData.add(data);
                System.out.println("MOBIL BERHASIL DISEWA");
            }
            else System.out.println("MAAF, BELUM CUKUP UMUR");
        } else System.out.println("MAAF, MOBIL SUDAH DISEWA");
    }

    public void info(){
        System.out.println("----------------------------");
        System.out.println("    INFORMASI  PELANGGAN    ");
        System.out.println("----------------------------");
        for (CarRent data : rentData){
            System.out.println("NAMA PEMINJAM   : "+data.getRider().getName());
            System.out.println("TIPE MOBIL      : "+data.getCar().carType);
            System.out.println("NO.POLISI       : "+data.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : "+data.getRentDur());
            System.out.println("----------------------------");
        }
    }
}
