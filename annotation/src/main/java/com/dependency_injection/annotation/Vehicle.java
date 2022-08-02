package com.dependency_injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Vehicle implements Movable {

	@Autowired
	@Qualifier("truck")
Movable m ;
	
	public Vehicle() {
		
	}

	public Movable getM() {
		return m;
	}

	public void setM(Movable m) {
		this.m = m;
	}
	

	public Vehicle(Movable m) {
		// TODO Auto-generated method stub
		m.move_left();
		m.move_right();
	}

	public void move_right() {
		// TODO Auto-generated method stub
		
	}

	public void move_left() {
		// TODO Auto-generated method stub
		
	}


}
