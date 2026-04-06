package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerState$Companion$Saver$2 extends Lambda implements Function1<DrawerValue, DrawerState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f7789z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerState$Companion$Saver$2(Function1 function1) {
        super(1);
        this.f7789z = function1;
    }

    /* renamed from: b */
    public final DrawerState invoke(DrawerValue drawerValue) {
        return new DrawerState(drawerValue, this.f7789z);
    }
}
