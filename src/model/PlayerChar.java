package model;

import javafx.scene.canvas.GraphicsContext;

public class PlayerChar extends Entity{
	public static boolean isDestroy;
	public static int moveSpeed;
	public static int life,colorType;
	public PlayerChar(int x, int y) {
		//Fill in here
		super(x,y);
		life = 5;
		isDestroy = false;
		z = 2;
		
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		if(colorType == 0){
			gc.drawImage(RenderableHolder.playerChar[0], x, y);
		}else if(colorType == 1){
			gc.drawImage(RenderableHolder.playerChar[1], x, y);
		}else if(colorType == 2){
			gc.drawImage(RenderableHolder.playerChar[2], x, y);
		}
		
	}

	@Override
	public boolean isDestroy() {
		// TODO Auto-generated method stub
		return isDestroy;
	}
	
}
