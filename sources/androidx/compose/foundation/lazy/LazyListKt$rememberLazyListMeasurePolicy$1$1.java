package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f4380A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4381B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Arrangement.Vertical E;
    public final /* synthetic */ Arrangement.Horizontal F;
    public final /* synthetic */ int G;
    public final /* synthetic */ CoroutineScope H;
    public final /* synthetic */ GraphicsContext I;
    public final /* synthetic */ StickyItemsPlacement J;
    public final /* synthetic */ Alignment.Horizontal K;
    public final /* synthetic */ Alignment.Vertical L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4382z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(LazyListState lazyListState, boolean z2, PaddingValues paddingValues, boolean z3, Function0 function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, CoroutineScope coroutineScope, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.f4382z = lazyListState;
        this.f4380A = z2;
        this.f4381B = paddingValues;
        this.C = z3;
        this.D = function0;
        this.E = vertical;
        this.F = horizontal;
        this.G = i2;
        this.H = coroutineScope;
        this.I = graphicsContext;
        this.J = stickyItemsPlacement;
        this.K = horizontal2;
        this.L = vertical2;
    }

    /* JADX INFO: finally extract failed */
    public final LazyListMeasureResult b(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
        float f2;
        long f3;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j3 = j2;
        ObservableScopeInvalidator.a(this.f4382z.y());
        boolean z2 = this.f4382z.u() || lazyLayoutMeasureScope.w1();
        CheckScrollableContainerConstraintsKt.a(j3, this.f4380A ? Orientation.Vertical : Orientation.Horizontal);
        int P1 = this.f4380A ? lazyLayoutMeasureScope2.P1(this.f4381B.b(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.g(this.f4381B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P12 = this.f4380A ? lazyLayoutMeasureScope2.P1(this.f4381B.c(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.f(this.f4381B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P13 = lazyLayoutMeasureScope2.P1(this.f4381B.d());
        int P14 = lazyLayoutMeasureScope2.P1(this.f4381B.a());
        int i2 = P13 + P14;
        int i3 = P1 + P12;
        boolean z3 = this.f4380A;
        int i4 = z3 ? i2 : i3;
        int i5 = (!z3 || this.C) ? (!z3 || !this.C) ? (z3 || this.C) ? P12 : P1 : P14 : P13;
        int i6 = i4 - i5;
        long i7 = ConstraintsKt.i(j3, -i3, -i2);
        LazyListItemProvider lazyListItemProvider = (LazyListItemProvider) this.D.invoke();
        lazyListItemProvider.h().c(Constraints.l(i7), Constraints.k(i7));
        if (this.f4380A) {
            Arrangement.Vertical vertical = this.E;
            if (vertical != null) {
                f2 = vertical.a();
            } else {
                InlineClassHelperKt.b("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
        } else {
            Arrangement.Horizontal horizontal = this.F;
            if (horizontal != null) {
                f2 = horizontal.a();
            } else {
                InlineClassHelperKt.b("null horizontalAlignment when isVertical == false");
                throw new KotlinNothingValueException();
            }
        }
        int P15 = lazyLayoutMeasureScope2.P1(f2);
        int b2 = lazyListItemProvider.b();
        int k2 = this.f4380A ? Constraints.k(j2) - i2 : Constraints.l(j2) - i3;
        if (!this.C || k2 > 0) {
            f3 = IntOffset.f((((long) P1) << 32) | (((long) P13) & 4294967295L));
        } else {
            boolean z4 = this.f4380A;
            if (!z4) {
                P1 += k2;
            }
            if (z4) {
                P13 += k2;
            }
            f3 = IntOffset.f((((long) P1) << 32) | (((long) P13) & 4294967295L));
        }
        LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
        int i8 = i3;
        int i9 = i2;
        LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 = new LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(i7, this.f4380A, lazyListItemProvider, lazyLayoutMeasureScope, b2, P15, this.K, this.L, this.C, i5, i6, f3, this.f4382z);
        Snapshot.Companion companion = Snapshot.f15255e;
        LazyListState lazyListState = this.f4382z;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f4 = companion.f(d2);
        try {
            int N = lazyListState.N(lazyListItemProvider2, lazyListState.s());
            int t2 = lazyListState.t();
            Unit unit = Unit.f40552a;
            companion.m(d2, f4, g2);
            List a2 = LazyLayoutBeyondBoundsStateKt.a(lazyListItemProvider2, this.f4382z.A(), this.f4382z.q());
            float F2 = (lazyLayoutMeasureScope.w1() || !z2) ? this.f4382z.F() : this.f4382z.E();
            boolean z5 = this.f4380A;
            Arrangement.Vertical vertical2 = this.E;
            Arrangement.Horizontal horizontal2 = this.F;
            boolean z6 = this.C;
            LazyLayoutItemAnimator w2 = this.f4382z.w();
            int i10 = this.G;
            boolean w1 = lazyLayoutMeasureScope.w1();
            LazyListMeasureResult o2 = this.f4382z.o();
            CoroutineScope coroutineScope = this.H;
            MutableState B2 = this.f4382z.B();
            GraphicsContext graphicsContext = this.I;
            StickyItemsPlacement stickyItemsPlacement = this.J;
            LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1 = r2;
            LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$12 = new LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1(lazyLayoutMeasureScope, j2, i8, i9);
            LazyListMeasureResult e2 = LazyListMeasureKt.e(b2, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1, k2, i5, i6, P15, N, t2, F2, i7, z5, vertical2, horizontal2, z6, lazyLayoutMeasureScope, w2, i10, a2, z2, w1, o2, coroutineScope, B2, graphicsContext, stickyItemsPlacement, lazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1);
            LazyListState.n(this.f4382z, e2, lazyLayoutMeasureScope.w1(), false, 4, (Object) null);
            return e2;
        } catch (Throwable th) {
            companion.m(d2, f4, g2);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((LazyLayoutMeasureScope) obj, ((Constraints) obj2).r());
    }
}
