package _10_list.bai_tap.ArrayList;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Student a = new Student(1, "Lam");
            Student b = new Student(2, "Huy");
            Student c = new Student(3, "Tu");
            Student d = new Student(4, "Kha");
            Student e = new Student(5, "Minh");
            Student f = new Student(6, "Dung");

            MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
            MyArrayList<Student> newMyArrayList = new MyArrayList<>();


            studentMyArrayList.add(a);
            studentMyArrayList.add(b);
            studentMyArrayList.add(c);
            studentMyArrayList.add(d);
            studentMyArrayList.add(e);
//            studentMyArrayList.add(f, 2);
//            studentMyArrayList.size();
//            System.out.println(studentMyArrayList.size());
//            System.out.println(studentMyArrayList.get(2).getName());
//            System.out.println(studentMyArrayList.indexOf(f));
//            System.out.println(studentMyArrayList.contains(f));
//            for (int i = 0;i<studentMyArrayList.size();i++){
//                Student student = (Student) studentMyArrayList.elements[i];
//                System.out.print(student.getId()+"");
//                System.out.println(student.getName());
//            }
            newMyArrayList = studentMyArrayList.clone();
            newMyArrayList.remove(0);
            for (int i =0;i< newMyArrayList.size();i++){
                System.out.println(newMyArrayList.get(i).getName());
            }
        }
    }
}
