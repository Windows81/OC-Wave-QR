package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SizeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final FillElement f4160a;

    /* renamed from: b  reason: collision with root package name */
    public static final FillElement f4161b;

    /* renamed from: c  reason: collision with root package name */
    public static final FillElement f4162c;

    /* renamed from: d  reason: collision with root package name */
    public static final WrapContentElement f4163d;

    /* renamed from: e  reason: collision with root package name */
    public static final WrapContentElement f4164e;

    /* renamed from: f  reason: collision with root package name */
    public static final WrapContentElement f4165f;

    /* renamed from: g  reason: collision with root package name */
    public static final WrapContentElement f4166g;

    /* renamed from: h  reason: collision with root package name */
    public static final WrapContentElement f4167h;

    /* renamed from: i  reason: collision with root package name */
    public static final WrapContentElement f4168i;

    static {
        FillElement.Companion companion = FillElement.C;
        f4160a = companion.c(1.0f);
        f4161b = companion.a(1.0f);
        f4162c = companion.b(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.E;
        Alignment.Companion companion3 = Alignment.f15444a;
        f4163d = companion2.c(companion3.g(), false);
        f4164e = companion2.c(companion3.k(), false);
        f4165f = companion2.a(companion3.i(), false);
        f4166g = companion2.a(companion3.l(), false);
        f4167h = companion2.b(companion3.e(), false);
        f4168i = companion2.b(companion3.o(), false);
    }

    public static /* synthetic */ Modifier A(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        return z(modifier, f2, f3);
    }

    public static final Modifier B(Modifier modifier, Alignment.Vertical vertical, boolean z2) {
        Alignment.Companion companion = Alignment.f15444a;
        return modifier.o0((!Intrinsics.d(vertical, companion.i()) || z2) ? (!Intrinsics.d(vertical, companion.l()) || z2) ? WrapContentElement.E.a(vertical, z2) : f4166g : f4165f);
    }

    public static /* synthetic */ Modifier C(Modifier modifier, Alignment.Vertical vertical, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vertical = Alignment.f15444a.i();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return B(modifier, vertical, z2);
    }

    public static final Modifier D(Modifier modifier, Alignment alignment, boolean z2) {
        Alignment.Companion companion = Alignment.f15444a;
        return modifier.o0((!Intrinsics.d(alignment, companion.e()) || z2) ? (!Intrinsics.d(alignment, companion.o()) || z2) ? WrapContentElement.E.b(alignment, z2) : f4168i : f4167h);
    }

    public static /* synthetic */ Modifier E(Modifier modifier, Alignment alignment, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alignment = Alignment.f15444a.e();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return D(modifier, alignment, z2);
    }

    public static final Modifier F(Modifier modifier, Alignment.Horizontal horizontal, boolean z2) {
        Alignment.Companion companion = Alignment.f15444a;
        return modifier.o0((!Intrinsics.d(horizontal, companion.g()) || z2) ? (!Intrinsics.d(horizontal, companion.k()) || z2) ? WrapContentElement.E.c(horizontal, z2) : f4164e : f4163d);
    }

    public static /* synthetic */ Modifier G(Modifier modifier, Alignment.Horizontal horizontal, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            horizontal = Alignment.f15444a.g();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return F(modifier, horizontal, z2);
    }

    public static final Modifier a(Modifier modifier, float f2, float f3) {
        return modifier.o0(new UnspecifiedConstraintsElement(f2, f3, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        return a(modifier, f2, f3);
    }

    public static final Modifier c(Modifier modifier, float f2) {
        return modifier.o0(f2 == 1.0f ? f4161b : FillElement.C.a(f2));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return c(modifier, f2);
    }

    public static final Modifier e(Modifier modifier, float f2) {
        return modifier.o0(f2 == 1.0f ? f4162c : FillElement.C.b(f2));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return e(modifier, f2);
    }

    public static final Modifier g(Modifier modifier, float f2) {
        return modifier.o0(f2 == 1.0f ? f4160a : FillElement.C.c(f2));
    }

    public static /* synthetic */ Modifier h(Modifier modifier, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return g(modifier, f2);
    }

    public static final Modifier i(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(0.0f, f2, 0.0f, f2, true, InspectableValueKt.b() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), 5, (DefaultConstructorMarker) null));
    }

    public static final Modifier j(Modifier modifier, float f2, float f3) {
        return modifier.o0(new SizeElement(0.0f, f2, 0.0f, f3, true, InspectableValueKt.b() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.a(), 5, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        return j(modifier, f2, f3);
    }

    public static final Modifier l(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(0.0f, f2, 0.0f, f2, false, InspectableValueKt.b() ? new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), 5, (DefaultConstructorMarker) null));
    }

    public static final Modifier m(Modifier modifier, float f2, float f3) {
        return modifier.o0(new SizeElement(0.0f, f2, 0.0f, f3, false, InspectableValueKt.b() ? new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.a(), 5, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier n(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        return m(modifier, f2, f3);
    }

    public static final Modifier o(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(f2, f2, f2, f2, false, InspectableValueKt.b() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static final Modifier p(Modifier modifier, float f2, float f3) {
        return modifier.o0(new SizeElement(f2, f3, f2, f3, false, InspectableValueKt.b() ? new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static final Modifier q(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.o0(new SizeElement(f2, f3, f4, f5, false, InspectableValueKt.b() ? new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier r(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.f19144A.c();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.f19144A.c();
        }
        return q(modifier, f2, f3, f4, f5);
    }

    public static final Modifier s(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(f2, 0.0f, f2, 0.0f, false, InspectableValueKt.b() ? new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), 10, (DefaultConstructorMarker) null));
    }

    public static final Modifier t(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.b() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static final Modifier u(Modifier modifier, long j2) {
        return v(modifier, DpSize.j(j2), DpSize.i(j2));
    }

    public static final Modifier v(Modifier modifier, float f2, float f3) {
        return modifier.o0(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.b() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static final Modifier w(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.o0(new SizeElement(f2, f3, f4, f5, true, InspectableValueKt.b() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier x(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.f19144A.c();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.f19144A.c();
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.f19144A.c();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.f19144A.c();
        }
        return w(modifier, f2, f3, f4, f5);
    }

    public static final Modifier y(Modifier modifier, float f2) {
        return modifier.o0(new SizeElement(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.b() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.a(), 10, (DefaultConstructorMarker) null));
    }

    public static final Modifier z(Modifier modifier, float f2, float f3) {
        return modifier.o0(new SizeElement(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.b() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.a(), 10, (DefaultConstructorMarker) null));
    }
}
