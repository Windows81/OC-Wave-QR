package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CacheDrawScope implements Density {

    /* renamed from: A  reason: collision with root package name */
    public DrawResult f15699A;

    /* renamed from: B  reason: collision with root package name */
    public ContentDrawScope f15700B;
    public Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public BuildDrawCacheParams f15701z = EmptyBuildDrawCacheParams.f15712z;

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.compose.ui.unit.Density] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void w(androidx.compose.ui.draw.CacheDrawScope r7, androidx.compose.ui.graphics.layer.GraphicsLayer r8, androidx.compose.ui.unit.Density r9, androidx.compose.ui.unit.LayoutDirection r10, long r11, kotlin.jvm.functions.Function1 r13, int r14, java.lang.Object r15) {
        /*
            r15 = r14 & 1
            if (r15 == 0) goto L_0x0006
            r2 = r7
            goto L_0x0007
        L_0x0006:
            r2 = r9
        L_0x0007:
            r9 = r14 & 2
            if (r9 == 0) goto L_0x000f
            androidx.compose.ui.unit.LayoutDirection r10 = r7.getLayoutDirection()
        L_0x000f:
            r3 = r10
            r9 = r14 & 4
            if (r9 == 0) goto L_0x001c
            long r9 = r7.c()
            long r11 = androidx.compose.ui.unit.IntSizeKt.d(r9)
        L_0x001c:
            r4 = r11
            r0 = r7
            r1 = r8
            r6 = r13
            r0.u(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.CacheDrawScope.w(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.layer.GraphicsLayer, androidx.compose.ui.unit.Density, androidx.compose.ui.unit.LayoutDirection, long, kotlin.jvm.functions.Function1, int, java.lang.Object):void");
    }

    public final void C(BuildDrawCacheParams buildDrawCacheParams) {
        this.f15701z = buildDrawCacheParams;
    }

    public final void F(ContentDrawScope contentDrawScope) {
        this.f15700B = contentDrawScope;
    }

    public final void G(DrawResult drawResult) {
        this.f15699A = drawResult;
    }

    public final void H(Function0 function0) {
        this.C = function0;
    }

    public final DrawResult b() {
        return this.f15699A;
    }

    public final long c() {
        return this.f15701z.c();
    }

    public final GraphicsLayer f() {
        Function0 function0 = this.C;
        Intrinsics.f(function0);
        return ((GraphicsContext) function0.invoke()).b();
    }

    public float getDensity() {
        return this.f15701z.getDensity().getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.f15701z.getLayoutDirection();
    }

    public final DrawResult q(Function1 function1) {
        return t(new CacheDrawScope$onDrawBehind$1(function1));
    }

    public final DrawResult t(Function1 function1) {
        DrawResult drawResult = new DrawResult(function1);
        this.f15699A = drawResult;
        return drawResult;
    }

    public final void u(GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j2, Function1 function1) {
        ContentDrawScope contentDrawScope = this.f15700B;
        Intrinsics.f(contentDrawScope);
        contentDrawScope.l1(graphicsLayer, j2, new CacheDrawScope$record$1$1(function1, contentDrawScope, density, layoutDirection, contentDrawScope.G1().getDensity(), contentDrawScope.G1().getLayoutDirection()));
    }

    public float u1() {
        return this.f15701z.getDensity().u1();
    }
}
