package Test;

import java.util.Scanner;

public class Controller {
    public static Staff[] addStaff (Staff[] staff){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên");
        String name = sc.next();
        System.out.println("Nhập Tuổi");
        int age = sc.nextInt();
        System.out.println("Nhập Địa chỉ");
        String address = sc.next();
        System.out.println("Nhập Số Điện Thoại");
        String phoneNumber = sc.next();

        Staff staff1 = new Staff(phoneNumber,name,address,age);

        Staff[] newStaff = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length; i++) {
            newStaff[i] = staff[i];
        }

        newStaff[newStaff.length -1] = staff1;
        return newStaff;
    }

    public static void disPlay(Staff[] staff){
        for (Staff st:staff) {
            System.out.println(st.toString());
        }
    }

    public static Staff[] delete(Staff[] staff){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < staff.length; i++) {
            if (id == staff[i].getId()){
                index = i;
            }
        }

        for (int i = index; i < staff.length-1 ; i++) {
            staff[i] = staff[i + 1];
        }

        Staff[] newStaff = new Staff[staff.length - 1];
        for (int i = 0; i < newStaff.length; i++) {
            newStaff[i] = staff[i];
        }
        return newStaff;
    }
    public static Staff[] edit(Staff[] staff){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id muốn sửa");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < staff.length; i++) {
            if (id == staff[i].getId()){
                index = i;
            }
        }

        System.out.println("Nhập lại tên:");
        String name = sc.next();
        System.out.println("Nhập lại tuổi:");
        int age = sc.nextInt();
        System.out.println("Nhập lại dịa chỉ:");
        String address = sc.next();
        System.out.println("Nhập lại số điện thoại:");
        String phoneNumber = sc.next();

        staff[index].setAddress(address);
        staff[index].setName(name);
        staff[index].setAge(age);
        staff[index].setPhoneNumber(phoneNumber);
        return staff;
    }
}
