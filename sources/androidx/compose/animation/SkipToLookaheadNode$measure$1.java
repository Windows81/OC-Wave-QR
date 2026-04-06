package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class SkipToLookaheadNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f2397A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2398B;
    public final /* synthetic */ MeasureScope C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SkipToLookaheadNode f2399z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadNode$measure$1(SkipToLookaheadNode skipToLookaheadNode, Placeable placeable, long j2, MeasureScope measureScope) {
        super(1);
        this.f2399z = skipToLookaheadNode;
        this.f2397A = placeable;
        this.f2398B = j2;
        this.C = measureScope;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        final long j2;
        ScaleToBoundsImpl a3 = this.f2399z.a3();
        if (!((Boolean) this.f2399z.b3().invoke()).booleanValue() || a3 == null) {
            Placeable.PlacementScope.j(placementScope, this.f2397A, 0, 0, 0.0f, 4, (Object) null);
            return;
        }
        ContentScale b2 = a3.b();
        if (((int) (this.f2399z.Q >> 32)) == 0 || ((int) (this.f2399z.Q & 4294967295L)) == 0) {
            j2 = ScaleFactor.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
        } else {
            j2 = b2.a(IntSizeKt.e(this.f2399z.Q), IntSizeKt.e(this.f2398B));
        }
        Alignment a2 = a3.a();
        int d2 = MathKt.d(((float) ((int) (this.f2399z.Q >> 32))) * Float.intBitsToFloat((int) (j2 >> 32)));
        long a4 = a2.a(IntSize.c((((long) MathKt.d(((float) ((int) (this.f2399z.Q & 4294967295L))) * Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) d2) << 32)), this.f2398B, this.C.getLayoutDirection());
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.x(placementScope2, this.f2397A, IntOffset.k(a4), IntOffset.l(a4), 0.0f, new Function1<GraphicsLayerScope, Unit>() {
            public final void b(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.j(Float.intBitsToFloat((int) (j2 >> 32)));
                graphicsLayerScope.i(Float.intBitsToFloat((int) (j2 & 4294967295L)));
                graphicsLayerScope.Q1(TransformOriginKt.a(0.0f, 0.0f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((GraphicsLayerScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
