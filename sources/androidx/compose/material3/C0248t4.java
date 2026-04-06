package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.t4  reason: case insensitive filesystem */
public final /* synthetic */ class C0248t4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12711A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f12712B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ MutableFloatState D;
    public final /* synthetic */ float E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f12713z;

    public /* synthetic */ C0248t4(DrawerState drawerState, int i2, List list, MutableState mutableState, MutableFloatState mutableFloatState, float f2) {
        this.f12713z = drawerState;
        this.f12711A = i2;
        this.f12712B = list;
        this.C = mutableState;
        this.D = mutableFloatState;
        this.E = f2;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt$ModalNavigationDrawer$2$6$1.e(this.f12713z, this.f12711A, this.f12712B, this.C, this.D, this.E, (Placeable.PlacementScope) obj);
    }
}
