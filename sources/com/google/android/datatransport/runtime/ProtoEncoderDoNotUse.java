package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;

@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a  reason: collision with root package name */
    public static final ProtobufEncoder f24058a = ProtobufEncoder.a().d(AutoProtoEncoderDoNotUseEncoder.f23993a).c();

    public static byte[] a(Object obj) {
        return f24058a.c(obj);
    }

    public abstract ClientMetrics b();
}
