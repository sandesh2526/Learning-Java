package solomon.app.domain;

public class Column
{
	private String name,id;

	public String getId()
	{
		return id;
	}
	
	public Column(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
