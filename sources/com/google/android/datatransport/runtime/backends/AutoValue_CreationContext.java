package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

final class AutoValue_CreationContext extends CreationContext {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24085a;

    /* renamed from: b  reason: collision with root package name */
    public final Clock f24086b;

    /* renamed from: c  reason: collision with root package name */
    public final Clock f24087c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24088d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context != null) {
            this.f24085a = context;
            if (clock != null) {
                this.f24086b = clock;
                if (clock2 != null) {
                    this.f24087c = clock2;
                    if (str != null) {
                        this.f24088d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.f24085a;
    }

    public String c() {
        return this.f24088d;
    }

    public Clock d() {
        return this.f24087c;
    }

    public Clock e() {
        return this.f24086b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f24085a.equals(creationContext.b()) && this.f24086b.equals(creationContext.e()) && this.f24087c.equals(creationContext.d()) && this.f24088d.equals(creationContext.c());
    }

    public int hashCode() {
        return ((((((this.f24085a.hashCode() ^ 1000003) * 1000003) ^ this.f24086b.hashCode()) * 1000003) ^ this.f24087c.hashCode()) * 1000003) ^ this.f24088d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f24085a + ", wallClock=" + this.f24086b + ", monotonicClock=" + this.f24087c + ", backendName=" + this.f24088d + "}";
    }
}
