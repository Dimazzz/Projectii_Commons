package org.projii.serverside.commons;

import org.jai.BSON.BSONDocument;
import org.jai.BSON.BSONSerializer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;
import org.projii.commons.net.Response;

public class MessageEncoder extends SimpleChannelDownstreamHandler {
    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        Response message = (Response) e.getMessage();
        BSONDocument marshaledMessage = BSONSerializer.serialize(message);
        Channels.write(ctx, e.getFuture(), marshaledMessage);
    }


}
