package org.bson.json;

import com.google.api.Service;
import java.io.IOException;
import java.io.Writer;
import org.bson.BSONException;
import org.bson.BsonInvalidOperationException;
import org.bson.assertions.Assertions;

public final class StrictCharacterStreamJsonWriter implements StrictJsonWriter {

    /* renamed from: a  reason: collision with root package name */
    public final Writer f44006a;

    /* renamed from: b  reason: collision with root package name */
    public final StrictCharacterStreamJsonWriterSettings f44007b;

    /* renamed from: c  reason: collision with root package name */
    public StrictJsonContext f44008c = new StrictJsonContext((StrictJsonContext) null, JsonContextType.TOP_LEVEL, "");

    /* renamed from: d  reason: collision with root package name */
    public State f44009d = State.INITIAL;

    /* renamed from: e  reason: collision with root package name */
    public int f44010e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f44011f;

    public enum JsonContextType {
        TOP_LEVEL,
        DOCUMENT,
        ARRAY
    }

    public enum State {
        INITIAL,
        NAME,
        VALUE,
        DONE
    }

    public static class StrictJsonContext {

        /* renamed from: a  reason: collision with root package name */
        public final StrictJsonContext f44018a;

        /* renamed from: b  reason: collision with root package name */
        public final JsonContextType f44019b;

        /* renamed from: c  reason: collision with root package name */
        public final String f44020c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f44021d;

        public StrictJsonContext(StrictJsonContext strictJsonContext, JsonContextType jsonContextType, String str) {
            this.f44018a = strictJsonContext;
            this.f44019b = jsonContextType;
            if (strictJsonContext != null) {
                str = strictJsonContext.f44020c + str;
            }
            this.f44020c = str;
        }
    }

    public StrictCharacterStreamJsonWriter(Writer writer, StrictCharacterStreamJsonWriterSettings strictCharacterStreamJsonWriterSettings) {
        this.f44006a = writer;
        this.f44007b = strictCharacterStreamJsonWriterSettings;
    }

    public void A(String str) {
        Assertions.d("name", str);
        h(State.NAME);
        if (this.f44008c.f44021d) {
            n(",");
        }
        if (this.f44007b.e()) {
            n(this.f44007b.d());
            n(this.f44008c.f44020c);
        } else if (this.f44008c.f44021d) {
            n(" ");
        }
        r(str);
        n(": ");
        this.f44009d = State.VALUE;
    }

    public void C(String str, String str2) {
        Assertions.d("name", str);
        Assertions.d("value", str2);
        A(str);
        p(str2);
    }

    public void D() {
        h(State.VALUE);
        j();
        n("null");
        k();
    }

    public void a() {
        h(State.NAME);
        if (this.f44007b.e() && this.f44008c.f44021d) {
            n(this.f44007b.d());
            n(this.f44008c.f44018a.f44020c);
        }
        n("}");
        StrictJsonContext d2 = this.f44008c.f44018a;
        this.f44008c = d2;
        if (d2.f44019b == JsonContextType.TOP_LEVEL) {
            this.f44009d = State.DONE;
        } else {
            k();
        }
    }

    public void b(String str) {
        A(str);
        f();
    }

    public void c(String str) {
        Assertions.d("value", str);
        h(State.VALUE);
        j();
        n(str);
        k();
    }

    public void d(String str, String str2) {
        Assertions.d("name", str);
        Assertions.d("value", str2);
        A(str);
        g(str2);
    }

    public void e(String str, boolean z2) {
        Assertions.d("name", str);
        A(str);
        writeBoolean(z2);
    }

    public void f() {
        State state = this.f44009d;
        if (state == State.INITIAL || state == State.VALUE) {
            j();
            n("{");
            this.f44008c = new StrictJsonContext(this.f44008c, JsonContextType.DOCUMENT, this.f44007b.b());
            this.f44009d = State.NAME;
            return;
        }
        throw new BsonInvalidOperationException("Invalid state " + this.f44009d);
    }

    public void g(String str) {
        Assertions.d("value", str);
        h(State.VALUE);
        j();
        n(str);
        k();
    }

