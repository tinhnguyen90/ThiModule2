package QLSV;
import java.io.*;
import java.util.ArrayList;

public class io {

    static File file = new File("tinh.txt");

    public static void write(ArrayList<Studen> sinhVien)
    {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Studen sv : sinhVien) {
                String s = sv.getMaSinhVien() +"," + sv.getHoVaTen()+ "," + sv.getTuoi() +"," + sv.getGioiTinh() + "," + sv.getDiaChi()+" "+ sv.getDiemTrungBinh();
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Studen> read() {
        ArrayList<Studen> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(", ");
                String maSinhVien = arr[0];
                String hoVaten = arr[1];
                double price = Double.parseDouble((arr[2]));
                int tuoi = Integer.parseInt(arr[3]);
                String gioiTinh = arr[4];
                String diaChi = arr[5];
                double diemTrungBinh = Double.parseDouble(arr[6]);

                Studen product = new Studen(maSinhVien,hoVaten, tuoi, gioiTinh,diaChi,diemTrungBinh);
                products.add(product);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}

