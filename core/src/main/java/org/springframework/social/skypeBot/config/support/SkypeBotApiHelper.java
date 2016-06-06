package org.springframework.social.skypeBot.config.support;

import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.skypeBot.api.SkypeBot;

/**
 * Support class for JavaConfig and XML configuration support.
 * Creates an API binding instance for the current user's connection.
 * @author Anton Leliuk
 */
public class SkypeBotApiHelper implements ApiHelper<SkypeBot> {

    private final UsersConnectionRepository usersConnectionRepository;

    private final UserIdSource userIdSource;

    public SkypeBotApiHelper(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
        this.usersConnectionRepository = usersConnectionRepository;
        this.userIdSource = userIdSource;
    }

    @Override
    public SkypeBot getApi() {
        Connection<SkypeBot> connection = usersConnectionRepository
                .createConnectionRepository(userIdSource.getUserId())
                .findPrimaryConnection(SkypeBot.class);
        return connection != null ? connection.getApi() : null;
    }
}
