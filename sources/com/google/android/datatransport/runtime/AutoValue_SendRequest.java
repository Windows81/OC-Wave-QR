package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

final class AutoValue_SendRequest extends SendRequest {

    /* renamed from: a  reason: collision with root package name */
    public final TransportContext f24035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24036b;

    /* renamed from: c  reason: collision with root package name */
    public final Event f24037c;

    /* renamed from: d  reason: collision with root package name */
    public final Transformer f24038d;

    /* renamed from: e  reason: collision with root package name */
    public final Encoding f24039e;

    public static final class Builder extends SendRequest.Builder {

        /* renamed from: a  reason: collision with root package name */
        public TransportContext f24040a;

        /* renamed from: b  reason: collision with root package name */
        public String f24041b;

        /* renamed from: c  reason: collision with root package name */
        public Event f24042c;

        /* renamed from: d  reason: collision with root package name */
        public Transformer f24043d;

        /* renamed from: e  reason: collision with root package name */
        public Encoding f24044e;

        public SendRequest a() {
            String str = "";
            if (this.f24040a == null) {
                str = str + " transportContext";
            }
            if (this.f24041b == null) {
                str = str + " transportName";
            }
            if (this.f24042c == null) {
                str = str + " event";
            }
            if (this.f24043d == null) {
                str = str + " transformer";
            }
            if (this.f24044e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new AutoValue_SendRequest(this.f24040a, this.f24041b, this.f24042c, this.f24043d, this.f24044e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public SendRequest.Builder b(Encoding encoding) {
            if (encoding != null) {
                this.f24044e = encoding;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        public SendRequest.Builder c(Event event) {
            if (event != null) {
                this.f24042c = event;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        public SendRequest.Builder d(Transformer transformer) {
            if (transformer != null) {
                this.f24043d = transformer;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public SendRequest.Builder e(TransportContext transportContext) {
            if (transportContext != null) {
                this.f24040a = transportContext;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public SendRequest.Builder f(String str) {
            if (str != null) {
                this.f24041b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public Encoding b() {
        return this.f24039e;
    }

    public Event c() {
        return this.f24037c;
    }

    public Transformer e() {
        return this.f24038d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        return this.f24035a.equals(sendRequest.f()) && this.f24036b.equals(sendRequest.g()) && this.f24037c.equals(sendRequest.c()) && this.f24038d.equals(sendRequest.e()) && this.f24039e.equals(sendRequest.b());
    }

    public TransportContext f() {
        return this.f24035a;
    }

    public String g() {
        return this.f24036b;
    }

    public int hashCode() {
        return ((((((((this.f24035a.hashCode() ^ 1000003) * 1000003) ^ this.f24036b.hashCode()) * 1000003) ^ this.f24037c.hashCode()) * 1000003) ^ this.f24038d.hashCode()) * 1000003) ^ this.f24039e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f24035a + ", transportName=" + this.f24036b + ", event=" + this.f24037c + ", transformer=" + this.f24038d + ", encoding=" + this.f24039e + "}";
    }

    public AutoValue_SendRequest(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding) {
        this.f24035a = transportContext;
        this.f24036b = str;
        this.f24037c = event;
        this.f24038d = transformer;
        this.f24039e = encoding;
    }
}
