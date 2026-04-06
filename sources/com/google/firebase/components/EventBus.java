package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class EventBus implements Subscriber, Publisher {

    /* renamed from: a  reason: collision with root package name */
    public final Map f29773a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue f29774b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f29775c;

    public EventBus(Executor executor) {
        this.f29775c = executor;
    }

    public synchronized void a(Class cls, Executor executor, EventHandler eventHandler) {
        try {
            Preconditions.b(cls);
            Preconditions.b(eventHandler);
            Preconditions.b(executor);
            if (!this.f29773a.containsKey(cls)) {
                this.f29773a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f29773a.get(cls)).put(eventHandler, executor);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void c() {
        Queue<Event> queue;
        synchronized (this) {
            try {
                queue = this.f29774b;
                if (queue != null) {
                    this.f29774b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (queue != null) {
            for (Event f2 : queue) {
                f(f2);
            }
        }
    }

    public final synchronized Set d(Event event) {
        Map map;
        try {
            map = (Map) this.f29773a.get(event.b());
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = d(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.j(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(com.google.firebase.events.Event r5) {
        /*
            r4 = this;
            com.google.firebase.components.Preconditions.b(r5)
            monitor-enter(r4)
            java.util.Queue r0 = r4.f29774b     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            r0.add(r5)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r5 = move-exception
            goto L_0x0034
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            java.util.Set r0 = r4.d(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.j r3 = new com.google.firebase.components.j
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.EventBus.f(com.google.firebase.events.Event):void");
    }
}
