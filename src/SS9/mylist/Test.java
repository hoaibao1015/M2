package SS9.mylist;

public class Test {
    public static void main(String[] args) {
        Student a = new Student(1, "Bao");
        Student b = new Student(2, "Nhan");
        Student c = new Student(3, "Tun");

        MyList<Student> Arraylist = new MyList<>();
        MyList<Student> newMyArrayList = new MyList<>();
        Arraylist.add(a);
        Arraylist.add(b);
        Arraylist.add(c, 1);
        Arraylist.Size();

        for (int i = 0; i < Arraylist.Size(); i++) {
            Student student = (Student) Arraylist.get(i);
            System.out.println("Ds MSV: " + student.getId());
            System.out.println("Ds tên SV: " + student.getName());
        }

        System.out.println("Ten sinh vien duoc lay tu danh sach: " + Arraylist.get(1).getName());
        System.out.println("Ma sinh vien duoc lay tu danh sach: " + Arraylist.get(2).getId());
        System.out.println("Tim kiem sinh vien : " + Arraylist.indexOf(b));
        System.out.println("Kiem tra co sinh vien: " + Arraylist.conntains(b));
        newMyArrayList = Arraylist.clone();
        System.out.println(" danh sách sinh viên tên ");
        for (int i = 0; i < newMyArrayList.Size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }

        Student student = Arraylist.remove(1);
        System.out.println(" danh sách sinh viên tên sau khi xóa ");
        for (int i = 0; i < Arraylist.Size(); i++) {
            System.out.println(Arraylist.get(i).getName());
        }
    }

}

