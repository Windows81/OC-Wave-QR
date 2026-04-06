package androidx.compose.runtime.tooling;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DiagnosticComposeException extends RuntimeException {

    /* renamed from: z  reason: collision with root package name */
    public final List f15396z;

    public DiagnosticComposeException(List list) {
        this.f15396z = list;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Composition stack when thrown:");
        Intrinsics.h(sb, "append(...)");
        sb.append(10);
        Intrinsics.h(sb, "append(...)");
        ComposeStackTraceKt.a(sb, this.f15396z);
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }
}
