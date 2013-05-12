package org.projii.serverside.commons;

import org.jai.BSON.BSONDocument;
import org.jai.BSON.BSONEncoder;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;
import org.projii.commons.TimeLogger;

import java.nio.ByteBuffer;

import static org.jboss.netty.channel.Channels.write;

public class ProtocolEncoder extends SimpleChannelDownstreamHandler {
    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        TimeLogger.d("ProtocolEncoder: ", "I'v got a message");
        Object message = e.getMessage();
        if (ctx.getAttachment() == null) {
            BSONDocument document = (BSONDocument) message;
            ByteBuffer buffer = BSONEncoder.encode(document);
            message = ChannelBuffers.wrappedBuffer(buffer);
        }
        write(ctx, e.getFuture(), message);
        TimeLogger.d("ProtocolEncoder: ", "I'v send it to client");
    }
}
