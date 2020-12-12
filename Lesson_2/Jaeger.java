public class Jaeger {
	private String modelName;
	private String mark;
	private String country;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry (String country) {
		this.country = country;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public boolean drift() {
		System.out.println("Связь между пилотами и Егерем установлена.");
		return true;
	}

	public void move() {
		System.out.println("Егерь движется.");
	}

	public void joinTheBattle() {
		System.out.println("Вступить в бой с Кайдзю.");
	}

	public boolean powerMove() {
		System.out.println("Активирован силовой прием.");
		return true;
	}
}