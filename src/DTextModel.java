import java.awt.Color;
public class DTextModel extends DShapeModel {
	private String text;
	private String f;
	public DTextModel(){
		super();
	}
	public DTextModel(int x, int y, int width, int height){
		super.setX(x);
		super.setY(y);
		super.setWidth(width);
		super.setHeight(height);
		super.setColor(Color.GRAY);
	}
	public DTextModel(String text, String font){
		this.text = text;
		this.f = font;
	}
	public void setText(String text){
		this.text = text;
	}
	public String getText(){
		return this.text;
	}
	public void setFont(String font){
		this.f = font;
	}
	public String getFont(){
		return this.f;
	}
	public String toString(){
		return super.toString() +" "+text+" "+f;
	}
}