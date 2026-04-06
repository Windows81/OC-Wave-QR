package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 f8190z = new ProgressIndicatorKt$CircularProgressIndicator$endAngle$2();

    public ProgressIndicatorKt$CircularProgressIndicator$endAngle$2() {
        super(1);
    }

    public final void b(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.d(1332);
        keyframesSpecConfig.e(keyframesSpecConfig.f(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f8171h);
        keyframesSpecConfig.f(Float.valueOf(290.0f), 666);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((KeyframesSpec.KeyframesSpecConfig) obj);
        return Unit.f40552a;
    }
}
