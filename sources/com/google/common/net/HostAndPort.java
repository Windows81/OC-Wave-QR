package com.google.common.net;

import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final int f29071A;

    /* renamed from: z  reason: collision with root package name */
    public final String f29072z;

    public boolean a() {
        return this.f29071A >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return Objects.a(this.f29072z, hostAndPort.f29072z) && this.f29071A == hostAndPort.f29071A;
    }

    public int hashCode() {
        return Objects.b(this.f29072z, Integer.valueOf(this.f29071A));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f29072z.length() + 8);
        if (this.f29072z.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.f29072z);
            sb.append(']');
        } else {
            sb.append(this.f29072z);
        }
        if (a()) {
            sb.append(':');
            sb.append(this.f29071A);
        }
        return sb.toString();
    }
}
