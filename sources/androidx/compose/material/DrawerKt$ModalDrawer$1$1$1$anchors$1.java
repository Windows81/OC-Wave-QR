package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$ModalDrawer$1$1$1$anchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<DrawerValue>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7750A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7751z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1$anchors$1(float f2, float f3) {
        super(1);
        this.f7751z = f2;
        this.f7750A = f3;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(DrawerValue.Closed, this.f7751z);
        draggableAnchorsConfig.a(DrawerValue.Open, this.f7750A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
