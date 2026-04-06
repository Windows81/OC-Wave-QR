package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class SavedStateCodecUtils_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerialDescriptor f22860a;

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f22861b;

    /* renamed from: c  reason: collision with root package name */
    public static final SerialDescriptor f22862c = new PolymorphicSerializer(Reflection.b(Serializable.class)).a();

    /* renamed from: d  reason: collision with root package name */
    public static final SerialDescriptor f22863d = new PolymorphicSerializer(Reflection.b(IBinder.class)).a();

    /* renamed from: e  reason: collision with root package name */
    public static final SerialDescriptor f22864e;

    /* renamed from: f  reason: collision with root package name */
    public static final SerialDescriptor f22865f;

    /* renamed from: g  reason: collision with root package name */
    public static final SerialDescriptor f22866g;

    /* renamed from: h  reason: collision with root package name */
    public static final SerialDescriptor f22867h;

    /* renamed from: i  reason: collision with root package name */
    public static final SerialDescriptor f22868i;

    /* renamed from: j  reason: collision with root package name */
    public static final SerialDescriptor f22869j;

    /* renamed from: k  reason: collision with root package name */
    public static final SerialDescriptor f22870k;

    /* renamed from: l  reason: collision with root package name */
    public static final SerialDescriptor f22871l;

    /* renamed from: m  reason: collision with root package name */
    public static final SerialDescriptor f22872m;

    /* renamed from: n  reason: collision with root package name */
    public static final SerialDescriptor f22873n;

    /* renamed from: o  reason: collision with root package name */
    public static final SerialDescriptor f22874o;

    static {
        Class<CharSequence> cls = CharSequence.class;
        f22860a = new PolymorphicSerializer(Reflection.b(cls)).a();
        Class<Parcelable> cls2 = Parcelable.class;
        f22861b = new PolymorphicSerializer(Reflection.b(cls2)).a();
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.f22904b;
        f22864e = BuiltinSerializersKt.a(Reflection.b(cls2), defaultParcelableSerializer).a();
        f22865f = BuiltinSerializersKt.a(Reflection.b(cls2), new PolymorphicSerializer(Reflection.b(cls2))).a();
        f22866g = BuiltinSerializersKt.h(defaultParcelableSerializer).a();
        f22867h = BuiltinSerializersKt.h(new PolymorphicSerializer(Reflection.b(cls2))).a();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f22901a;
        f22868i = BuiltinSerializersKt.a(Reflection.b(cls), charSequenceSerializer).a();
        f22869j = BuiltinSerializersKt.a(Reflection.b(cls), new PolymorphicSerializer(Reflection.b(cls))).a();
        f22870k = BuiltinSerializersKt.h(charSequenceSerializer).a();
        f22871l = BuiltinSerializersKt.h(new PolymorphicSerializer(Reflection.b(cls))).a();
        f22872m = new SparseArraySerializer(defaultParcelableSerializer).a();
        f22873n = new SparseArraySerializer(new PolymorphicSerializer(Reflection.b(cls2))).a();
        f22874o = new SparseArraySerializer(BuiltinSerializersKt.u(new PolymorphicSerializer(Reflection.b(cls2)))).a();
    }

    public static final SerialDescriptor a() {
        return f22868i;
    }

    public static final SerialDescriptor b() {
        return f22870k;
    }

    public static final SerialDescriptor c() {
        return f22874o;
    }

    public static final SerialDescriptor d() {
        return f22864e;
    }

    public static final SerialDescriptor e() {
        return f22866g;
    }

    public static final SerialDescriptor f() {
        return f22869j;
    }

    public static final SerialDescriptor g() {
        return f22860a;
    }

    public static final SerialDescriptor h() {
        return f22871l;
    }

    public static final SerialDescriptor i() {
        return f22863d;
    }

    public static final SerialDescriptor j() {
        return f22862c;
    }

    public static final SerialDescriptor k() {
        return f22865f;
    }

    public static final SerialDescriptor l() {
        return f22861b;
    }

    public static final SerialDescriptor m() {
        return f22867h;
    }

    public static final SerialDescriptor n() {
        return f22873n;
    }

    public static final SerialDescriptor o() {
        return f22872m;
    }
}
