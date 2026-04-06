package androidx.activity.result;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

@Metadata
public final class ActivityResultRegistry$generateRandomNumber$1 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public static final ActivityResultRegistry$generateRandomNumber$1 f236z = new ActivityResultRegistry$generateRandomNumber$1();

    public ActivityResultRegistry$generateRandomNumber$1() {
        super(0);
    }

    public final Integer invoke() {
        return Integer.valueOf(Random.f40940z.i(2147418112) + 65536);
    }
}
