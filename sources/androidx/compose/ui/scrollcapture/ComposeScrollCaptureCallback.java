package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;

@Metadata
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final SemanticsNode f17996a;

    /* renamed from: b  reason: collision with root package name */
    public final IntRect f17997b;

    /* renamed from: c  reason: collision with root package name */
    public final ScrollCaptureSessionListener f17998c;

    /* renamed from: d  reason: collision with root package name */
    public final View f17999d;

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineScope f18000e;

    /* renamed from: f  reason: collision with root package name */
    public final RelativeScroller f18001f;

    /* renamed from: g  reason: collision with root package name */
    public int f18002g;

    @Metadata
    public interface ScrollCaptureSessionListener {
        void a();

        void b();
    }

    public ComposeScrollCaptureCallback(SemanticsNode semanticsNode, IntRect intRect, CoroutineScope coroutineScope, ScrollCaptureSessionListener scrollCaptureSessionListener, View view) {
        this.f17996a = semanticsNode;
        this.f17997b = intRect;
        this.f17998c = scrollCaptureSessionListener;
        this.f17999d = view;
        this.f18000e = CoroutineScopeKt.i(coroutineScope, DisableAnimationMotionDurationScale.f18005z);
        this.f18001f = new RelativeScroller(intRect.f(), new ComposeScrollCaptureCallback$scrollTracker$1(this, (Continuation) null));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, androidx.compose.ui.unit.IntRect r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 r0 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.J = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 r0 = new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            int r9 = r0.G
            int r10 = r0.F
            java.lang.Object r1 = r0.E
            androidx.compose.ui.unit.IntRect r1 = (androidx.compose.ui.unit.IntRect) r1
            java.lang.Object r2 = r0.D
            android.view.ScrollCaptureSession r2 = androidx.compose.ui.scrollcapture.a.a(r2)
            java.lang.Object r0 = r0.C
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r0 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback) r0
            kotlin.ResultKt.b(r11)
            r11 = r2
            goto L_0x009c
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            int r9 = r0.G
            int r10 = r0.F
            java.lang.Object r2 = r0.E
            androidx.compose.ui.unit.IntRect r2 = (androidx.compose.ui.unit.IntRect) r2
            java.lang.Object r4 = r0.D
            android.view.ScrollCaptureSession r4 = androidx.compose.ui.scrollcapture.a.a(r4)
            java.lang.Object r5 = r0.C
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r5 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback) r5
            kotlin.ResultKt.b(r11)
            r11 = r10
            r10 = r2
            r2 = r9
            r9 = r4
            goto L_0x0082
        L_0x0061:
            kotlin.ResultKt.b(r11)
            int r11 = r10.j()
            int r2 = r10.d()
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = r8.f18001f
            r0.C = r8
            r0.D = r9
            r0.E = r10
            r0.F = r11
            r0.G = r2
            r0.J = r4
            java.lang.Object r4 = r5.f(r11, r2, r0)
            if (r4 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r5 = r8
        L_0x0082:
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3 r4 = androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.f18003z
            r0.C = r5
            r0.D = r9
            r0.E = r10
            r0.F = r11
            r0.G = r2
            r0.J = r3
            java.lang.Object r0 = androidx.compose.runtime.MonotonicFrameClockKt.c(r4, r0)
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r10
            r10 = r11
            r0 = r5
            r11 = r9
            r9 = r2
        L_0x009c:
            androidx.compose.ui.scrollcapture.RelativeScroller r2 = r0.f18001f
            int r10 = r2.c(r10)
            androidx.compose.ui.scrollcapture.RelativeScroller r2 = r0.f18001f
            int r9 = r2.c(r9)
            r6 = 5
            r7 = 0
            r2 = 0
            r4 = 0
            r3 = r10
            r5 = r9
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.ui.unit.IntRect.c(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r9) goto L_0x00bb
            androidx.compose.ui.unit.IntRect$Companion r9 = androidx.compose.ui.unit.IntRect.f19164e
            androidx.compose.ui.unit.IntRect r9 = r9.a()
            return r9
        L_0x00bb:
            android.view.Surface r9 = r11.getSurface()
            android.graphics.Canvas r9 = r9.lockHardwareCanvas()
            r9.save()     // Catch:{ all -> 0x0108 }
            int r10 = r1.g()     // Catch:{ all -> 0x0108 }
            float r10 = (float) r10     // Catch:{ all -> 0x0108 }
            float r10 = -r10
            int r2 = r1.j()     // Catch:{ all -> 0x0108 }
            float r2 = (float) r2     // Catch:{ all -> 0x0108 }
            float r2 = -r2
            r9.translate(r10, r2)     // Catch:{ all -> 0x0108 }
            androidx.compose.ui.unit.IntRect r10 = r0.f17997b     // Catch:{ all -> 0x0108 }
            int r10 = r10.g()     // Catch:{ all -> 0x0108 }
            float r10 = (float) r10     // Catch:{ all -> 0x0108 }
            float r10 = -r10
            androidx.compose.ui.unit.IntRect r2 = r0.f17997b     // Catch:{ all -> 0x0108 }
            int r2 = r2.j()     // Catch:{ all -> 0x0108 }
            float r2 = (float) r2     // Catch:{ all -> 0x0108 }
            float r2 = -r2
            r9.translate(r10, r2)     // Catch:{ all -> 0x0108 }
            android.view.View r10 = r0.f17999d     // Catch:{ all -> 0x0108 }
            android.view.View r10 = r10.getRootView()     // Catch:{ all -> 0x0108 }
            r10.draw(r9)     // Catch:{ all -> 0x0108 }
            android.view.Surface r10 = r11.getSurface()
            r10.unlockCanvasAndPost(r9)
            androidx.compose.ui.scrollcapture.RelativeScroller r9 = r0.f18001f
            float r9 = r9.b()
            int r9 = kotlin.math.MathKt.d(r9)
            r10 = 0
            androidx.compose.ui.unit.IntRect r9 = r1.n(r10, r9)
            return r9
        L_0x0108:
            r10 = move-exception
            android.view.Surface r11 = r11.getSurface()
            r11.unlockCanvasAndPost(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.e(android.view.ScrollCaptureSession, androidx.compose.ui.unit.IntRect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        Job unused = BuildersKt__Builders_commonKt.d(this.f18000e, NonCancellable.f41432A, (CoroutineStart) null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, (Continuation) null), 2, (Object) null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Job unused = ComposeScrollCaptureCallback_androidKt.c(this.f18000e, cancellationSignal, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, (Continuation) null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(RectHelper_androidKt.b(this.f17997b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f18001f.d();
        this.f18002g = 0;
        this.f17998c.a();
        runnable.run();
    }
}
