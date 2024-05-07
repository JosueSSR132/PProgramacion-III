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
		// Puedes ajustar este valor según sea necesario

		    // Revisa las condiciones de colisión con los márgenes
		boolean colisionX = this.getX() < obstaculo.getX() + obstaculo.getLargo() &&
                this.getX() + this.getLargo() > obstaculo.getX();

// Verifica si hay colisión en el eje y
boolean colisionY = this.getY() < obstaculo.getY() + obstaculo.getAltura() &&
                this.getY() + this.getAltura() > obstaculo.getY();

// Retorna verdadero si hay colisión tanto en el eje x como en el eje y
return colisionX && colisionY;
    }
}