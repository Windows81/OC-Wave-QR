package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.Objects;

public final class Streams {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        return com.google.gson.JsonNull.f31678z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000d A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.JsonElement a(com.google.gson.stream.JsonReader r2) {
        /*
            r2.S()     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            r0 = 0
            com.google.gson.TypeAdapter r1 = com.google.gson.internal.bind.TypeAdapters.V     // Catch:{ EOFException -> 0x0013, MalformedJsonException -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            java.lang.Object r2 = r1.b(r2)     // Catch:{ EOFException -> 0x0013, MalformedJsonException -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch:{ EOFException -> 0x0013, MalformedJsonException -> 0x0011, IOException -> 0x000f, NumberFormatException -> 0x000d }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0015
        L_0x000f:
            r2 = move-exception
            goto L_0x001b
        L_0x0011:
            r2 = move-exception
            goto L_0x0021
        L_0x0013:
            r2 = move-exception
            goto L_0x0029
        L_0x0015:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001b:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0021:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0027:
            r2 = move-exception
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.f31678z
            return r2
        L_0x002e:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Streams.a(com.google.gson.stream.JsonReader):com.google.gson.JsonElement");
    }

    public static void b(JsonElement jsonElement, JsonWriter jsonWriter) {
        TypeAdapters.V.d(jsonWriter, jsonElement);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    public static final class AppendableWriter extends Writer {

        /* renamed from: A  reason: collision with root package name */
        public final CurrentWrite f31748A = new CurrentWrite();

        /* renamed from: z  reason: collision with root package name */
        public final Appendable f31749z;

        public static class CurrentWrite implements CharSequence {

            /* renamed from: A  reason: collision with root package name */
            public String f31750A;

            /* renamed from: z  reason: collision with root package name */
            public char[] f31751z;

            public CurrentWrite() {
            }

            public void a(char[] cArr) {
                this.f31751z = cArr;
                this.f31750A = null;
            }

            public char charAt(int i2) {
                return this.f31751z[i2];
            }

            public int length() {
                return this.f31751z.length;
            }

            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f31751z, i2, i3 - i2);
            }

            public String toString() {
                if (this.f31750A == null) {
                    this.f31750A = new String(this.f31751z);
                }
                return this.f31750A;
            }
        }

        public AppendableWriter(Appendable appendable) {
            this.f31749z = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i2, int i3) {
            this.f31748A.a(cArr);
            this.f31749z.append(this.f31748A, i2, i3 + i2);
        }

        public Writer append(CharSequence charSequence) {
            this.f31749z.append(charSequence);
            return this;
        }

        public void write(int i2) {
            this.f31749z.append((char) i2);
        }

        public Writer append(CharSequence charSequence, int i2, int i3) {
            this.f31749z.append(charSequence, i2, i3);
            return this;
        }

        public void write(String str, int i2, int i3) {
            Objects.requireNonNull(str);
            this.f31749z.append(str, i2, i3 + i2);
        }
    }
}
