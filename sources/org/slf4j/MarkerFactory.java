package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMarkerBinder;

public class MarkerFactory {

    /* renamed from: a  reason: collision with root package name */
    public static IMarkerFactory f44102a;

    static {
        try {
            f44102a = StaticMarkerBinder.SINGLETON.getMarkerFactory();
        } catch (NoClassDefFoundError unused) {
            f44102a = new BasicMarkerFactory();
        } catch (Exception e2) {
            Util.b("Unexpected failure while binding MarkerFactory", e2);
        }
    }
}
