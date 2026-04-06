package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

@Metadata
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    /* renamed from: a  reason: collision with root package name */
    public final String f42038a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialKind f42039b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42040c;

    /* renamed from: d  reason: collision with root package name */
    public final List f42041d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f42042e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f42043f;

    /* renamed from: g  reason: collision with root package name */
    public final SerialDescriptor[] f42044g;

    /* renamed from: h  reason: collision with root package name */
    public final List[] f42045h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean[] f42046i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f42047j;

    /* renamed from: k  reason: collision with root package name */
    public final SerialDescriptor[] f42048k;

    /* renamed from: l  reason: collision with root package name */
    public final Lazy f42049l;

    public SerialDescriptorImpl(String str, SerialKind serialKind, int i2, List list, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(serialKind, "kind");
        Intrinsics.i(list, "typeParameters");
        Intrinsics.i(classSerialDescriptorBuilder, "builder");
        this.f42038a = str;
        this.f42039b = serialKind;
        this.f42040c = i2;
        this.f42041d = classSerialDescriptorBuilder.c();
        this.f42042e = CollectionsKt.K0(classSerialDescriptorBuilder.f());
        String[] strArr = (String[]) classSerialDescriptorBuilder.f().toArray(new String[0]);
        this.f42043f = strArr;
        this.f42044g = Platform_commonKt.b(classSerialDescriptorBuilder.e());
        this.f42045h = (List[]) classSerialDescriptorBuilder.d().toArray(new List[0]);
        this.f42046i = CollectionsKt.G0(classSerialDescriptorBuilder.g());
        Iterable<IndexedValue> j1 = ArraysKt.j1(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(j1, 10));
        for (IndexedValue indexedValue : j1) {
            arrayList.add(TuplesKt.a(indexedValue.b(), Integer.valueOf(indexedValue.a())));
        }
        this.f42047j = MapsKt.q(arrayList);
        this.f42048k = Platform_commonKt.b(list);
        this.f42049l = LazyKt.b(new b(this));
    }

    public static final int n(SerialDescriptorImpl serialDescriptorImpl) {
        return PluginGeneratedSerialDescriptorKt.a(serialDescriptorImpl, serialDescriptorImpl.f42048k);
    }

    public static final CharSequence p(SerialDescriptorImpl serialDescriptorImpl, int i2) {
        return serialDescriptorImpl.g(i2) + ": " + serialDescriptorImpl.j(i2).a();
    }

    public String a() {
        return this.f42038a;
    }

    public Set b() {
        return this.f42042e;
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        Integer num = (Integer) this.f42047j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public SerialKind e() {
        return this.f42039b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.d(a(), serialDescriptor.a()) && Arrays.equals(this.f42048k, ((SerialDescriptorImpl) obj).f42048k) && f() == serialDescriptor.f()) {
                int f2 = f();
                int i2 = 0;
                while (i2 < f2) {
                    if (Intrinsics.d(j(i2).a(), serialDescriptor.j(i2).a()) && Intrinsics.d(j(i2).e(), serialDescriptor.j(i2).e())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f42040c;
    }

    public String g(int i2) {
        return this.f42043f[i2];
    }

    public List getAnnotations() {
        return this.f42041d;
    }

    public boolean h() {
        return SerialDescriptor.DefaultImpls.b(this);
    }

    public int hashCode() {
        return o();
    }

    public List i(int i2) {
        return this.f42045h[i2];
    }

    public SerialDescriptor j(int i2) {
        return this.f42044g[i2];
    }

    public boolean k(int i2) {
        return this.f42046i[i2];
    }

    public final int o() {
        return ((Number) this.f42049l.getValue()).intValue();
    }

    public String toString() {
        IntRange v2 = RangesKt.v(0, f());
        return CollectionsKt.n0(v2, ", ", a() + '(', ")", 0, (CharSequence) null, new a(this), 24, (Object) null);
    }
}
