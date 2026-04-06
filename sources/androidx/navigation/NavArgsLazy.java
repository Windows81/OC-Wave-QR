package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class NavArgsLazy<Args extends NavArgs> implements Lazy<Args> {

    /* renamed from: A  reason: collision with root package name */
    public final Function0 f22177A;

    /* renamed from: B  reason: collision with root package name */
    public NavArgs f22178B;

    /* renamed from: z  reason: collision with root package name */
    public final KClass f22179z;

    /* renamed from: a */
    public NavArgs getValue() {
        NavArgs navArgs = this.f22178B;
        if (navArgs != null) {
            return navArgs;
        }
        Bundle bundle = (Bundle) this.f22177A.invoke();
        Method method = (Method) NavArgsLazyKt.a().get(this.f22179z);
        if (method == null) {
            Class a2 = JvmClassMappingKt.a(this.f22179z);
            Class[] b2 = NavArgsLazyKt.b();
            method = a2.getMethod("fromBundle", (Class[]) Arrays.copyOf(b2, b2.length));
            NavArgsLazyKt.a().put(this.f22179z, method);
            Intrinsics.h(method, "navArgsClass.java.getMet…                        }");
        }
        Object invoke = method.invoke((Object) null, new Object[]{bundle});
        Intrinsics.g(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        NavArgs navArgs2 = (NavArgs) invoke;
        this.f22178B = navArgs2;
        return navArgs2;
    }

    public boolean b() {
        return this.f22178B != null;
    }
}
