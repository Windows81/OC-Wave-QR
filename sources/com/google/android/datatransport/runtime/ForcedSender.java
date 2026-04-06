package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

public final class ForcedSender {
    public static void a(Transport transport, Priority priority) {
        if (transport instanceof TransportImpl) {
            TransportRuntime.c().e().u(((TransportImpl) transport).d().f(priority), 1);
            return;
        }
        Logging.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", transport);
    }
}
