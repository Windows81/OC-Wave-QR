package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30744a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30745b = false;

    /* renamed from: c  reason: collision with root package name */
    public FieldDescriptor f30746c;

    /* renamed from: d  reason: collision with root package name */
    public final ProtobufDataEncoderContext f30747d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f30747d = protobufDataEncoderContext;
    }

    public final void a() {
        if (!this.f30744a) {
            this.f30744a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public void b(FieldDescriptor fieldDescriptor, boolean z2) {
        this.f30744a = false;
        this.f30746c = fieldDescriptor;
        this.f30745b = z2;
    }

    public ValueEncoderContext e(String str) {
        a();
        this.f30747d.i(this.f30746c, str, this.f30745b);
        return this;
    }

    public ValueEncoderContext f(boolean z2) {
        a();
        this.f30747d.o(this.f30746c, z2, this.f30745b);
        return this;
    }
}
