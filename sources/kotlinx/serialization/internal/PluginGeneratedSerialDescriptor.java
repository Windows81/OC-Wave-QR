package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    /* renamed from: a  reason: collision with root package name */
    public final String f42169a;

    /* renamed from: b  reason: collision with root package name */
    public final GeneratedSerializer f42170b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42171c;

    /* renamed from: d  reason: collision with root package name */
    public int f42172d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f42173e;

    /* renamed from: f  reason: collision with root package name */
    public final List[] f42174f;

    /* renamed from: g  reason: collision with root package name */
    public List f42175g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f42176h;

    /* renamed from: i  reason: collision with root package name */
    public Map f42177i;

    /* renamed from: j  reason: collision with root package name */
    public final Lazy f42178j;

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f42179k;

    /* renamed from: l  reason: collision with root package name */
    public final Lazy f42180l;

    public PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i2) {
        Intrinsics.i(str, "serialName");
        this.f42169a = str;
        this.f42170b = generatedSerializer;
        this.f42171c = i2;
        this.f42172d = -1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f42173e = strArr;
        int i4 = this.f42171c;
        this.f42174f = new List[i4];
        this.f42176h = new boolean[i4];
        this.f42177i = MapsKt.h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f42178j = LazyKt.a(lazyThreadSafetyMode, new i(this));
        this.f42179k = LazyKt.a(lazyThreadSafetyMode, new j(this));
        this.f42180l = LazyKt.a(lazyThreadSafetyMode, new k(this));
    }

    public static final SerialDescriptor[] A(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer[] b2;
        GeneratedSerializer generatedSerializer = pluginGeneratedSerialDescriptor.f42170b;
        if (generatedSerializer == null || (b2 = generatedSerializer.b()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(b2.length);
            for (KSerializer a2 : b2) {
                arrayList.add(a2.a());
            }
        }
        return Platform_commonKt.b(arrayList);
    }

    public static final int p(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.v());
    }

    public static /* synthetic */ void r(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            pluginGeneratedSerialDescriptor.q(str, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.KSerializer[] t(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r0) {
        /*
            kotlinx.serialization.internal.GeneratedSerializer r0 = r0.f42170b
            if (r0 == 0) goto L_0x000a
            kotlinx.serialization.KSerializer[] r0 = r0.e()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            kotlinx.serialization.KSerializer[] r0 = kotlinx.serialization.internal.PluginHelperInterfacesKt.f42181a
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.t(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor):kotlinx.serialization.KSerializer[]");
    }

    private final int w() {
        return ((Number) this.f42180l.getValue()).intValue();
    }

    public static final CharSequence z(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i2) {
        return pluginGeneratedSerialDescriptor.g(i2) + ": " + pluginGeneratedSerialDescriptor.j(i2).a();
    }

    public String a() {
        return this.f42169a;
    }

    public Set b() {
        return this.f42177i.keySet();
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        Integer num = (Integer) this.f42177i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public SerialKind e() {
        return StructureKind.CLASS.f42058a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.d(a(), serialDescriptor.a()) && Arrays.equals(v(), ((PluginGeneratedSerialDescriptor) obj).v()) && f() == serialDescriptor.f()) {
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

    public final int f() {
        return this.f42171c;
    }

    public String g(int i2) {
        return this.f42173e[i2];
    }

    public List getAnnotations() {
        List list = this.f42175g;
        return list == null ? CollectionsKt.m() : list;
    }

    public boolean h() {
        return SerialDescriptor.DefaultImpls.b(this);
    }

    public int hashCode() {
        return w();
    }

    public List i(int i2) {
        List list = this.f42174f[i2];
        return list == null ? CollectionsKt.m() : list;
    }

    public SerialDescriptor j(int i2) {
        return u()[i2].a();
    }

    public boolean k(int i2) {
        return this.f42176h[i2];
    }

    public final void q(String str, boolean z2) {
        Intrinsics.i(str, "name");
        String[] strArr = this.f42173e;
        int i2 = this.f42172d + 1;
        this.f42172d = i2;
        strArr[i2] = str;
        this.f42176h[i2] = z2;
        this.f42174f[i2] = null;
        if (i2 == this.f42171c - 1) {
            this.f42177i = s();
        }
    }

    public final Map s() {
        HashMap hashMap = new HashMap();
        int length = this.f42173e.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(this.f42173e[i2], Integer.valueOf(i2));
        }
        return hashMap;
    }

    public String toString() {
        IntRange v2 = RangesKt.v(0, this.f42171c);
        return CollectionsKt.n0(v2, ", ", a() + '(', ")", 0, (CharSequence) null, new h(this), 24, (Object) null);
    }

    public final KSerializer[] u() {
        return (KSerializer[]) this.f42178j.getValue();
    }

    public final SerialDescriptor[] v() {
        return (SerialDescriptor[]) this.f42179k.getValue();
    }

    public final void x(Annotation annotation) {
        Intrinsics.i(annotation, "annotation");
        List list = this.f42174f[this.f42172d];
        if (list == null) {
            list = new ArrayList(1);
            this.f42174f[this.f42172d] = list;
        }
        list.add(annotation);
    }

    public final void y(Annotation annotation) {
        Intrinsics.i(annotation, "a");
        if (this.f42175g == null) {
            this.f42175g = new ArrayList(1);
        }
        List list = this.f42175g;
        Intrinsics.f(list);
        list.add(annotation);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : generatedSerializer, i2);
    }
}
