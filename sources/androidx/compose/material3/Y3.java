package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Y3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f11814A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetProperties f11815B;
    public final /* synthetic */ Animatable C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11816z;

    public /* synthetic */ Y3(Function0 function0, long j2, ModalBottomSheetProperties modalBottomSheetProperties, Animatable animatable, Function2 function2, int i2) {
        this.f11816z = function0;
        this.f11814A = j2;
        this.f11815B = modalBottomSheetProperties;
        this.C = animatable;
        this.D = function2;
        this.E = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return ModalBottomSheet_androidKt.h(this.f11816z, this.f11814A, this.f11815B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
