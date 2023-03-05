package main;

import java.util.ArrayList;

import clases.Canal;
import clases.Greeddit;
import clases.Post;
import clases.Usuario;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Canal> canales = new ArrayList<Canal>();
		ArrayList<Post> post = new ArrayList<Post>();
		Canal canal1 = new Canal("Radio", "UNA RADIO");
		Canal canal2 = new Canal("Radio2", "UNA RADIO2");
		Post post1 = new Post("POST1", new Usuario(), "HOLA", null, 0, null);
		post.add(post1);
		Canal canal3 = new Canal("Radio3", "UNA RADIO3", null, post);
		canales.add(canal1);
		canales.add(canal2);
		canales.add(canal3);
		Greeddit greddit = new Greeddit(canales);
		
		

		System.out.println(greddit);
	}

}
