class Item{
	String ItemName;
	int ItemNumber;
	float ItemPrice,ItemTotal;
	public Item(String name,int num,float price){
		ItemName = name;
		ItemNumber = num;
		ItemPrice = price;
		setTotal();
	}
	public void setTotal(){
		ItemTotal = ItemPrice*ItemNumber;
	}
	public void ShowItemInfo(){
		System.out.println(ItemName+"\t"+ItemPrice+"\t"+ItemNumber+"\t"+ItemTotal);
	}
}
