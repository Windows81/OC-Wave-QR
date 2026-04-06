package org.bson.internal;

import java.util.NoSuchElementException;

abstract class Optional<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final Optional f43892a = new Optional<Object>() {
        public Object a() {
            throw new NoSuchElementException(".get call on None!");
        }

        public boolean b() {
            return true;
        }
    };

    public static class Some<T> extends Optional<T> {

        /* renamed from: b  reason: collision with root package name */
        public final Object f43893b;

        public Some(Object obj) {
            this.f43893b = obj;
        }

        public Object a() {
            return this.f43893b;
        }

        public boolean b() {
            return false;
        }

        public String toString() {
            return String.format("Some(%s)", new Object[]{this.f43893b});
        }
    }

    public static Optional c(Object obj) {
        return obj == null ? f43892a : new Some(obj);
    }

    public abstract Object a();

    public abstract boolean b();

    public String toString() {
        return "None";
    }
}
