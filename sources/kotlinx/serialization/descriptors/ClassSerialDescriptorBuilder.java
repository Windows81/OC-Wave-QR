package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClassSerialDescriptorBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final String f42017a;

    /* renamed from: b  reason: collision with root package name */
    public List f42018b = CollectionsKt.m();

    /* renamed from: c  reason: collision with root package name */
    public final List f42019c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Set f42020d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final List f42021e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List f42022f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final List f42023g = new ArrayList();

    public ClassSerialDescriptorBuilder(String str) {
        Intrinsics.i(str, "serialName");
        this.f42017a = str;
    }

    public static /* synthetic */ void b(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String str, SerialDescriptor serialDescriptor, List list, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.m();
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        classSerialDescriptorBuilder.a(str, serialDescriptor, list, z2);
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List list, boolean z2) {
        Intrinsics.i(str, "elementName");
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(list, "annotations");
        if (this.f42020d.add(str)) {
            this.f42019c.add(str);
            this.f42021e.add(serialDescriptor);
            this.f42022f.add(list);
            this.f42023g.add(Boolean.valueOf(z2));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f42017a).toString());
    }

    public final List c() {
        return this.f42018b;
    }

    public final List d() {
        return this.f42022f;
    }

    public final List e() {
        return this.f42021e;
    }

    public final List f() {
        return this.f42019c;
    }

    public final List g() {
        return this.f42023g;
    }

    public final void h(List list) {
        Intrinsics.i(list, "<set-?>");
        this.f42018b = list;
    }
}
