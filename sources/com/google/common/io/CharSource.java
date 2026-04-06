package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class CharSource {

    public final class AsByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f28993a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CharSource f28994b;

        public InputStream a() {
            return new ReaderInputStream(this.f28994b.a(), this.f28993a, 8192);
        }

        public String toString() {
            String obj = this.f28994b.toString();
            String valueOf = String.valueOf(this.f28993a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asByteSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class CharSequenceCharSource extends CharSource {

        /* renamed from: b  reason: collision with root package name */
        public static final Splitter f28995b = Splitter.j("\r\n|\n|\r");

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f28996a;

        /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1  reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<String> {

            /* renamed from: B  reason: collision with root package name */
            public Iterator f28997B;

            /* renamed from: e */
            public String b() {
                if (this.f28997B.hasNext()) {
                    String str = (String) this.f28997B.next();
                    if (this.f28997B.hasNext() || !str.isEmpty()) {
                        return str;
                    }
                }
                return (String) c();
            }
        }

        public CharSequenceCharSource(CharSequence charSequence) {
            this.f28996a = (CharSequence) Preconditions.q(charSequence);
        }

        public Reader a() {
            return new CharSequenceReader(this.f28996a);
        }

        public String toString() {
            String f2 = Ascii.f(this.f28996a, 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 17);
            sb.append("CharSource.wrap(");
            sb.append(f2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class ConcatenatedCharSource extends CharSource {

        /* renamed from: a  reason: collision with root package name */
        public final Iterable f28998a;

        public Reader a() {
            return new MultiReader(this.f28998a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28998a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("CharSource.concat(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class EmptyCharSource extends StringCharSource {

        /* renamed from: c  reason: collision with root package name */
        public static final EmptyCharSource f28999c = new EmptyCharSource();

        public EmptyCharSource() {
            super("");
        }

        public String toString() {
            return "CharSource.empty()";
        }
    }

    public static class StringCharSource extends CharSequenceCharSource {
        public StringCharSource(String str) {
            super(str);
        }

        public Reader a() {
            return new StringReader((String) this.f28996a);
        }
    }

    public abstract Reader a();
}
