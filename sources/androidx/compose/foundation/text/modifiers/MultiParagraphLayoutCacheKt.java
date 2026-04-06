package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

@Metadata
public final class MultiParagraphLayoutCacheKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f6631a = TextUnitKt.i(14);

    public static final long b(long j2, long j3) {
        if (!TextUnit.j(j3)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + TextUnit.l(j3) + '.');
        } else if (TextUnit.j(j2)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + TextUnit.l(j3) + "). Please declare the style.fontSize with Sp units instead.");
        } else if (TextUnit.f(j2) == 0) {
            long j4 = f6631a;
            float h2 = TextUnit.h(j3);
            TextUnitKt.b(j4);
            return TextUnitKt.k(TextUnit.f(j4), TextUnit.h(j4) * h2);
        } else {
            float h3 = TextUnit.h(j3);
            TextUnitKt.b(j2);
            return TextUnitKt.k(TextUnit.f(j2), TextUnit.h(j2) * h3);
        }
    }
}
