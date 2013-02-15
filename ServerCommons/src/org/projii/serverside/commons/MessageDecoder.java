package org.projii.serverside.commons;

import org.jai.BSON.BSONDocument;
import org.jai.BSON.BSONSerializer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import org.projii.commons.net.Request;

import java.util.Map;

public class MessageDecoder extends SimpleChannelUpstreamHandler {

    private final Map<Integer, Class> correspondenceTable;

    public MessageDecoder(Map<Integer, Class> correspondenceTable) {
        this.correspondenceTable = correspondenceTable;
    }

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        BSONDocument requestDocument = (BSONDocument) e.getMessage();
        Integer type = (Integer) requestDocument.get("type");
        Class requestClass = correspondenceTable.get(type);
        Request request = (Request) BSONSerializer.deserialize(requestClass, requestDocument);
        Channels.fireMessageReceived(ctx, request);
    }

}