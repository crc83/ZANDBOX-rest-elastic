package org.sbelei.restsample;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.ConsoleAppender;
import net.logstash.logback.appender.LogstashTcpSocketAppender;
import net.logstash.logback.encoder.LogstashEncoder;

@Component
public class LogstashConfiguration {

//
//
//    @PostConstruct
//    public void init() {
//        Logger rootLogger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
//        LoggerContext loggerContext = rootLogger.getLoggerContext();
//        //loggerContext.reset(); // shouldn't need to use that
//
//        ;
//
//        rootLogger.addAppender(configureConsloeAppender(loggerContext));
//        rootLogger.addAppender(configureLogstashAppender(loggerContext));
//        rootLogger.setLevel(Level.ALL);
//        rootLogger.warn("TEST");
//    }
//
//    private Appender<ILoggingEvent> configureConsloeAppender(LoggerContext loggerContext) {
//        ConsoleAppender ca = new ConsoleAppender<ILoggingEvent>();
//        ca.setContext(loggerContext);
//        return ca;
//    }
//
//    private LogstashTcpSocketAppender configureLogstashAppender(LoggerContext loggerContext) {
//        LogstashTcpSocketAppender logstashTcpSocketAppender = new LogstashTcpSocketAppender();
//        logstashTcpSocketAppender.setName("logstash");
//        logstashTcpSocketAppender.setContext(loggerContext);
//        logstashTcpSocketAppender.addDestination("localhost:9600");
//
//        LogstashEncoder encoder = new LogstashEncoder();
//        encoder.setContext(loggerContext);
//        encoder.start();
//
//        logstashTcpSocketAppender.setEncoder(encoder);
//        logstashTcpSocketAppender.start();
//        return logstashTcpSocketAppender;
//    }
}
