import java.util.Scanner;

public class MotelRoom  {
    private double soNgaytro;
    private String loaiPhongTro;
    private double giaPhong;
    private People people = new People();

    public MotelRoom(double soNgaytro, String loaiPhongTro, double giaPhong, People people) {
        this.soNgaytro = soNgaytro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
        this.people = people;
    }

    public MotelRoom() {
    }

    public double getSoNgaytro() {
        return soNgaytro;
    }

    public void setSoNgaytro(double soNgaytro) {
        this.soNgaytro = soNgaytro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    public void inputInfoRoom(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("so ngay tro");
        this.soNgaytro=scanner.nextDouble();
        System.out.println("loai phong tro");
        this.loaiPhongTro=scanner.nextLine();
        System.out.println("gia phong");
        this.giaPhong=scanner.nextDouble();
        this.people.inputPersoninfo();
    }
    public void showInpuInfoRoom(){
        System.out.printf("so ngay tro %s","loai phong %s","gia phong %s \n",this.soNgaytro,this.loaiPhongTro,this.giaPhong);
    }
    @Override
    public String toString() {
        return "MotelRoom{" +
                "soPhongtro=" + soNgaytro +
                ", loaiPhongTro='" + loaiPhongTro + '\'' +
                ", people=" + people +
                '}';
    }
}

