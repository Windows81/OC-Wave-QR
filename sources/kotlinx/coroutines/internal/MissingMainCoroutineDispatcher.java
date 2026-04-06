package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {

    /* renamed from: B  reason: collision with root package name */
    public final Throwable f41858B;
    public final String C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? null : str);
    }

    public CoroutineDispatcher E0(int i2, String str) {
        S0();
        throw new KotlinNothingValueException();
    }

    public MainCoroutineDispatcher H0() {
        return this;
    }

    /* renamed from: L0 */
    public Void o0(CoroutineContext coroutineContext, Runnable runnable) {
        S0();
        throw new KotlinNothingValueException();
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        S0();
        throw new KotlinNothingValueException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void S0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f41858B
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.C
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f41858B
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            kotlinx.coroutines.internal.MainDispatchersKt.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.MissingMainCoroutineDispatcher.S0():java.lang.Void");
    }

    /* renamed from: U0 */
    public Void f(long j2, CancellableContinuation cancellableContinuation) {
        S0();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f41858B != null) {
            str = ", cause=" + this.f41858B;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public boolean w0(CoroutineContext coroutineContext) {
        S0();
        throw new KotlinNothingValueException();
    }

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.f41858B = th;
        this.C = str;
    }
}
