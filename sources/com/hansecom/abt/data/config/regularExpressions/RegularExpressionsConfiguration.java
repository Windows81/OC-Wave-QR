package com.hansecom.abt.data.config.regularExpressions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata
public final class RegularExpressionsConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final Regex f33255a;

    /* renamed from: b  reason: collision with root package name */
    public final Regex f33256b;

    /* renamed from: c  reason: collision with root package name */
    public final Regex f33257c;

    /* renamed from: d  reason: collision with root package name */
    public final Regex f33258d;

    /* renamed from: e  reason: collision with root package name */
    public final Regex f33259e;

    /* renamed from: f  reason: collision with root package name */
    public final Regex f33260f;

    /* renamed from: g  reason: collision with root package name */
    public final Regex f33261g;

    public RegularExpressionsConfiguration(Regex regex, Regex regex2, Regex regex3, Regex regex4, Regex regex5, Regex regex6, Regex regex7) {
        Intrinsics.i(regex, "firstName");
        Intrinsics.i(regex2, "password");
        Intrinsics.i(regex3, "lastName");
        Intrinsics.i(regex4, "phoneNumber");
        Intrinsics.i(regex5, "email");
        Intrinsics.i(regex6, "securityQuestionAnswer");
        Intrinsics.i(regex7, "accountPin");
        this.f33255a = regex;
        this.f33256b = regex2;
        this.f33257c = regex3;
        this.f33258d = regex4;
        this.f33259e = regex5;
        this.f33260f = regex6;
        this.f33261g = regex7;
    }

    public final Regex a() {
        return this.f33261g;
    }

    public final Regex b() {
        return this.f33259e;
    }

    public final Regex c() {
        return this.f33255a;
    }

    public final Regex d() {
        return this.f33257c;
    }

    public final Regex e() {
        return this.f33256b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularExpressionsConfiguration)) {
            return false;
        }
        RegularExpressionsConfiguration regularExpressionsConfiguration = (RegularExpressionsConfiguration) obj;
        return Intrinsics.d(this.f33255a, regularExpressionsConfiguration.f33255a) && Intrinsics.d(this.f33256b, regularExpressionsConfiguration.f33256b) && Intrinsics.d(this.f33257c, regularExpressionsConfiguration.f33257c) && Intrinsics.d(this.f33258d, regularExpressionsConfiguration.f33258d) && Intrinsics.d(this.f33259e, regularExpressionsConfiguration.f33259e) && Intrinsics.d(this.f33260f, regularExpressionsConfiguration.f33260f) && Intrinsics.d(this.f33261g, regularExpressionsConfiguration.f33261g);
    }

    public final Regex f() {
        return this.f33258d;
    }

    public final Regex g() {
        return this.f33260f;
    }

    public int hashCode() {
        return (((((((((((this.f33255a.hashCode() * 31) + this.f33256b.hashCode()) * 31) + this.f33257c.hashCode()) * 31) + this.f33258d.hashCode()) * 31) + this.f33259e.hashCode()) * 31) + this.f33260f.hashCode()) * 31) + this.f33261g.hashCode();
    }

    public String toString() {
        Regex regex = this.f33255a;
        Regex regex2 = this.f33256b;
        Regex regex3 = this.f33257c;
        Regex regex4 = this.f33258d;
        Regex regex5 = this.f33259e;
        Regex regex6 = this.f33260f;
        Regex regex7 = this.f33261g;
        return "RegularExpressionsConfiguration(firstName=" + regex + ", password=" + regex2 + ", lastName=" + regex3 + ", phoneNumber=" + regex4 + ", email=" + regex5 + ", securityQuestionAnswer=" + regex6 + ", accountPin=" + regex7 + ")";
    }
}
