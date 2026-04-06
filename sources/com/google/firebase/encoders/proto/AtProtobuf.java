package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;

public final class AtProtobuf {

    /* renamed from: a  reason: collision with root package name */
    public int f30719a;

    /* renamed from: b  reason: collision with root package name */
    public Protobuf.IntEncoding f30720b = Protobuf.IntEncoding.DEFAULT;

    public static final class ProtobufImpl implements Protobuf {

        /* renamed from: a  reason: collision with root package name */
        public final int f30721a;

        /* renamed from: b  reason: collision with root package name */
        public final Protobuf.IntEncoding f30722b;

        public ProtobufImpl(int i2, Protobuf.IntEncoding intEncoding) {
            this.f30721a = i2;
            this.f30722b = intEncoding;
        }

        public Class annotationType() {
            return Protobuf.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f30721a == protobuf.tag() && this.f30722b.equals(protobuf.intEncoding());
        }

        public int hashCode() {
            return (14552422 ^ this.f30721a) + (this.f30722b.hashCode() ^ 2041407134);
        }

        public Protobuf.IntEncoding intEncoding() {
            return this.f30722b;
        }

        public int tag() {
            return this.f30721a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f30721a + "intEncoding=" + this.f30722b + ')';
        }
    }

    public static AtProtobuf b() {
        return new AtProtobuf();
    }

    public Protobuf a() {
        return new ProtobufImpl(this.f30719a, this.f30720b);
    }

    public AtProtobuf c(int i2) {
        this.f30719a = i2;
        return this;
    }
}
