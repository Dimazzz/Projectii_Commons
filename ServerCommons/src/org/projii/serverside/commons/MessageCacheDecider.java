package org.projii.serverside.commons;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;
import sun.misc.Cache;

import static org.jboss.netty.channel.Channels.write;

public class MessageCacheDecider extends SimpleChannelDownstreamHandler {

    private final Cache cache;

    public MessageCacheDecider(Cache cache) {
        this.cache = cache;
    }

    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        final Object initialMessage = e.getMessage();
        final Object cachedMessage = cache.get(initialMessage);
        Object message = initialMessage;
        if (cachedMessage == null) {
            ctx.setAttachment(initialMessage);
            message = cachedMessage;
        }
        write(ctx, e.getFuture(), message);
    }
}
