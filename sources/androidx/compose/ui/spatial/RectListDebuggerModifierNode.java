package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;

@Metadata
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    public Paint N;
    public Object O;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint a2 = AndroidPaint_androidKt.a();
        a2.I(Color.f15975b.d());
        a2.H(PaintingStyle.f16061b.b());
        this.N = a2.x();
    }

    public void I2() {
        this.O = DelegatableNodeKt.p(this).getRectManager().o(new RectListDebuggerModifierNode$onAttach$1(this));
    }

    public void J2() {
        DelegatableNodeKt.p(this).getRectManager().s(this.O);
    }

    public void U(ContentDrawScope contentDrawScope) {
        RectList e2 = DelegatableNodeKt.p(this).getRectManager().e();
        Canvas d2 = AndroidCanvas_androidKt.d(contentDrawScope.G1().j());
        Paint paint = this.N;
        long[] jArr = e2.f18155a;
        int i2 = e2.f18157c;
        int i3 = 0;
        while (i3 < jArr.length - 2 && i3 < i2) {
            long j2 = jArr[i3];
            long j3 = jArr[i3 + 1];
            long j4 = jArr[i3 + 2];
            d2.drawRect((float) ((int) (j2 >> 32)), (float) ((int) j2), (float) ((int) (j3 >> 32)), (float) ((int) j3), paint);
            i3 += 3;
        }
    }
}
