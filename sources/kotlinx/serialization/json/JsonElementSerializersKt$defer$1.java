package kotlinx.serialization.json;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata
public final class JsonElementSerializersKt$defer$1 implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f42312a;

    public JsonElementSerializersKt$defer$1(Function0 function0) {
        this.f42312a = LazyKt.b(function0);
    }

    public String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.f42312a.getValue();
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        return b().d(str);
    }

    public SerialKind e() {
        return b().e();
    }

    public int f() {
        return b().f();
    }

    public String g(int i2) {
        return b().g(i2);
    }

    public List getAnnotations() {
        return SerialDescriptor.DefaultImpls.a(this);
    }

    public boolean h() {
        return SerialDescriptor.DefaultImpls.b(this);
    }

    public List i(int i2) {
        return b().i(i2);
    }

    public SerialDescriptor j(int i2) {
        return b().j(i2);
    }

    public boolean k(int i2) {
        return b().k(i2);
    }
}
