package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {
    public static final Companion R = new Companion((DefaultConstructorMarker) null);
    public static final int S = 8;
    public static final LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1 T = new LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1();
    public LazyLayoutBeyondBoundsState N;
    public LazyLayoutBeyondBoundsInfo O;
    public boolean P;
    public Orientation Q;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4793a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f4793a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierNode.WhenMappings.<clinit>():void");
        }
    }

    public LazyLayoutBeyondBoundsModifierNode(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, Orientation orientation) {
        this.N = lazyLayoutBeyondBoundsState;
        this.O = lazyLayoutBeyondBoundsInfo;
        this.P = z2;
        this.Q = orientation;
    }

    public Object Y0(int i2, Function1 function1) {
        if (this.N.b() <= 0 || !this.N.e() || !F2()) {
            return function1.invoke(T);
        }
        int c2 = c3(i2) ? this.N.c() : this.N.f();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = this.O.a(c2, c2);
        int j2 = RangesKt.j(this.N.d() * 2, this.N.b());
        Object obj = null;
        int i3 = 0;
        while (obj == null && b3((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f40908z, i2) && i3 < j2) {
            LazyLayoutBeyondBoundsInfo.Interval a3 = a3((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f40908z, i2);
            this.O.e((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f40908z);
            objectRef.f40908z = a3;
            i3++;
            LayoutModifierNodeKt.d(this);
            obj = function1.invoke(new LazyLayoutBeyondBoundsModifierNode$layout$2(this, objectRef, i2));
        }
        this.O.e((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f40908z);
        LayoutModifierNodeKt.d(this);
        return obj;
    }

    public final LazyLayoutBeyondBoundsInfo.Interval a3(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        int b2 = interval.b();
        int a2 = interval.a();
        if (c3(i2)) {
            a2++;
        } else {
            b2--;
        }
        return this.O.a(b2, a2);
    }

    public final boolean b3(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        if (d3(i2)) {
            return false;
        }
        if (c3(i2)) {
            if (interval.a() >= this.N.b() - 1) {
                return false;
            }
        } else if (interval.b() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean c3(int i2) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.f17013b;
        if (BeyondBoundsLayout.LayoutDirection.i(i2, companion.c())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.i(i2, companion.b())) {
            if (BeyondBoundsLayout.LayoutDirection.i(i2, companion.a())) {
                return this.P;
            }
            if (BeyondBoundsLayout.LayoutDirection.i(i2, companion.d())) {
                if (this.P) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.i(i2, companion.e())) {
                int i3 = WhenMappings.f4793a[DelegatableNodeKt.n(this).ordinal()];
                if (i3 == 1) {
                    return this.P;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.P) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.i(i2, companion.f())) {
                int i4 = WhenMappings.f4793a[DelegatableNodeKt.n(this).ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return this.P;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (this.P) {
                    return false;
                }
            } else {
                Void unused = LazyLayoutBeyondBoundsModifierLocalKt.c();
                throw new KotlinNothingValueException();
            }
        }
        return true;
    }

    public final boolean d3(int i2) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.f17013b;
        boolean z2 = true;
        if (!(BeyondBoundsLayout.LayoutDirection.i(i2, companion.a()) ? true : BeyondBoundsLayout.LayoutDirection.i(i2, companion.d()))) {
            if (!(BeyondBoundsLayout.LayoutDirection.i(i2, companion.e()) ? true : BeyondBoundsLayout.LayoutDirection.i(i2, companion.f()))) {
                if (!BeyondBoundsLayout.LayoutDirection.i(i2, companion.c())) {
                    z2 = BeyondBoundsLayout.LayoutDirection.i(i2, companion.b());
                }
                if (!z2) {
                    Void unused = LazyLayoutBeyondBoundsModifierLocalKt.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.Q == Orientation.Vertical) {
                return true;
            }
        } else if (this.Q == Orientation.Horizontal) {
            return true;
        }
        return false;
    }

    public final void e3(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, Orientation orientation) {
        this.N = lazyLayoutBeyondBoundsState;
        this.O = lazyLayoutBeyondBoundsInfo;
        this.P = z2;
        this.Q = orientation;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new LazyLayoutBeyondBoundsModifierNode$measure$1(c0), 4, (Object) null);
    }

    public ModifierLocalMap q1() {
        return ModifierLocalModifierNodeKt.b(TuplesKt.a(BeyondBoundsLayoutKt.a(), this));
    }
}
