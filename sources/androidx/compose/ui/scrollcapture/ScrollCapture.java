package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import kotlin.Metadata;

@Metadata
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f18009a = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    public void a() {
        e(true);
    }

    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((Boolean) this.f18009a.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.compose.ui.scrollcapture.ScrollCaptureCandidate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r12, androidx.compose.ui.semantics.SemanticsOwner r13, kotlin.coroutines.CoroutineContext r14, java.util.function.Consumer r15) {
        /*
            r11 = this;
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.ui.scrollcapture.ScrollCaptureCandidate[] r1 = new androidx.compose.ui.scrollcapture.ScrollCaptureCandidate[r1]
            r2 = 0
            r0.<init>(r1, r2)
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.d()
            androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1 r1 = new androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1
            r1.<init>(r0)
            r3 = 2
            r4 = 0
            androidx.compose.ui.scrollcapture.ScrollCapture_androidKt.e(r13, r2, r1, r3, r4)
            kotlin.jvm.functions.Function1[] r13 = new kotlin.jvm.functions.Function1[r3]
            androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2 r1 = androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2.f18010z
            r13[r2] = r1
            androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3 r1 = androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3.f18011z
            r2 = 1
            r13[r2] = r1
            java.util.Comparator r13 = kotlin.comparisons.ComparisonsKt.b(r13)
            r0.E(r13)
            int r13 = r0.p()
            if (r13 != 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            int r13 = r0.p()
            int r13 = r13 - r2
            java.lang.Object[] r0 = r0.f15005z
            r4 = r0[r13]
        L_0x003a:
            androidx.compose.ui.scrollcapture.ScrollCaptureCandidate r4 = (androidx.compose.ui.scrollcapture.ScrollCaptureCandidate) r4
            if (r4 != 0) goto L_0x003f
            return
        L_0x003f:
            kotlinx.coroutines.CoroutineScope r8 = kotlinx.coroutines.CoroutineScopeKt.a(r14)
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r13 = new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback
            androidx.compose.ui.semantics.SemanticsNode r6 = r4.c()
            androidx.compose.ui.unit.IntRect r7 = r4.d()
            r5 = r13
            r9 = r11
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            androidx.compose.ui.layout.LayoutCoordinates r14 = r4.a()
            androidx.compose.ui.geometry.Rect r14 = androidx.compose.ui.layout.LayoutCoordinatesKt.b(r14)
            androidx.compose.ui.unit.IntRect r0 = r4.d()
            long r0 = r0.k()
            androidx.compose.ui.unit.IntRect r14 = androidx.compose.ui.unit.IntRectKt.b(r14)
            android.graphics.Rect r14 = androidx.compose.ui.graphics.RectHelper_androidKt.b(r14)
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = androidx.compose.ui.unit.IntOffset.k(r0)
            int r0 = androidx.compose.ui.unit.IntOffset.l(r0)
            r2.<init>(r3, r0)
            android.view.ScrollCaptureCallback r13 = androidx.compose.ui.scrollcapture.d.a(r13)
            android.view.ScrollCaptureTarget r12 = androidx.compose.ui.scrollcapture.f.a(r12, r14, r2, r13)
            androidx.compose.ui.unit.IntRect r13 = r4.d()
            android.graphics.Rect r13 = androidx.compose.ui.graphics.RectHelper_androidKt.b(r13)
            r12.setScrollBounds(r13)
            r15.accept(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ScrollCapture.d(android.view.View, androidx.compose.ui.semantics.SemanticsOwner, kotlin.coroutines.CoroutineContext, java.util.function.Consumer):void");
    }

    public final void e(boolean z2) {
        this.f18009a.setValue(Boolean.valueOf(z2));
    }
}
