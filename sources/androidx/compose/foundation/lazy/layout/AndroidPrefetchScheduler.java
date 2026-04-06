package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {
    public static final Companion F = new Companion((DefaultConstructorMarker) null);
    public static final int G = 8;
    public static long H;

    /* renamed from: A  reason: collision with root package name */
    public final MutableVector f4766A = new MutableVector(new PrefetchRequest[16], 0);

    /* renamed from: B  reason: collision with root package name */
    public boolean f4767B;
    public final Choreographer C = Choreographer.getInstance();
    public boolean D;
    public long E;

    /* renamed from: z  reason: collision with root package name */
    public final View f4768z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
            if (r5 >= 30.0f) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.H
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L_0x0021
                if (r0 == 0) goto L_0x0021
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = 1114636288(0x42700000, float:60.0)
            L_0x0023:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.H = r0
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion.b(android.view.View):void");
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {

        /* renamed from: a  reason: collision with root package name */
        public final long f4769a;

        public PrefetchRequestScopeImpl(long j2) {
            this.f4769a = j2;
        }

        public long a() {
            return Math.max(0, this.f4769a - System.nanoTime());
        }
    }

    public AndroidPrefetchScheduler(View view) {
        this.f4768z = view;
        F.b(view);
    }

    public void a(PrefetchRequest prefetchRequest) {
        this.f4766A.d(prefetchRequest);
        if (!this.f4767B) {
            this.f4767B = true;
            this.f4768z.post(this);
        }
    }

    public void doFrame(long j2) {
        if (this.D) {
            this.E = j2;
            this.f4768z.post(this);
        }
    }

    public void e() {
    }

    public void f() {
        this.D = false;
        this.f4768z.removeCallbacks(this);
        this.C.removeFrameCallback(this);
    }

    public void h() {
        this.D = true;
    }

    public void run() {
        if (this.f4766A.p() != 0 && this.f4767B && this.D && this.f4768z.getWindowVisibility() == 0) {
            PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.E + H);
            boolean z2 = false;
            while (this.f4766A.p() != 0 && !z2) {
                if (prefetchRequestScopeImpl.a() <= 0 || ((PrefetchRequest) this.f4766A.f15005z[0]).b(prefetchRequestScopeImpl)) {
                    z2 = true;
                } else {
                    this.f4766A.y(0);
                }
            }
            if (z2) {
                this.C.postFrameCallback(this);
            } else {
                this.f4767B = false;
            }
        } else {
            this.f4767B = false;
        }
    }
}
