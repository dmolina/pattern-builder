package org.uca.dss.pattern.builder;

import java.awt.Color;

public class MainSystem {
	
	private void setDefaultAvatar(ControlUser user, Avatar.Sex sex) {
		Avatar avatar;
		
		user.getAvatar().setHair(Avatar.Hair.BLACK);
		user.getAvatar().setSex(sex);
		
		avatar = user.getAvatar();
		avatar.setWeight(60);
		avatar.setHeight(160);
		avatar.setColorEyes(Color.BLACK);
	}
	private ControlUser[] defineUsers() {
		ControlUser user1 = new ControlUser("Bob");
		setDefaultAvatar(user1, Avatar.Sex.MAN);
		ControlUser user2 = new ControlUser("Alice");
		setDefaultAvatar(user2, Avatar.Sex.WOMAN);
		
		ControlUser users[] = new ControlUser[2];
		users[0] = user1;
		users[1] = user2;
		return users;
	}
	
	private void drawUser(ControlUser user) {
		System.out.println("Pinta ojos : " +user.getAvatar().getColorEyes().toString());
		System.out.println("Color : " +user.getAvatar().getColorSkin().toString());
		
		System.out.println("Altura Pintado: ");
		
		// For each 50 cms it put an X
		for (int i=0; i < user.getAvatar().getHeight(); i+= 50) {
			System.out.println("X");
		}
		
		System.out.println("Y pelo : " +user.getAvatar().getHair());	
	}
	
	public static void main(String[] args) {
		MainSystem main = new MainSystem();
		ControlUser users[] = main.defineUsers();
	
		// Now I draw them
		for (ControlUser user: users) {
			main.drawUser(user);
		}
	}
	

}
