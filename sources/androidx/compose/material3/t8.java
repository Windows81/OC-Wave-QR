package androidx.compose.material3;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class t8 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12722A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ModalWideNavigationRailState f12723B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12724z;

    public /* synthetic */ t8(boolean z2, boolean z3, ModalWideNavigationRailState modalWideNavigationRailState) {
        this.f12724z = z2;
        this.f12722A = z3;
        this.f12723B = modalWideNavigationRailState;
    }

    public final Object m(Object obj, Object obj2) {
        return WideNavigationRailKt.r(this.f12724z, this.f12722A, this.f12723B, (IntSize) obj, (Constraints) obj2);
    }
}
