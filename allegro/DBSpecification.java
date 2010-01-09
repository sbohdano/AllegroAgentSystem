package allegro;

public interface DBSpecification {

	public final static String UsersTable="users";
	public final static String LoginColumn="login";
	public final static String PasswordColumn="password";

	public final static String ItemsTable="items";
	public final static String ItemNameColumn="name";
	public final static String TrackedFormColumn="tracked_form";
	public final static String TrackedToColumn="tracked_to";
	public final static String OwnersLogin="owners_login";
	
	public final static String PriceDataTable= "prices";
	public final static String ItemIDColumn="item_id";
	public final static String DateColumn="date";
	public final static String Price="price";

}
