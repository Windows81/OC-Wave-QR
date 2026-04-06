package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DefaultPagerState$Companion$Saver$2 extends Lambda implements Function1<List, DefaultPagerState> {

    /* renamed from: z  reason: collision with root package name */
    public static final DefaultPagerState$Companion$Saver$2 f5228z = new DefaultPagerState$Companion$Saver$2();

    public DefaultPagerState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: b */
    public final DefaultPagerState invoke(final List list) {
        Object obj = list.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new DefaultPagerState(intValue, ((Float) obj2).floatValue(), new Function0<Integer>() {
            public final Integer invoke() {
                Object obj = list.get(2);
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        });
    }
}
