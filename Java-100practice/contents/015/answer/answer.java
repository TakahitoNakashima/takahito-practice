class answer {
	// フィールド
	private String name;
	
	// コンストラクタ
	public answer() {
		this.name = "no name";
	}
	public answer(String name) {
		this.name = name;
	}
	
	public static void main(String args[]) {
		String withoutName = new answer().name;
		String withName = new answer("Takahito").name;
		
		System.out.println(withoutName);
		System.out.println(withName);
	}	
}