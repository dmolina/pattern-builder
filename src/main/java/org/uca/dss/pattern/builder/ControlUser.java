package org.uca.dss.pattern.builder;

public class ControlUser {
	Avatar avatar;
	String name;
	
	public ControlUser(String name) {
		avatar = new Avatar();
		this.name = name;
	}
	
	public Avatar getAvatar() {
		return avatar;
	}
	@Override
	public String toString() {
		return "User '" +name +"' has appearance\n'" +avatar.toString()+"'\n";
	}
	
}
