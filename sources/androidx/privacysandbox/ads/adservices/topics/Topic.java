package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;

@Metadata
public final class Topic {

    /* renamed from: a  reason: collision with root package name */
    public final long f22752a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22753b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22754c;

    public Topic(long j2, long j3, int i2) {
        this.f22752a = j2;
        this.f22753b = j3;
        this.f22754c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.f22752a == topic.f22752a && this.f22753b == topic.f22753b && this.f22754c == topic.f22754c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f22752a) * 31) + Long.hashCode(this.f22753b)) * 31) + Integer.hashCode(this.f22754c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f22752a + ", ModelVersion=" + this.f22753b + ", TopicCode=" + this.f22754c + " }");
    }
}
