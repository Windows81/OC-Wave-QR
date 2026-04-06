package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements Function1<Object, ParagraphStyle> {

    /* renamed from: z  reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$2 f18401z = new SaversKt$ParagraphStyleSaver$2();

    public SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    /* renamed from: b */
    public final ParagraphStyle invoke(Object obj) {
        Object obj2 = obj;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        TextAlign textAlign = obj3 != null ? (TextAlign) obj3 : null;
        Intrinsics.f(textAlign);
        int n2 = textAlign.n();
        Object obj4 = list.get(1);
        TextDirection textDirection = obj4 != null ? (TextDirection) obj4 : null;
        Intrinsics.f(textDirection);
        int m2 = textDirection.m();
        Object obj5 = list.get(2);
        Saver v2 = SaversKt.v(TextUnit.f19177b);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = ((!Intrinsics.d(obj5, bool) || (v2 instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextUnit) v2.a(obj5) : null;
        Intrinsics.f(textUnit);
        long m3 = textUnit.m();
        Object obj6 = list.get(3);
        Saver u2 = SaversKt.u(TextIndent.f19111c);
        TextIndent textIndent = ((!Intrinsics.d(obj6, bool) || (u2 instanceof NonNullValueClassSaver)) && obj6 != null) ? (TextIndent) u2.a(obj6) : null;
        Object obj7 = list.get(4);
        Saver a2 = Savers_androidKt.a(PlatformParagraphStyle.f18341c);
        PlatformParagraphStyle platformParagraphStyle = ((!Intrinsics.d(obj7, bool) || (a2 instanceof NonNullValueClassSaver)) && obj7 != null) ? (PlatformParagraphStyle) a2.a(obj7) : null;
        Object obj8 = list.get(5);
        Saver r2 = SaversKt.r(LineHeightStyle.f19056d);
        LineHeightStyle lineHeightStyle = ((!Intrinsics.d(obj8, bool) || (r2 instanceof NonNullValueClassSaver)) && obj8 != null) ? (LineHeightStyle) r2.a(obj8) : null;
        Object obj9 = list.get(6);
        Saver b2 = Savers_androidKt.b(LineBreak.f19032b);
        LineBreak lineBreak = ((!Intrinsics.d(obj9, bool) || (b2 instanceof NonNullValueClassSaver)) && obj9 != null) ? (LineBreak) b2.a(obj9) : null;
        Intrinsics.f(lineBreak);
        int l2 = lineBreak.l();
        Object obj10 = list.get(7);
        Hyphens hyphens = obj10 != null ? (Hyphens) obj10 : null;
        Intrinsics.f(hyphens);
        int j2 = hyphens.j();
        Object obj11 = list.get(8);
        Saver c2 = Savers_androidKt.c(TextMotion.f19115c);
        return new ParagraphStyle(n2, m2, m3, textIndent, platformParagraphStyle, lineHeightStyle, l2, j2, ((!Intrinsics.d(obj11, bool) || (c2 instanceof NonNullValueClassSaver)) && obj11 != null) ? (TextMotion) c2.a(obj11) : null, (DefaultConstructorMarker) null);
    }
}
