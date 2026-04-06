package kotlinx.serialization.builtins;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;

@Metadata
public final class BuiltinSerializersKt {
    public static final KSerializer A(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.i(booleanCompanionObject, "<this>");
        return BooleanSerializer.f42073a;
    }

    public static final KSerializer B(ByteCompanionObject byteCompanionObject) {
        Intrinsics.i(byteCompanionObject, "<this>");
        return ByteSerializer.f42078a;
    }

    public static final KSerializer C(CharCompanionObject charCompanionObject) {
        Intrinsics.i(charCompanionObject, "<this>");
        return CharSerializer.f42085a;
    }

    public static final KSerializer D(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.i(doubleCompanionObject, "<this>");
        return DoubleSerializer.f42102a;
    }

    public static final KSerializer E(FloatCompanionObject floatCompanionObject) {
        Intrinsics.i(floatCompanionObject, "<this>");
        return FloatSerializer.f42120a;
    }

    public static final KSerializer F(IntCompanionObject intCompanionObject) {
        Intrinsics.i(intCompanionObject, "<this>");
        return IntSerializer.f42129a;
    }

    public static final KSerializer G(LongCompanionObject longCompanionObject) {
        Intrinsics.i(longCompanionObject, "<this>");
        return LongSerializer.f42142a;
    }

    public static final KSerializer H(ShortCompanionObject shortCompanionObject) {
        Intrinsics.i(shortCompanionObject, "<this>");
        return ShortSerializer.f42195a;
    }

    public static final KSerializer I(StringCompanionObject stringCompanionObject) {
        Intrinsics.i(stringCompanionObject, "<this>");
        return StringSerializer.f42197a;
    }

    public static final KSerializer J(Duration.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return DurationSerializer.f42104a;
    }

    public static final KSerializer K(Uuid.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return UuidSerializer.f42229a;
    }

    public static final KSerializer a(KClass kClass, KSerializer kSerializer) {
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(kSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, kSerializer);
    }

    public static final KSerializer b() {
        return BooleanArraySerializer.f42072c;
    }

    public static final KSerializer c() {
        return ByteArraySerializer.f42077c;
    }

    public static final KSerializer d() {
        return CharArraySerializer.f42084c;
    }

    public static final KSerializer e() {
        return DoubleArraySerializer.f42101c;
    }

    public static final KSerializer f() {
        return FloatArraySerializer.f42119c;
    }

    public static final KSerializer g() {
        return IntArraySerializer.f42128c;
    }

    public static final KSerializer h(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "elementSerializer");
        return new ArrayListSerializer(kSerializer);
    }

    public static final KSerializer i() {
        return LongArraySerializer.f42141c;
    }

    public static final KSerializer j(KSerializer kSerializer, KSerializer kSerializer2) {
        Intrinsics.i(kSerializer, "keySerializer");
        Intrinsics.i(kSerializer2, "valueSerializer");
        return new MapEntrySerializer(kSerializer, kSerializer2);
    }

    public static final KSerializer k(KSerializer kSerializer, KSerializer kSerializer2) {
        Intrinsics.i(kSerializer, "keySerializer");
        Intrinsics.i(kSerializer2, "valueSerializer");
        return new LinkedHashMapSerializer(kSerializer, kSerializer2);
    }

    public static final KSerializer l() {
        return NothingSerializer.f42159a;
    }

    public static final KSerializer m(KSerializer kSerializer, KSerializer kSerializer2) {
        Intrinsics.i(kSerializer, "keySerializer");
        Intrinsics.i(kSerializer2, "valueSerializer");
        return new PairSerializer(kSerializer, kSerializer2);
    }

    public static final KSerializer n(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "elementSerializer");
        return new LinkedHashSetSerializer(kSerializer);
    }

    public static final KSerializer o() {
        return ShortArraySerializer.f42194c;
    }

    public static final KSerializer p(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        Intrinsics.i(kSerializer, "aSerializer");
        Intrinsics.i(kSerializer2, "bSerializer");
        Intrinsics.i(kSerializer3, "cSerializer");
        return new TripleSerializer(kSerializer, kSerializer2, kSerializer3);
    }

    public static final KSerializer q() {
        return UByteArraySerializer.f42209c;
    }

    public static final KSerializer r() {
        return UIntArraySerializer.f42214c;
    }

    public static final KSerializer s() {
        return ULongArraySerializer.f42219c;
    }

    public static final KSerializer t() {
        return UShortArraySerializer.f42224c;
    }

    public static final KSerializer u(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "<this>");
        return kSerializer.a().c() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static final KSerializer v(UByte.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return UByteSerializer.f42210a;
    }

    public static final KSerializer w(UInt.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return UIntSerializer.f42215a;
    }

    public static final KSerializer x(ULong.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return ULongSerializer.f42220a;
    }

    public static final KSerializer y(UShort.Companion companion) {
        Intrinsics.i(companion, "<this>");
        return UShortSerializer.f42225a;
    }

    public static final KSerializer z(Unit unit) {
        Intrinsics.i(unit, "<this>");
        return UnitSerializer.f42227b;
    }
}
