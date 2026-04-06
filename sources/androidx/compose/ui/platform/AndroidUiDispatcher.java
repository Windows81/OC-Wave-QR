package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    public static final Companion L = new Companion((DefaultConstructorMarker) null);
    public static final int M = 8;
    public static final Lazy N = LazyKt.b(AndroidUiDispatcher$Companion$Main$2.f17640z);
    public static final ThreadLocal O = new AndroidUiDispatcher$Companion$currentThread$1();

    /* renamed from: B  reason: collision with root package name */
    public final Choreographer f17639B;
    public final Handler C;
    public final Object D;
    public final ArrayDeque E;
    public List F;
    public List G;
    public boolean H;
    public boolean I;
    public final AndroidUiDispatcher$dispatchCallback$1 J;
    public final MonotonicFrameClock K;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            if (AndroidUiDispatcher_androidKt.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.O.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext b() {
            return (CoroutineContext) AndroidUiDispatcher.N.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    public final Runnable E1() {
        Runnable runnable;
        synchronized (this.D) {
            runnable = (Runnable) this.E.z();
        }
        return runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        ((android.view.Choreographer.FrameCallback) r2.get(r1)).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F1(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.D
            monitor-enter(r0)
            boolean r1 = r4.I     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.I = r1     // Catch:{ all -> 0x002b }
            java.util.List r2 = r4.F     // Catch:{ all -> 0x002b }
            java.util.List r3 = r4.G     // Catch:{ all -> 0x002b }
            r4.F = r3     // Catch:{ all -> 0x002b }
            r4.G = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidUiDispatcher.F1(long):void");
    }

    public final void G1() {
        boolean z2;
        do {
            Runnable E1 = E1();
            while (E1 != null) {
                E1.run();
                E1 = E1();
            }
            synchronized (this.D) {
                if (this.E.isEmpty()) {
                    z2 = false;
                    this.H = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    public final void H1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.D) {
            try {
                this.F.add(frameCallback);
                if (!this.I) {
                    this.I = true;
                    this.f17639B.postFrameCallback(this.J);
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.D) {
            this.F.remove(frameCallback);
        }
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.D) {
            try {
                this.E.addLast(runnable);
                if (!this.H) {
                    this.H = true;
                    this.C.post(this.J);
                    if (!this.I) {
                        this.I = true;
                        this.f17639B.postFrameCallback(this.J);
                    }
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer q1() {
        return this.f17639B;
    }

    public final MonotonicFrameClock w1() {
        return this.K;
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f17639B = choreographer;
        this.C = handler;
        this.D = new Object();
        this.E = new ArrayDeque();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.K = new AndroidUiFrameClock(choreographer, this);
    }
}
