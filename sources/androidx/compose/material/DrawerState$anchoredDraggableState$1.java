package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7790z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerState$anchoredDraggableState$1(DrawerState drawerState) {
        super(1);
        this.f7790z = drawerState;
    }

    public final Float b(float f2) {
        return Float.valueOf(this.f7790z.f().B1(DrawerKt.f7707b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
