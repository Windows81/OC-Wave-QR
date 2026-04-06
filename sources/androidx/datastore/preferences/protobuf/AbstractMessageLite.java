package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public interface InternalOneOfEnum {
    }

    public static void a(Iterable iterable, List list) {
        Builder.k(iterable, list);
    }

    public ByteString f() {
        try {
            ByteString.CodedBuilder E = ByteString.E(g());
            j(E.b());
            return E.a();
        } catch (IOException e2) {
            throw new RuntimeException(m("ByteString"), e2);
        }
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public int l(Schema schema) {
        int k2 = k();
        if (k2 != -1) {
            return k2;
        }
        int f2 = schema.f(this);
        o(f2);
        return f2;
    }

    public final String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException n() {
        return new UninitializedMessageException(this);
    }

    public void o(int i2) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) {
        CodedOutputStream W0 = CodedOutputStream.W0(outputStream, CodedOutputStream.A0(g()));
        j(W0);
        W0.T0();
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        public static void k(Iterable iterable, List list) {
            Internal.a(iterable);
            if (iterable instanceof LazyStringList) {
                List y2 = ((LazyStringList) iterable).y();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object next : y2) {
                    if (next == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        lazyStringList.s0((ByteString) next);
                    } else if (next instanceof byte[]) {
                        lazyStringList.s0(ByteString.q((byte[]) next));
                    } else {
                        lazyStringList.add((String) next);
                    }
                }
            } else if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                l(iterable, list);
            }
        }

        public static void l(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        public static UninitializedMessageException r(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        /* renamed from: n */
        public abstract Builder clone();

        public abstract Builder o(AbstractMessageLite abstractMessageLite);

        /* renamed from: p */
        public abstract Builder b1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        /* renamed from: q */
        public Builder S(MessageLite messageLite) {
            if (c().getClass().isInstance(messageLite)) {
                return o((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: z  reason: collision with root package name */
            public int f20716z;

            public int available() {
                return Math.min(super.available(), this.f20716z);
            }

            public int read() {
                if (this.f20716z <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f20716z--;
                }
                return read;
            }

            public long skip(long j2) {
                int skip = (int) super.skip(Math.min(j2, (long) this.f20716z));
                if (skip >= 0) {
                    this.f20716z -= skip;
                }
                return (long) skip;
            }

            public int read(byte[] bArr, int i2, int i3) {
                int i4 = this.f20716z;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f20716z -= read;
                }
                return read;
            }
        }
    }
}
