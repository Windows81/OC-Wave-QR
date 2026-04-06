package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class ArrayPoolsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f42355a;

    static {
        Object obj;
        try {
            Result.Companion companion = Result.f40519A;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.h(property, "getProperty(...)");
            obj = Result.b(StringsKt.q(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (Result.g(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        f42355a = num != null ? num.intValue() : 2097152;
    }
}
