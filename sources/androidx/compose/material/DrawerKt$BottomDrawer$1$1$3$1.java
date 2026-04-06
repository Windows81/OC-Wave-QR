package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class DrawerKt$BottomDrawer$1$1$3$1 extends Lambda implements Function1<Density, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f7723z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$3$1(BottomDrawerState bottomDrawerState) {
        super(1);
        this.f7723z = bottomDrawerState;
    }

    public final long b(Density density) {
        return IntOffsetKt.a(0, MathKt.d(this.f7723z.h()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((Density) obj));
    }
}
