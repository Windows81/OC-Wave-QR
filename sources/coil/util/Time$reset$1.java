package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
final /* synthetic */ class Time$reset$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final Time$reset$1 I = new Time$reset$1();

    public Time$reset$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* renamed from: v */
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
