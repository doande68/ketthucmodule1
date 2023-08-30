import java.util.Scanner;

public class Baizalo {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

//        System.out.println("Hello World");
//        System.out.println("Hi ae");
//        String name = srt.nextLine();
//        System.out.println("Hello" + name);
//        int a = 5;
//        System.out.println(a);
//        int b = num.nextInt();
//        System.out.println(b);
//        int num1 = num.nextInt();
//        int num2 = num.nextInt();
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1/num2);
//        System.out.println(num1 % num2);
//       switch (name){
//           case "Đề":
//               System.out.println("Xin chào");
//               break;
//           case "20":
//               System.out.println("Tôi năm nay : ");
//       }

        //bai1;
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
//        if(a%b == 0){
//            System.out.println("Chia hết");
//        } else {
//            System.out.println("Không chia hết");
//        }
//        //bai2;
//        int age = num.nextInt();
//        if(age <= 15){
//            System.out.println("Đủ điều kiện vào lớp 10");
//        }else {
//            System.out.println("Không đủ điều kiện vào lớp 10");
//        }
//        //bai3;
//        int c = num.nextInt();
//        if(c >= 0){
//            System.out.println("Lớn hơn 0");
//        }else {
//            System.out.println("Nhỏ hơn 0");
//        }
//        //bai4
//         if(a < b ){
//             if(b < c){
//                 System.out.println("max = " + c);
//             }else {
//                 System.out.println("max = " + b);
//             }
//         }if(a<c){
//                 System.out.println("max = " + c);
//             }else {
//                 System.out.println("max = " + a);
//             }
//
//         //bai5
//        if(a >=80 && a <= 100){
//            System.out.println("Học sinh tốt");
//        }else if(a < 80 && a >=70){
//            System.out.println("Học sinh khá");
//        }else if(a < 70 && a >= 50){
//            System.out.println("Học sinh trung bình ");
//        }else if(a < 50 && a >= 0){
//            System.out.println("Học sinh yếu ");
//        }
//        //bai6
//toán tử
        // +-*%
//        System.out.println( a + b);
//        System.out.println(a - b );
//        System.out.println( a * b);
//        System.out.println(a / b );
//        System.out.println(a % b );
//       //Sử dụng =, +=, -=, *=, /=
//        System.out.println( a = b);
//        System.out.println(a += b );
//        System.out.println( a -= b);
//        System.out.println(a *= b );
//        System.out.println(a /= b );
//       //3. Sử dụng ++, --
//        System.out.println(a++);
//        System.out.println(b++);
//        // Sử dụng <, >, <=, >=, ==, !=
//        System.out.println( a > b);
//        System.out.println(a < b );
//        System.out.println( a >= b);
//        System.out.println(a <= b );
//        System.out.println(a == b );
//        System.out.println(a != b );
        //Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        double tempC = num.nextDouble();
        double tempF = tempC * 9/5 + 32 ;
        System.out.println(tempF);
        //baif2 :Chuyển từ mét sang feet: ft =m * 3.2808
        double met = num.nextDouble();
        double ft = met * 3.2808;
        System.out.println(ft);
        //bai3 : Tính diện tích hình vuông khi biết cạnh a
        System.out.println("Dien tich HV = "+(a*a));
        //bai 4 :Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
        System.out.println("Dien tich HCN = "+(a*b));
        //bai5 Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
        System.out.println("Dien tich TGV = "+(a*b)/2);
        //bai 6
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            System.out.println("phương trình có nghiệm" +(-b/a));
        }
        //bai7
        double delta, x1, x2, x;
        String result;
        delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Phuong trình vô số nghiệm";
                } else {
                    result = "Phương trình vô nghiệm";
                }
            } else {
                result = "Phương trình bậc nhất x = " + (-c / b);
            }
        } else {
            if (delta < 0) {
                result = "Phương trình vô nghiệm";
            } else if (delta == 0) {
                x = -b / (2 * a);
                result = "Phương trình có nghiệm duy nhất    x1 = x2 = " + x;
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                result = "Phương trình có 2 nghiệm phân biệt \nx1 = " + x1 + "\nx2 = " + x2;
            }
        }
        System.out.println(result);
        //bai 8
        if(a < 120 && a >0){
            System.out.println("Bạn đủ tuổi");
        }else {
            System.out.println("BẠn mé đủ tuổi");
        }
        // bai 9
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("tao thanh 1 tam giac");
        } else {
            System.out.println("khong tao thanh 1 tam giac");
        }
        // bai 10
        int sodien = num.nextInt();
        int giadien = 0 ;
        if(sodien < 20){
            giadien = sodien * 2 ;
            System.out.println("giá điện của bạn là");
        }
        if (sodien > 20 && sodien < 40) {
            giadien = sodien * 2;
            System.out.println("giá điện của e là");
        }
        if ( sodien > 50) {
            giadien = sodien * 2;
            System.out.println(" giá dienj của bạn là ");
        }
        //bai 11
        int doanhthu = num.nextInt();
        int thue = 0;
        if ( doanhthu <= 5 ){
            thue = doanhthu * 5/100 ;
            System.out.println("số tiền thuế mà bạn phải nộp là" + thue);
        }
        else  if ( doanhthu >= 15 && doanhthu >10){
             thue = doanhthu * 13/100;
            System.out.println("số tiền thuế mà bạn phải nộp là"+ thue);
        }
        else if ( doanhthu >= 50 && doanhthu >15) {
            thue = doanhthu * 35 / 100;
            System.out.println("số tiền thuế mà bạn phải nộp là" + thue);
        }

    }
}
