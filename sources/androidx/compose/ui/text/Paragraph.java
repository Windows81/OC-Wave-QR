package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface Paragraph {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void B(Paragraph paragraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        if (obj == null) {
            paragraph.j(canvas, brush, (i3 & 4) != 0 ? Float.NaN : f2, (i3 & 8) != 0 ? null : shadow, (i3 & 16) != 0 ? null : textDecoration, (i3 & 32) != 0 ? null : drawStyle, (i3 & 64) != 0 ? DrawScope.f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }

    static /* synthetic */ void i(Paragraph paragraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        if (obj == null) {
            long f2 = (i3 & 2) != 0 ? Color.f15975b.f() : j2;
            DrawStyle drawStyle2 = null;
            Shadow shadow2 = (i3 & 4) != 0 ? null : shadow;
            TextDecoration textDecoration2 = (i3 & 8) != 0 ? null : textDecoration;
            if ((i3 & 16) == 0) {
                drawStyle2 = drawStyle;
            }
            paragraph.p(canvas, f2, shadow2, textDecoration2, drawStyle2, (i3 & 32) != 0 ? DrawScope.f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    int A(int i2, boolean z2);

    int C();

    boolean D();

    int E(float f2);

    Path F(int i2, int i3);

    float G(int i2, boolean z2);

    float a();

    float b();

    float c();

    Rect d(int i2);

    float e(int i2);

    float f(int i2);

    float g();

    float h(int i2);

    void j(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    void k(long j2, float[] fArr, int i2);

    ResolvedTextDirection l(int i2);

    float m(int i2);

    float n();

    Rect o(int i2);

    void p(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    long q(int i2);

    int r(int i2);

    float s();

    long t(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy);

    ResolvedTextDirection u(int i2);

    float v(int i2);

    int w(long j2);

    List x();

    boolean y(int i2);

    int z(int i2);
}
