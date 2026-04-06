package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f5472z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j2) {
        super(1);
        this.f5472z = j2;
    }

    /* renamed from: b */
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        final float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.c() >> 32)) / 2.0f;
        final ImageBitmap d2 = AndroidSelectionHandles_androidKt.d(cacheDrawScope, intBitsToFloat);
        final ColorFilter b2 = ColorFilter.Companion.b(ColorFilter.f15990b, this.f5472z, 0, 2, (Object) null);
        return cacheDrawScope.t(new Function1<ContentDrawScope, Unit>() {
            public final void b(ContentDrawScope contentDrawScope) {
                contentDrawScope.q2();
                float f2 = intBitsToFloat;
                ImageBitmap imageBitmap = d2;
                ColorFilter colorFilter = b2;
                DrawContext G1 = contentDrawScope.G1();
                long c2 = G1.c();
                G1.j().o();
                try {
                    DrawTransform e2 = G1.e();
                    DrawTransform.e(e2, f2, 0.0f, 2, (Object) null);
                    e2.i(45.0f, Offset.f15855b.c());
                    DrawScope.t0(contentDrawScope, imageBitmap, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 46, (Object) null);
                } finally {
                    G1.j().t();
                    G1.f(c2);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ContentDrawScope) obj);
                return Unit.f40552a;
            }
        });
    }
}
