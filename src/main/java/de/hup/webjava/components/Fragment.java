package de.hup.webjava.components;

public class Fragment extends Component {
	private final String content;

	public Fragment(String content) {
		super(null);

		this.content = content
			.replace("&", "&amp;")
			.replace("<", "&lt;")
			.replace(">", "&gt;");
	}

	@Override
	public String toHtm() {
		return content;
	}

	@Override
	public void addClassNames(String... classNames) {
		throw new IllegalStateException("fragment class name cannot be modified");
	}

	@Override
	public void setStyle(String style) {
		throw new IllegalStateException("fragment class name cannot be modified");
	}
}
