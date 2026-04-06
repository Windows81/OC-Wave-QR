package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

final class TransportFactoryImpl implements TransportFactory {

    /* renamed from: a  reason: collision with root package name */
    public final Set f24061a;

    /* renamed from: b  reason: collision with root package name */
    public final TransportContext f24062b;

    /* renamed from: c  reason: collision with root package name */
    public final TransportInternal f24063c;

    public TransportFactoryImpl(Set set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f24061a = set;
        this.f24062b = transportContext;
        this.f24063c = transportInternal;
    }

    public Transport a(String str, Class cls, Encoding encoding, Transformer transformer) {
        if (this.f24061a.contains(encoding)) {
            return new TransportImpl(this.f24062b, str, encoding, transformer, this.f24063c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{encoding, this.f24061a}));
    }
}
