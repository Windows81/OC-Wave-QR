package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.c();

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32149a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.protobuf.WireFormat$JavaType[] r0 = com.google.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32149a = r0
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32149a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.AnonymousClass1.<clinit>():void");
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: A  reason: collision with root package name */
        public GeneratedMessageLite f32150A;

        /* renamed from: z  reason: collision with root package name */
        public final GeneratedMessageLite f32151z;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.f32151z = generatedMessageLite;
            if (!generatedMessageLite.Q()) {
                this.f32150A = N();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void M(Object obj, Object obj2) {
            Protobuf.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite N() {
            return this.f32151z.X();
        }

        /* renamed from: B */
        public Builder t() {
            Builder V = c().h();
            V.f32150A = C();
            return V;
        }

        public final void G() {
            if (!this.f32150A.Q()) {
                H();
            }
        }

        public void H() {
            GeneratedMessageLite N = N();
            M(N, this.f32150A);
            this.f32150A = N;
        }

        /* renamed from: I */
        public GeneratedMessageLite c() {
            return this.f32151z;
        }

        /* renamed from: J */
        public Builder u(GeneratedMessageLite generatedMessageLite) {
            return L(generatedMessageLite);
        }

        /* renamed from: K */
        public Builder v(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            G();
            try {
                Protobuf.a().d(this.f32150A).i(this.f32150A, CodedInputStreamReader.j(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        public Builder L(GeneratedMessageLite generatedMessageLite) {
            if (c().equals(generatedMessageLite)) {
                return this;
            }
            G();
            M(this.f32150A, generatedMessageLite);
            return this;
        }

        public final boolean b() {
            return GeneratedMessageLite.P(this.f32150A, false);
        }

        /* renamed from: y */
        public final GeneratedMessageLite d() {
            GeneratedMessageLite z2 = C();
            if (z2.b()) {
                return z2;
            }
            throw AbstractMessageLite.Builder.x(z2);
        }

        /* renamed from: z */
        public GeneratedMessageLite C() {
            if (!this.f32150A.Q()) {
                return this.f32150A;
            }
            this.f32150A.R();
            return this.f32150A;
        }
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: b  reason: collision with root package name */
        public final GeneratedMessageLite f32152b;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.f32152b = generatedMessageLite;
        }

        /* renamed from: g */
        public GeneratedMessageLite b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return GeneratedMessageLite.a0(this.f32152b, codedInputStream, extensionRegistryLite);
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(ExtendableMessage extendableMessage) {
            super(extendableMessage);
        }

        public void H() {
            super.H();
            if (((ExtendableMessage) this.f32150A).extensions != FieldSet.h()) {
                GeneratedMessageLite generatedMessageLite = this.f32150A;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        /* renamed from: O */
        public final ExtendableMessage z() {
            if (!((ExtendableMessage) this.f32150A).Q()) {
                return (ExtendableMessage) this.f32150A;
            }
            ((ExtendableMessage) this.f32150A).extensions.u();
            return (ExtendableMessage) super.C();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.h();

        public class ExtensionWriter {
        }

        public /* bridge */ /* synthetic */ MessageLite c() {
            return GeneratedMessageLite.super.c();
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder e() {
            return GeneratedMessageLite.super.e();
        }

        public FieldSet e0() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder h() {
            return GeneratedMessageLite.super.h();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* renamed from: A  reason: collision with root package name */
        public final int f32153A;

        /* renamed from: B  reason: collision with root package name */
        public final WireFormat.FieldType f32154B;
        public final boolean C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final Internal.EnumLiteMap f32155z;

        public ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z2, boolean z3) {
            this.f32155z = enumLiteMap;
            this.f32153A = i2;
            this.f32154B = fieldType;
            this.C = z2;
            this.D = z3;
        }

        public MessageLite.Builder J(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).L((GeneratedMessageLite) messageLite);
        }

        /* renamed from: d */
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.f32153A - extensionDescriptor.f32153A;
        }

        public Internal.EnumLiteMap f() {
            return this.f32155z;
        }

        public int i() {
            return this.f32153A;
        }

        public boolean q() {
            return this.C;
        }

        public WireFormat.FieldType s() {
            return this.f32154B;
        }

        public WireFormat.JavaType u() {
            return this.f32154B.f();
        }

        public boolean v() {
            return this.D;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageLite f32156a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f32157b;

        /* renamed from: c  reason: collision with root package name */
        public final MessageLite f32158c;

        /* renamed from: d  reason: collision with root package name */
        public final ExtensionDescriptor f32159d;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.s() == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f32156a = messageLite;
                this.f32157b = obj;
                this.f32158c = messageLite2;
                this.f32159d = extensionDescriptor;
            }
        }

        public WireFormat.FieldType a() {
            return this.f32159d.s();
        }

        public MessageLite b() {
            return this.f32158c;
        }

        public int c() {
            return this.f32159d.i();
        }

        public boolean d() {
            return this.f32159d.C;
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
    }

    public static Internal.DoubleList G() {
        return DoubleArrayList.n();
    }

    public static Internal.IntList H() {
        return IntArrayList.m();
    }

    public static Internal.LongList I() {
        return LongArrayList.n();
    }

    public static Internal.ProtobufList J() {
        return ProtobufArrayList.h();
    }

    public static GeneratedMessageLite K(Class cls) {
        GeneratedMessageLite generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = ((GeneratedMessageLite) UnsafeUtil.l(cls)).c();
            if (generatedMessageLite != null) {
                defaultInstanceMap.put(cls, generatedMessageLite);
            } else {
                throw new IllegalStateException();
            }
        }
        return generatedMessageLite;
    }

    public static Object O(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final boolean P(GeneratedMessageLite generatedMessageLite, boolean z2) {
        byte byteValue = ((Byte) generatedMessageLite.D(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = Protobuf.a().d(generatedMessageLite).e(generatedMessageLite);
        if (z2) {
            generatedMessageLite.E(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, e2 ? generatedMessageLite : null);
        }
        return e2;
    }

    public static Internal.IntList T(Internal.IntList intList) {
        int size = intList.size();
        return intList.f(size == 0 ? 10 : size * 2);
    }

    public static Internal.ProtobufList U(Internal.ProtobufList protobufList) {
        int size = protobufList.size();
        return protobufList.f(size == 0 ? 10 : size * 2);
    }

    public static Object W(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static GeneratedExtension Y(MessageLite messageLite, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z2, Class cls) {
        return new GeneratedExtension(messageLite, Collections.emptyList(), messageLite2, new ExtensionDescriptor(enumLiteMap, i2, fieldType, true, z2), cls);
    }

    public static GeneratedExtension Z(MessageLite messageLite, Object obj, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, obj, messageLite2, new ExtensionDescriptor(enumLiteMap, i2, fieldType, false, false), cls);
    }

    public static GeneratedMessageLite a0(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite X = generatedMessageLite.X();
        try {
            Schema d2 = Protobuf.a().d(X);
            d2.i(X, CodedInputStreamReader.j(codedInputStream), extensionRegistryLite);
            d2.d(X);
            return X;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.k(X);
        } catch (UninitializedMessageException e3) {
            throw e3.a().k(X);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).k(X);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static void b0(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.S();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public final int A(Schema schema) {
        return schema == null ? Protobuf.a().d(this).f(this) : schema.f(this);
    }

    public final Builder B() {
        return (Builder) D(MethodToInvoke.NEW_BUILDER);
    }

    public Object D(MethodToInvoke methodToInvoke) {
        return F(methodToInvoke, (Object) null, (Object) null);
    }

    public Object E(MethodToInvoke methodToInvoke, Object obj) {
        return F(methodToInvoke, obj, (Object) null);
    }

    public abstract Object F(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* renamed from: L */
    public final GeneratedMessageLite c() {
        return (GeneratedMessageLite) D(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public int M() {
        return this.memoizedHashCode;
    }

    public boolean N() {
        return M() == 0;
    }

    public boolean Q() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void R() {
        Protobuf.a().d(this).d(this);
        S();
    }

    public void S() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: V */
    public final Builder h() {
        return (Builder) D(MethodToInvoke.NEW_BUILDER);
    }

    public GeneratedMessageLite X() {
        return (GeneratedMessageLite) D(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public final boolean b() {
        return P(this, true);
    }

    public void c0(int i2) {
        this.memoizedHashCode = i2;
    }

    /* renamed from: d0 */
    public final Builder e() {
        return ((Builder) D(MethodToInvoke.NEW_BUILDER)).L(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Protobuf.a().d(this).b(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public int g() {
        return r((Schema) null);
    }

    public int hashCode() {
        if (Q()) {
            return z();
        }
        if (N()) {
            c0(z());
        }
        return M();
    }

    public final Parser i() {
        return (Parser) D(MethodToInvoke.GET_PARSER);
    }

    public void k(CodedOutputStream codedOutputStream) {
        Protobuf.a().d(this).h(this, CodedOutputStreamWriter.g(codedOutputStream));
    }

    public int m() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public int r(Schema schema) {
        if (Q()) {
            int A2 = A(schema);
            if (A2 >= 0) {
                return A2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + A2);
        } else if (m() != Integer.MAX_VALUE) {
            return m();
        } else {
            int A3 = A(schema);
            u(A3);
            return A3;
        }
    }

    public String toString() {
        return MessageLiteToString.f(this, super.toString());
    }

    public void u(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i2);
    }

    public Object w() {
        return D(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public void x() {
        this.memoizedHashCode = 0;
    }

    public void y() {
        u(Integer.MAX_VALUE);
    }

    public int z() {
        return Protobuf.a().d(this).c(this);
    }
}
