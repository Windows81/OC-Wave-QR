package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Html_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Html_androidKt$TagHandler$1 f18276a = new Html_androidKt$TagHandler$1();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18277a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f18277a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.Html_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void a(AnnotatedString.Builder builder, Object obj, int i2, int i3, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        AnnotatedString.Builder builder2 = builder;
        Object obj2 = obj;
        int i4 = i2;
        int i5 = i3;
        if (obj2 instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj2 instanceof AlignmentSpan) {
            builder2.d(g((AlignmentSpan) obj2), i4, i5);
        } else if (obj2 instanceof AnnotationSpan) {
            AnnotationSpan annotationSpan = (AnnotationSpan) obj2;
            builder2.c(annotationSpan.a(), annotationSpan.b(), i4, i5);
        } else if (obj2 instanceof BackgroundColorSpan) {
            builder2.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.b(((BackgroundColorSpan) obj2).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof BulletSpanWithLevel) {
            long b2 = BulletKt.b();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj2;
            int b3 = bulletSpanWithLevel.b();
            TextUnitKt.b(b2);
            AnnotatedString.Builder builder3 = builder;
            builder3.a(bulletSpanWithLevel.a(), TextUnitKt.k(TextUnit.f(b2), TextUnit.h(b2) * ((float) b3)), i2, i3);
        } else if (obj2 instanceof ForegroundColorSpan) {
            builder2.e(new SpanStyle(ColorKt.b(((ForegroundColorSpan) obj2).getForegroundColor()), 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof RelativeSizeSpan) {
            builder2.e(new SpanStyle(0, TextUnitKt.e(((RelativeSizeSpan) obj2).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65533, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof StrikethroughSpan) {
            builder2.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.b(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof StyleSpan) {
            SpanStyle h2 = h((StyleSpan) obj2);
            if (h2 != null) {
                builder2.e(h2, i4, i5);
            }
        } else if (obj2 instanceof SubscriptSpan) {
            builder2.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, BaselineShift.d(BaselineShift.f19019b.b()), (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof SuperscriptSpan) {
            builder2.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, BaselineShift.d(BaselineShift.f19019b.c()), (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i4, i5);
        } else if (obj2 instanceof TypefaceSpan) {
            builder2.e(i((TypefaceSpan) obj2), i4, i5);
        } else if (obj2 instanceof UnderlineSpan) {
            builder2.e(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, TextDecoration.f19089b.d(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i4, i5);
        } else if ((obj2 instanceof URLSpan) && (url = ((URLSpan) obj2).getURL()) != null) {
            builder2.b(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i4, i5);
        }
    }

    public static final void b(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.m(), Object.class)) {
            long b2 = TextRangeKt.b(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            a(builder, obj, TextRange.n(b2), TextRange.i(b2), textLinkStyles, linkInteractionListener);
        }
    }

    public static final AnnotatedString c(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        return f(HtmlCompat.a("<ContentHandlerReplacementTag />" + str, 63, (Html.ImageGetter) null, f18276a), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString d(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i2 & 4) != 0) {
            linkInteractionListener = null;
        }
        return c(companion, str, textLinkStyles, linkInteractionListener);
    }

    public static final FontFamily e(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface typeface = Typeface.DEFAULT;
        if (Intrinsics.d(create, typeface) || Intrinsics.d(create, Typeface.create(typeface, 0))) {
            create = null;
        }
        if (create != null) {
            return AndroidTypeface_androidKt.a(create);
        }
        return null;
    }

    public static final AnnotatedString f(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder g2 = new AnnotatedString.Builder(spanned.length()).append(spanned);
        b(g2, spanned, textLinkStyles, linkInteractionListener);
        return g2.r();
    }

    public static final ParagraphStyle g(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i2 = alignment == null ? -1 : WhenMappings.f18277a[alignment.ordinal()];
        return new ParagraphStyle(i2 != 1 ? i2 != 2 ? i2 != 3 ? TextAlign.f19080b.g() : TextAlign.f19080b.b() : TextAlign.f19080b.a() : TextAlign.f19080b.f(), 0, 0, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 510, (DefaultConstructorMarker) null);
    }

    public static final SpanStyle h(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0, 0, FontWeight.f18746A.b(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new SpanStyle(0, 0, (FontWeight) null, FontStyle.c(FontStyle.f18724b.a()), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0, 0, FontWeight.f18746A.b(), FontStyle.c(FontStyle.f18724b.a()), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null);
    }

    public static final SpanStyle i(TypefaceSpan typefaceSpan) {
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.f18695A;
        return new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, Intrinsics.d(family, companion.a().n()) ? companion.a() : Intrinsics.d(family, companion.c().n()) ? companion.c() : Intrinsics.d(family, companion.d().n()) ? companion.d() : Intrinsics.d(family, companion.e().n()) ? companion.e() : e(typefaceSpan.getFamily()), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null);
    }
}
