package org.bson.json;

import org.bson.assertions.Assertions;

public final class StrictCharacterStreamJsonWriterSettings {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f44022a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44023b;

    /* renamed from: c  reason: collision with root package name */
    public final String f44024c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44025d;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f44026a;

        /* renamed from: b  reason: collision with root package name */
        public String f44027b;

        /* renamed from: c  reason: collision with root package name */
        public String f44028c;

        /* renamed from: d  reason: collision with root package name */
        public int f44029d;

        public StrictCharacterStreamJsonWriterSettings e() {
            return new StrictCharacterStreamJsonWriterSettings(this);
        }

        public Builder f(boolean z2) {
            this.f44026a = z2;
            return this;
        }

        public Builder g(String str) {
            Assertions.d("indentCharacters", str);
            this.f44028c = str;
            return this;
        }

        public Builder h(int i2) {
            this.f44029d = i2;
            return this;
        }

        public Builder i(String str) {
            Assertions.d("newLineCharacters", str);
            this.f44027b = str;
            return this;
        }

        public Builder() {
            this.f44027b = System.getProperty("line.separator");
            this.f44028c = "  ";
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public String b() {
        return this.f44024c;
    }

    public int c() {
        return this.f44025d;
    }

    public String d() {
        return this.f44023b;
    }

    public boolean e() {
        return this.f44022a;
    }

    public StrictCharacterStreamJsonWriterSettings(Builder builder) {
        this.f44022a = builder.f44026a;
        this.f44023b = builder.f44027b != null ? builder.f44027b : System.getProperty("line.separator");
        this.f44024c = builder.f44028c;
        this.f44025d = builder.f44029d;
    }
}
