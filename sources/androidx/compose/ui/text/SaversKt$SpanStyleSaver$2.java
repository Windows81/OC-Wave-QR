package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$SpanStyleSaver$2 extends Lambda implements Function1<Object, SpanStyle> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$SpanStyleSaver$2 f18405z = new SaversKt$SpanStyleSaver$2();

    public SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final SpanStyle invoke(Object obj) {
        Object obj2 = obj;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Color.Companion companion = Color.f15975b;
        Saver k2 = SaversKt.k(companion);
        Boolean bool = Boolean.FALSE;
        Color color = ((!Intrinsics.d(obj3, bool) || (k2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (Color) k2.a(obj3) : null;
        Intrinsics.f(color);
        long v2 = color.v();
        Object obj4 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.f19177b;
        Saver v3 = SaversKt.v(companion2);
        TextUnit textUnit = ((!Intrinsics.d(obj4, bool) || (v3 instanceof NonNullValueClassSaver)) && obj4 != null) ? (TextUnit) v3.a(obj4) : null;
        Intrinsics.f(textUnit);
        long m2 = textUnit.m();
        Object obj5 = list.get(2);
        Saver n2 = SaversKt.n(FontWeight.f18746A);
        FontWeight fontWeight = ((!Intrinsics.d(obj5, bool) || (n2 instanceof NonNullValueClassSaver)) && obj5 != null) ? (FontWeight) n2.a(obj5) : null;
        Object obj6 = list.get(3);
        FontStyle fontStyle = obj6 != null ? (FontStyle) obj6 : null;
        Object obj7 = list.get(4);
        FontSynthesis fontSynthesis = obj7 != null ? (FontSynthesis) obj7 : null;
        Object obj8 = list.get(6);
        String str = obj8 != null ? (String) obj8 : null;
        Object obj9 = list.get(7);
        Saver v4 = SaversKt.v(companion2);
        TextUnit textUnit2 = ((!Intrinsics.d(obj9, bool) || (v4 instanceof NonNullValueClassSaver)) && obj9 != null) ? (TextUnit) v4.a(obj9) : null;
        Intrinsics.f(textUnit2);
        long m3 = textUnit2.m();
        Object obj10 = list.get(8);
        Saver q2 = SaversKt.q(BaselineShift.f19019b);
        BaselineShift baselineShift = ((!Intrinsics.d(obj10, bool) || (q2 instanceof NonNullValueClassSaver)) && obj10 != null) ? (BaselineShift) q2.a(obj10) : null;
        Object obj11 = list.get(9);
        Saver t2 = SaversKt.t(TextGeometricTransform.f19107c);
        TextGeometricTransform textGeometricTransform = ((!Intrinsics.d(obj11, bool) || (t2 instanceof NonNullValueClassSaver)) && obj11 != null) ? (TextGeometricTransform) t2.a(obj11) : null;
        Object obj12 = list.get(10);
        Saver p2 = SaversKt.p(LocaleList.f18941B);
        LocaleList localeList = ((!Intrinsics.d(obj12, bool) || (p2 instanceof NonNullValueClassSaver)) && obj12 != null) ? (LocaleList) p2.a(obj12) : null;
        Object obj13 = list.get(11);
        Saver k3 = SaversKt.k(companion);
        Color color2 = ((!Intrinsics.d(obj13, bool) || (k3 instanceof NonNullValueClassSaver)) && obj13 != null) ? (Color) k3.a(obj13) : null;
        Intrinsics.f(color2);
        long v5 = color2.v();
        Object obj14 = list.get(12);
        Saver s2 = SaversKt.s(TextDecoration.f19089b);
        TextDecoration textDecoration = ((!Intrinsics.d(obj14, bool) || (s2 instanceof NonNullValueClassSaver)) && obj14 != null) ? (TextDecoration) s2.a(obj14) : null;
        Object obj15 = list.get(13);
        Saver l2 = SaversKt.l(Shadow.f16116d);
        return new SpanStyle(v2, m2, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str, m3, baselineShift, textGeometricTransform, localeList, v5, textDecoration, ((!Intrinsics.d(obj15, bool) || (l2 instanceof NonNullValueClassSaver)) && obj15 != null) ? (Shadow) l2.a(obj15) : null, (PlatformSpanStyle) null, (DrawStyle) null, 49184, (DefaultConstructorMarker) null);
    }
}
