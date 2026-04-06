package org.bson.json;

import java.io.Writer;
import org.bson.AbstractBsonWriter;
import org.bson.BsonBinary;
import org.bson.BsonContextType;
import org.bson.BsonDbPointer;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class JsonWriter extends AbstractBsonWriter {
    public final JsonWriterSettings F;
    public final StrictCharacterStreamJsonWriter G;

    public class Context extends AbstractBsonWriter.Context {
        public Context(Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        /* renamed from: e */
        public Context d() {
            return (Context) super.d();
        }
    }

    public JsonWriter(Writer writer, JsonWriterSettings jsonWriterSettings) {
        super(jsonWriterSettings);
        this.F = jsonWriterSettings;
        P1(new Context((Context) null, BsonContextType.TOP_LEVEL));
        this.G = new StrictCharacterStreamJsonWriter(writer, StrictCharacterStreamJsonWriterSettings.a().f(jsonWriterSettings.x()).i(jsonWriterSettings.o()).g(jsonWriterSettings.h()).h(jsonWriterSettings.m()).e());
    }

    public void A0(String str) {
        this.G.A(str);
    }

    public void E0() {
        this.F.p().a((Object) null, this.G);
    }

    public void G0(ObjectId objectId) {
        this.F.q().a(objectId, this.G);
    }

    public void H0(BsonRegularExpression bsonRegularExpression) {
        this.F.s().a(bsonRegularExpression, this.G);
    }

    public void J0() {
        this.G.q();
        P1(new Context(j1(), BsonContextType.ARRAY));
    }

    public void L0() {
        this.G.f();
        P1(new Context(j1(), E1() == AbstractBsonWriter.State.SCOPE_DOCUMENT ? BsonContextType.SCOPE_DOCUMENT : BsonContextType.DOCUMENT));
    }

    public void S0(String str) {
        this.F.t().a(str, this.G);
    }

    /* renamed from: T1 */
    public Context j1() {
        return (Context) super.j1();
    }

    public void U0(String str) {
        this.F.u().a(str, this.G);
    }

    public void W0(BsonTimestamp bsonTimestamp) {
        this.F.v().a(bsonTimestamp, this.G);
    }

    public boolean a() {
        return this.G.i();
    }

    public void b1() {
        this.F.w().a((Object) null, this.G);
    }

    public void d(BsonBinary bsonBinary) {
        this.F.c().a(bsonBinary, this.G);
    }

    public void f(boolean z2) {
        this.F.d().a(Boolean.valueOf(z2), this.G);
    }

    public void g(BsonDbPointer bsonDbPointer) {
        if (this.F.r() == JsonMode.EXTENDED) {
            new Converter<BsonDbPointer>() {
                /* renamed from: b */
                public void a(BsonDbPointer bsonDbPointer, StrictJsonWriter strictJsonWriter) {
                    strictJsonWriter.f();
                    strictJsonWriter.b("$dbPointer");
                    strictJsonWriter.C("$ref", bsonDbPointer.p0());
                    strictJsonWriter.A("$id");
                    JsonWriter.this.G0(bsonDbPointer.l0());
                    strictJsonWriter.a();
                    strictJsonWriter.a();
                }
            }.a(bsonDbPointer, this.G);
        } else {
            new Converter<BsonDbPointer>() {
                /* renamed from: b */
                public void a(BsonDbPointer bsonDbPointer, StrictJsonWriter strictJsonWriter) {
                    strictJsonWriter.f();
                    strictJsonWriter.C("$ref", bsonDbPointer.p0());
                    strictJsonWriter.A("$id");
                    JsonWriter.this.G0(bsonDbPointer.l0());
                    strictJsonWriter.a();
                }
            }.a(bsonDbPointer, this.G);
        }
    }

    public void j(long j2) {
        this.F.e().a(Long.valueOf(j2), this.G);
    }

    public void k(Decimal128 decimal128) {
        this.F.f().a(decimal128, this.G);
    }

    public void l(double d2) {
        this.F.g().a(Double.valueOf(d2), this.G);
    }

    public void m() {
        this.G.o();
        P1(j1().d());
    }

    public void r() {
        this.G.a();
        if (j1().c() == BsonContextType.SCOPE_DOCUMENT) {
            P1(j1().d());
            f0();
            return;
        }
        P1(j1().d());
    }

    public void s0(String str) {
        T();
        C("$code", str);
        A("$scope");
    }

    public void t(int i2) {
        this.F.i().a(Integer.valueOf(i2), this.G);
    }

    public void t0() {
        this.F.l().a((Object) null, this.G);
    }

    public void w0() {
        this.F.n().a((Object) null, this.G);
    }

    public void x(long j2) {
        this.F.j().a(Long.valueOf(j2), this.G);
    }

    public void y(String str) {
        this.F.k().a(str, this.G);
    }
}
