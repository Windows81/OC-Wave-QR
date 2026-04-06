package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class SubstituteLoggerFactory implements ILoggerFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap f44116a = new ConcurrentHashMap();

    public Logger a(String str) {
        SubstituteLogger substituteLogger = (SubstituteLogger) this.f44116a.get(str);
        if (substituteLogger != null) {
            return substituteLogger;
        }
        SubstituteLogger substituteLogger2 = new SubstituteLogger(str);
        SubstituteLogger substituteLogger3 = (SubstituteLogger) this.f44116a.putIfAbsent(str, substituteLogger2);
        return substituteLogger3 != null ? substituteLogger3 : substituteLogger2;
    }

    public void b() {
        this.f44116a.clear();
    }

    public List c() {
        return new ArrayList(this.f44116a.values());
    }
}
