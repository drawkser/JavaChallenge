package AccountWorld;

public class Product implements java.io.Serializable{
	
/** Attributes, the type selected was Strings because of the information used  */
	
	private String sku;
	private String name;
	private String description;
	
/** Methods */
	
	public Product() {		
	}
	
 /** Getters */	
	public String getSku ()
	{
		return sku;
	}
	public String getName()
	{
		return name;
	}
	public String getDescription()
	{
		return description;
	}
	
 /** Setters */
	public void setSku(String newSku)
	{
		sku=newSku;
	}
	public void setName(String newName)
	{
		sku=newName;
	}
	public void setDescription(String newDescription)
	{
		sku=newDescription;
	}
}
