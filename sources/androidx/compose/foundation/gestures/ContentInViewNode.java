package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public Orientation N;
    public final ScrollingLogic O;
    public boolean P;
    public BringIntoViewSpec Q;
    public final boolean R;
    public final BringIntoViewRequestPriorityQueue S = new BringIntoViewRequestPriorityQueue();
    public LayoutCoordinates T;
    public boolean U;
    public boolean V;
    public long W = IntSize.f19170b.a();
    public boolean X;

    @Metadata
    public static final class Request {

        /* renamed from: a  reason: collision with root package name */
        public final Function0 f3411a;

        /* renamed from: b  reason: collision with root package name */
        public final CancellableContinuation f3412b;

        public Request(Function0 function0, CancellableContinuation cancellableContinuation) {
            this.f3411a = function0;
            this.f3412b = cancellableContinuation;
        }

        public final CancellableContinuation a() {
            return this.f3412b;
        }

        public final Function0 b() {
            return this.f3411a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
            if (r0 == null) goto L_0x0050;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.CancellableContinuation r0 = r4.f3412b
                kotlin.coroutines.CoroutineContext r0 = r0.f()
                kotlinx.coroutines.CoroutineName$Key r1 = kotlinx.coroutines.CoroutineName.f41383B
                kotlin.coroutines.CoroutineContext$Element r0 = r0.d(r1)
                kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.o0()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.CharsKt.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.h(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L_0x0050
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L_0x0052
            L_0x0050:
                java.lang.String r0 = "("
            L_0x0052:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                kotlin.jvm.functions.Function0 r0 = r4.f3411a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.CancellableContinuation r0 = r4.f3412b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3413a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.gestures.Orientation[] r0 = androidx.compose.foundation.gestures.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f3413a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.WhenMappings.<clinit>():void");
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.N = orientation;
        this.O = scrollingLogic;
        this.P = z2;
        this.Q = bringIntoViewSpec;
    }

    public static /* synthetic */ boolean r3(ContentInViewNode contentInViewNode, Rect rect, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = contentInViewNode.W;
        }
        return contentInViewNode.q3(rect, j2);
    }

    public Object C1(Function0 function0, Continuation continuation) {
        Rect rect = (Rect) function0.invoke();
        if (rect == null || r3(this, rect, 0, 1, (Object) null)) {
            return Unit.f40552a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        if (this.S.c(new Request(function0, cancellableContinuationImpl)) && !this.X) {
            s3();
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public boolean D2() {
        return this.R;
    }

    public Rect b1(Rect rect) {
        if (IntSize.e(this.W, IntSize.f19170b.a())) {
            InlineClassHelperKt.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m3(rect, this.W);
    }

    public final float j3(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.e(this.W, IntSize.f19170b.a())) {
            return 0.0f;
        }
        Rect n3 = n3();
        if (n3 == null) {
            n3 = this.U ? o3() : null;
            if (n3 == null) {
                return 0.0f;
            }
        }
        long e2 = IntSizeKt.e(this.W);
        int i2 = WhenMappings.f3413a[this.N.ordinal()];
        if (i2 == 1) {
            return bringIntoViewSpec.a(n3.r(), n3.i() - n3.r(), Float.intBitsToFloat((int) (e2 & 4294967295L)));
        }
        if (i2 == 2) {
            return bringIntoViewSpec.a(n3.o(), n3.p() - n3.o(), Float.intBitsToFloat((int) (e2 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int k3(long j2, long j3) {
        int i2 = WhenMappings.f3413a[this.N.ordinal()];
        if (i2 == 1) {
            return Intrinsics.k((int) (j2 & 4294967295L), (int) (j3 & 4294967295L));
        }
        if (i2 == 2) {
            return Intrinsics.k((int) (j2 >> 32), (int) (j3 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int l3(long j2, long j3) {
        int i2 = WhenMappings.f3413a[this.N.ordinal()];
        if (i2 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
        if (i2 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Rect m3(Rect rect, long j2) {
        return rect.B(Offset.e(u3(rect, j2) ^ -9223372034707292160L));
    }

    public final Rect n3() {
        MutableVector a2 = this.S.f3399a;
        int p2 = a2.p() - 1;
        Object[] objArr = a2.f15005z;
        Rect rect = null;
        if (p2 < objArr.length) {
            while (p2 >= 0) {
                Rect rect2 = (Rect) ((Request) objArr[p2]).b().invoke();
                if (rect2 != null) {
                    if (l3(rect2.q(), IntSizeKt.e(this.W)) > 0) {
                        return rect == null ? rect2 : rect;
                    }
                    rect = rect2;
                }
                p2--;
            }
        }
        return rect;
    }

    public final Rect o3() {
        if (!F2()) {
            return null;
        }
        LayoutCoordinates m2 = DelegatableNodeKt.m(this);
        LayoutCoordinates layoutCoordinates = this.T;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.b()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return m2.X(layoutCoordinates, false);
            }
        }
        return null;
    }

    public final long p3() {
        return this.W;
    }

    public void q(long j2) {
        Rect o3;
        long j3 = this.W;
        this.W = j2;
        if (k3(j2, j3) < 0 && !this.X && !this.U && (o3 = o3()) != null && q3(o3, j3)) {
            this.V = true;
        }
    }

    public final boolean q3(Rect rect, long j2) {
        long u3 = u3(rect, j2);
        return Math.abs(Float.intBitsToFloat((int) (u3 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (u3 & 4294967295L))) <= 0.5f;
    }

    public final void s3() {
        BringIntoViewSpec v3 = v3();
        if (this.X) {
            InlineClassHelperKt.c("launchAnimation called when previous animation was running");
        }
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(BringIntoViewSpec.f3402a.c()), v3, (Continuation) null), 1, (Object) null);
    }

    public final void t3(LayoutCoordinates layoutCoordinates) {
        Rect o3;
        this.T = layoutCoordinates;
        if (this.V && (o3 = o3()) != null && !q3(o3, this.W)) {
            this.U = true;
            s3();
        }
        this.V = false;
    }

    public final long u3(Rect rect, long j2) {
        long e2 = IntSizeKt.e(j2);
        int i2 = WhenMappings.f3413a[this.N.ordinal()];
        if (i2 == 1) {
            return Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(v3().a(rect.r(), rect.i() - rect.r(), Float.intBitsToFloat((int) (e2 & 4294967295L))))) & 4294967295L));
        } else if (i2 == 2) {
            return Offset.e((((long) Float.floatToRawIntBits(v3().a(rect.o(), rect.p() - rect.o(), Float.intBitsToFloat((int) (e2 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final BringIntoViewSpec v3() {
        BringIntoViewSpec bringIntoViewSpec = this.Q;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.a(this, BringIntoViewSpec_androidKt.a()) : bringIntoViewSpec;
    }

    public final void w3(Orientation orientation, boolean z2, BringIntoViewSpec bringIntoViewSpec) {
        this.N = orientation;
        this.P = z2;
        this.Q = bringIntoViewSpec;
    }
}
