package main;

import core.App;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class Main {

	public static void main(String[] args) {
		try {
			App app = new App();

			TwitterFactory factory = new
			TwitterFactory(app.loadConfiguration());
			Twitter twitter = factory.getInstance();
			twitter.setOAuthAccessToken(app.loadAccessToken());
			
			Status status = twitter.updateStatus("Olá Twitter!");
			System.out.println("Tweet postado com sucesso! [" + status.getText() + "].");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
