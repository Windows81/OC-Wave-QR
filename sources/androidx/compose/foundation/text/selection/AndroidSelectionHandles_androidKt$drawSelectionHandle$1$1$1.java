package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f6719A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f6720B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f6721z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j2, Function0 function0, boolean z2) {
        super(1);
        this.f6721z = j2;
        this.f6719A = function0;
        this.f6720B = z2;
    }

    /* renamed from: b */
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        final ImageBitmap d2 = AndroidSelectionHandles_androidKt.d(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.c() >> 32)) / 2.0f);
        final ColorFilter b2 = ColorFilter.Companion.b(ColorFilter.f15990b, this.f6721z, 0, 2, (Object) null);
        final Function0 function0 = this.f6719A;
        final boolean z2 = this.f6720B;
        return cacheDrawScope.t(new Function1<ContentDrawScope, Unit>() {
            public final void b(ContentDrawScope contentDrawScope) {
                contentDrawScope.q2();
                if (((Boolean) function0.invoke()).booleanValue()) {
                    if (z2) {
                        ImageBitmap imageBitmap = d2;
                        ColorFilter colorFilter = b2;
                        long T1 = contentDrawScope.T1();
                        DrawContext G1 = contentDrawScope.G1();
                        long c2 = G1.c();
                        G1.j().o();
                        try {
                            G1.e().g(-1.0f, 1.0f, T1);
                            DrawScope.t0(contentDrawScope, imageBitmap, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 46, (Object) null);
                        } finally {
                            G1.j().t();
                            G1.f(c2);
                        }
                    } else {
                        DrawScope.t0(contentDrawScope, d2, 0, 0.0f, (DrawStyle) null, b2, 0, 46, (Object) null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ContentDrawScope) obj);
                return Unit.f40552a;
            }
        });
    }
}
