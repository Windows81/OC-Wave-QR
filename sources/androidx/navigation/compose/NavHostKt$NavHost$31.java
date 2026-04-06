package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$31 extends Lambda implements Function1<NavBackStackEntry, Object> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavHostKt$NavHost$31 f22553z = new NavHostKt$NavHost$31();

    public NavHostKt$NavHost$31() {
        super(1);
    }

    /* renamed from: b */
    public final Object invoke(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.h();
    }
}
