package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

final class zzht extends Thread {

    /* renamed from: A  reason: collision with root package name */
    public final BlockingQueue f26479A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f26480B = false;
    public final /* synthetic */ zzhp C;

    /* renamed from: z  reason: collision with root package name */
    public final Object f26481z;

    public zzht(zzhp zzhp, String str, BlockingQueue blockingQueue) {
        this.C = zzhp;
        Preconditions.m(str);
        Preconditions.m(blockingQueue);
        this.f26481z = new Object();
        this.f26479A = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f26481z) {
            this.f26481z.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException) {
        zzgk L = this.C.m().L();
        String name = getName();
        L.b(name + " was interrupted", interruptedException);
    }

    public final void c() {
        synchronized (this.C.f26472i) {
            try {
                if (!this.f26480B) {
                    this.C.f26473j.release();
                    this.C.f26472i.notifyAll();
                    if (this == this.C.f26466c) {
                        this.C.f26466c = null;
                    } else if (this == this.C.f26467d) {
                        this.C.f26467d = null;
                    } else {
                        this.C.m().G().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f26480B = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        boolean z2 = false;
        while (!z2) {
            try {
                this.C.f26473j.acquire();
                z2 = true;
            } catch (InterruptedException e2) {
                b(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhu zzhu = (zzhu) this.f26479A.poll();
                if (zzhu != null) {
                    Process.setThreadPriority(zzhu.f26482A ? threadPriority : 10);
                    zzhu.run();
                } else {
                    synchronized (this.f26481z) {
                        if (this.f26479A.peek() == null && !this.C.f26474k) {
                            try {
                                this.f26481z.wait(30000);
                            } catch (InterruptedException e3) {
                                b(e3);
                            }
                        }
                    }
                    synchronized (this.C.f26472i) {
                        if (this.f26479A.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
