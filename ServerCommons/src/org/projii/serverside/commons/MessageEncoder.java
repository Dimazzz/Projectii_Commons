package org.projii.serverside.commons;

import org.jai.BSON.BSONSerializer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;

import static org.jboss.netty.channel.Channels.write;

public class MessageEncoder extends SimpleChannelDownstreamHandler {
    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        Object message = e.getMessage();
        if (ctx.getAttachment() != null) {
            message = BSONSerializer.serialize(message);
        }
        write(ctx, e.getFuture(), message);
    }
}
