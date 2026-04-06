package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: z  reason: collision with root package name */
    public final ImmutableMap f29213z;

    public static final class Builder<B> {
    }

    /* renamed from: Q */
    public Map M() {
        return this.f29213z;
    }

    /* renamed from: S */
    public Object put(TypeToken typeToken, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }
}
