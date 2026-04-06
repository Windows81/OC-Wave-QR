package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0082e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f12002A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DialogProperties f12003B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f12004z;

    public /* synthetic */ C0082e(Function0 function0, Modifier modifier, DialogProperties dialogProperties, Function2 function2, int i2, int i3) {
        this.f12004z = function0;
        this.f12002A = modifier;
        this.f12003B = dialogProperties;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AlertDialogKt.m(this.f12004z, this.f12002A, this.f12003B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
