package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class BottomSheetScaffoldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final BottomSheetScaffoldDefaults f7353a = new BottomSheetScaffoldDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7354b = Dp.m((float) 8);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7355c = Dp.m((float) 56);

    /* renamed from: d  reason: collision with root package name */
    public static final AnimationSpec f7356d = AnimationSpecKt.n(300, 0, EasingKt.d(), 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7357e = 8;

    public final AnimationSpec a() {
        return f7356d;
    }

    public final float b() {
        return f7354b;
    }

    public final float c() {
        return f7355c;
    }
}
