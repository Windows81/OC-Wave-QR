package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class SavedStateCodecUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerialDescriptor f22851a = BuiltinSerializersKt.h(BuiltinSerializersKt.F(IntCompanionObject.f40897a)).a();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22852b;

    /* renamed from: c  reason: collision with root package name */
    public static final SerialDescriptor f22853c = BuiltinSerializersKt.b().a();

    /* renamed from: d  reason: collision with root package name */
    public static final SerialDescriptor f22854d = BuiltinSerializersKt.d().a();

    /* renamed from: e  reason: collision with root package name */
    public static final SerialDescriptor f22855e = BuiltinSerializersKt.e().a();

    /* renamed from: f  reason: collision with root package name */
    public static final SerialDescriptor f22856f = BuiltinSerializersKt.f().a();

    /* renamed from: g  reason: collision with root package name */
    public static final SerialDescriptor f22857g = BuiltinSerializersKt.g().a();

    /* renamed from: h  reason: collision with root package name */
    public static final SerialDescriptor f22858h = BuiltinSerializersKt.i().a();

    /* renamed from: i  reason: collision with root package name */
    public static final SerialDescriptor f22859i;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        f22852b = BuiltinSerializersKt.h(BuiltinSerializersKt.I(stringCompanionObject)).a();
        f22859i = BuiltinSerializersKt.a(Reflection.b(String.class), BuiltinSerializersKt.I(stringCompanionObject)).a();
    }

    public static final SerialDescriptor a() {
        return f22853c;
    }

    public static final SerialDescriptor b() {
        return f22854d;
    }

    public static final SerialDescriptor c() {
        return f22855e;
    }

    public static final SerialDescriptor d() {
        return f22856f;
    }

    public static final SerialDescriptor e() {
        return f22857g;
    }

    public static final SerialDescriptor f() {
        return f22851a;
    }

    public static final SerialDescriptor g() {
        return f22858h;
    }

    public static final SerialDescriptor h() {
        return f22859i;
    }

    public static final SerialDescriptor i() {
        return f22852b;
    }
}
