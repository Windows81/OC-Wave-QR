package org.slf4j;

import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

public class MDC {

    /* renamed from: a  reason: collision with root package name */
    public static MDCAdapter f44101a;

    static {
        try {
            f44101a = StaticMDCBinder.SINGLETON.getMDCA();
        } catch (NoClassDefFoundError e2) {
            f44101a = new NOPMDCAdapter();
            String message = e2.getMessage();
            if (message == null || message.indexOf("StaticMDCBinder") == -1) {
                throw e2;
            }
            Util.a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            Util.a("Defaulting to no-operation MDCAdapter implementation.");
            Util.a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        } catch (Exception e3) {
            Util.b("MDC binding unsuccessful.", e3);
        }
    }
}
