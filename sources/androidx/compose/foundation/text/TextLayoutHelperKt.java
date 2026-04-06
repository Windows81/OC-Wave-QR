package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayoutHelperKt {
    public static final boolean a(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutInput l2 = textLayoutResult.l();
        if (textLayoutResult.w().j().a() || !Intrinsics.d(l2.j(), annotatedString) || !l2.i().G(textStyle) || !Intrinsics.d(l2.g(), list) || l2.e() != i2 || l2.h() != z2 || !TextOverflow.h(l2.f(), i3) || !Intrinsics.d(l2.b(), density) || l2.d() != layoutDirection || !Intrinsics.d(l2.c(), resolver) || Constraints.n(j2) != Constraints.n(l2.a())) {
            return false;
        }
        if (z2 || TextOverflow.h(i3, TextOverflow.f19125b.b())) {
            return Constraints.l(j2) == Constraints.l(l2.a()) && Constraints.k(j2) == Constraints.k(l2.a());
        }
        return true;
    }

    public static final float b(TextLayoutResult textLayoutResult, int i2) {
        if (i2 < 0 || textLayoutResult.l().j().length() == 0) {
            return 0.0f;
        }
        int min = Math.min(textLayoutResult.w().p(i2), Math.min(textLayoutResult.w().w() - 1, textLayoutResult.w().m() - 1));
        if (i2 > MultiParagraph.o(textLayoutResult.w(), min, false, 2, (Object) null)) {
            return 0.0f;
        }
        return textLayoutResult.w().r(min);
    }
}
