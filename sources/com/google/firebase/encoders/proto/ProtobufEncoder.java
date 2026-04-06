package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class ProtobufEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final Map f30737a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f30738b;

    /* renamed from: c  reason: collision with root package name */
    public final ObjectEncoder f30739c;

    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d  reason: collision with root package name */
        public static final ObjectEncoder f30740d = new b();

        /* renamed from: a  reason: collision with root package name */
        public final Map f30741a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map f30742b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public ObjectEncoder f30743c = f30740d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, ObjectEncoderContext objectEncoderContext) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder c() {
            return new ProtobufEncoder(new HashMap(this.f30741a), new HashMap(this.f30742b), this.f30743c);
        }

        public Builder d(Configurator configurator) {
            configurator.a(this);
            return this;
        }

        /* renamed from: f */
        public Builder a(Class cls, ObjectEncoder objectEncoder) {
            this.f30741a.put(cls, objectEncoder);
            this.f30742b.remove(cls);
            return this;
        }
    }

    public ProtobufEncoder(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f30737a = map;
        this.f30738b = map2;
        this.f30739c = objectEncoder;
    }

    public static Builder a() {
        return new Builder();
    }

    public void b(Object obj, OutputStream outputStream) {
        new ProtobufDataEncoderContext(outputStream, this.f30737a, this.f30738b, this.f30739c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
