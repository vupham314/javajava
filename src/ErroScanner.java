public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào họ tên  : ");
		String hoten = input.nextLine();
		
		System.out.println("Nhập vào tuổi : ");
		int tuoi = input.nextInt();
		
		System.out.println("Nhập vào tên lớp  : ");
		String tenlop = input.nextLine();
		System.out.println(">> THÔNG TIN SINH VIÊN");
		System.out.println("Họ tên : "+hoten);
		System.out.println("Tuổi : "+tuoi);
		System.out.println("Tên lớp : "+tenlop);
	}
}
