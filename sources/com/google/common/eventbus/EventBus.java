package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public class EventBus {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f28712b = Logger.getLogger(EventBus.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final String f28713a;

    public static final class LoggingHandler implements SubscriberExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final LoggingHandler f28714a = new LoggingHandler();
    }

    public String toString() {
        return MoreObjects.c(this).j(this.f28713a).toString();
    }
}
