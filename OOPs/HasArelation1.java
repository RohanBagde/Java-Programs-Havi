package OOPs;

public class HasArelation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dc dc1 = new Dc();
		dc1.setHeroineName("gal");
		dc1.setHeroineName2("zendaya");
		Marvel marvel = new Marvel();
		marvel.setHeroName("cris evans");
		marvel.setHeroNAme1("jeremy renner");
		System.out.println(dc1.getHeroineName());
		System.out.println(dc1.getHeroineName2());
		System.out.println(marvel.getHeroName());
		System.out.println(marvel.getHeroNAme1());
		dc1.setHeroName3(marvel);
		System.out.println(dc1.getHeroName3().getHeroNAme1());

	}

}

class Marvel {
	private String HeroName;
	private String HeroNAme1;

	public String getHeroName() {
		return HeroName;
	}

	public void setHeroName(String heroName) {
		this.HeroName = heroName;
	}

	public String getHeroNAme1() {
		return HeroNAme1;
	}

	public void setHeroNAme1(String heroNAme1) {
		this.HeroNAme1 = heroNAme1;
	}

}

class Dc {
	private String HeroineName;
	private String HeroineName2;
	private Marvel HeroName3;

	public String getHeroineName() {
		return HeroineName;
	}

	public void setHeroineName(String heroineName) {
		HeroineName = heroineName;
	}

	public String getHeroineName2() {
		return HeroineName2;
	}

	public void setHeroineName2(String heroineName2) {
		HeroineName2 = heroineName2;
	}

	public Marvel getHeroName3() {
		return HeroName3;
	}

	public void setHeroName3(Marvel heroName3) {
		HeroName3 = heroName3;
	}
}