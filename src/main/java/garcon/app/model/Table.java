package garcon.app.model;

/**
*
* @author Thomas Pokorny
*
*/
public class Table
{
	private int id;
	private int number;

	public void setId(int id){
		this.id = id;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getId(){
		return id;
	}

	public int getNumber(){
		return number;
	}
}
