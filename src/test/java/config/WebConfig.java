package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebConfig extends Config {

    @DefaultValue("FIREFOX")
    @Key("webdriver.browser.name")
    BrowserName browserName();

    @Key("webdriver.browser.version")
    String versionBrows();

    @Key("base.url")
    String baseUrl();

    @Key("webdriver.remote.url")
    URL remoteURL();

    @Key("webdriver.remote")
    boolean remote();

    @Key("remote.browser.name")
    String remoteBrowser();

    @Key("remote.browser.version")
    String remoteVersionBrowser();
}
