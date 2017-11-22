package variables;

public class XString extends Variable {
	String name;
	String value;

	public XString(String name, String value){
		this.name = name;
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}
}
