package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class AndroidMultiParagraphDraw_androidKt {
    public static final void a(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        Brush brush2 = brush;
        canvas.o();
        if (multiParagraph.z().size() <= 1) {
            b(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
        } else if (brush2 instanceof SolidColor) {
            b(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
        } else if (brush2 instanceof ShaderBrush) {
            List z2 = multiParagraph.z();
            int size = z2.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) z2.get(i3);
                f4 += paragraphInfo.e().a();
                f3 = Math.max(f3, paragraphInfo.e().b());
            }
            Shader c2 = ((ShaderBrush) brush2).c(Size.d((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)));
            Matrix matrix = new Matrix();
            c2.getLocalMatrix(matrix);
            List z3 = multiParagraph.z();
            int size2 = z3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ParagraphInfo paragraphInfo2 = (ParagraphInfo) z3.get(i4);
                Canvas canvas2 = canvas;
                paragraphInfo2.e().j(canvas2, BrushKt.a(c2), f2, shadow, textDecoration, drawStyle, i2);
                canvas2.d(0.0f, paragraphInfo2.e().a());
                matrix.setTranslate(0.0f, -paragraphInfo2.e().a());
                c2.setLocalMatrix(matrix);
            }
        }
        Canvas canvas3 = canvas;
        canvas.t();
    }

    public static final void b(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        List z2 = multiParagraph.z();
        int size = z2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) z2.get(i3);
            paragraphInfo.e().j(canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
            canvas.d(0.0f, paragraphInfo.e().a());
        }
    }
}
