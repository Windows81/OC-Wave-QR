package com.hansecom.abt.util.resourcesResolvers;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class StringValueSerializer implements KSerializer<StringValue> {

    /* renamed from: a  reason: collision with root package name */
    public static final StringValueSerializer f39098a = new StringValueSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f39099b = SerialDescriptorsKt.c("StringValue", PrimitiveKind.STRING.f42037a);

    /* renamed from: c  reason: collision with root package name */
    public static final int f39100c = 8;

    public SerialDescriptor a() {
        return f39099b;
    }

    /* renamed from: f */
    public StringValue c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        String n2 = decoder.n();
        return (!StringsKt.W(n2, "_", false, 2, (Object) null) || StringsKt.W(n2, " ", false, 2, (Object) null)) ? new StringValue.Value(n2) : new StringValue.Key(n2, (Integer) null, (List) null, 6, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, StringValue stringValue) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(stringValue, "value");
        throw new SerializationException("StringValue does not support serialization.");
    }
}
