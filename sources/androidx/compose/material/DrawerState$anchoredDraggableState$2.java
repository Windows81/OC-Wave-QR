package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerState$anchoredDraggableState$2 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7791z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerState$anchoredDraggableState$2(DrawerState drawerState) {
        super(0);
        this.f7791z = drawerState;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(this.f7791z.f().B1(DrawerKt.f7708c));
    }
}
