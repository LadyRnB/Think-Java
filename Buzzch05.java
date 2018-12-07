public class Buzzch05 {
		public static void baffle(String blimp) {
		System.out.println(blimp);
		zippo("ping", -5);
		}
		public static void zippo(String quince, int flag) {
		if (flag < 0) {
		System.out.println(quince + " zoop");
		} else {
			//Executed just once afetr having added numbers in front of the first line of execution, & the second one!!
		System.out.println("1ik");
		baffle(quince);
		System.out.println("boo-wa-ha-ha");
		}
		}
		public static void main(String[] args) {
		zippo("2rattle", 13);
		}
		}
