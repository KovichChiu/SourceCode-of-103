class ItemP{
	private String ItemName;
	private int ItemNumber;
	private float ItemPrice,Subtotal;
	public ItemP(String iName,float iPrice,int iNumber){
		ItemName = iName;ItemPrice = iPrice;ItemNumber = iNumber;
		setSubtotal();
	}
	public void setSubtotal(){Subtotal = ItemPrice * ItemNumber;}
	public float getSubtotal(){return Subtotal;}
	public void Show(){
		System.out.println(ItemName+"\t"+ItemPrice+"\t"+ItemNumber+"\t"+Subtotal);
	}
}