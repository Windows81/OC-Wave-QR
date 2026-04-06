package org.bson;

import java.util.List;
import java.util.Stack;
import org.bson.AbstractBsonReader;
import org.bson.AbstractBsonWriter;
import org.bson.assertions.Assertions;
import org.bson.io.BsonInput;
import org.bson.io.BsonOutput;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class BsonBinaryWriter extends AbstractBsonWriter {
    public final BsonBinaryWriterSettings F;
    public final BsonOutput G;
    public final Stack H;

    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e  reason: collision with root package name */
        public final int f43624e;

        /* renamed from: f  reason: collision with root package name */
        public int f43625f;

        public Context(Context context, BsonContextType bsonContextType, int i2) {
            super(context, bsonContextType);
            this.f43624e = i2;
        }

        public static /* synthetic */ int e(Context context) {
            int i2 = context.f43625f;
            context.f43625f = i2 + 1;
            return i2;
        }

        /* renamed from: g */
        public Context d() {
            return (Context) super.d();
        }
    }

    public class Mark extends AbstractBsonWriter.Mark {
    }

    public BsonBinaryWriter(BsonOutput bsonOutput) {
        this(new BsonWriterSettings(), new BsonBinaryWriterSettings(), bsonOutput);
    }

    public void E0() {
        this.G.writeByte(BsonType.NULL.f());
        W1();
    }

    public void G0(ObjectId objectId) {
        this.G.writeByte(BsonType.OBJECT_ID.f());
        W1();
        this.G.writeBytes(objectId.z());
    }

    public void H0(BsonRegularExpression bsonRegularExpression) {
        this.G.writeByte(BsonType.REGULAR_EXPRESSION.f());
        W1();
        this.G.F0(bsonRegularExpression.p0());
        this.G.F0(bsonRegularExpression.l0());
    }

    public void J0() {
        this.G.writeByte(BsonType.ARRAY.f());
        W1();
        P1(new Context(j1(), BsonContextType.ARRAY, this.G.getPosition()));
        this.G.q(0);
    }

    public final void J1(BsonReader bsonReader, List list) {
        if (bsonReader instanceof BsonBinaryReader) {
            BsonBinaryReader bsonBinaryReader = (BsonBinaryReader) bsonReader;
            if (E1() == AbstractBsonWriter.State.VALUE) {
                this.G.writeByte(BsonType.DOCUMENT.f());
                W1();
            }
            BsonInput j1 = bsonBinaryReader.j1();
            int i2 = j1.i();
            if (i2 >= 5) {
                int position = this.G.getPosition();
                this.G.q(i2);
                byte[] bArr = new byte[(i2 - 4)];
                j1.z0(bArr);
                this.G.writeBytes(bArr);
                bsonBinaryReader.H0(AbstractBsonReader.State.TYPE);
                if (list != null) {
                    BsonOutput bsonOutput = this.G;
                    bsonOutput.i0(bsonOutput.getPosition() - 1);
                    P1(new Context(j1(), BsonContextType.DOCUMENT, position));
                    Q1(AbstractBsonWriter.State.NAME);
                    K1(list);
                    this.G.writeByte(0);
                    BsonOutput bsonOutput2 = this.G;
                    bsonOutput2.o(position, bsonOutput2.getPosition() - position);
                    P1(j1().d());
                }
                if (j1() == null) {
                    Q1(AbstractBsonWriter.State.DONE);
                } else {
                    if (j1().c() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
                        T1();
                        P1(j1().d());
                    }
                    Q1(w1());
                }
                V1(this.G.getPosition() - position);
                return;
            }
            throw new BsonSerializationException("Document size must be at least 5");
        } else if (list != null) {
            super.F1(bsonReader, list);
        } else {
            super.e0(bsonReader);
        }
    }

    public void L0() {
        if (E1() == AbstractBsonWriter.State.VALUE) {
            this.G.writeByte(BsonType.DOCUMENT.f());
            W1();
        }
        P1(new Context(j1(), BsonContextType.DOCUMENT, this.G.getPosition()));
        this.G.q(0);
    }

    public void S0(String str) {
        this.G.writeByte(BsonType.STRING.f());
        W1();
        this.G.p(str);
    }

    public final void T1() {
        int position = this.G.getPosition() - j1().f43624e;
        V1(position);
        BsonOutput bsonOutput = this.G;
        bsonOutput.o(bsonOutput.getPosition() - position, position);
    }

    public void U0(String str) {
        this.G.writeByte(BsonType.SYMBOL.f());
        W1();
        this.G.p(str);
    }

    /* renamed from: U1 */
    public Context j1() {
        return (Context) super.j1();
    }

    public final void V1(int i2) {
        if (i2 > ((Integer) this.H.peek()).intValue()) {
            throw new BsonMaximumSizeExceededException(String.format("Document size of %d is larger than maximum of %d.", new Object[]{Integer.valueOf(i2), this.H.peek()}));
        }
    }

    public void W0(BsonTimestamp bsonTimestamp) {
        this.G.writeByte(BsonType.TIMESTAMP.f());
        W1();
        this.G.z(bsonTimestamp.r0());
    }

    public final void W1() {
        if (j1().c() == BsonContextType.ARRAY) {
            this.G.F0(Integer.toString(Context.e(j1())));
        } else {
            this.G.F0(q1());
        }
    }

    public void b1() {
        this.G.writeByte(BsonType.UNDEFINED.f());
        W1();
    }

    public void close() {
        super.close();
    }

    public void d(BsonBinary bsonBinary) {
        this.G.writeByte(BsonType.BINARY.f());
        W1();
        int length = bsonBinary.p0().length;
        byte q0 = bsonBinary.q0();
        BsonBinarySubType bsonBinarySubType = BsonBinarySubType.OLD_BINARY;
        if (q0 == bsonBinarySubType.d()) {
            length += 4;
        }
        this.G.q(length);
        this.G.writeByte(bsonBinary.q0());
        if (bsonBinary.q0() == bsonBinarySubType.d()) {
            this.G.q(length - 4);
        }
        this.G.writeBytes(bsonBinary.p0());
    }

    public void e0(BsonReader bsonReader) {
        Assertions.d("reader", bsonReader);
        J1(bsonReader, (List) null);
    }

    public void f(boolean z2) {
        this.G.writeByte(BsonType.BOOLEAN.f());
        W1();
        this.G.writeByte(z2 ? 1 : 0);
    }

    public void g(BsonDbPointer bsonDbPointer) {
        this.G.writeByte(BsonType.DB_POINTER.f());
        W1();
        this.G.p(bsonDbPointer.p0());
        this.G.writeBytes(bsonDbPointer.l0().z());
    }

    public void j(long j2) {
        this.G.writeByte(BsonType.DATE_TIME.f());
        W1();
        this.G.z(j2);
    }

    public void k(Decimal128 decimal128) {
        this.G.writeByte(BsonType.DECIMAL128.f());
        W1();
        this.G.z(decimal128.o());
        this.G.z(decimal128.n());
    }

    public void l(double d2) {
        this.G.writeByte(BsonType.DOUBLE.f());
        W1();
        this.G.writeDouble(d2);
    }

    public void m() {
        this.G.writeByte(0);
        T1();
        P1(j1().d());
    }

    public void r() {
        this.G.writeByte(0);
        T1();
        P1(j1().d());
        if (j1() != null && j1().c() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            T1();
            P1(j1().d());
        }
    }

    public void s0(String str) {
        this.G.writeByte(BsonType.JAVASCRIPT_WITH_SCOPE.f());
        W1();
        P1(new Context(j1(), BsonContextType.JAVASCRIPT_WITH_SCOPE, this.G.getPosition()));
        this.G.q(0);
        this.G.p(str);
    }

    public void t(int i2) {
        this.G.writeByte(BsonType.INT32.f());
        W1();
        this.G.q(i2);
    }

    public void t0() {
        this.G.writeByte(BsonType.MAX_KEY.f());
        W1();
    }

    public void w0() {
        this.G.writeByte(BsonType.MIN_KEY.f());
        W1();
    }

    public void x(long j2) {
        this.G.writeByte(BsonType.INT64.f());
        W1();
        this.G.z(j2);
    }

    public void y(String str) {
        this.G.writeByte(BsonType.JAVASCRIPT.f());
        W1();
        this.G.p(str);
    }

    public BsonBinaryWriter(BsonWriterSettings bsonWriterSettings, BsonBinaryWriterSettings bsonBinaryWriterSettings, BsonOutput bsonOutput) {
        this(bsonWriterSettings, bsonBinaryWriterSettings, bsonOutput, new NoOpFieldNameValidator());
    }

    public BsonBinaryWriter(BsonWriterSettings bsonWriterSettings, BsonBinaryWriterSettings bsonBinaryWriterSettings, BsonOutput bsonOutput, FieldNameValidator fieldNameValidator) {
        super(bsonWriterSettings, fieldNameValidator);
        Stack stack = new Stack();
        this.H = stack;
        this.F = bsonBinaryWriterSettings;
        this.G = bsonOutput;
        stack.push(Integer.valueOf(bsonBinaryWriterSettings.a()));
    }
}
