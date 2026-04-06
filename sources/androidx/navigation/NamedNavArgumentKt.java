package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NamedNavArgumentKt {
    public static final NamedNavArgument a(String str, Function1 function1) {
        Intrinsics.i(str, "name");
        Intrinsics.i(function1, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        function1.invoke(navArgumentBuilder);
        return new NamedNavArgument(str, navArgumentBuilder.a());
    }
}
