package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20984a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20984a = r0
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20984a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.AnonymousClass1.<clinit>():void");
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: A  reason: collision with root package name */
        public GeneratedMessageLite f20985A;

        /* renamed from: z  reason: collision with root package name */
        public final GeneratedMessageLite f20986z;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.f20986z = generatedMessageLite;
            if (!generatedMessageLite.J()) {
                this.f20985A = H();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void G(Object obj, Object obj2) {
            Protobuf.a().d(obj).a(obj, obj2);
        }

        private GeneratedMessageLite H() {
            return this.f20986z.P();
        }

        public Builder B(GeneratedMessageLite generatedMessageLite) {
            if (c().equals(generatedMessageLite)) {
                return this;
            }
            v();
            G(this.f20985A, generatedMessageLite);
            return this;
        }

        public final boolean b() {
            return GeneratedMessageLite.I(this.f20985A, false);
        }

        /* renamed from: s */
        public final GeneratedMessageLite d() {
            GeneratedMessageLite t2 = C();
            if (t2.b()) {
                return t2;
            }
            throw AbstractMessageLite.Builder.r(t2);
        }

        /* renamed from: t */
        public GeneratedMessageLite C() {
            if (!this.f20985A.J()) {
                return this.f20985A;
            }
            this.f20985A.K();
            return this.f20985A;
        }

        /* renamed from: u */
        public Builder n() {
            Builder N = c().h();
            N.f20985A = C();
            return N;
        }

        public final void v() {
            if (!this.f20985A.J()) {
                w();
            }
        }

        public void w() {
            GeneratedMessageLite H = H();
            G(H, this.f20985A);
            this.f20985A = H;
        }

        /* renamed from: x */
        public GeneratedMessageLite c() {
            return this.f20986z;
        }

        /* renamed from: y */
        public Builder o(GeneratedMessageLite generatedMessageLite) {
            return B(generatedMessageLite);
        }

        /* renamed from: z */
        public Builder p(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            v();
            try {
                Protobuf.a().d(this.f20985A).h(this.f20985A, CodedInputStreamReader.a(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: b  reason: collision with root package name */
        public final GeneratedMessageLite f20987b;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.f20987b = generatedMessageLite;
        }

        /* renamed from: g */
        public GeneratedMessageLite b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return GeneratedMessageLite.T(this.f20987b, codedInputStream, extensionRegistryLite);
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(ExtendableMessage extendableMessage) {
            super(extendableMessage);
        }

        /* renamed from: I */
        public final ExtendableMessage t() {
            if (!((ExtendableMessage) this.f20985A).J()) {
                return (ExtendableMessage) this.f20985A;
            }
            ((ExtendableMessage) this.f20985A).extensions.u();
            return (ExtendableMessage) super.C();
        }

        public void w() {
            super.w();
            if (((ExtendableMessage) this.f20985A).extensions != FieldSet.h()) {
                GeneratedMessageLite generatedMessageLite = this.f20985A;
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.h();

        public class ExtensionWriter {
        }

        public FieldSet X() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ MessageLite c() {
            return GeneratedMessageLite.super.c();
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder e() {
            return GeneratedMessageLite.super.e();
        }

        public /* bridge */ /* synthetic */ MessageLite.Builder h() {
            return GeneratedMessageLite.super.h();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* renamed from: A  reason: collision with root package name */
        public final int f20988A;

        /* renamed from: B  reason: collision with root package name */
        public final WireFormat.FieldType f20989B;
        public final boolean C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final Internal.EnumLiteMap f20990z;

        public ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, boolean z2, boolean z3) {
            this.f20990z = enumLiteMap;
            this.f20988A = i2;
            this.f20989B = fieldType;
            this.C = z2;
            this.D = z3;
        }

        public MessageLite.Builder P(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).B((GeneratedMessageLite) messageLite);
        }

        /* renamed from: d */
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.f20988A - extensionDescriptor.f20988A;
        }

        public Internal.EnumLiteMap f() {
            return this.f20990z;
        }

        public int i() {
            return this.f20988A;
        }

        public boolean q() {
            return this.C;
        }

        public WireFormat.FieldType s() {
            return this.f20989B;
        }

        public WireFormat.JavaType u() {
            return this.f20989B.d();
        }

        public boolean v() {
            return this.D;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageLite f20991a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20992b;

        /* renamed from: c  reason: collision with root package name */
        public final MessageLite f20993c;

        /* renamed from: d  reason: collision with root package name */
        public final ExtensionDescriptor f20994d;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.s() == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f20991a = messageLite;
                this.f20992b = obj;
                this.f20993c = messageLite2;
                this.f20994d = extensionDescriptor;
            }
        }

        public WireFormat.FieldType a() {
            return this.f20994d.s();
        }

        public MessageLite b() {
            return this.f20993c;
        }

        public int c() {
            return this.f20994d.i();
        }

        public boolean d() {
            return this.f20994d.C;
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

    public static Internal.IntList A() {
        return IntArrayList.m();
    }

    public static Internal.ProtobufList B() {
        return ProtobufArrayList.h();
    }

    public static GeneratedMessageLite D(Class cls) {
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

    public static Object H(Method method, Object obj, Object... objArr) {
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

    public static final boolean I(GeneratedMessageLite generatedMessageLite, boolean z2) {
        byte byteValue = ((Byte) generatedMessageLite.x(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = Protobuf.a().d(generatedMessageLite).e(generatedMessageLite);
        if (z2) {
            generatedMessageLite.y(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, e2 ? generatedMessageLite : null);
        }
        return e2;
    }

    public static Internal.ProtobufList M(Internal.ProtobufList protobufList) {
        int size = protobufList.size();
        return protobufList.f(size == 0 ? 10 : size * 2);
    }

    public static Object O(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static GeneratedExtension Q(MessageLite messageLite, Object obj, MessageLite messageLite2, Internal.EnumLiteMap enumLiteMap, int i2, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, obj, messageLite2, new ExtensionDescriptor(enumLiteMap, i2, fieldType, false, false), cls);
    }

    public static GeneratedMessageLite R(GeneratedMessageLite generatedMessageLite, InputStream inputStream) {
        return r(T(generatedMessageLite, CodedInputStream.g(inputStream), ExtensionRegistryLite.b()));
    }

    public static GeneratedMessageLite T(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite P = generatedMessageLite.P();
        try {
            Schema d2 = Protobuf.a().d(P);
            d2.h(P, CodedInputStreamReader.a(codedInputStream), extensionRegistryLite);
            d2.d(P);
            return P;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.a()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.k(P);
        } catch (UninitializedMessageException e3) {
            throw e3.a().k(P);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).k(P);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static void U(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.L();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public static GeneratedMessageLite r(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite == null || generatedMessageLite.b()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.n().a().k(generatedMessageLite);
    }

    /* renamed from: E */
    public final GeneratedMessageLite c() {
        return (GeneratedMessageLite) x(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public int F() {
        return this.memoizedHashCode;
    }

    public boolean G() {
        return F() == 0;
    }

    public boolean J() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void K() {
        Protobuf.a().d(this).d(this);
        L();
    }

    public void L() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: N */
    public final Builder h() {
        return (Builder) x(MethodToInvoke.NEW_BUILDER);
    }

    public GeneratedMessageLite P() {
        return (GeneratedMessageLite) x(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public void V(int i2) {
        this.memoizedHashCode = i2;
    }

    /* renamed from: W */
    public final Builder e() {
        return ((Builder) x(MethodToInvoke.NEW_BUILDER)).B(this);
    }

    public final boolean b() {
        return I(this, true);
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
        return l((Schema) null);
    }

    public int hashCode() {
        if (J()) {
            return u();
        }
        if (G()) {
            V(u());
        }
        return F();
    }

    public final Parser i() {
        return (Parser) x(MethodToInvoke.GET_PARSER);
    }

    public void j(CodedOutputStream codedOutputStream) {
        Protobuf.a().d(this).i(this, CodedOutputStreamWriter.a(codedOutputStream));
    }

    public int k() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public int l(Schema schema) {
        if (J()) {
            int v2 = v(schema);
            if (v2 >= 0) {
                return v2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
        } else if (k() != Integer.MAX_VALUE) {
            return k();
        } else {
            int v3 = v(schema);
            o(v3);
            return v3;
        }
    }

    public void o(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i2);
    }

    public Object q() {
        return x(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public void s() {
        this.memoizedHashCode = 0;
    }

    public void t() {
        o(Integer.MAX_VALUE);
    }

    public String toString() {
        return MessageLiteToString.f(this, super.toString());
    }

    public int u() {
        return Protobuf.a().d(this).c(this);
    }

    public final int v(Schema schema) {
        return schema == null ? Protobuf.a().d(this).f(this) : schema.f(this);
    }

    public final Builder w() {
        return (Builder) x(MethodToInvoke.NEW_BUILDER);
    }

    public Object x(MethodToInvoke methodToInvoke) {
        return z(methodToInvoke, (Object) null, (Object) null);
    }

    public Object y(MethodToInvoke methodToInvoke, Object obj) {
        return z(methodToInvoke, obj, (Object) null);
    }

    public abstract Object z(MethodToInvoke methodToInvoke, Object obj, Object obj2);
}
