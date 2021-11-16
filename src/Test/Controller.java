package Test;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    public static Staff[] addStaff (Staff[] staff){
        Staff staff1 = create();

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

    public static int findId(Staff[]staff){
        System.out.println("Nhập id ");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < staff.length; i++) {
            if (id == staff[i].getId()){
                index = i;
                return index;
            }
        }return index;
    }

    public static Staff[] delete(Staff[] staff) {
        int index = findId(staff);
        if (index >= 0) {
            for (int i = index; i < staff.length - 1; i++) {
                staff[i] = staff[i + 1];
            }
            Staff[] newStaff = new Staff[staff.length - 1];
            for (int i = 0; i < newStaff.length; i++) {
                newStaff[i] = staff[i];
            }
            return newStaff;
        }
        return null;
    }

    public static Staff[] edit(Staff[] staff){
        int index = findId(staff);
        if (index >= 0){
            Staff staff1 = create();
            staff[index].setAddress(staff1.getAddress());
            staff[index].setName(staff1.getName());
            staff[index].setAge(staff1.getAge());
            staff[index].setPhoneNumber(staff1.getPhoneNumber());
            return staff;
        }
        return null;
    }

    public static Staff create(){
        System.out.println("Nhập tên:");
        String name = sc.next();
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        System.out.println("Nhập dịa chỉ:");
        String address = sc.next();
        System.out.println("Nhập số điện thoại:");
        String phoneNumber = sc.next();
        return new Staff(phoneNumber,name,address,age);
    }


}
