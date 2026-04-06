package androidx.compose.foundation.lazy.grid;

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
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f4607A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4608B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ LazyGridSlotsProvider E;
    public final /* synthetic */ Arrangement.Vertical F;
    public final /* synthetic */ Arrangement.Horizontal G;
    public final /* synthetic */ CoroutineScope H;
    public final /* synthetic */ GraphicsContext I;
    public final /* synthetic */ StickyItemsPlacement J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4609z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(LazyGridState lazyGridState, boolean z2, PaddingValues paddingValues, boolean z3, Function0 function0, LazyGridSlotsProvider lazyGridSlotsProvider, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, CoroutineScope coroutineScope, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement) {
        super(2);
        this.f4609z = lazyGridState;
        this.f4607A = z2;
        this.f4608B = paddingValues;
        this.C = z3;
        this.D = function0;
        this.E = lazyGridSlotsProvider;
        this.F = vertical;
        this.G = horizontal;
        this.H = coroutineScope;
        this.I = graphicsContext;
        this.J = stickyItemsPlacement;
    }

    public final LazyGridMeasureResult b(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2) {
        float f2;
        int i2;
        long j3;
        int i3;
        int i4;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        long j4 = j2;
        ObservableScopeInvalidator.a(this.f4609z.x());
        boolean z2 = this.f4609z.t() || lazyLayoutMeasureScope.w1();
        CheckScrollableContainerConstraintsKt.a(j4, this.f4607A ? Orientation.Vertical : Orientation.Horizontal);
        int P1 = this.f4607A ? lazyLayoutMeasureScope2.P1(this.f4608B.b(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.g(this.f4608B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P12 = this.f4607A ? lazyLayoutMeasureScope2.P1(this.f4608B.c(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope2.P1(PaddingKt.f(this.f4608B, lazyLayoutMeasureScope.getLayoutDirection()));
        int P13 = lazyLayoutMeasureScope2.P1(this.f4608B.d());
        int P14 = lazyLayoutMeasureScope2.P1(this.f4608B.a());
        int i5 = P13 + P14;
        int i6 = P1 + P12;
        boolean z3 = this.f4607A;
        int i7 = z3 ? i5 : i6;
        int i8 = (!z3 || this.C) ? (!z3 || !this.C) ? (z3 || this.C) ? P12 : P1 : P14 : P13;
        int i9 = i7 - i8;
        long i10 = ConstraintsKt.i(j4, -i6, -i5);
        LazyGridItemProvider lazyGridItemProvider = (LazyGridItemProvider) this.D.invoke();
        LazyGridSpanLayoutProvider j5 = lazyGridItemProvider.j();
        LazyGridSlots a2 = this.E.a(lazyLayoutMeasureScope2, i10);
        int length = a2.b().length;
        j5.h(length);
        if (this.f4607A) {
            Arrangement.Vertical vertical = this.F;
            if (vertical != null) {
                f2 = vertical.a();
            } else {
                InlineClassHelperKt.b("null verticalArrangement when isVertical == true");
                throw new KotlinNothingValueException();
            }
        } else {
            Arrangement.Horizontal horizontal = this.G;
            if (horizontal != null) {
                f2 = horizontal.a();
            } else {
                InlineClassHelperKt.b("null horizontalArrangement when isVertical == false");
                throw new KotlinNothingValueException();
            }
        }
        int P15 = lazyLayoutMeasureScope2.P1(f2);
        int b2 = lazyGridItemProvider.b();
        int k2 = this.f4607A ? Constraints.k(j2) - i5 : Constraints.l(j2) - i6;
        if (!this.C || k2 > 0) {
            i2 = b2;
            j3 = IntOffset.f((((long) P1) << 32) | (((long) P13) & 4294967295L));
        } else {
            boolean z4 = this.f4607A;
            if (!z4) {
                P1 += k2;
            }
            if (z4) {
                P13 += k2;
            }
            i2 = b2;
            j3 = IntOffset.f((((long) P1) << 32) | (((long) P13) & 4294967295L));
        }
        int i11 = i2;
        int i12 = length;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = j5;
        LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
        long j6 = i10;
        int i13 = i5;
        int i14 = i6;
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(lazyGridItemProvider, lazyLayoutMeasureScope, P15, this.f4609z, this.f4607A, this.C, i8, i9, j3);
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1(this.f4607A, a2, i11, P15, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, lazyGridSpanLayoutProvider);
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1(lazyGridSpanLayoutProvider2, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1);
        Snapshot.Companion companion = Snapshot.f15255e;
        LazyGridState lazyGridState = this.f4609z;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f3 = companion.f(d2);
        try {
            int O = lazyGridState.O(lazyGridItemProvider2, lazyGridState.r());
            int i15 = i11;
            if (O >= i15) {
                if (i15 > 0) {
                    i3 = 0;
                    i4 = lazyGridSpanLayoutProvider2.d(i15 - 1);
                    Unit unit = Unit.f40552a;
                    companion.m(d2, f3, g2);
                    List a3 = LazyLayoutBeyondBoundsStateKt.a(lazyGridItemProvider2, this.f4609z.A(), this.f4609z.p());
                    float F2 = (!lazyLayoutMeasureScope.w1() || !z2) ? this.f4609z.F() : this.f4609z.E();
                    LazyLayoutItemAnimator v2 = this.f4609z.v();
                    boolean w1 = lazyLayoutMeasureScope.w1();
                    LazyGridMeasureResult n2 = this.f4609z.n();
                    MutableState B2 = this.f4609z.B();
                    boolean z5 = this.f4607A;
                    Arrangement.Vertical vertical2 = this.F;
                    Arrangement.Horizontal horizontal2 = this.G;
                    boolean z6 = this.C;
                    CoroutineScope coroutineScope = this.H;
                    GraphicsContext graphicsContext = this.I;
                    StickyItemsPlacement stickyItemsPlacement = this.J;
                    LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1 = r2;
                    LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$12 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1(lazyLayoutMeasureScope, j2, i14, i13);
                    LazyGridMeasureResult e2 = LazyGridMeasureKt.e(i15, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, k2, i8, i9, P15, i4, i3, F2, j6, z5, vertical2, horizontal2, z6, lazyLayoutMeasureScope, v2, i12, a3, z2, w1, n2, coroutineScope, B2, graphicsContext, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1, stickyItemsPlacement, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1);
                    LazyGridState.m(this.f4609z, e2, lazyLayoutMeasureScope.w1(), false, 4, (Object) null);
                    return e2;
                }
            }
            i4 = lazyGridSpanLayoutProvider2.d(O);
            i3 = lazyGridState.s();
            Unit unit2 = Unit.f40552a;
            companion.m(d2, f3, g2);
            List a32 = LazyLayoutBeyondBoundsStateKt.a(lazyGridItemProvider2, this.f4609z.A(), this.f4609z.p());
            float F22 = (!lazyLayoutMeasureScope.w1() || !z2) ? this.f4609z.F() : this.f4609z.E();
            LazyLayoutItemAnimator v22 = this.f4609z.v();
            boolean w12 = lazyLayoutMeasureScope.w1();
            LazyGridMeasureResult n22 = this.f4609z.n();
            MutableState B22 = this.f4609z.B();
            boolean z52 = this.f4607A;
            Arrangement.Vertical vertical22 = this.F;
            Arrangement.Horizontal horizontal22 = this.G;
            boolean z62 = this.C;
            CoroutineScope coroutineScope2 = this.H;
            GraphicsContext graphicsContext2 = this.I;
            StickyItemsPlacement stickyItemsPlacement2 = this.J;
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$13 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$12;
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$122 = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1(lazyLayoutMeasureScope, j2, i14, i13);
            LazyGridMeasureResult e22 = LazyGridMeasureKt.e(i15, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, k2, i8, i9, P15, i4, i3, F22, j6, z52, vertical22, horizontal22, z62, lazyLayoutMeasureScope, v22, i12, a32, z2, w12, n22, coroutineScope2, B22, graphicsContext2, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1, stickyItemsPlacement2, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$13);
            LazyGridState.m(this.f4609z, e22, lazyLayoutMeasureScope.w1(), false, 4, (Object) null);
            return e22;
        } catch (Throwable th) {
            companion.m(d2, f3, g2);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((LazyLayoutMeasureScope) obj, ((Constraints) obj2).r());
    }
}
