package com.lokalise.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ResourceName {
    private final String resName;

    private /* synthetic */ ResourceName(String str) {
        this.resName = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ResourceName m31boximpl(String str) {
        return new ResourceName(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m32constructorimpl(String str) {
        Intrinsics.i(str, "resName");
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m33equalsimpl(String str, Object obj) {
        return (obj instanceof ResourceName) && Intrinsics.d(str, ((ResourceName) obj).m37unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34equalsimpl0(String str, String str2) {
        return Intrinsics.d(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36toStringimpl(String str) {
        return "ResourceName(resName=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m33equalsimpl(this.resName, obj);
    }

    public final String getResName() {
        return this.resName;
    }

    public int hashCode() {
        return m35hashCodeimpl(this.resName);
    }

    public String toString() {
        return m36toStringimpl(this.resName);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m37unboximpl() {
        return this.resName;
    }
}
