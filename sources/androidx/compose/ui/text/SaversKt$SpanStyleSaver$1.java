package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$SpanStyleSaver$1 extends Lambda implements Function2<SaverScope, SpanStyle, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$SpanStyleSaver$1 f18404z = new SaversKt$SpanStyleSaver$1();

    public SaversKt$SpanStyleSaver$1() {
        super(2);
    }

    /* renamed from: b */
    public final Object m(SaverScope saverScope, SpanStyle spanStyle) {
        SaverScope saverScope2 = saverScope;
        Color h2 = Color.h(spanStyle.g());
        Color.Companion companion = Color.f15975b;
        Object z2 = SaversKt.z(h2, SaversKt.k(companion), saverScope2);
        TextUnit b2 = TextUnit.b(spanStyle.k());
        TextUnit.Companion companion2 = TextUnit.f19177b;
        return CollectionsKt.g(z2, SaversKt.z(b2, SaversKt.v(companion2), saverScope2), SaversKt.z(spanStyle.n(), SaversKt.n(FontWeight.f18746A), saverScope2), SaversKt.y(spanStyle.l()), SaversKt.y(spanStyle.m()), SaversKt.y(-1), SaversKt.y(spanStyle.j()), SaversKt.z(TextUnit.b(spanStyle.o()), SaversKt.v(companion2), saverScope2), SaversKt.z(spanStyle.e(), SaversKt.q(BaselineShift.f19019b), saverScope2), SaversKt.z(spanStyle.u(), SaversKt.t(TextGeometricTransform.f19107c), saverScope2), SaversKt.z(spanStyle.p(), SaversKt.p(LocaleList.f18941B), saverScope2), SaversKt.z(Color.h(spanStyle.d()), SaversKt.k(companion), saverScope2), SaversKt.z(spanStyle.s(), SaversKt.s(TextDecoration.f19089b), saverScope2), SaversKt.z(spanStyle.r(), SaversKt.l(Shadow.f16116d), saverScope2));
    }
}
