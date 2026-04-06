package org.apache.oltu.oauth2.common.domain.client;

public class BasicClientInfo implements ClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public String f43527a;

    /* renamed from: b  reason: collision with root package name */
    public String f43528b;

    /* renamed from: c  reason: collision with root package name */
    public String f43529c;

    /* renamed from: d  reason: collision with root package name */
    public String f43530d;

    /* renamed from: e  reason: collision with root package name */
    public String f43531e;

    /* renamed from: f  reason: collision with root package name */
    public String f43532f;

    /* renamed from: g  reason: collision with root package name */
    public String f43533g;

    /* renamed from: h  reason: collision with root package name */
    public Long f43534h;

    /* renamed from: i  reason: collision with root package name */
    public Long f43535i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicClientInfo basicClientInfo = (BasicClientInfo) obj;
        String str = this.f43528b;
        if (str == null ? basicClientInfo.f43528b != null : !str.equals(basicClientInfo.f43528b)) {
            return false;
        }
        String str2 = this.f43529c;
        if (str2 == null ? basicClientInfo.f43529c != null : !str2.equals(basicClientInfo.f43529c)) {
            return false;
        }
        String str3 = this.f43531e;
        if (str3 == null ? basicClientInfo.f43531e != null : !str3.equals(basicClientInfo.f43531e)) {
            return false;
        }
        String str4 = this.f43532f;
        if (str4 == null ? basicClientInfo.f43532f != null : !str4.equals(basicClientInfo.f43532f)) {
            return false;
        }
        Long l2 = this.f43535i;
        if (l2 == null ? basicClientInfo.f43535i != null : !l2.equals(basicClientInfo.f43535i)) {
            return false;
        }
        String str5 = this.f43533g;
        if (str5 == null ? basicClientInfo.f43533g != null : !str5.equals(basicClientInfo.f43533g)) {
            return false;
        }
        Long l3 = this.f43534h;
        if (l3 == null ? basicClientInfo.f43534h != null : !l3.equals(basicClientInfo.f43534h)) {
            return false;
        }
        String str6 = this.f43527a;
        if (str6 == null ? basicClientInfo.f43527a != null : !str6.equals(basicClientInfo.f43527a)) {
            return false;
        }
        String str7 = this.f43530d;
        String str8 = basicClientInfo.f43530d;
        return str7 == null ? str8 == null : str7.equals(str8);
    }

    public int hashCode() {
        String str = this.f43527a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f43528b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43529c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f43530d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f43531e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f43532f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f43533g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l2 = this.f43534h;
        int hashCode8 = (hashCode7 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f43535i;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode8 + i2;
    }
}
