package allegro;

import java.util.ArrayList;
import java.util.Date;

public class UserInfo {
	private int id;
	private String login;
	private String password;
	private ArrayList<ItemInfo> itemsInfo = new ArrayList<ItemInfo>();
	
	public UserInfo(String login, String password, ArrayList<ItemInfo> itemsInfo) {
		this.setLogin(login);
		this.setPassword(password);
		this.setItemsInfo(itemsInfo);
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setItemsInfo(ArrayList<ItemInfo> itemsInfo) {
		this.itemsInfo = itemsInfo;
	}

	public ArrayList<ItemInfo> getItemsInfo() {
		return itemsInfo;
	}

	public ItemInfo getItemInfo(String itemName){
		for (ItemInfo i : itemsInfo) {
			if(i.getItemName().equals(itemName)) return i;
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public class ItemInfo {
		private int id;
		private String itemName;
		private String ownersLogin;
		private Date from;
		private Date till;
		
		public ItemInfo(String itemName,String ownersLogin, Date from, Date till) {
			this.setItemName(itemName);
			this.setOwnersLogin(ownersLogin);
			this.setFrom(from);
			this.setTill(till);
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemName() {
			return itemName;
		}

		public void setFrom(Date from) {
			this.from = from;
		}

		public Date getFrom() {
			return from;
		}

		public void setTill(Date till) {
			this.till = till;
		}

		public Date getTill() {
			return till;
		}

		public void setOwnersLogin(String ownersLogin) {
			this.ownersLogin = ownersLogin;
		}

		public String getOwnersLogin() {
			return ownersLogin;
		}

		public int getId() {
			return id;
		}
	}
}
