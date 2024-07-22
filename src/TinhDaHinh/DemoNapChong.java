package TinhDaHinh;

public class DemoNapChong {

    public int tinhTong(int number1, int number2){
        return number1 + number2;
    }

    public int tingTong(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        DemoNapChong demoNapChong = new DemoNapChong();
        System.out.println(demoNapChong.tinhTong(3,5));
        System.out.println(demoNapChong.tingTong(5,6,8));
    }
}
