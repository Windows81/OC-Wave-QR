package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class J implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10155A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10156B;
    public final /* synthetic */ FiniteAnimationSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10157z;

    public /* synthetic */ J(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        this.f10157z = sheetState;
        this.f10155A = finiteAnimationSpec;
        this.f10156B = finiteAnimationSpec2;
        this.C = finiteAnimationSpec3;
    }

    public final Object invoke() {
        return BottomSheetScaffoldKt.p(this.f10157z, this.f10155A, this.f10156B, this.C);
    }
}
