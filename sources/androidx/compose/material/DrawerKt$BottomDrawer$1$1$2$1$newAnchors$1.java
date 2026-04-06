package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7720A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7721B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7722z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1(float f2, float f3, boolean z2) {
        super(1);
        this.f7722z = f2;
        this.f7720A = f3;
        this.f7721B = z2;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(BottomDrawerValue.Closed, this.f7722z);
        float f2 = this.f7722z * 0.5f;
        if (this.f7720A > f2 || this.f7721B) {
            draggableAnchorsConfig.a(BottomDrawerValue.Open, f2);
        }
        float f3 = this.f7720A;
        if (f3 > 0.0f) {
            draggableAnchorsConfig.a(BottomDrawerValue.Expanded, Math.max(0.0f, this.f7722z - f3));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
