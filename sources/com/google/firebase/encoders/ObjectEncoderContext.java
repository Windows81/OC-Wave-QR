package com.google.firebase.encoders;

public interface ObjectEncoderContext {
    ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2);

    ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j2);

    ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i2);

    ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d2);

    ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj);
}
