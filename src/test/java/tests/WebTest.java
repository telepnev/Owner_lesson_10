package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class WebTest {

    @Test
    public void testWeb() {
        WebConfig config = ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());

        System.out.println(config.browserName());
        System.out.println(config.versionBrows());
        System.out.println(config.baseUrl());

        System.out.println(config.remoteURL());
        System.out.println(config.remoteBrowser());
        System.out.println(config.remoteVersionBrowser());
    }
}
