package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.material3.w3  reason: case insensitive filesystem */
public final /* synthetic */ class C0274w3 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f14449A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f14450B;
    public final /* synthetic */ FiniteAnimationSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f14451z;

    public /* synthetic */ C0274w3(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        this.f14451z = sheetState;
        this.f14449A = finiteAnimationSpec;
        this.f14450B = finiteAnimationSpec2;
        this.C = finiteAnimationSpec3;
    }

    public final Object invoke() {
        return ModalBottomSheetKt.z(this.f14451z, this.f14449A, this.f14450B, this.C);
    }
}
