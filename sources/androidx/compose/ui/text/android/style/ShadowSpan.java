package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;

@Metadata
public final class ShadowSpan extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final int f18649a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18650b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18651c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18652d;

    public ShadowSpan(int i2, float f2, float f3, float f4) {
        this.f18649a = i2;
        this.f18650b = f2;
        this.f18651c = f3;
        this.f18652d = f4;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f18652d, this.f18650b, this.f18651c, this.f18649a);
    }
}
