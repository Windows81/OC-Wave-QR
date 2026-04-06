package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SemanticsModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f18086a = new AtomicInteger(0);

    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new ClearAndSetSemanticsElement(function1));
    }

    public static final int b() {
        return f18086a.addAndGet(1);
    }

    public static final Modifier c(Modifier modifier, boolean z2, Function1 function1) {
        return modifier.o0(new AppendedSemanticsElement(z2, function1));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return c(modifier, z2, function1);
    }
}
