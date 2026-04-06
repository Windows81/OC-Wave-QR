package com.hansecom.mapi.infrastructure;

import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class URLAdapter implements KSerializer<URL> {

    /* renamed from: a  reason: collision with root package name */
    public static final URLAdapter f39160a = new URLAdapter();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39161b = SerialDescriptorsKt.c("URL", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f39161b;
    }

    /* renamed from: f */
    public URL c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return new URL(decoder.n());
    }

    /* renamed from: g */
    public void d(Encoder encoder, URL url) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(url, "value");
        String externalForm = url.toExternalForm();
        Intrinsics.h(externalForm, "toExternalForm(...)");
        encoder.G(externalForm);
    }
}
