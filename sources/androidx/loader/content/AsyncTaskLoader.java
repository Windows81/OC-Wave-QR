package androidx.loader.content;

import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class AsyncTaskLoader<D> extends Loader<D> {

    /* renamed from: j  reason: collision with root package name */
    public final Executor f22107j;

    /* renamed from: k  reason: collision with root package name */
    public volatile LoadTask f22108k;

    /* renamed from: l  reason: collision with root package name */
    public volatile LoadTask f22109l;

    /* renamed from: m  reason: collision with root package name */
    public long f22110m;

    /* renamed from: n  reason: collision with root package name */
    public long f22111n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f22112o;

    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {
        public final CountDownLatch J = new CountDownLatch(1);
        public boolean K;

        public LoadTask() {
        }

        public void h(Object obj) {
            try {
                AsyncTaskLoader.this.A(this, obj);
            } finally {
                this.J.countDown();
            }
        }

        public void i(Object obj) {
            try {
                AsyncTaskLoader.this.B(this, obj);
            } finally {
                this.J.countDown();
            }
        }

        /* renamed from: n */
        public Object b(Void... voidArr) {
            try {
                return AsyncTaskLoader.this.G();
            } catch (OperationCanceledException e2) {
                if (f()) {
                    return null;
                }
                throw e2;
            }
        }

        public void run() {
            this.K = false;
            AsyncTaskLoader.this.C();
        }
    }

    public void A(LoadTask loadTask, Object obj) {
        F(obj);
        if (this.f22109l == loadTask) {
            u();
            this.f22111n = SystemClock.uptimeMillis();
            this.f22109l = null;
            e();
            C();
        }
    }

    public void B(LoadTask loadTask, Object obj) {
        if (this.f22108k != loadTask) {
            A(loadTask, obj);
        } else if (j()) {
            F(obj);
        } else {
            c();
            this.f22111n = SystemClock.uptimeMillis();
            this.f22108k = null;
            f(obj);
        }
    }

    public void C() {
        if (this.f22109l == null && this.f22108k != null) {
            if (this.f22108k.K) {
                this.f22108k.K = false;
                this.f22112o.removeCallbacks(this.f22108k);
            }
            if (this.f22110m <= 0 || SystemClock.uptimeMillis() >= this.f22111n + this.f22110m) {
                this.f22108k.c(this.f22107j, (Object[]) null);
                return;
            }
            this.f22108k.K = true;
            this.f22112o.postAtTime(this.f22108k, this.f22111n + this.f22110m);
        }
    }

    public boolean D() {
        return this.f22109l != null;
    }

    public abstract Object E();

    public void F(Object obj) {
    }

    public Object G() {
        return E();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f22108k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f22108k);
            printWriter.print(" waiting=");
            printWriter.println(this.f22108k.K);
        }
        if (this.f22109l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f22109l);
            printWriter.print(" waiting=");
            printWriter.println(this.f22109l.K);
        }
        if (this.f22110m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.c(this.f22110m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.b(this.f22111n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public boolean n() {
        if (this.f22108k == null) {
            return false;
        }
        if (!this.f22125e) {
            this.f22128h = true;
        }
        if (this.f22109l != null) {
            if (this.f22108k.K) {
                this.f22108k.K = false;
                this.f22112o.removeCallbacks(this.f22108k);
            }
            this.f22108k = null;
            return false;
        } else if (this.f22108k.K) {
            this.f22108k.K = false;
            this.f22112o.removeCallbacks(this.f22108k);
            this.f22108k = null;
            return false;
        } else {
            boolean a2 = this.f22108k.a(false);
            if (a2) {
                this.f22109l = this.f22108k;
                z();
            }
            this.f22108k = null;
            return a2;
        }
    }

    public void p() {
        super.p();
        b();
        this.f22108k = new LoadTask();
        C();
    }

    public void z() {
    }
}
