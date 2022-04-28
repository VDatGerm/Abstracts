package advance.dev;

public class HinhTron extends Hinh {
	private double banKinh;
	
	public HinhTron(double bk) {
		super();
		this.banKinh = bk;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return (banKinh * 2 * Math.PI) ;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return banKinh * banKinh * Math.PI;
	}
}
	