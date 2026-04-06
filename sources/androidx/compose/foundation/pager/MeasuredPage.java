package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MeasuredPage implements PageInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f5244a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5245b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5246c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5247d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5248e;

    /* renamed from: f  reason: collision with root package name */
    public final Alignment.Horizontal f5249f;

    /* renamed from: g  reason: collision with root package name */
    public final Alignment.Vertical f5250g;

    /* renamed from: h  reason: collision with root package name */
    public final LayoutDirection f5251h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5252i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5253j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5254k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f5255l;

    /* renamed from: m  reason: collision with root package name */
    public int f5256m;

    /* renamed from: n  reason: collision with root package name */
    public int f5257n;

    public /* synthetic */ MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, list, j2, obj, orientation, horizontal, vertical, layoutDirection, z2);
    }

    public final void a(int i2) {
        this.f5256m = f() + i2;
        int length = this.f5255l.length;
        for (int i3 = 0; i3 < length; i3++) {
            boolean z2 = this.f5253j;
            if ((z2 && i3 % 2 == 1) || (!z2 && i3 % 2 == 0)) {
                int[] iArr = this.f5255l;
                iArr[i3] = iArr[i3] + i2;
            }
        }
    }

    public final int b() {
        return this.f5254k;
    }

    public Object c() {
        return this.f5248e;
    }

    public final int d(Placeable placeable) {
        return this.f5253j ? placeable.C0() : placeable.L0();
    }

    public final long e(int i2) {
        int[] iArr = this.f5255l;
        int i3 = i2 * 2;
        return IntOffset.f((((long) iArr[i3]) << 32) | (((long) iArr[i3 + 1]) & 4294967295L));
    }

    public int f() {
        return this.f5256m;
    }

    public final int g() {
        return this.f5245b;
    }

    public int getIndex() {
        return this.f5244a;
    }

    public final void h(Placeable.PlacementScope placementScope) {
        if (!(this.f5257n != Integer.MIN_VALUE)) {
            InlineClassHelperKt.a("position() should be called first");
        }
        int size = this.f5246c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) this.f5246c.get(i2);
            long e2 = e(i2);
            if (this.f5252i) {
                e2 = IntOffset.f((((long) (this.f5253j ? IntOffset.k(e2) : (this.f5257n - IntOffset.k(e2)) - d(placeable))) << 32) | (((long) (this.f5253j ? (this.f5257n - IntOffset.l(e2)) - d(placeable) : IntOffset.l(e2))) & 4294967295L));
            }
            long o2 = IntOffset.o(e2, this.f5247d);
            if (this.f5253j) {
                Placeable.PlacementScope.A(placementScope, placeable, o2, 0.0f, (Function1) null, 6, (Object) null);
            } else {
                Placeable.PlacementScope.u(placementScope, placeable, o2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void i(int i2, int i3, int i4) {
        int L0;
        this.f5256m = i2;
        this.f5257n = this.f5253j ? i4 : i3;
        List list = this.f5246c;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            if (this.f5253j) {
                int[] iArr = this.f5255l;
                Alignment.Horizontal horizontal = this.f5249f;
                if (horizontal != null) {
                    iArr[i6] = horizontal.a(placeable.L0(), i3, this.f5251h);
                    this.f5255l[i6 + 1] = i2;
                    L0 = placeable.C0();
                } else {
                    InlineClassHelperKt.b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
            } else {
                int[] iArr2 = this.f5255l;
                iArr2[i6] = i2;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.f5250g;
                if (vertical != null) {
                    iArr2[i7] = vertical.a(placeable.C0(), i4);
                    L0 = placeable.L0();
                } else {
                    InlineClassHelperKt.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
            }
            i2 += L0;
        }
    }

    public MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2) {
        this.f5244a = i2;
        this.f5245b = i3;
        this.f5246c = list;
        this.f5247d = j2;
        this.f5248e = obj;
        this.f5249f = horizontal;
        this.f5250g = vertical;
        this.f5251h = layoutDirection;
        this.f5252i = z2;
        this.f5253j = orientation == Orientation.Vertical;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            i4 = Math.max(i4, !this.f5253j ? placeable.C0() : placeable.L0());
        }
        this.f5254k = i4;
        this.f5255l = new int[(this.f5246c.size() * 2)];
        this.f5257n = Integer.MIN_VALUE;
    }
}
