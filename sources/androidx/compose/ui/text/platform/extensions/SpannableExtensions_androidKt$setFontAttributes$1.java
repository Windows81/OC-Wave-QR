package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function4 f18999A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Spannable f19000z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, Function4 function4) {
        super(3);
        this.f19000z = spannable;
        this.f18999A = function4;
    }

    public final void b(SpanStyle spanStyle, int i2, int i3) {
        Spannable spannable = this.f19000z;
        Function4 function4 = this.f18999A;
        FontFamily i4 = spanStyle.i();
        FontWeight n2 = spanStyle.n();
        if (n2 == null) {
            n2 = FontWeight.f18746A.g();
        }
        FontStyle l2 = spanStyle.l();
        FontStyle c2 = FontStyle.c(l2 != null ? l2.i() : FontStyle.f18724b.b());
        FontSynthesis m2 = spanStyle.m();
        spannable.setSpan(new TypefaceSpan((Typeface) function4.j(i4, n2, c2, FontSynthesis.e(m2 != null ? m2.m() : FontSynthesis.f18728b.a()))), i2, i3, 33);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
