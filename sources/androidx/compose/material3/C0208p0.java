package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.p0  reason: case insensitive filesystem */
public final /* synthetic */ class C0208p0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppBarMenuState f12566A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f12567B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClickableAppBarItem f12568z;

    public /* synthetic */ C0208p0(ClickableAppBarItem clickableAppBarItem, AppBarMenuState appBarMenuState, int i2) {
        this.f12568z = clickableAppBarItem;
        this.f12566A = appBarMenuState;
        this.f12567B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ClickableAppBarItem.h(this.f12568z, this.f12566A, this.f12567B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
