package org.bson.codecs.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bson.codecs.Codec;
import org.bson.internal.ProvidersCodecRegistry;

public final class CodecRegistries {
    public static CodecRegistry a(List list) {
        return d(new MapOfCodecsProvider(list));
    }

    public static CodecRegistry b(Codec... codecArr) {
        return a(Arrays.asList(codecArr));
    }

    public static CodecRegistry c(List list) {
        return new ProvidersCodecRegistry(list);
    }

    public static CodecRegistry d(CodecProvider... codecProviderArr) {
        return c(Arrays.asList(codecProviderArr));
    }

    public static CodecRegistry e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g((CodecRegistry) it.next()));
        }
        return new ProvidersCodecRegistry(arrayList);
    }

    public static CodecRegistry f(CodecRegistry... codecRegistryArr) {
        return e(Arrays.asList(codecRegistryArr));
    }

    public static CodecProvider g(final CodecRegistry codecRegistry) {
        return codecRegistry instanceof CodecProvider ? (CodecProvider) codecRegistry : new CodecProvider() {
            public Codec b(Class cls, CodecRegistry codecRegistry) {
                try {
                    return CodecRegistry.this.a(cls);
                } catch (CodecConfigurationException unused) {
                    return null;
                }
            }
        };
    }
}
