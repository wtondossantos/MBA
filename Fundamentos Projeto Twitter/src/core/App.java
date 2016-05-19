package core;

import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class App {

	public Configuration loadConfiguration(){
		ConfigurationBuilder builder = new ConfigurationBuilder();
		builder.setOAuthConsumerKey("x");
		builder.setOAuthConsumerSecret("x");
		return builder.build();
	}
	public AccessToken loadAccessToken(){
		String token = "1-x";
		String tokenSecret = "x";
		return new AccessToken(token, tokenSecret);
	}
}
