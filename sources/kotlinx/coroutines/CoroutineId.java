package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    /* renamed from: B  reason: collision with root package name */
    public static final Key f41381B = new Key((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final long f41382A;

    @Metadata
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.f41382A == ((CoroutineId) obj).f41382A;
    }

    public int hashCode() {
        return Long.hashCode(this.f41382A);
    }

    public final long o0() {
        return this.f41382A;
    }

    /* renamed from: t0 */
    public void X(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    public String toString() {
        return "CoroutineId(" + this.f41382A + ')';
    }

    /* renamed from: w0 */
    public String n0(CoroutineContext coroutineContext) {
        String str;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.d(CoroutineName.f41383B);
        if (coroutineName == null || (str = coroutineName.o0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int q0 = StringsKt.q0(name, " @", 0, false, 6, (Object) null);
        if (q0 < 0) {
            q0 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + q0 + 10);
        String substring = name.substring(0, q0);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f41382A);
        currentThread.setName(sb.toString());
        return name;
    }
}
