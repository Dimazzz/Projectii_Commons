package org.projii.serverside.commons;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;
import sun.misc.Cache;

import static org.jboss.netty.channel.Channels.write;

public class MessageCacher extends SimpleChannelDownstreamHandler {

    private final Cache cache;

    public MessageCacher(Cache cache) {
        this.cache = cache;
    }

    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        final Object message = e.getMessage();
        final Object initialMessage = ctx.getAttachment();
        if (initialMessage != null) {
            cache.put(initialMessage, message);
        }
        write(ctx, e.getFuture(), message);
    }
}
