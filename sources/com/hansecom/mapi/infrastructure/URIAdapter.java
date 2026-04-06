package com.hansecom.mapi.infrastructure;

import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class URIAdapter implements KSerializer<URI> {

    /* renamed from: a  reason: collision with root package name */
    public static final URIAdapter f39158a = new URIAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39159b = SerialDescriptorsKt.c("URI", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39159b;
    }

    /* renamed from: f */
    public URI c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new URI(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, URI uri) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uri, "value");
        String aSCIIString = uri.toASCIIString();
        Intrinsics.h(aSCIIString, "toASCIIString(...)");
        encoder.G(aSCIIString);
    }
}
