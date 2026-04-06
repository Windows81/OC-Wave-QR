package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata
public final class FastServiceLoaderKt {
    static {
        Object obj;
        try {
            Result.Companion companion = Result.f40519A;
            obj = Result.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        Result.h(obj);
    }

    public static final boolean a() {
        return true;
    }
}
