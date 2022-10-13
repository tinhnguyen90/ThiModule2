package QLSV;

import java.util.Scanner;

public class validate {
        Scanner scanner = new Scanner(System.in);

        public String checkMaSinhVien(){
            while (true){
                try {
                    String maSinhVien = scanner.nextLine();
                    return maSinhVien;
                }catch (Exception e){
                    System.err.println("lỗi định dạng");
                }
            }
        }
        public int checkTuoi(){
            while (true){
                try {
                    int tuoi= Integer.parseInt(scanner. nextLine());
                    if(tuoi > 0 && tuoi <100 ) {
                        return tuoi;

                    }else {
                        System.out.println(" trừu tượng quá ");

                    }
                }catch (Exception e){
                    System.out.println("sai định dạng");
                }

            }

        }
        public String checkGioiTinh(){
            while (true){
                try {
                    String gioiTinh = scanner.nextLine();
                    if(gioiTinh.equals("nam")  || gioiTinh.equals("nu")){
                        return gioiTinh;
                    }else {
                        System.err.println("Giới tính không xác định");
                    }
                }catch (Exception e){
                    System.err.println("sai định dạng");;
                }
            }
        }
        public double checkDiemTrungBinh(){
            while (true){
                try {
                    double diemTrungBinh = Double.parseDouble(scanner.nextLine());
                    if(diemTrungBinh >=0 && diemTrungBinh <=10){
                        return diemTrungBinh;
                    }else {
                        System.err.println("Điểm không xác định");
                    }
                }catch (Exception e){
                    System.err.println("Sai định dạng");
                }
            }
        }
    }

