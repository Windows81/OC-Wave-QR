package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.v6  reason: case insensitive filesystem */
public final /* synthetic */ class C0268v6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f14436A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f14437B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarHostState f14438z;

    public /* synthetic */ C0268v6(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, int i2, int i3) {
        this.f14438z = snackbarHostState;
        this.f14436A = modifier;
        this.f14437B = function3;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SnackbarHostKt.g(this.f14438z, this.f14436A, this.f14437B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
