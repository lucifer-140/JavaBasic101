package Java_Keyword_static;

public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("admmin");
		Friend friend4 = new Friend("test");
		
		// System.out.println(friend1.numberOfFriends);
		// System.out.println(friend2.numberOfFriends);
		// System.out.println(friend3.numberOfFriends);
		// System.out.println(friend4.numberOfFriends);

        Friend.displayFriends();
	}
}

 