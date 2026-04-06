package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;

@Metadata
public final class TextDecorationSpan extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18654a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18655b;

    public TextDecorationSpan(boolean z2, boolean z3) {
        this.f18654a = z2;
        this.f18655b = z3;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f18654a);
        textPaint.setStrikeThruText(this.f18655b);
    }
}
