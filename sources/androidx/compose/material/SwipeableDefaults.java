package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class SwipeableDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SwipeableDefaults f8558a = new SwipeableDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final SpringSpec f8559b = new SpringSpec(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8560c = Dp.m((float) 125);

    public static /* synthetic */ ResistanceConfig d(SwipeableDefaults swipeableDefaults, Set set, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 10.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 10.0f;
        }
        return swipeableDefaults.c(set, f2, f3);
    }

    public final SpringSpec a() {
        return f8559b;
    }

    public final float b() {
        return f8560c;
    }

    public final ResistanceConfig c(Set set, float f2, float f3) {
        if (set.size() <= 1) {
            return null;
        }
        Iterable iterable = set;
        Float s0 = CollectionsKt.s0(iterable);
        Intrinsics.f(s0);
        float floatValue = s0.floatValue();
        Float u0 = CollectionsKt.u0(iterable);
        Intrinsics.f(u0);
        return new ResistanceConfig(floatValue - u0.floatValue(), f2, f3);
    }
}
