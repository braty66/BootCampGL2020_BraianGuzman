package com.globallogic.app;

public class VariableInstancia {
		
	private int engPoints = 0;
	private int mathPoints = 0;
	private int phyPoints = 0;
	
	public VariableInstancia(int engPoints, int mathPoints, int phyPoints) {
		this.engPoints = engPoints;
		this.mathPoints = mathPoints;
		this.phyPoints = phyPoints;
	}

	public int getEngPoints() {
		return engPoints;
	}

	public void setEngPoints(int engPoints) {
		this.engPoints = engPoints;
	}

	public int getMathPoints() {
		return mathPoints;
	}

	public void setMathPoints(int mathPoints) {
		this.mathPoints = mathPoints;
	}

	public int getPhyPoints() {
		return phyPoints;
	}

	public void setPhyPoints(int phyPoints) {
		this.phyPoints = phyPoints;
	}
	
}
