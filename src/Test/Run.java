package Test;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] staff = new Staff[0];
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm Nhân Viên");
            System.out.println("2. Xóa Nhân Viên");
            System.out.println("3.Hiển Thị Nhân Viên");
            System.out.println("4.Sửa Nhân Viên");
            int number = sc.nextInt();

            switch (number){
                case 1:
                    staff = Controller.addStaff(staff);
                    break;
                case 2:
                    staff = Controller.delete(staff);
                    break;
                case 3:
                    Controller.disPlay(staff);
                    break;
                case 4:
                    staff = Controller.edit(staff);
                    break;
                default:
                    System.out.println("Nhâp từ 1-4");
                    break;
            }
        }
    }
}
