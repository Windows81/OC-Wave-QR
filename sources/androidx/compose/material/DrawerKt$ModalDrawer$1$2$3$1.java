package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$ModalDrawer$1$2$3$1 extends Lambda implements Function0<Float> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7755A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7756B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7757z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f2, float f3, DrawerState drawerState) {
        super(0);
        this.f7757z = f2;
        this.f7755A = f3;
        this.f7756B = drawerState;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(DrawerKt.p(this.f7757z, this.f7755A, this.f7756B.g()));
    }
}
