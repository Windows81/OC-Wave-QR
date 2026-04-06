package org.apache.oltu.oauth2.common.domain.credentials;

public class BasicCredentials implements Credentials {

    /* renamed from: a  reason: collision with root package name */
    public String f43536a;

    /* renamed from: b  reason: collision with root package name */
    public String f43537b;

    /* renamed from: c  reason: collision with root package name */
    public Long f43538c;

    /* renamed from: d  reason: collision with root package name */
    public Long f43539d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicCredentials basicCredentials = (BasicCredentials) obj;
        String str = this.f43536a;
        if (str == null ? basicCredentials.f43536a != null : !str.equals(basicCredentials.f43536a)) {
            return false;
        }
        String str2 = this.f43537b;
        if (str2 == null ? basicCredentials.f43537b != null : !str2.equals(basicCredentials.f43537b)) {
            return false;
        }
        Long l2 = this.f43539d;
        if (l2 == null ? basicCredentials.f43539d != null : !l2.equals(basicCredentials.f43539d)) {
            return false;
        }
        Long l3 = this.f43538c;
        Long l4 = basicCredentials.f43538c;
        return l3 == null ? l4 == null : l3.equals(l4);
    }

    public int hashCode() {
        String str = this.f43536a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f43537b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.f43538c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f43539d;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode3 + i2;
    }
}
