package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

@Metadata
class JsonTreeDecoder extends AbstractJsonTreeDecoder {

    /* renamed from: g  reason: collision with root package name */
    public final JsonObject f42408g;

    /* renamed from: h  reason: collision with root package name */
    public final SerialDescriptor f42409h;

    /* renamed from: i  reason: collision with root package name */
    public int f42410i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42411j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : serialDescriptor);
    }

    public final boolean F0(SerialDescriptor serialDescriptor, int i2) {
        boolean z2 = !d().g().j() && !serialDescriptor.k(i2) && serialDescriptor.j(i2).c();
        this.f42411j = z2;
        return z2;
    }

    public final boolean G0(SerialDescriptor serialDescriptor, int i2, String str) {
        Json d2 = d();
        boolean k2 = serialDescriptor.k(i2);
        SerialDescriptor j2 = serialDescriptor.j(i2);
        if (k2 && !j2.c() && (n0(str) instanceof JsonNull)) {
            return true;
        }
        if (Intrinsics.d(j2.e(), SerialKind.ENUM.f42057a) && (!j2.c() || !(n0(str) instanceof JsonNull))) {
            JsonElement n0 = n0(str);
            String str2 = null;
            JsonPrimitive jsonPrimitive = n0 instanceof JsonPrimitive ? (JsonPrimitive) n0 : null;
            if (jsonPrimitive != null) {
                str2 = JsonElementKt.f(jsonPrimitive);
            }
            if (str2 != null) {
                int j3 = JsonNamesMapKt.j(j2, d2, str2);
                boolean z2 = !d2.g().j() && j2.c();
                if (j3 == -3 && (k2 || z2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H0 */
    public JsonObject C0() {
        return this.f42408g;
    }

    public void b(SerialDescriptor serialDescriptor) {
        Set set;
        Intrinsics.i(serialDescriptor, "descriptor");
        if (!this.f42341f.k() && !(serialDescriptor.e() instanceof PolymorphicKind)) {
            JsonNamingStrategy n2 = JsonNamesMapKt.n(serialDescriptor, d());
            if (n2 == null && !this.f42341f.o()) {
                set = JsonInternalDependenciesKt.a(serialDescriptor);
            } else if (n2 != null) {
                set = JsonNamesMapKt.f(d(), serialDescriptor).keySet();
            } else {
                Set a2 = JsonInternalDependenciesKt.a(serialDescriptor);
                Map map = (Map) JsonSchemaCacheKt.a(d()).a(serialDescriptor, JsonNamesMapKt.h());
                Set keySet = map != null ? map.keySet() : null;
                if (keySet == null) {
                    keySet = SetsKt.d();
                }
                set = SetsKt.h(a2, keySet);
            }
            for (String str : C0().keySet()) {
                if (!set.contains(str) && !Intrinsics.d(str, B0())) {
                    throw JsonExceptionsKt.g(str, C0().toString());
                }
            }
        }
    }

    public CompositeDecoder c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (serialDescriptor != this.f42409h) {
            return super.c(serialDescriptor);
        }
        Json d2 = d();
        JsonElement o0 = o0();
        String a2 = this.f42409h.a();
        if (o0 instanceof JsonObject) {
            return new JsonTreeDecoder(d2, (JsonObject) o0, B0(), this.f42409h);
        }
        throw JsonExceptionsKt.f(-1, "Expected " + Reflection.b(JsonObject.class).e() + ", but had " + Reflection.b(o0.getClass()).e() + " as the serialized body of " + a2 + " at element: " + k0(), o0.toString());
    }

    public String h0(SerialDescriptor serialDescriptor, int i2) {
        String str;
        Object obj;
        Intrinsics.i(serialDescriptor, "descriptor");
        JsonNamingStrategy n2 = JsonNamesMapKt.n(serialDescriptor, d());
        String g2 = serialDescriptor.g(i2);
        if (n2 == null && (!this.f42341f.o() || C0().keySet().contains(g2))) {
            return g2;
        }
        Map f2 = JsonNamesMapKt.f(d(), serialDescriptor);
        Iterator it = C0().keySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) f2.get((String) obj);
            if (num != null && num.intValue() == i2) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        if (n2 != null) {
            str = n2.a(serialDescriptor, i2, g2);
        }
        return str == null ? g2 : str;
    }

    public JsonElement n0(String str) {
        Intrinsics.i(str, "tag");
        return (JsonElement) MapsKt.i(C0(), str);
    }

    public boolean u() {
        return !this.f42411j && super.u();
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        while (this.f42410i < serialDescriptor.f()) {
            int i2 = this.f42410i;
            this.f42410i = i2 + 1;
            String i0 = b0(serialDescriptor, i2);
            int i3 = this.f42410i - 1;
            this.f42411j = false;
            if ((C0().containsKey(i0) || F0(serialDescriptor, i3)) && (!this.f42341f.g() || !G0(serialDescriptor, i3, i0))) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(json, jsonObject, str, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(jsonObject, "value");
        this.f42408g = jsonObject;
        this.f42409h = serialDescriptor;
    }
}
