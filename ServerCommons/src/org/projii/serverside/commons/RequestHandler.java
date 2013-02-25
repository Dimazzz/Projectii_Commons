package org.projii.serverside.commons;

import org.jboss.netty.channel.Channel;
import org.projii.commons.net.InteractionMessage;

public interface RequestHandler {
    void handle(InteractionMessage request, Channel channel);
}
