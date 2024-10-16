package de.hup.webjava;

import de.hup.webjava.components.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * WebJava Framework<br>
 * ==================<br>
 * <br>
 * WebJava is a robust and versatile Java framework designed for the static generation of websites.
 * It provides an intuitive interface for creating raw `.htm` files, enabling users to build web pages
 * without requiring in-depth knowledge of traditional web technologies such as HTM, CSS, and JavaScript.<br>
 * <br>
 * The primary objective of WebJava is to simplify the process of website creation, making it accessible
 * to a broader audience, including those who may not have a technical background. Through its user-friendly
 * design, WebJava empowers users to generate static web pages with minimal effort, streamlining the development
 * process and reducing the complexity associated with modern web development.<br>
 * <br>
 * The WebJava framework is engineered to be lightweight yet powerful, ensuring that users can efficiently
 * produce high-quality websites that meet their specific needs. Whether for personal projects, small businesses,
 * or educational purposes, WebJava offers a reliable solution that caters to a wide range of web development
 * requirements.<br>
 * <br>
 * Project Information:<br>
 * ---------------------<br>
 * **Framework Name:** WebJava<br>
 * **Primary Language:** Java<br>
 * **Target Users:** Non-technical users and developers seeking simplicity<br>
 * **File Output:** Raw `.htm` files<br>
 * <br>
 * Legal Notice:<br>
 * -------------<br>
 * © 2024 Maksym. All rights reserved.<br>
 * <br>
 * The WebJava project and its associated intellectual property are the exclusive property of Maksym.<br>
 * This software is provided for inspection purposes to Ivan, under the supervision of Nick.<br>
 * Redistribution, modification, or commercial use of this software without prior written consent from Maksym<br>
 * is strictly prohibited. Any unauthorized use of the WebJava framework may result in legal action.<br>
 * <br>
 * This project is distributed as-is, with no warranty or guarantee of functionality or fitness for a particular
 * purpose. The author reserves all rights to the project, including the right to update, modify, or discontinue
 * the software at any time.
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		var bootstrap = """
			<head>
				<link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
				<script>
					function a() {
						alert("hello");
					}

					addEventListener("load", () => {
						let select = document.getElementsByClassName("custom-select")[0];

						select.addEventListener("change", event => {
							let value = select.options[select.selectedIndex].value;
							let color;

							if (value === "TRON") {
								document.write("<img src=\\"https://www.hup.de/wp-content/uploads/2023/08/hup-guides-2023.jpg\\" style=\\"width: 100%;height: 100%;\\">");
							} else if (value === "SOL") {
								color = "yellow";
							} else if (value === "BTS") {
								color = "green";
							}

							document.getElementsByTagName("body")[0].style.backgroundColor = color;
						});
					});
				</script>
			</head>""";







//THATS INPUT

		var options = new Option("TRON");
		var options1 = new Option("SOL");
		var options2 = new Option("BTS");

		var select = new Select(options, options1, options2);
		select.addClassNames("custom-select");
		select.setId("inputGroupSelect01");
		select.setStyle("width: 30%;     margin-bottom: 0.25rem;");

		var label = new Label("choose ur theme");

		label.addClassNames("input-group-text");
		label.setFor("inputGroupSelect01");
		label.setStyle("color: red;");

		var secondDiv = new Div(label);
		secondDiv.addClassNames("input-group-prepend");

		var footerInput = new Div(secondDiv, select);
		footerInput.setStyle("input-group");
		footerInput.addClassNames("input-group mb-3");
		footerInput.setStyle("text-align: center; width: 100%; position: absolute; bottom: 0; background-color: #007bff;");


		var buttonSimilarCoins = new Button("Similar Coins");    buttonSimilarCoins.addClassNames("btn btn-primary btn-sm");      buttonSimilarCoins.setStyle("border-radius: 15px; background-color: #20c997; margin-left: 0.5rem; margin-right: 0.5rem;");   buttonSimilarCoins.addClickListener();
		//  conDiv1.setStyle("margin-left: 0.5rem; margin-right: 0.5rem;");

		var buttonAnalyticsSay = new Button("Analytics Say");   buttonAnalyticsSay.addClassNames("btn btn-primary btn-sm");     buttonAnalyticsSay.setStyle("border-radius: 15px; background-color: #20c997; margin-left: 0.5rem; margin-right: 0.5rem;");
		//  conDiv2.setStyle("margin-left: 0.5rem; margin-right: 0.5rem;");

		var buttonAboutThisCrypto = new Button("About this Coin");  buttonAboutThisCrypto.addClassNames("btn btn-primary btn-sm");    buttonAboutThisCrypto.setStyle("border-radius: 15px; background-color: #20c997; margin-left: 0.5rem; margin-right: 0.5rem;");
		//  conDiv3.setStyle("margin-left: 0.5rem; margin-right: 0.5rem;");

		var buttonNews = new Button("News");        buttonNews.addClassNames("btn btn-primary btn-sm");     buttonNews.setStyle("background-color: red;");  buttonNews.setStyle("border-radius: 15px; background-color: #20c997; margin-left: 0.5rem; margin-right: 0.5rem;");
		//  conDiv4.setStyle("margin-left: 0.5rem; margin-right: 0.5rem;");

		var buttonToStats = new Button("today's  stats"); 		buttonToStats.addClassNames("btn btn-primary btn-sm");    buttonToStats.setStyle("background-color: red;");  buttonToStats.setStyle("border-radius: 15px; background-color: #20c997; margin-left: 0.5rem; margin-right: 0.5rem;");


		var containerForUserMenu = new Div(buttonToStats, buttonNews,buttonSimilarCoins, buttonAboutThisCrypto, buttonAnalyticsSay);
		containerForUserMenu.addClassNames();

		var userMenu = new Div(containerForUserMenu);
		userMenu.addClassNames("container"); userMenu.setStyle("display: flex; justify-content: center; padding-top: 0rem; background-color: #28a745");


		var div = new Div(userMenu, footerInput);

		select.setId("inputGroupSelect01");


		IO.createFile(bootstrap + div.toHtm());
	}
}
