package QLSV;

import java.util.Scanner;
import java.util.ArrayList;

public class PhuongThuc {
    validate validate = new validate();
    ArrayList<Studen> arraySV = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public Studen inPutInFo() {
        System.out.println("Nhập mã sinh viên :");
        String maSinhVien = validate.checkMaSinhVien();
        System.out.println("Nhập họ và tên ");
        String hoVaten = scanner.nextLine();
        System.out.println("Nhập tuổi ");
        int tuoi = validate.checkTuoi();
        System.out.println("Nhập giới tính: ");
        String gioiTinh = validate.checkGioiTinh();
        System.out.println("Nhập địa chỉ :");
        String diaChi = scanner.nextLine();
        System.out.println("Nhâp điểm trung bình ");
        double diemTrungBinh = validate.checkDiemTrungBinh();

        Studen studen = new Studen(maSinhVien, hoVaten, tuoi, gioiTinh, diaChi, diemTrungBinh);
        arraySV.add(studen);
        return studen;
    }

    public void showInfo() {
        for (Studen sv : arraySV) {
            System.out.println(sv);
        }
    }

    public void showMenu() {
        System.out.println("-------MENU-------");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Sửa");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào File");
        System.out.println("8. Thoát");

    }

    public void update() {
        System.out.println("Nhập mã sinh vien muốn xóa");
        String maSinhVien = String.valueOf(Integer.parseInt(scanner.nextLine()));
        for (int i = 0; i < arraySV.size(); i++) {
            if (arraySV.get(i).getMaSinhVien().equals(maSinhVien)) {
                arraySV.set(i, inPutInFo());
            }

        }
    }

    public void delete() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        String maSinhvien = String.valueOf(Integer.parseInt(scanner.nextLine()));
        for (int i = 0; i < arraySV.size(); i++) {
            if (arraySV.get(i).getMaSinhVien().equals(maSinhvien)) {
                arraySV.clear();
            } else {
                System.out.println("mã sản phẩm không tồn tại");
            }

        }
    }

    public void ascending() {
        Studen temp;
        for (int i = 0; i < arraySV.size() - 1; i++) {
            for (int j = i + 1; j < arraySV.size(); j++) {
                if (arraySV.get(i).getTuoi() > arraySV.get(j).getTuoi()) {
                    temp = arraySV.get(i);
                    arraySV.set(i, arraySV.get(j));
                    arraySV.set(j, temp);
                }
            }
        }
        showInfo();

    }

    public void ReadFromFile1() {
        arraySV = io.read();
    }


    public void WriteToFile1() {

        io.write(arraySV);
    }


}

