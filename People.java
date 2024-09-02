//Object Class
public class People {
    String nama;
    double salary;

    // Constructor nama sama dgn Class//
    public People() {
        nama = "";
        salary = 0.0;

    }

    // Constructor Parameter
    public People(String nama, Double gaji) {
        this.nama = nama;
        this.salary = gaji;
    }

    //Getter-->mendapatkan nilai-->tipe data
    public String getNama() {
        return nama;
    }
    
    public double getSalary() {
        return salary;
    }
    //Setter-->mengubah nilai-->void
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
   
    //method tdk menghasilkan value
    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Salary : " + salary);
    }

    

}