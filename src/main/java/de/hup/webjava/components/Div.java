package de.hup.webjava.components;

public class Div extends Component {
	public Div() {
		super("div");
	}

	public Div(String content) {
		super("div", content);
	}

	public Div(Component... components) {
		super("div", components);
	}

	public Div(String content, Component... components) {
		super("div", components);
	}
}
