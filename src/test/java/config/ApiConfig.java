package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:api.properties",
        "file:~/project.properties"
})
public interface ApiConfig extends Config {

    @Key("token.secret.project")
    String token();

    @Key("base.url")
    String baseUrl();
}