    public final void h(State state) {
        if (this.f44009d != state) {
            throw new BsonInvalidOperationException("Invalid state " + this.f44009d);
        }
    }

    public boolean i() {
        return this.f44011f;
    }

    public final void j() {
        if (this.f44008c.f44019b == JsonContextType.ARRAY) {
            if (this.f44008c.f44021d) {
                n(",");
            }
            if (this.f44007b.e()) {
                n(this.f44007b.d());
                n(this.f44008c.f44020c);
            } else if (this.f44008c.f44021d) {
                n(" ");
            }
        }
        boolean unused = this.f44008c.f44021d = true;
    }

    public final void k() {
        if (this.f44008c.f44019b == JsonContextType.ARRAY) {
            this.f44009d = State.VALUE;
        } else {
            this.f44009d = State.NAME;
        }
    }

    public final void l(IOException iOException) {
        throw new BSONException("Wrapping IOException", iOException);
    }

    public final void m(char c2) {
        try {
            if (this.f44007b.c() != 0) {
                if (this.f44010e >= this.f44007b.c()) {
                    this.f44011f = true;
                    return;
                }
            }
            this.f44006a.write(c2);
            this.f44010e++;
        } catch (IOException e2) {
            l(e2);
        }
    }

    public final void n(String str) {
        try {
            if (this.f44007b.c() != 0) {
                if (str.length() + this.f44010e >= this.f44007b.c()) {
                    this.f44006a.write(str.substring(0, this.f44007b.c() - this.f44010e));
                    this.f44010e = this.f44007b.c();
                    this.f44011f = true;
                    return;
                }
            }
            this.f44006a.write(str);
            this.f44010e += str.length();
        } catch (IOException e2) {
            l(e2);
        }
    }

    public void o() {
        h(State.VALUE);
        if (this.f44008c.f44019b == JsonContextType.ARRAY) {
            if (this.f44007b.e() && this.f44008c.f44021d) {
                n(this.f44007b.d());
                n(this.f44008c.f44018a.f44020c);
            }
            n("]");
            StrictJsonContext d2 = this.f44008c.f44018a;
            this.f44008c = d2;
            if (d2.f44019b == JsonContextType.TOP_LEVEL) {
                this.f44009d = State.DONE;
            } else {
                k();
            }
        } else {
            throw new BsonInvalidOperationException("Can't end an array if not in an array");
        }
    }

    public void p(String str) {
        Assertions.d("value", str);
        h(State.VALUE);
        j();
        r(str);
        k();
    }

    public void q() {
        j();
        n("[");
        this.f44008c = new StrictJsonContext(this.f44008c, JsonContextType.ARRAY, this.f44007b.b());
        this.f44009d = State.VALUE;
    }

    public final void r(String str) {
        m('\"');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 12) {
                n("\\f");
            } else if (charAt == 13) {
                n("\\r");
            } else if (charAt == '\"') {
                n("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        n("\\b");
                        break;
                    case 9:
                        n("\\t");
                        break;
                    case 10:
                        n("\\n");
                        break;
                    default:
                        int type = Character.getType(charAt);
                        if (!(type == 1 || type == 2 || type == 3 || type == 5)) {
                            switch (type) {
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    break;
                                default:
                                    switch (type) {
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case Service.METRICS_FIELD_NUMBER:
                                        case Service.MONITORED_RESOURCES_FIELD_NUMBER:
                                        case Service.BILLING_FIELD_NUMBER:
                                        case 27:
                                        case Service.MONITORING_FIELD_NUMBER:
                                        case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
                                        case 30:
                                            break;
                                        default:
                                            n("\\u");
                                            n(Integer.toHexString((61440 & charAt) >> 12));
                                            n(Integer.toHexString((charAt & 3840) >> 8));
                                            n(Integer.toHexString((charAt & 240) >> 4));
                                            n(Integer.toHexString(charAt & 15));
                                            continue;
                                            continue;
                                    }
                            }
                        }
                        m(charAt);
                        break;
                }
            } else {
                n("\\\\");
            }
        }
        m('\"');
    }

    public void writeBoolean(boolean z2) {
        h(State.VALUE);
        j();
        n(z2 ? "true" : "false");
        k();
    }
}
