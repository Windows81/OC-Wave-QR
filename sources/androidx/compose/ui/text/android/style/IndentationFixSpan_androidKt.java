package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;

@Metadata
public final class IndentationFixSpan_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18620a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f18620a = iArr;
        }
    }

    public static final float a(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        if (!TextLayout_androidKt.m(layout, i2) || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i2) + layout.getEllipsisStart(i2)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : WhenMappings.f18620a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i2, Paint paint, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i2, paint);
    }

    public static final float c(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        if (!TextLayout_androidKt.m(layout, i2)) {
            return 0.0f;
        }
        int i3 = -1;
        if (layout.getParagraphDirection(i2) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getLineStart(i2) + layout.getEllipsisStart(i2))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment != null) {
            i3 = WhenMappings.f18620a[paragraphAlignment.ordinal()];
        }
        if (i3 == 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i2);
            width2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i2);
            width2 = ((float) layout.getWidth()) - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i2, Paint paint, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i2, paint);
    }
}
