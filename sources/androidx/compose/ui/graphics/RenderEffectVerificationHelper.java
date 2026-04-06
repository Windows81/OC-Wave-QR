package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

@Metadata
final class RenderEffectVerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final RenderEffectVerificationHelper f16110a = new RenderEffectVerificationHelper();

    public final RenderEffect a(RenderEffect renderEffect, float f2, float f3, int i2) {
        return (f2 == 0.0f && f3 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : renderEffect == null ? RenderEffect.createBlurEffect(f2, f3, AndroidTileMode_androidKt.a(i2)) : RenderEffect.createBlurEffect(f2, f3, renderEffect.a(), AndroidTileMode_androidKt.a(i2));
    }

    public final RenderEffect b(RenderEffect renderEffect, long j2) {
        return renderEffect == null ? RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))) : RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), renderEffect.a());
    }
}
