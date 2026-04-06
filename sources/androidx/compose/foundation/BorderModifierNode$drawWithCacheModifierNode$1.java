package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BorderModifierNode f2985z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.f2985z = borderModifierNode;
    }

    /* renamed from: b */
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        if (cacheDrawScope.B1(this.f2985z.l3()) < 0.0f || Size.h(cacheDrawScope.c()) <= 0.0f) {
            return BorderKt.j(cacheDrawScope);
        }
        float f2 = (float) 2;
        float min = Math.min(Dp.o(this.f2985z.l3(), Dp.f19144A.a()) ? 1.0f : (float) Math.ceil((double) cacheDrawScope.B1(this.f2985z.l3())), (float) Math.ceil((double) (Size.h(cacheDrawScope.c()) / f2)));
        float f3 = min / f2;
        long e2 = Offset.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long d2 = Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.c() & 4294967295L)) - min)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.c() >> 32)) - min)) << 32));
        boolean z2 = f2 * min > Size.h(cacheDrawScope.c());
        Outline a2 = this.f2985z.k3().a(cacheDrawScope.c(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (a2 instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.f2985z;
            return borderModifierNode.h3(cacheDrawScope, borderModifierNode.j3(), (Outline.Generic) a2, z2, min);
        } else if (a2 instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.f2985z;
            return borderModifierNode2.i3(cacheDrawScope, borderModifierNode2.j3(), (Outline.Rounded) a2, e2, d2, z2, min);
        } else if (a2 instanceof Outline.Rectangle) {
            return BorderKt.k(cacheDrawScope, this.f2985z.j3(), e2, d2, z2, min);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
