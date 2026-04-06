package com.google.common.io;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

@ElementTypesAreNonnullByDefault
public final class Resources {

    /* renamed from: com.google.common.io.Resources$1  reason: invalid class name */
    class AnonymousClass1 implements LineProcessor<List<String>> {
    }

    public static final class UrlByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final URL f29033a;

        public InputStream a() {
            return this.f29033a.openStream();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f29033a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Resources.asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }
}
