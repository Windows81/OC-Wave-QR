package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class DrawerKt$ModalDrawer$1$2$5$1 extends Lambda implements Function1<Density, IntOffset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7758z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$5$1(DrawerState drawerState) {
        super(1);
        this.f7758z = drawerState;
    }

    public final long b(Density density) {
        return IntOffsetKt.a(MathKt.d(this.f7758z.g()), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.c(b((Density) obj));
    }
}
