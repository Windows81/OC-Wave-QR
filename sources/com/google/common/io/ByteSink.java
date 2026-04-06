package com.google.common.io;

import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
public abstract class ByteSink {

    public final class AsCharSink extends CharSink {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f28973a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ByteSink f28974b;

        public String toString() {
            String obj = this.f28974b.toString();
            String valueOf = String.valueOf(this.f28973a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 13 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSink(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }
}
