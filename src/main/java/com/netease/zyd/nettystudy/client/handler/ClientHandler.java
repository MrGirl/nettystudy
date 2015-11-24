package com.netease.zyd.nettystudy.client.handler;

import java.util.Date;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientHandler extends SimpleChannelHandler {

	private Logger logger = LoggerFactory.getLogger(ClientHandler.class);

	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		String content = (String) e.getMessage();
		System.out.println("" + new Date().toString() + "\n" + content);
		logger.debug("" + new Date().toString() + "\n" + content);
	}

	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {

		logger.debug("exception found", e.getCause());
	}

}