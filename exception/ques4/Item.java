package com.yash.exception.ques4;

public class Item {
	private int itemId;
	private String itemName;
	private float price;
	private int maxNoOfItem;
	
	
	public Item() {
		super();
	}
	public Item(int itemId, String itemName, float price, int maxNoOfItem) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.maxNoOfItem = maxNoOfItem;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getMaxNoOfItem() {
		return maxNoOfItem;
	}
	public void setMaxNoOfItem(int maxNoOfItem) {
		this.maxNoOfItem = maxNoOfItem;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", maxNoOfItem=" + maxNoOfItem
				+ "]";
	}
	
	

}
