package mifen;

public class mi {
	String theMa;
	int quantity;
	boolean likeSoup;
	mi(String M,int L,boolean Tang){
		this.theMa=M;
		this.quantity=L;
		this.likeSoup=Tang;
	}
	mi(){
		this("ţ��",2,true);
	}
	mi(String M,int L){
		this(M,L,false);
	}
	void check(){
		System.out.println("����"+this.theMa);
		System.out.println("��"+this.quantity);
		System.out.println("��"+this.likeSoup);
	}
	public static void main(String[] args) {
		mi f1 = new mi("ţ��",3,true);
		f1.check();
		mi f2 = new mi("ţ��",2);
		f2.check();
		mi f3 = new mi();
		f3.check();
	}

}
