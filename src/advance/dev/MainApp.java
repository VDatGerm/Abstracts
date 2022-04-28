package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinh h = new HinhTron(7);
		h.chuVi();		
		h.dienTich();
		System.out.println("Hinh Tron");
		System.out.println("Chu vi: " + h.chuVi());
		System.out.println("Dien tich: " + h.dienTich());

		Hinh h1 = new HinhChuNhat(5,7);
		h1.chuVi();
		h1.dienTich();
		System.out.println("-------------------");
		System.out.println("Hinh Chu Nhat");
		System.out.println("Chu vi: " + h1.chuVi());
		System.out.println("Dien tich: " + h1.dienTich());

		Hinh h2 = new HinhTamGiac(13, 6, 8, 7);
		h2.chuVi();
		h2.dienTich();
		System.out.println("-------------------");
		System.out.println("Hinh Tam Giac");
		System.out.println("Chu vi: " + h2.chuVi());
		System.out.println("Dien tich: " + h2.dienTich());

	}

}