package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class JsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    public boolean f42271a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42272b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42273c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42274d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42275e;

    /* renamed from: f  reason: collision with root package name */
    public String f42276f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42277g;

    /* renamed from: h  reason: collision with root package name */
    public String f42278h;

    /* renamed from: i  reason: collision with root package name */
    public ClassDiscriminatorMode f42279i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42280j;

    /* renamed from: k  reason: collision with root package name */
    public JsonNamingStrategy f42281k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42282l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f42283m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f42284n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f42285o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f42286p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f42287q;

    /* renamed from: r  reason: collision with root package name */
    public SerializersModule f42288r;

    public JsonBuilder(Json json) {
        Intrinsics.i(json, "json");
        this.f42271a = json.g().i();
        this.f42272b = json.g().j();
        this.f42273c = json.g().k();
        this.f42274d = json.g().q();
        this.f42275e = json.g().m();
        this.f42276f = json.g().n();
        this.f42277g = json.g().g();
        this.f42278h = json.g().e();
        this.f42279i = json.g().f();
        this.f42280j = json.g().o();
        this.f42281k = json.g().l();
        this.f42282l = json.g().h();
        this.f42283m = json.g().d();
        this.f42284n = json.g().a();
        this.f42285o = json.g().b();
        this.f42286p = json.g().c();
        this.f42287q = json.g().p();
        this.f42288r = json.a();
    }

    public final JsonConfiguration a() {
        if (this.f42287q) {
            if (!Intrinsics.d(this.f42278h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            } else if (this.f42279i != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (!this.f42275e) {
            if (!Intrinsics.d(this.f42276f, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!Intrinsics.d(this.f42276f, "    ")) {
            String str = this.f42276f;
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f42276f).toString());
                }
            }
        }
        return new JsonConfiguration(this.f42271a, this.f42273c, this.f42274d, this.f42286p, this.f42275e, this.f42272b, this.f42276f, this.f42277g, this.f42287q, this.f42278h, this.f42285o, this.f42280j, this.f42281k, this.f42282l, this.f42283m, this.f42284n, this.f42279i);
    }

    public final SerializersModule b() {
        return this.f42288r;
    }

    public final void c(boolean z2) {
        this.f42284n = z2;
    }

    public final void d(boolean z2) {
        this.f42283m = z2;
    }

    public final void e(boolean z2) {
        this.f42277g = z2;
    }

    public final void f(boolean z2) {
        this.f42282l = z2;
    }

    public final void g(boolean z2) {
        this.f42271a = z2;
    }

    public final void h(boolean z2) {
        this.f42272b = z2;
    }

    public final void i(boolean z2) {
        this.f42273c = z2;
    }

    public final void j(boolean z2) {
        this.f42274d = z2;
    }

    public final void k(SerializersModule serializersModule) {
        Intrinsics.i(serializersModule, "<set-?>");
        this.f42288r = serializersModule;
    }
}
