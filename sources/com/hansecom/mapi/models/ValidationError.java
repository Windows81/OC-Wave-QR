package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class ValidationError {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f39684f = {new ContextualSerializer(Reflection.b(ErrorCode.class), ErrorCode.Companion.serializer(), new KSerializer[0]), null, null, null, new ArrayListSerializer(StringSerializer.f42197a)};

    /* renamed from: a  reason: collision with root package name */
    public final ErrorCode f39685a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39686b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39687c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39688d;

    /* renamed from: e  reason: collision with root package name */
    public final List f39689e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValidationError> serializer() {
            return ValidationError$$serializer.f39690a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ValidationError(int i2, ErrorCode errorCode, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, ValidationError$$serializer.f39690a.a());
        }
        this.f39685a = errorCode;
        this.f39686b = str;
        if ((i2 & 4) == 0) {
            this.f39687c = null;
        } else {
            this.f39687c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39688d = null;
        } else {
            this.f39688d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39689e = null;
        } else {
            this.f39689e = list;
        }
    }

    public static final /* synthetic */ void f(ValidationError validationError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39684f;
        compositeEncoder.A(serialDescriptor, 0, kSerializerArr[0], validationError.f39685a);
        compositeEncoder.t(serialDescriptor, 1, validationError.f39686b);
        if (compositeEncoder.w(serialDescriptor, 2) || validationError.f39687c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, validationError.f39687c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || validationError.f39688d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, validationError.f39688d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || validationError.f39689e != null) {
            compositeEncoder.m(serialDescriptor, 4, kSerializerArr[4], validationError.f39689e);
        }
    }

    public final String b() {
        return this.f39686b;
    }

    public final String c() {
        return this.f39688d;
    }

    public final List d() {
        return this.f39689e;
    }

    public final String e() {
        return this.f39687c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationError)) {
            return false;
        }
        ValidationError validationError = (ValidationError) obj;
        return this.f39685a == validationError.f39685a && Intrinsics.d(this.f39686b, validationError.f39686b) && Intrinsics.d(this.f39687c, validationError.f39687c) && Intrinsics.d(this.f39688d, validationError.f39688d) && Intrinsics.d(this.f39689e, validationError.f39689e);
    }

    public int hashCode() {
        int hashCode = ((this.f39685a.hashCode() * 31) + this.f39686b.hashCode()) * 31;
        String str = this.f39687c;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39688d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f39689e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "ValidationError(code=" + this.f39685a + ", field=" + this.f39686b + ", message=" + this.f39687c + ", localizationKey=" + this.f39688d + ", localizationValues=" + this.f39689e + ')';
    }
}
