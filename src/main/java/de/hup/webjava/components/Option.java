package de.hup.webjava.components;

public class Option extends Component {
	public Option(String content) {
		super("option", content);
		setAttribute("value", content);
	}

	public void setSelected(boolean selected) {
		setAttribute("selected", selected);
	}
}
