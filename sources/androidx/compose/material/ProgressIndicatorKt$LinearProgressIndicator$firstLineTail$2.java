package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 f8211z = new ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2();

    public ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2() {
        super(1);
    }

    public final void b(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.d(1800);
        keyframesSpecConfig.e(keyframesSpecConfig.f(Float.valueOf(0.0f), 333), ProgressIndicatorKt.f8168e);
        keyframesSpecConfig.f(Float.valueOf(1.0f), 1183);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((KeyframesSpec.KeyframesSpecConfig) obj);
        return Unit.f40552a;
    }
}
