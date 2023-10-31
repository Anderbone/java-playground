package controlPlay;

public class breakPlay {

	private static void breakPlay() {
		boolean t = true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before the break.");
					if (t) break second; // break out of second block
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block.");
		}
	}

	public static void main(String[] args) {
		breakPlay();
	}
}
