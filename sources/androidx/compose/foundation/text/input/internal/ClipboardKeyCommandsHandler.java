package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ClipboardKeyCommandsHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f6133a;

    public static Function1 a(Function1 function1) {
        return function1;
    }

    public static boolean b(Function1 function1, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && Intrinsics.d(function1, ((ClipboardKeyCommandsHandler) obj).e());
    }

    public static int c(Function1 function1) {
        return function1.hashCode();
    }

    public static String d(Function1 function1) {
        return "ClipboardKeyCommandsHandler(handler=" + function1 + ')';
    }

    public final /* synthetic */ Function1 e() {
        return this.f6133a;
    }

    public boolean equals(Object obj) {
        return b(this.f6133a, obj);
    }

    public int hashCode() {
        return c(this.f6133a);
    }

    public String toString() {
        return d(this.f6133a);
    }
}
