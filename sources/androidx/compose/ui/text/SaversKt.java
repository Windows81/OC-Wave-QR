package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SaversKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Saver f18349a = SaverKt.e(SaversKt$AnnotatedStringSaver$1.f18372z, SaversKt$AnnotatedStringSaver$2.f18373z);

    /* renamed from: b  reason: collision with root package name */
    public static final Saver f18350b = SaverKt.e(SaversKt$AnnotationRangeListSaver$1.f18374z, SaversKt$AnnotationRangeListSaver$2.f18375z);

    /* renamed from: c  reason: collision with root package name */
    public static final Saver f18351c = SaverKt.e(SaversKt$AnnotationRangeSaver$1.f18376z, SaversKt$AnnotationRangeSaver$2.f18378z);

    /* renamed from: d  reason: collision with root package name */
    public static final Saver f18352d = SaverKt.e(SaversKt$VerbatimTtsAnnotationSaver$1.f18420z, SaversKt$VerbatimTtsAnnotationSaver$2.f18421z);

    /* renamed from: e  reason: collision with root package name */
    public static final Saver f18353e = SaverKt.e(SaversKt$UrlAnnotationSaver$1.f18418z, SaversKt$UrlAnnotationSaver$2.f18419z);

    /* renamed from: f  reason: collision with root package name */
    public static final Saver f18354f = SaverKt.e(SaversKt$LinkSaver$1.f18390z, SaversKt$LinkSaver$2.f18391z);

    /* renamed from: g  reason: collision with root package name */
    public static final Saver f18355g = SaverKt.e(SaversKt$ClickableSaver$1.f18382z, SaversKt$ClickableSaver$2.f18383z);

    /* renamed from: h  reason: collision with root package name */
    public static final Saver f18356h = SaverKt.e(SaversKt$ParagraphStyleSaver$1.f18400z, SaversKt$ParagraphStyleSaver$2.f18401z);

    /* renamed from: i  reason: collision with root package name */
    public static final Saver f18357i = SaverKt.e(SaversKt$SpanStyleSaver$1.f18404z, SaversKt$SpanStyleSaver$2.f18405z);

    /* renamed from: j  reason: collision with root package name */
    public static final Saver f18358j = SaverKt.e(SaversKt$TextLinkStylesSaver$1.f18412z, SaversKt$TextLinkStylesSaver$2.f18413z);

    /* renamed from: k  reason: collision with root package name */
    public static final Saver f18359k = SaverKt.e(SaversKt$TextDecorationSaver$1.f18406z, SaversKt$TextDecorationSaver$2.f18407z);

    /* renamed from: l  reason: collision with root package name */
    public static final Saver f18360l = SaverKt.e(SaversKt$TextGeometricTransformSaver$1.f18408z, SaversKt$TextGeometricTransformSaver$2.f18409z);

    /* renamed from: m  reason: collision with root package name */
    public static final Saver f18361m = SaverKt.e(SaversKt$TextIndentSaver$1.f18410z, SaversKt$TextIndentSaver$2.f18411z);

    /* renamed from: n  reason: collision with root package name */
    public static final Saver f18362n = SaverKt.e(SaversKt$FontWeightSaver$1.f18386z, SaversKt$FontWeightSaver$2.f18387z);

    /* renamed from: o  reason: collision with root package name */
    public static final Saver f18363o = SaverKt.e(SaversKt$BaselineShiftSaver$1.f18380z, SaversKt$BaselineShiftSaver$2.f18381z);

    /* renamed from: p  reason: collision with root package name */
    public static final Saver f18364p = SaverKt.e(SaversKt$TextRangeSaver$1.f18414z, SaversKt$TextRangeSaver$2.f18415z);

    /* renamed from: q  reason: collision with root package name */
    public static final Saver f18365q = SaverKt.e(SaversKt$ShadowSaver$1.f18402z, SaversKt$ShadowSaver$2.f18403z);

    /* renamed from: r  reason: collision with root package name */
    public static final NonNullValueClassSaver f18366r = a(SaversKt$ColorSaver$1.f18384z, SaversKt$ColorSaver$2.f18385z);

    /* renamed from: s  reason: collision with root package name */
    public static final NonNullValueClassSaver f18367s = a(SaversKt$TextUnitSaver$1.f18416z, SaversKt$TextUnitSaver$2.f18417z);

    /* renamed from: t  reason: collision with root package name */
    public static final NonNullValueClassSaver f18368t = a(SaversKt$OffsetSaver$1.f18398z, SaversKt$OffsetSaver$2.f18399z);

    /* renamed from: u  reason: collision with root package name */
    public static final Saver f18369u = SaverKt.e(SaversKt$LocaleListSaver$1.f18392z, SaversKt$LocaleListSaver$2.f18393z);

    /* renamed from: v  reason: collision with root package name */
    public static final Saver f18370v = SaverKt.e(SaversKt$LocaleSaver$1.f18394z, SaversKt$LocaleSaver$2.f18395z);

    /* renamed from: w  reason: collision with root package name */
    public static final Saver f18371w = SaverKt.e(SaversKt$LineHeightStyleSaver$1.f18388z, SaversKt$LineHeightStyleSaver$2.f18389z);

    public static final NonNullValueClassSaver a(Function2 function2, Function1 function1) {
        return new SaversKt$NonNullValueClassSaver$1(function2, function1);
    }

    public static final Saver h() {
        return f18349a;
    }

    public static final Saver i() {
        return f18356h;
    }

    public static final Saver j(Offset.Companion companion) {
        return f18368t;
    }

    public static final Saver k(Color.Companion companion) {
        return f18366r;
    }

    public static final Saver l(Shadow.Companion companion) {
        return f18365q;
    }

    public static final Saver m(TextRange.Companion companion) {
        return f18364p;
    }

    public static final Saver n(FontWeight.Companion companion) {
        return f18362n;
    }

    public static final Saver o(Locale.Companion companion) {
        return f18370v;
    }

    public static final Saver p(LocaleList.Companion companion) {
        return f18369u;
    }

    public static final Saver q(BaselineShift.Companion companion) {
        return f18363o;
    }

    public static final Saver r(LineHeightStyle.Companion companion) {
        return f18371w;
    }

    public static final Saver s(TextDecoration.Companion companion) {
        return f18359k;
    }

    public static final Saver t(TextGeometricTransform.Companion companion) {
        return f18360l;
    }

    public static final Saver u(TextIndent.Companion companion) {
        return f18361m;
    }

    public static final Saver v(TextUnit.Companion companion) {
        return f18367s;
    }

    public static final Saver w() {
        return f18357i;
    }

    public static final Saver x() {
        return f18358j;
    }

    public static final Object y(Object obj) {
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.b(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object z(java.lang.Object r0, androidx.compose.runtime.saveable.Saver r1, androidx.compose.runtime.saveable.SaverScope r2) {
        /*
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r1.b(r2, r0)
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt.z(java.lang.Object, androidx.compose.runtime.saveable.Saver, androidx.compose.runtime.saveable.SaverScope):java.lang.Object");
    }
}
