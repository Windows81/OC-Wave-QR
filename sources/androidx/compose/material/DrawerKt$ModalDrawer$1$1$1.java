package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$ModalDrawer$1$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f7747A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7748B;
    public final /* synthetic */ float C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7749z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1(DrawerState drawerState, Density density, float f2, float f3) {
        super(0);
        this.f7749z = drawerState;
        this.f7747A = density;
        this.f7748B = f2;
        this.C = f3;
    }

    public final void invoke() {
        this.f7749z.h(this.f7747A);
        AnchoredDraggableState.J(this.f7749z.c(), AnchoredDraggableKt.a(new DrawerKt$ModalDrawer$1$1$1$anchors$1(this.f7748B, this.C)), (Object) null, 2, (Object) null);
    }
}
