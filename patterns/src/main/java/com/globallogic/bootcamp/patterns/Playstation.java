package com.globallogic.bootcamp.patterns;

public class Playstation {

	
		private Game videoGame;
		
		public Playstation(Game game) {
			videoGame = game;
		}
		
		
		public void setGame(Game newGame) {
			
			this.videoGame= newGame;
		}
		
		public void askMygame() {
			
			if(videoGame.getTitle().isEmpty() == true) {
				System.out.println("Estoy vacio!");
			}else {
				System.out.println("El video juego que estoy corriendo es: " + videoGame.getTitle());
			}
			
		}
		
		
}
