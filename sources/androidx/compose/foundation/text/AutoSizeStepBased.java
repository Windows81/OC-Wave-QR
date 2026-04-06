package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;

@Metadata
final class AutoSizeStepBased implements TextAutoSize {

    /* renamed from: a  reason: collision with root package name */
    public long f5482a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5483b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5484c;

    public long a(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j2, AnnotatedString annotatedString) {
        TextAutoSizeLayoutScope textAutoSizeLayoutScope2 = textAutoSizeLayoutScope;
        float f2 = textAutoSizeLayoutScope2.f2(this.f5484c);
        float f22 = textAutoSizeLayoutScope2.f2(this.f5482a);
        float f23 = textAutoSizeLayoutScope2.f2(this.f5483b);
        float f3 = (float) 2;
        float f4 = (f22 + f23) / f3;
        float f5 = f22;
        float f6 = f23;
        while (f6 - f5 >= f2) {
            if (b(textAutoSizeLayoutScope.z1(j2, annotatedString, textAutoSizeLayoutScope2.A(f4)))) {
                f6 = f4;
            } else {
                f5 = f4;
            }
            f4 = (f5 + f6) / f3;
        }
        float floor = f22 + (((float) Math.floor((double) ((f5 - f22) / f2))) * f2);
        float f7 = f2 + floor;
        if (f7 <= f23) {
            if (!b(textAutoSizeLayoutScope.z1(j2, annotatedString, textAutoSizeLayoutScope2.A(f7)))) {
                floor = f7;
            }
        }
        return textAutoSizeLayoutScope2.A(floor);
    }

    public final boolean b(TextLayoutResult textLayoutResult) {
        int f2 = textLayoutResult.l().f();
        TextOverflow.Companion companion = TextOverflow.f19125b;
        boolean z2 = true;
        if (TextOverflow.h(f2, companion.a()) ? true : TextOverflow.h(f2, companion.e())) {
            return c(textLayoutResult);
        }
        if (!(TextOverflow.h(f2, companion.d()) ? true : TextOverflow.h(f2, companion.c()))) {
            z2 = TextOverflow.h(f2, companion.b());
        }
        if (z2) {
            return d(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + TextOverflow.j(textLayoutResult.l().f()) + " is not supported.");
    }

    public final boolean c(TextLayoutResult textLayoutResult) {
        return textLayoutResult.g() || textLayoutResult.f();
    }

    public final boolean d(TextLayoutResult textLayoutResult) {
        int n2 = textLayoutResult.n();
        if (n2 == 0) {
            return false;
        }
        if (n2 == 1) {
            return textLayoutResult.D(0);
        }
        int f2 = textLayoutResult.l().f();
        TextOverflow.Companion companion = TextOverflow.f19125b;
        if (TextOverflow.h(f2, companion.d()) ? true : TextOverflow.h(f2, companion.c())) {
            return c(textLayoutResult);
        }
        if (TextOverflow.h(f2, companion.b())) {
            return textLayoutResult.D(textLayoutResult.n() - 1);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) obj;
        return TextUnit.e(autoSizeStepBased.f5482a, this.f5482a) && TextUnit.e(autoSizeStepBased.f5483b, this.f5483b) && TextUnit.e(autoSizeStepBased.f5484c, this.f5484c);
    }

    public int hashCode() {
        return (((TextUnit.i(this.f5482a) * 31) + TextUnit.i(this.f5483b)) * 31) + TextUnit.i(this.f5484c);
    }
}
