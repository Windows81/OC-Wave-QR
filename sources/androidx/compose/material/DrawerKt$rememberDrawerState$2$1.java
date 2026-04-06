package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$rememberDrawerState$2$1 extends Lambda implements Function0<DrawerState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f7782A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerValue f7783z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$rememberDrawerState$2$1(DrawerValue drawerValue, Function1 function1) {
        super(0);
        this.f7783z = drawerValue;
        this.f7782A = function1;
    }

    /* renamed from: b */
    public final DrawerState invoke() {
        return new DrawerState(this.f7783z, this.f7782A);
    }
}
