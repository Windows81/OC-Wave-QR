package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLayout_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TextAndroidCanvas f18599a = new TextAndroidCanvas();

    /* renamed from: b  reason: collision with root package name */
    public static final long f18600b = a(0, 0);

    public static final long a(int i2, int i3) {
        return VerticalPaddings.a((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    public static final Paint.FontMetricsInt h(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        LineHeightStyleSpan[] lineHeightStyleSpanArr2 = lineHeightStyleSpanArr;
        int m2 = textLayout.m() - 1;
        if (textLayout.i().getLineStart(m2) != textLayout.i().getLineEnd(m2) || lineHeightStyleSpanArr2 == null || lineHeightStyleSpanArr2.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("​");
        LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) ArraysKt.e0(lineHeightStyleSpanArr);
        spannableString.setSpan(lineHeightStyleSpan.b(0, spannableString.length(), (m2 == 0 || !lineHeightStyleSpan.e()) ? lineHeightStyleSpan.e() : false), 0, spannableString.length(), 33);
        StaticLayout b2 = StaticLayoutFactory.b(StaticLayoutFactory.f18545a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, textLayout.h(), textLayout.e(), 0, 0, 0, 0, (int[]) null, (int[]) null, 2072512, (Object) null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = b2.getLineAscent(0);
        fontMetricsInt.descent = b2.getLineDescent(0);
        fontMetricsInt.top = b2.getLineTop(0);
        fontMetricsInt.bottom = b2.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final long i(LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i2 = 0;
        int i3 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.c() < 0) {
                i2 = Math.max(i2, Math.abs(lineHeightStyleSpan.c()));
            }
            if (lineHeightStyleSpan.d() < 0) {
                i3 = Math.max(i2, Math.abs(lineHeightStyleSpan.d()));
            }
        }
        return (i2 == 0 && i3 == 0) ? f18600b : a(i2, i3);
    }

    public static final LineHeightStyleSpan[] j(TextLayout textLayout) {
        if (!(textLayout.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G = textLayout.G();
        Intrinsics.g(G, "null cannot be cast to non-null type android.text.Spanned");
        Class<LineHeightStyleSpan> cls = LineHeightStyleSpan.class;
        if (!SpannedExtensions_androidKt.a((Spanned) G, cls) && textLayout.G().length() > 0) {
            return null;
        }
        CharSequence G2 = textLayout.G();
        Intrinsics.g(G2, "null cannot be cast to non-null type android.text.Spanned");
        return (LineHeightStyleSpan[]) ((Spanned) G2).getSpans(0, textLayout.G().length(), cls);
    }

    public static final TextDirectionHeuristic k(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final long l(TextLayout textLayout) {
        if (textLayout.h() || textLayout.J()) {
            return f18600b;
        }
        TextPaint paint = textLayout.i().getPaint();
        CharSequence text = textLayout.i().getText();
        Rect c2 = PaintExtensions_androidKt.c(paint, text, textLayout.i().getLineStart(0), textLayout.i().getLineEnd(0));
        int lineAscent = textLayout.i().getLineAscent(0);
        int i2 = c2.top;
        int topPadding = i2 < lineAscent ? lineAscent - i2 : textLayout.i().getTopPadding();
        if (textLayout.m() != 1) {
            int m2 = textLayout.m() - 1;
            c2 = PaintExtensions_androidKt.c(paint, text, textLayout.i().getLineStart(m2), textLayout.i().getLineEnd(m2));
        }
        int lineDescent = textLayout.i().getLineDescent(textLayout.m() - 1);
        int i3 = c2.bottom;
        int bottomPadding = i3 > lineDescent ? i3 - lineDescent : textLayout.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f18600b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i2) {
        return layout.getEllipsisCount(i2) > 0;
    }
}
