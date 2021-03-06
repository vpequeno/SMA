package pt.ual.meit.Model;

import java.util.ArrayList;
import java.util.List;

public class PublicObject {
	private Integer id; 
	private String text;
	private String icon;
	private String type;
	private String aBasic;
	private boolean flgPathExp;

	private List<NodesPublicObject> nodes = new ArrayList<>();

	private List<AssertivePublicObject> listA = new ArrayList<>();

	public PublicObject() {
		super();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List getNodes() {
		return nodes;
	}

	public void setNodes(List nodes) {
		this.nodes = nodes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AssertivePublicObject> getListA() {
		return listA;
	}

	public void setListA(List<AssertivePublicObject> listA) {
		this.listA = listA;
	}

	public String getaBasic() {
		return aBasic;
	}

	public void setaBasic(String aBasic) {
		this.aBasic = aBasic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the flgPathExp
	 */
	public boolean isFlgPathExp() {
		return flgPathExp;
	}

	/**
	 * @param flgPathExp the flgPathExp to set
	 */
	public void setFlgPathExp(boolean flgPathExp) {
		this.flgPathExp = flgPathExp;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	
}
