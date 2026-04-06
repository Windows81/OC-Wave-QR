package com.google.common.reflect;

import com.google.common.base.Splitter;
import java.io.File;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class ClassPath {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f29206a = Logger.getLogger(ClassPath.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Splitter f29207b = Splitter.i(" ").e();

    public static final class ClassInfo extends ResourceInfo {

        /* renamed from: c  reason: collision with root package name */
        public final String f29208c;

        public String toString() {
            return this.f29208c;
        }
    }

    public static final class LocationInfo {

        /* renamed from: a  reason: collision with root package name */
        public final File f29209a;

        /* renamed from: b  reason: collision with root package name */
        public final ClassLoader f29210b;

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            return this.f29209a.equals(locationInfo.f29209a) && this.f29210b.equals(locationInfo.f29210b);
        }

        public int hashCode() {
            return this.f29209a.hashCode();
        }

        public String toString() {
            return this.f29209a.toString();
        }
    }

    public static class ResourceInfo {

        /* renamed from: a  reason: collision with root package name */
        public final String f29211a;

        /* renamed from: b  reason: collision with root package name */
        public final ClassLoader f29212b;

        public boolean equals(Object obj) {
            if (!(obj instanceof ResourceInfo)) {
                return false;
            }
            ResourceInfo resourceInfo = (ResourceInfo) obj;
            return this.f29211a.equals(resourceInfo.f29211a) && this.f29212b == resourceInfo.f29212b;
        }

        public int hashCode() {
            return this.f29211a.hashCode();
        }

        public String toString() {
            return this.f29211a;
        }
    }
}
