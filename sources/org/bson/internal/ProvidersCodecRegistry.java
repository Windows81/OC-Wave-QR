package org.bson.internal;

import java.util.ArrayList;
import java.util.List;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

public final class ProvidersCodecRegistry implements CodecRegistry, CodecProvider, CycleDetectingCodecRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final List f43897a;

    /* renamed from: b  reason: collision with root package name */
    public final CodecCache f43898b = new CodecCache();

    public ProvidersCodecRegistry(List list) {
        Assertions.c("codecProviders must not be null or empty", list != null && list.size() > 0);
        this.f43897a = new ArrayList(list);
    }

    public Codec a(Class cls) {
        return c(new ChildCodecRegistry((CycleDetectingCodecRegistry) this, cls));
    }

    public Codec b(Class cls, CodecRegistry codecRegistry) {
        for (CodecProvider b2 : this.f43897a) {
            Codec b3 = b2.b(cls, codecRegistry);
            if (b3 != null) {
                return b3;
            }
        }
        return null;
    }

    public Codec c(ChildCodecRegistry childCodecRegistry) {
        if (!this.f43898b.a(childCodecRegistry.b())) {
            for (CodecProvider b2 : this.f43897a) {
                Codec b3 = b2.b(childCodecRegistry.b(), childCodecRegistry);
                if (b3 != null) {
                    this.f43898b.c(childCodecRegistry.b(), b3);
                    return b3;
                }
            }
            this.f43898b.c(childCodecRegistry.b(), (Codec) null);
        }
        return this.f43898b.b(childCodecRegistry.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProvidersCodecRegistry.class != obj.getClass()) {
            return false;
        }
        ProvidersCodecRegistry providersCodecRegistry = (ProvidersCodecRegistry) obj;
        if (this.f43897a.size() != providersCodecRegistry.f43897a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f43897a.size(); i2++) {
            if (((CodecProvider) this.f43897a.get(i2)).getClass() != ((CodecProvider) providersCodecRegistry.f43897a.get(i2)).getClass()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f43897a.hashCode();
    }
}
