class Product {
	private String name;
	private double price;
	private static int scanCode = 1000;//编号
	private int num;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		scanCode++;
	}

	public String getName() {
		return name;
	}

	public int getScanCode() {
		return scanCode;
	}

	public void changePrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getinfo() {
		return ("-----产品信息-----\n" + "名称：" + name + "\n编码：" + scanCode + "\n价格：" + price + "元");
	}

	public boolean buy(int num) {
		if (num > this.num) {
			return false;
		} else {
			this.num = this.num - num;
			return true;
		}
	}
}