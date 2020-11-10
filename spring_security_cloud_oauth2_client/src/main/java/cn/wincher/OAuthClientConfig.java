package cn.wincher;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * @author wincher
 * <p> cn.wincher <p>
 */
@Configuration
@EnableOAuth2Sso
public class OAuthClientConfig {
	@Bean
	public OAuth2RestTemplate oauth2RestTemplate(OAuth2ProtectedResourceDetails details, OAuth2ClientContext oAuth2ClientContext) {
		return new OAuth2RestTemplate(details, oAuth2ClientContext);
	}
}