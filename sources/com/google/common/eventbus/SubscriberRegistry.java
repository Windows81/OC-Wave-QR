package com.google.common.eventbus;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class SubscriberRegistry {

    /* renamed from: a  reason: collision with root package name */
    public static final LoadingCache f28717a = CacheBuilder.q().s().a(new CacheLoader<Class<?>, ImmutableList<Method>>() {
        /* renamed from: c */
        public ImmutableList a(Class cls) {
            return SubscriberRegistry.b(cls);
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final LoadingCache f28718b = CacheBuilder.q().s().a(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() {
        /* renamed from: c */
        public ImmutableSet a(Class cls) {
            return ImmutableSet.z(TypeToken.n(cls).m().b0());
        }
    });

    public static final class MethodIdentifier {

        /* renamed from: a  reason: collision with root package name */
        public final String f28719a;

        /* renamed from: b  reason: collision with root package name */
        public final List f28720b;

        public MethodIdentifier(Method method) {
            this.f28719a = method.getName();
            this.f28720b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MethodIdentifier)) {
                return false;
            }
            MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
            return this.f28719a.equals(methodIdentifier.f28719a) && this.f28720b.equals(methodIdentifier.f28720b);
        }

        public int hashCode() {
            return Objects.b(this.f28719a, this.f28720b);
        }
    }

    public static ImmutableList b(Class cls) {
        Set<Class> b0 = TypeToken.n(cls).m().b0();
        HashMap z2 = Maps.z();
        for (Class declaredMethods : b0) {
            for (Method method : declaredMethods.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class[] parameterTypes = method.getParameterTypes();
                    Preconditions.k(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    Preconditions.m(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), Primitives.b(parameterTypes[0]).getSimpleName());
                    MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                    if (!z2.containsKey(methodIdentifier)) {
                        z2.put(methodIdentifier, method);
                    }
                }
            }
        }
        return ImmutableList.w(z2.values());
    }
}
