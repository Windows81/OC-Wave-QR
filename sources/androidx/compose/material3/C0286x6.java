package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.x6  reason: case insensitive filesystem */
public final /* synthetic */ class C0286x6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f14474A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f14475B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f14476z;

    public /* synthetic */ C0286x6(SnackbarData snackbarData, Modifier modifier, Function3 function3, int i2, int i3) {
        this.f14476z = snackbarData;
        this.f14474A = modifier;
        this.f14475B = function3;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SnackbarHostKt.e(this.f14476z, this.f14474A, this.f14475B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
