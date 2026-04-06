package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

@Metadata
public final class StackTraceRecoveryKt {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement f41866a = new ArtificialStackFrames().a();

    /* renamed from: b  reason: collision with root package name */
    public static final String f41867b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f41868c;

    static {
        Object obj;
        Object obj2;
        try {
            Result.Companion companion = Result.f40519A;
            obj = Result.b(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        if (Result.e(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f41867b = (String) obj;
        try {
            obj2 = Result.b(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.f40519A;
            obj2 = Result.b(ResultKt.a(th2));
        }
        if (Result.e(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f41868c = (String) obj2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
