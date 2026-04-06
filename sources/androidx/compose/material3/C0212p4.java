package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.p4  reason: case insensitive filesystem */
public final /* synthetic */ class C0212p4 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Placeable f12576A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Placeable f12577B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawerState f12578z;

    public /* synthetic */ C0212p4(DrawerState drawerState, Placeable placeable, Placeable placeable2, MutableState mutableState) {
        this.f12578z = drawerState;
        this.f12576A = placeable;
        this.f12577B = placeable2;
        this.C = mutableState;
    }

    public final Object invoke(Object obj) {
        return NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.e(this.f12578z, this.f12576A, this.f12577B, this.C, (Placeable.PlacementScope) obj);
    }
}
