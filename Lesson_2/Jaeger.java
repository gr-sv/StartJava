public class Jaeger {
	private String modelName;
	private String mark;
	private String country;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String country, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.country = country;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getCountry() {
		return country;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
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