package androidx.compose.material;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 f8210z = new ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2();

    public ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2() {
        super(1);
    }

    public final void b(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.d(1800);
        keyframesSpecConfig.e(keyframesSpecConfig.f(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f8167d);
        keyframesSpecConfig.f(Float.valueOf(1.0f), 750);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((KeyframesSpec.KeyframesSpecConfig) obj);
        return Unit.f40552a;
    }
}
