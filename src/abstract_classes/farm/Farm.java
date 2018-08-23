package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	static Cow c;
	static Pig p;
	static Chicken ch;
	static Sheep s;
public static void main(String[] args) {
	c = new Cow();
	p = new Pig();
	ch = new Chicken();
	s = new Sheep();
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(c);
	farm.add(p);
	farm.add(ch);
	farm.add(s);
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).eat();
		farm.get(i).makeNoise();
	}

}
}
