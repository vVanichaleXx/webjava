package de.hup.webjava.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Component {
	private final Tag tag;
	private final Collection<Component> components;

	/**
	 * test
	 * @param name
	 */
	protected Component(String name) {
		this.tag = new Tag(name);
		this.components = new ArrayList<>();
	}

	protected Component(String name, String content) {
		this.tag = new Tag(name);
		this.components = new ArrayList<>(List.of(new Fragment(content)));
	}

	protected Component(String name, Component... components) {
		this.tag = new Tag(name);
		this.components = new ArrayList<>(List.of(components));
	}

	public String toHtm() {
		return tag.toHtm(components.stream().map(Component::toHtm).collect(Collectors.joining("")));
	}

	void setAttribute(String key, String value) {
		tag.setAttribute(key, value);
	}

	void setAttribute(String key, boolean value) {
		tag.setAttribute(key, value);
	}

	public void addClassNames(String... classNames) {
		tag.addClassNames(classNames);
	}

	public void setId(String id) {
		tag.setAttribute("id", id);
	}

	public void setStyle(String style) {
		tag.setAttribute("style", style);
	}

	public void role(String role) {
		tag.setAttribute("role", role);
	}
}
