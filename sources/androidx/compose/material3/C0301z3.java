package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: androidx.compose.material3.z3  reason: case insensitive filesystem */
public final /* synthetic */ class C0301z3 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f14511A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Animatable f14512B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f14513z;

    public /* synthetic */ C0301z3(SheetState sheetState, CoroutineScope coroutineScope, Animatable animatable, Function0 function0) {
        this.f14513z = sheetState;
        this.f14511A = coroutineScope;
        this.f14512B = animatable;
        this.C = function0;
    }

    public final Object invoke() {
        return ModalBottomSheetKt.A(this.f14513z, this.f14511A, this.f14512B, this.C);
    }
}
