package de.hup.webjava.components;

public class Label extends Component {
	public Label(String content) {
		super("label", content);
	}

	public void setFor(String htmFor) {
		setAttribute("for", htmFor);
	}
}