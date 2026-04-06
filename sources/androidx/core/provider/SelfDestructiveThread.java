package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public class SelfDestructiveThread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20034a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f20035b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f20036c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20037d;

    /* renamed from: androidx.core.provider.SelfDestructiveThread$1  reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SelfDestructiveThread f20038a;

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f20038a.a();
                return true;
            } else if (i2 != 1) {
                return true;
            } else {
                this.f20038a.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$2  reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Handler f20039A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ ReplyCallback f20040B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Callable f20041z;

        public void run() {
            final Object obj;
            try {
                obj = this.f20041z.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f20039A.post(new Runnable() {
                public void run() {
                    AnonymousClass2.this.f20040B.a(obj);
                }
            });
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$3  reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Callable f20044A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f20045B;
        public final /* synthetic */ AtomicBoolean C;
        public final /* synthetic */ Condition D;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f20046z;

        public void run() {
            try {
                this.f20046z.set(this.f20044A.call());
            } catch (Exception unused) {
            }
            this.f20045B.lock();
            try {
                this.C.set(false);
                this.D.signal();
            } finally {
                this.f20045B.unlock();
            }
        }
    }

    public interface ReplyCallback<T> {
        void a(Object obj);
    }

    public void a() {
        synchronized (this.f20034a) {
            try {
                if (!this.f20036c.hasMessages(1)) {
                    this.f20035b.quit();
                    this.f20035b = null;
                    this.f20036c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f20034a) {
            this.f20036c.removeMessages(0);
            Handler handler = this.f20036c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f20037d);
        }
    }
}
