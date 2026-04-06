package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Magnifier_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsPropertyKey f3103a = new SemanticsPropertyKey("MagnifierPositionInRoot", (Function2) null, 2, (DefaultConstructorMarker) null);

    public static final boolean a(float f2, float f3) {
        return (Float.isNaN(f2) && Float.isNaN(f3)) || f2 == f3;
    }

    public static final SemanticsPropertyKey b() {
        return f3103a;
    }

    public static final boolean c(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ boolean d(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return c(i2);
    }

    public static final Modifier e(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        if (!d(0, 1, (Object) null)) {
            return modifier;
        }
        Modifier modifier2 = modifier;
        return modifier.o0(new MagnifierElement(function1, function12, function13, f2, z2, j2, f3, f4, z3, platformMagnifierFactory == null ? PlatformMagnifierFactory.f3140a.a() : platformMagnifierFactory, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, Object obj) {
        int i3 = i2;
        PlatformMagnifierFactory platformMagnifierFactory2 = null;
        Function1 function14 = (i3 & 2) != 0 ? null : function12;
        Function1 function15 = (i3 & 4) != 0 ? null : function13;
        float f5 = (i3 & 8) != 0 ? Float.NaN : f2;
        boolean z4 = (i3 & 16) != 0 ? false : z2;
        long a2 = (i3 & 32) != 0 ? DpSize.f19156b.a() : j2;
        float c2 = (i3 & 64) != 0 ? Dp.f19144A.c() : f3;
        float c3 = (i3 & 128) != 0 ? Dp.f19144A.c() : f4;
        boolean z5 = (i3 & 256) != 0 ? true : z3;
        if ((i3 & 512) == 0) {
            platformMagnifierFactory2 = platformMagnifierFactory;
        }
        return e(modifier, function1, function14, function15, f5, z4, a2, c2, c3, z5, platformMagnifierFactory2);
    }
}
