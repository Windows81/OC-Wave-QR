package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

public final class ResourceProto {

    /* renamed from: a  reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f27623a;

    /* renamed from: b  reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f27624b;

    /* renamed from: c  reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f27625c;

    static {
        DescriptorProtos.FieldOptions g0 = DescriptorProtos.FieldOptions.g0();
        ResourceReference f0 = ResourceReference.f0();
        ResourceReference f02 = ResourceReference.f0();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f27623a = GeneratedMessageLite.Z(g0, f0, f02, (Internal.EnumLiteMap) null, 1055, fieldType, ResourceReference.class);
        f27624b = GeneratedMessageLite.Y(DescriptorProtos.FileOptions.g0(), ResourceDescriptor.f0(), (Internal.EnumLiteMap) null, 1053, fieldType, false, ResourceDescriptor.class);
        f27625c = GeneratedMessageLite.Z(DescriptorProtos.MessageOptions.g0(), ResourceDescriptor.f0(), ResourceDescriptor.f0(), (Internal.EnumLiteMap) null, 1053, fieldType, ResourceDescriptor.class);
    }
}
