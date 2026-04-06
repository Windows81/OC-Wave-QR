package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class ModalBottomSheetDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ModalBottomSheetDefaults f7982a = new ModalBottomSheetDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f7983b = Dp.m((float) 16);

    /* renamed from: c  reason: collision with root package name */
    public static final AnimationSpec f7984c = AnimationSpecKt.n(300, 0, EasingKt.d(), 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f7985d = 8;

    public final AnimationSpec a() {
        return f7984c;
    }

    public final float b() {
        return f7983b;
    }

    public final long c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-112572414, i2, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long l2 = Color.l(MaterialTheme.f7937a.a(composer, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }
}
