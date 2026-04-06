package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f29526b = Logger.getLogger(ListenerCallQueue.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final List f29527a;

    public interface Event<L> {
        void a(Object obj);
    }

    public static final class PerListenerQueue<L> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final Executor f29528A;

        /* renamed from: B  reason: collision with root package name */
        public final Queue f29529B;
        public final Queue C;
        public boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final Object f29530z;

        public synchronized void a(Event event, Object obj) {
            this.f29529B.add(event);
            this.C.add(obj);
        }

        public void b() {
            boolean z2;
            synchronized (this) {
                try {
                    if (!this.D) {
                        z2 = true;
                        this.D = true;
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z2) {
                try {
                    this.f29528A.execute(this);
                } catch (RuntimeException e2) {
                    synchronized (this) {
                        this.D = false;
                        Logger a2 = ListenerCallQueue.f29526b;
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(this.f29530z);
                        String valueOf2 = String.valueOf(this.f29528A);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 42 + valueOf2.length());
                        sb.append("Exception while running callbacks for ");
                        sb.append(valueOf);
                        sb.append(" on ");
                        sb.append(valueOf2);
                        a2.log(level, sb.toString(), e2);
                        throw e2;
                    }
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        public void run() {
            /*
                r10 = this;
            L_0x0000:
                r0 = 0
                r1 = 1
                monitor-enter(r10)     // Catch:{ all -> 0x002b }
                boolean r2 = r10.D     // Catch:{ all -> 0x001f }
                com.google.common.base.Preconditions.w(r2)     // Catch:{ all -> 0x001f }
                java.util.Queue r2 = r10.f29529B     // Catch:{ all -> 0x001f }
                java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x001f }
                com.google.common.util.concurrent.ListenerCallQueue$Event r2 = (com.google.common.util.concurrent.ListenerCallQueue.Event) r2     // Catch:{ all -> 0x001f }
                java.util.Queue r3 = r10.C     // Catch:{ all -> 0x001f }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x001f }
                if (r2 != 0) goto L_0x0024
                r10.D = r0     // Catch:{ all -> 0x001f }
                monitor-exit(r10)     // Catch:{ all -> 0x001c }
                return
            L_0x001c:
                r1 = move-exception
                r2 = r0
                goto L_0x0066
            L_0x001f:
                r2 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L_0x0066
            L_0x0024:
                monitor-exit(r10)     // Catch:{ all -> 0x001f }
                java.lang.Object r4 = r10.f29530z     // Catch:{ RuntimeException -> 0x002d }
                r2.a(r4)     // Catch:{ RuntimeException -> 0x002d }
                goto L_0x0000
            L_0x002b:
                r2 = move-exception
                goto L_0x006f
            L_0x002d:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.ListenerCallQueue.f29526b     // Catch:{ all -> 0x002b }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x002b }
                java.lang.Object r6 = r10.f29530z     // Catch:{ all -> 0x002b }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x002b }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x002b }
                int r7 = r6.length()     // Catch:{ all -> 0x002b }
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch:{ all -> 0x002b }
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
                r8.<init>(r7)     // Catch:{ all -> 0x002b }
                java.lang.String r7 = "Exception while executing callback: "
                r8.append(r7)     // Catch:{ all -> 0x002b }
                r8.append(r6)     // Catch:{ all -> 0x002b }
                java.lang.String r6 = " "
                r8.append(r6)     // Catch:{ all -> 0x002b }
                r8.append(r3)     // Catch:{ all -> 0x002b }
                java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x002b }
                r4.log(r5, r3, r2)     // Catch:{ all -> 0x002b }
                goto L_0x0000
            L_0x0066:
                monitor-exit(r10)     // Catch:{ all -> 0x006d }
                throw r1     // Catch:{ all -> 0x0068 }
            L_0x0068:
                r1 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L_0x006f
            L_0x006d:
                r1 = move-exception
                goto L_0x0066
            L_0x006f:
                if (r1 == 0) goto L_0x0079
                monitor-enter(r10)
                r10.D = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r10)     // Catch:{ all -> 0x0076 }
                goto L_0x0079
            L_0x0076:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0076 }
                throw r0
            L_0x0079:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue.run():void");
        }
    }

    public void b() {
        for (int i2 = 0; i2 < this.f29527a.size(); i2++) {
            ((PerListenerQueue) this.f29527a.get(i2)).b();
        }
    }

    public void c(Event event) {
        d(event, event);
    }

    public final void d(Event event, Object obj) {
        Preconditions.r(event, "event");
        Preconditions.r(obj, "label");
        synchronized (this.f29527a) {
            try {
                for (PerListenerQueue a2 : this.f29527a) {
                    a2.a(event, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
