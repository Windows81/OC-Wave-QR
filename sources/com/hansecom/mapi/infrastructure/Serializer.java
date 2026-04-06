package com.hansecom.mapi.infrastructure;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;

@Metadata
public final class Serializer {

    /* renamed from: a  reason: collision with root package name */
    public static final Serializer f39151a = new Serializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerializersModule f39152b;

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f39153c = LazyKt.b(Serializer$kotlinxSerializationJson$2.f39154z);

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.d(Reflection.b(BigDecimal.class), BigDecimalAdapter.f39140a);
        serializersModuleBuilder.d(Reflection.b(BigInteger.class), BigIntegerAdapter.f39142a);
        serializersModuleBuilder.d(Reflection.b(LocalDate.class), LocalDateAdapter.f39145a);
        serializersModuleBuilder.d(Reflection.b(LocalDateTime.class), LocalDateTimeAdapter.f39147a);
        serializersModuleBuilder.d(Reflection.b(OffsetDateTime.class), OffsetDateTimeAdapter.f39149a);
        serializersModuleBuilder.d(Reflection.b(UUID.class), UUIDAdapter.f39162a);
        serializersModuleBuilder.d(Reflection.b(AtomicInteger.class), AtomicIntegerAdapter.f39136a);
        serializersModuleBuilder.d(Reflection.b(AtomicLong.class), AtomicLongAdapter.f39138a);
        serializersModuleBuilder.d(Reflection.b(AtomicBoolean.class), AtomicBooleanAdapter.f39134a);
        serializersModuleBuilder.d(Reflection.b(URI.class), URIAdapter.f39158a);
        serializersModuleBuilder.d(Reflection.b(URL.class), URLAdapter.f39160a);
        serializersModuleBuilder.d(Reflection.b(StringBuilder.class), StringBuilderAdapter.f39156a);
        f39152b = serializersModuleBuilder.f();
    }

    public static final SerializersModule a() {
        return f39152b;
    }

    public static final Json b() {
        return (Json) f39153c.getValue();
    }
}
