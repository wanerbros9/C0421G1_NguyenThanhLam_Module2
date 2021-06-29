package case_study.services;

public class EmployeeManagement implements EmployeeService{
    @Override
    public void displayEmployee() {
        System.out.println("Hien thi danh sach nhan vien");
    }

    @Override
    public void createEmployee() {
        System.out.println("Them nhan vien");
    }

    @Override
    public void removeEmployee() {
        System.out.println("Xoa nhan vien");
    }
}
