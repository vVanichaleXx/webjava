package de.hup.webjava.components;

import java.util.*;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;

public class Tag {
	private final String name;
	private final List<String> classNames;
	private final Map<String, String> attrs;

	public Tag(String name) {
		this.name = name;
		this.classNames = new ArrayList<>();
		this.attrs = new HashMap<>();
	}

	public void addClassNames(String... classNames) {
		this.classNames.addAll(List.of(classNames));
	}

	public void setAttribute(String key, String value) {
		this.attrs.put(key, value);
	}

	public void setAttribute(String key, boolean value) {
		if (value) {
			this.attrs.put(key, "");
		} else {
			this.attrs.remove(key);
		}
	}

	public String toHtm(String innerHtm) {
		return format(
			"<%s class=\"%s\" %s>%s</%s>",
			name,
			String.join(" ", classNames),
			attrs
				.entrySet()
				.stream()
				.map(entry -> format("%s=\"%s\"", entry.getKey(), entry.getValue()))
				.collect(joining(" ")),
			innerHtm,
			name
		);
	}
}
