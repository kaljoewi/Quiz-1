package baseball_code;

public class BaseballStats {
	

	private int Hits;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int dbl;
	private int triple;
	private int HR;
	
	
	public BaseballStats(int hits, int aB, int bB, int hBP, int sF, int dbl, int triple, int hR) {
		super();
		Hits = hits;
		AB = aB;
		BB = bB;
		HBP = hBP;
		SF = sF;
		this.dbl = dbl;
		this.triple = triple;
		HR = hR;
	}
	public int getHits() {
		return Hits;
	}
	public void setHits(int hits) {
		Hits = hits;
	}
	public int getAB() {
		return AB;
	}
	public void setAB(int aB) {
		AB = aB;
	}
	public int getBB() {
		return BB;
	}
	public void setBB(int bB) {
		BB = bB;
	}
	public int getHBP() {
		return HBP;
	}
	public void setHBP(int hBP) {
		HBP = hBP;
	}
	public int getSF() {
		return SF;
	}
	public void setSF(int sF) {
		SF = sF;
	}
	public int getDbl() {
		return dbl;
	}
	public void setDbl(int dbl) {
		this.dbl = dbl;
	}
	public int getTriple() {
		return triple;
	}
	public void setTriple(int triple) {
		this.triple = triple;
	}
	public int getHR() {
		return HR;
	}
	public void setHR(int hR) {
		HR = hR;
	}
	
	public double BattingAverage() {
		double ba = Double.valueOf(this.Hits) / Double.valueOf(this.AB);
		return ba;
	}
	
	public double TB() {
		double singles = Double.valueOf(this.Hits) - Double.valueOf(this.dbl) - Double.valueOf(this.triple) - Double.valueOf(this.HR);
		double tb = singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR);
		return tb;
	}
	
	public double SLG() {
		double slg = this.TB() / Double.valueOf(this.AB);
		return slg;
	}
	
	public double OBP() {
		double obp = (Double.valueOf(this.Hits) + Double.valueOf(this.BB) + Double.valueOf(this.HBP)) / (Double.valueOf(this.AB) + Double.valueOf(this.BB) + Double.valueOf(this.HBP) + Double.valueOf(this.SF));
		return obp;
	}
	
	public double OBS() {
		double obp = this.OBP();
		double slg = this.SLG();
		double obs = obp + slg;
		return obs;
	}
}
