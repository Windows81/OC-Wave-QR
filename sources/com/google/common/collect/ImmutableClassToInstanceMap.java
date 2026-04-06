package com.google.common.collect;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@Immutable
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final ImmutableClassToInstanceMap f28134A = new ImmutableClassToInstanceMap(ImmutableMap.o());

    /* renamed from: z  reason: collision with root package name */
    public final ImmutableMap f28135z;

    public static final class Builder<B> {
    }

    public ImmutableClassToInstanceMap(ImmutableMap immutableMap) {
        this.f28135z = immutableMap;
    }

    /* renamed from: Q */
    public Map M() {
        return this.f28135z;
    }
}
