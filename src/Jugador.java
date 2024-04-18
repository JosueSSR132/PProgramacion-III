import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Jugador {
    int x;
    int y;
    int largo;
    int altura;
    String color;

    public Jugador(int x, int y, int largo, int altura, String color) {
        this.x = x;
        this.y = y;
        this.largo = largo;
        this.altura = altura;
        this.color = color;
    }

    public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLargo() {
		return largo;
	}

	public int getAltura() {
		return altura;
	}

	public String getColor() {
		return color;
	}

	public void dibujar(Graphics g) {
        Graphics2D graficos2d = (Graphics2D) g;
        graficos2d.setColor(Color.decode(this.color));
        graficos2d.fillRect(this.x, this.y, this.largo, this.altura);
    }
	
	public boolean colisiona(Jugador obstaculo) {
        if (this.getX() > obstaculo.getX() + obstaculo.getLargo()) {
            return false; 
        }
        if (this.getX() + this.getLargo() < obstaculo.getX()) {
            return false; 
        }
        if (this.getY() > obstaculo.getY() + obstaculo.getAltura()) {
            return false; 
        }
        if (this.getY() + this.getAltura() < obstaculo.getY()) {
            return false; 
        }
        
        return true;
    }
}