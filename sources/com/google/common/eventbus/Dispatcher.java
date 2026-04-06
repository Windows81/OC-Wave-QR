package com.google.common.eventbus;

import com.google.common.collect.Queues;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    public static final class ImmediateDispatcher extends Dispatcher {

        /* renamed from: a  reason: collision with root package name */
        public static final ImmediateDispatcher f28711a = new ImmediateDispatcher();
    }

    public static final class LegacyAsyncDispatcher extends Dispatcher {

        public static final class EventWithSubscriber {
        }
    }

    public static final class PerThreadQueuedDispatcher extends Dispatcher {

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$1  reason: invalid class name */
        public class AnonymousClass1 extends ThreadLocal<Queue<Event>> {
            /* renamed from: a */
            public Queue initialValue() {
                return Queues.a();
            }
        }

        /* renamed from: com.google.common.eventbus.Dispatcher$PerThreadQueuedDispatcher$2  reason: invalid class name */
        public class AnonymousClass2 extends ThreadLocal<Boolean> {
            /* renamed from: a */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        public static final class Event {
        }
    }
}
