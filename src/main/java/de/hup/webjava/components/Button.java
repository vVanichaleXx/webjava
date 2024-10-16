package de.hup.webjava.components;

public class Button extends Component {
	public Button(String content) {
		super("button", content);
	}

	public void addClickListener() {
		setAttribute("onclick", "a();");
	}
}
