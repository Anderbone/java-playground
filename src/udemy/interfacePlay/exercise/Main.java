package udemy.interfacePlay.exercise;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Player p = new Player("jiyu", 1,3);
		p.write().forEach(System.out::println);
		ArrayList<String> a = (ArrayList<String>) p.write();
		a.set(0, "name='abbie'");
		p.read(a);
		System.out.println(p);

		Monster m = new Monster("aa", 2, 5);
    System.out.println(m);
	}
}
