package org.slf4j.helpers;

import org.slf4j.spi.MDCAdapter;

public class BasicMDCAdapter implements MDCAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f44103a = a();

    public static boolean a() {
        try {
            return System.getProperty("java.version").startsWith("1.4");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
