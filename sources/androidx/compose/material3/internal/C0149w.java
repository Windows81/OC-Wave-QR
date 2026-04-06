package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.internal.w  reason: case insensitive filesystem */
public final /* synthetic */ class C0149w implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12458A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f12459B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PredictiveBackState f12460z;

    public /* synthetic */ C0149w(PredictiveBackState predictiveBackState, boolean z2, Function0 function0, int i2, int i3) {
        this.f12460z = predictiveBackState;
        this.f12458A = z2;
        this.f12459B = function0;
        this.C = i2;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BasicEdgeToEdgeDialogKt.d(this.f12460z, this.f12458A, this.f12459B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
