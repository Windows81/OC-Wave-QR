package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Y7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppBarMenuState f11824A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11825B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableAppBarItem f11826z;

    public /* synthetic */ Y7(ToggleableAppBarItem toggleableAppBarItem, AppBarMenuState appBarMenuState, int i2) {
        this.f11826z = toggleableAppBarItem;
        this.f11824A = appBarMenuState;
        this.f11825B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ToggleableAppBarItem.h(this.f11826z, this.f11824A, this.f11825B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
