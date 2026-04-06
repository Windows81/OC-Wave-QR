package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.y0  reason: case insensitive filesystem */
public final /* synthetic */ class C0289y0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppBarMenuState f14484A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f14485B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CustomAppBarItem f14486z;

    public /* synthetic */ C0289y0(CustomAppBarItem customAppBarItem, AppBarMenuState appBarMenuState, int i2) {
        this.f14486z = customAppBarItem;
        this.f14484A = appBarMenuState;
        this.f14485B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CustomAppBarItem.f(this.f14486z, this.f14484A, this.f14485B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
