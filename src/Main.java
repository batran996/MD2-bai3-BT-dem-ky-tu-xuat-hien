import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kyTu = 'a';
        int count = 0;
        System.out.println("nhap vào chuỗi bất kỳ");
        chuoi = scanner.nextLine();
        //////// duyet chuoi
        // System.out.println("nhập vào ký tự cần tìm");
        //kyTu = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("số lần ký tự " + kyTu + "xuất hiện là: " + count);
    }
}