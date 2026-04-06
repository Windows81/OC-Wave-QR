package com.google.android.datatransport;

final class AutoValue_Event<T> extends Event<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f23815a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f23816b;

    /* renamed from: c  reason: collision with root package name */
    public final Priority f23817c;

    /* renamed from: d  reason: collision with root package name */
    public final ProductData f23818d;

    /* renamed from: e  reason: collision with root package name */
    public final EventContext f23819e;

    public AutoValue_Event(Integer num, Object obj, Priority priority, ProductData productData, EventContext eventContext) {
        this.f23815a = num;
        if (obj != null) {
            this.f23816b = obj;
            if (priority != null) {
                this.f23817c = priority;
                this.f23818d = productData;
                this.f23819e = eventContext;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f23815a;
    }

    public EventContext b() {
        return this.f23819e;
    }

    public Object c() {
        return this.f23816b;
    }

    public Priority d() {
        return this.f23817c;
    }

    public ProductData e() {
        return this.f23818d;
    }

    public boolean equals(Object obj) {
        ProductData productData;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f23815a;
        if (num != null ? num.equals(event.a()) : event.a() == null) {
            if (this.f23816b.equals(event.c()) && this.f23817c.equals(event.d()) && ((productData = this.f23818d) != null ? productData.equals(event.e()) : event.e() == null)) {
                EventContext eventContext = this.f23819e;
                if (eventContext == null) {
                    if (event.b() == null) {
                        return true;
                    }
                } else if (eventContext.equals(event.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f23815a;
        int i2 = 0;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f23816b.hashCode()) * 1000003) ^ this.f23817c.hashCode()) * 1000003;
        ProductData productData = this.f23818d;
        int hashCode2 = (hashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        EventContext eventContext = this.f23819e;
        if (eventContext != null) {
            i2 = eventContext.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "Event{code=" + this.f23815a + ", payload=" + this.f23816b + ", priority=" + this.f23817c + ", productData=" + this.f23818d + ", eventContext=" + this.f23819e + "}";
    }
}
