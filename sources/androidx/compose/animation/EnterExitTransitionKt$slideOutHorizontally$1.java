package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class EnterExitTransitionKt$slideOutHorizontally$1 extends Lambda implements Function1<Integer, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final EnterExitTransitionKt$slideOutHorizontally$1 f2255z = new EnterExitTransitionKt$slideOutHorizontally$1();

    public EnterExitTransitionKt$slideOutHorizontally$1() {
        super(1);
    }

    public final Integer b(int i2) {
        return Integer.valueOf((-i2) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
