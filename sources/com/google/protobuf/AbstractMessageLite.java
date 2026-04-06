package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public interface InternalOneOfEnum {
    }

    public static void a(Iterable iterable, List list) {
        Builder.r(iterable, list);
    }

    public ByteString f() {
        try {
            ByteString.CodedBuilder E = ByteString.E(g());
            k(E.b());
            return E.a();
        } catch (IOException e2) {
            throw new RuntimeException(s("ByteString"), e2);
        }
    }

    public int m() {
        throw new UnsupportedOperationException();
    }

    public int r(Schema schema) {
        int m2 = m();
        if (m2 != -1) {
            return m2;
        }
        int f2 = schema.f(this);
        u(f2);
        return f2;
    }

    public final String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException t() {
        return new UninitializedMessageException(this);
    }

    public void u(int i2) {
        throw new UnsupportedOperationException();
    }

    public byte[] v() {
        try {
            byte[] bArr = new byte[g()];
            CodedOutputStream U0 = CodedOutputStream.U0(bArr);
            k(U0);
            U0.k();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(s("byte array"), e2);
        }
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        public static void r(Iterable iterable, List list) {
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
                        lazyStringList.c0((ByteString) next);
                    } else {
                        lazyStringList.add((String) next);
                    }
                }
            } else if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                s(iterable, list);
            }
        }

        public static void s(Iterable iterable, List list) {
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

        public static UninitializedMessageException x(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        /* renamed from: t */
        public abstract Builder clone();

        public abstract Builder u(AbstractMessageLite abstractMessageLite);

        /* renamed from: v */
        public abstract Builder W0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        /* renamed from: w */
        public Builder U0(MessageLite messageLite) {
            if (c().getClass().isInstance(messageLite)) {
                return u((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: z  reason: collision with root package name */
            public int f31929z;

            public int available() {
                return Math.min(super.available(), this.f31929z);
            }

            public int read() {
                if (this.f31929z <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f31929z--;
                }
                return read;
            }

            public long skip(long j2) {
                int skip = (int) super.skip(Math.min(j2, (long) this.f31929z));
                if (skip >= 0) {
                    this.f31929z -= skip;
                }
                return (long) skip;
            }

            public int read(byte[] bArr, int i2, int i3) {
                int i4 = this.f31929z;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f31929z -= read;
                }
                return read;
            }
        }
    }
}
