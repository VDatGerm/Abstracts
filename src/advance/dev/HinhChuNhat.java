package advance.dev;

public class HinhChuNhat extends Hinh {
	private double dai;
	private double rong;
	
	public HinhChuNhat(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return (dai + rong) * 2;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return (dai + rong);
	}

}

