package org.bson.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecConfigurationException;

final class CodecCache {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap f43888a = new ConcurrentHashMap();

    public boolean a(Class cls) {
        return this.f43888a.containsKey(cls);
    }

    public Codec b(Class cls) {
        if (this.f43888a.containsKey(cls)) {
            Optional optional = (Optional) this.f43888a.get(cls);
            if (!optional.b()) {
                return (Codec) optional.a();
            }
        }
        throw new CodecConfigurationException(String.format("Can't find a codec for %s.", new Object[]{cls}));
    }

    public void c(Class cls, Codec codec) {
        this.f43888a.put(cls, Optional.c(codec));
    }
}
