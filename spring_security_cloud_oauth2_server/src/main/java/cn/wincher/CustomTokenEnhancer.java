package cn.wincher;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wincher
 * <p> cn.wincher <p>
 */
public class CustomTokenEnhancer implements TokenEnhancer {
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
		Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();
		if (null != userAuthentication) {
			Object principal = userAuthentication.getPrincipal();
			Map<String, Object> additionalInfo = new HashMap<>();
			additionalInfo.put("userDetails", principal);
			((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(additionalInfo);
		}
		return oAuth2AccessToken;
	}
}
